package com.m1nkaa.todoapp

import Task
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TaskListFragment : Fragment() {

    private val tasks = mutableListOf<Task>()
    private lateinit var adapter: TaskAdapter
    private lateinit var textEmpty: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_task_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textEmpty = view.findViewById(R.id.textEmpty)

        adapter = TaskAdapter(tasks) {
            updateEmptyState()
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        val fab = view.findViewById<FloatingActionButton>(R.id.fabAddTask)
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_taskList_to_addTask)
        }

        parentFragmentManager.setFragmentResultListener("task_result", viewLifecycleOwner) { _, bundle ->
            val title = bundle.getString("task_title") ?: return@setFragmentResultListener
            val newTask = Task(id = tasks.size + 1, title = title)
            adapter.addTask(newTask)
            updateEmptyState()
        }

        updateEmptyState()
    }

    private fun updateEmptyState() {
        textEmpty.visibility = if (tasks.isEmpty()) View.VISIBLE else View.GONE
    }
}