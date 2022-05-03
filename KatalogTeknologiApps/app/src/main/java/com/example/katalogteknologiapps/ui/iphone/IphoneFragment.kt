package com.example.katalogteknologiapps.ui.iphone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.katalogteknologiapps.data.DataSource
import com.example.katalogteknologiapps.R
import com.example.katalogteknologiapps.databinding.FragmentListBinding

class IphoneFragment: Fragment(R.layout.fragment_list) {
    private var _binding: FragmentListBinding?= null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = IphoneAdapter(requireContext(), DataSource().loadIphone())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}