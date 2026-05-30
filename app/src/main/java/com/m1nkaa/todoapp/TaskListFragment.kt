package com.m1nkaa.todoapp

import Task
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TaskListFragment : Fragment() {

    private val tasks = mutableListOf<Task>()
    private lateinit var adapter: TaskAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_task_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = TaskAdapter(tasks)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        val fab = view.findViewById<FloatingActionButton>(R.id.fabAddTask)
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_taskList_to_addTask)
        }

        // Слушаем результат от AddTaskFragment
        parentFragmentManager.setFragmentResultListener("task_result", viewLifecycleOwner) { _, bundle ->
            val title = bundle.getString("task_title") ?: return@setFragmentResultListener
            val newTask = Task(id = tasks.size + 1, title = title)
            adapter.addTask(newTask)
        }
    }
}