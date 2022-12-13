package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class BlankFragment : Fragment(R.layout.fragment_blank) {
    lateinit var controller: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        controller = findNavController()
        var button = view.findViewById<Button>(R.id.switchButton)
        button.setOnClickListener {
            controller.navigate(R.id.action_blankFragment_to_blankFragment2)
        }
    }
}