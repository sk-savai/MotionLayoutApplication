package com.example.firebaseapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.firebaseapplication.R
import com.example.firebaseapplication.databinding.FragmentMotionLayoutBinding


class MotionLayoutFragment : Fragment() {

    private lateinit var binding: FragmentMotionLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_motion_layout,container,false)
        return binding.root
    }

}