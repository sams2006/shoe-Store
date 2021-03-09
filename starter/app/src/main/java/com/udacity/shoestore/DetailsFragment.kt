package com.udacity.shoestore

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.models.ShoeListViewModel


class DetailsFragment : Fragment() {


    private val sharedViewModel: ShoeListViewModel by activityViewModels()
    private lateinit var binding: FragmentDetailsBinding


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)



        Log.i("DetailsFragment", "called viewModel provider")



        binding.viewModel = sharedViewModel


        binding.buttonSave.setOnClickListener {
            sharedViewModel.setOrder("Your Order :", binding.editShoeName.text, binding.editCompanyName.text, binding.editSizeNumber.text, binding.editDescriptionContent.text)

            findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToShoeListFragment())
        }





        return binding.root
    }


}






