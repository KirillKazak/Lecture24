package com.example.lecture24.ui.constraint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lecture24.MainActivity
import com.example.lecture24.R

class ConstraintFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
            ) = inflater.inflate(R.layout.fragment_constraint, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editTextConstraintEmail : TextView = view.findViewById(R.id.text_constraint_email)
        val editTextConstraintPassword : TextView = view.findViewById(R.id.text_constraint_password)
        editTextConstraintEmail.setText(activity?.intent?.getStringExtra(MainActivity.EMAIL.toString()))
        editTextConstraintPassword.setText(activity?.intent?.getStringExtra(MainActivity.PASSWORD.toString()))
    }
}