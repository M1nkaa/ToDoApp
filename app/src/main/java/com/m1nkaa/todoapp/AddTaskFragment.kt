package com.m1nkaa.todoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AddTaskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText = view.findViewById<EditText>(R.id.editTaskTitle)
        val button = view.findViewById<Button>(R.id.buttonSave)

        button.setOnClickListener {
            val title = editText.text.toString().trim()
            if (title.isNotEmpty()) {
                val result = Bundle().apply {
                    putString("task_title", title)
                }
                parentFragmentManager.setFragmentResult("task_result", result)
                findNavController().popBackStack()
            } else {
                editText.error = "Введи название задачи"
            }
        }
    }
}