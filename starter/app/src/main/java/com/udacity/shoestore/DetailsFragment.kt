package com.udacity.shoestore

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.models.DetailsViewModel
import com.udacity.shoestore.models.Shoe


class DetailsFragment : Fragment() {

   private  lateinit var viewModel : DetailsViewModel
   private lateinit var binding: FragmentDetailsBinding


    @SuppressLint("LogNotTimber")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater , R.layout.fragment_details , container , false)

        Log.i("DetailsFragment","called viewModel provider")

        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)



        binding.buttonSave.setOnClickListener {



//


    viewModel.shoeName.observe(this , Observer { newShoeName ->
        binding.editShoeName.text = newShoeName.toString()
    })

        }




        binding.ButtonCancel.setOnClickListener(
                Navigation.createNavigateOnClickListener(DetailsFragmentDirections.actionDetailsFragmentToShoeListFragment())
        )



        return binding.root
    }






}