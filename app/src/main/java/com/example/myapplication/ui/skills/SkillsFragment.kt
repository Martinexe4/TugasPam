package com.example.myapplication.ui.skills

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.R

import com.example.myapplication.databinding.FragmentSkillsBinding
import com.example.myapplication.ui.skills.SkillsViewModel

class SkillsFragment : Fragment() {

    private var _binding: FragmentSkillsBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(SkillsViewModel::class.java)

        _binding = FragmentSkillsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSkills
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}