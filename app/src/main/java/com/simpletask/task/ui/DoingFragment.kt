package com.simpletask.task.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.simpletask.task.R
import com.simpletask.task.databinding.FragmentDoingBinding
import com.simpletask.task.databinding.FragmentTodoBinding

class DoingFragment : Fragment() {
    class TodoFragment : Fragment() {
        private var _binding: FragmentDoingBinding? = null
        private val binding get() = _binding!!

        private lateinit var auth: FirebaseAuth
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentDoingBinding.inflate(inflater, container, false)
            return binding.root
        }
    }
}