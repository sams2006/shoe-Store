package com.udacity.shoestore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.models.DetailsViewModel


class DetailsFragment : Fragment() {

   private lateinit var viewModel : DetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(inflater , R.layout.fragment_details , container , false)

        Log.i("DetailsFragment","called viewModel provider")
        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

  val args = DetailsFragmentArgs.fromBundle(requireArguments())

        binding.textName.text = args.name
        binding.sizeNumber.text = args.size.toString()
        binding.buttonImage.setImageResource(args.image)
        binding.textCompanyName.text = args.company
        binding.DescriptionContent.text = args.description

        binding.ButtonCancel.setOnClickListener(
                Navigation.createNavigateOnClickListener(DetailsFragmentDirections.actionDetailsFragmentToShoeListFragment())
        )

        return binding.root
    }




}