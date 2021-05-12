package com.example.lecture24.ui.linear

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lecture24.MainActivity
import com.example.lecture24.MainActivity2
import com.example.lecture24.R

class LinearFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
            ) = inflater.inflate(R.layout.fragment_linear, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textViewLinearEmail : TextView = view.findViewById(R.id.text_linear_email)
        val textViewLinearPassword : TextView = view.findViewById(R.id.text_linear_password)
        textViewLinearEmail.setText(activity?.intent?.getStringExtra(MainActivity.EMAIL.toString()))
        textViewLinearPassword.setText(activity?.intent?.getStringExtra(MainActivity.PASSWORD.toString()))
    }
}
