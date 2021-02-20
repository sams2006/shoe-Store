package com.udacity.shoestore

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.models.DetailsViewModel
import com.udacity.shoestore.models.Shoe


class DetailsFragment : Fragment() {

   private  lateinit var viewModel : DetailsViewModel
    private lateinit var binding: FragmentDetailsBinding

   private val shoe : Shoe = Shoe()

    private var order = "your order :"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater , R.layout.fragment_details , container , false)

        Log.i("DetailsFragment","called viewModel provider")

        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        binding.shoe = shoe
        binding.lifecycleOwner = this


        binding.buttonSave.setOnClickListener { addShoe(shoe)}






        binding.ButtonCancel.setOnClickListener(
                Navigation.createNavigateOnClickListener(DetailsFragmentDirections.actionDetailsFragmentToShoeListFragment(shoe.copy(), order))
        )

// viewModel.shoeList.observe(this , Observer {newShoe ->
//     shoe.name = newShoe.toString()
//     shoe.company = newShoe.toString()
//     shoe.description = newShoe.description
// })

        return binding.root
    }

 private fun addShoe(shoe: Shoe){

  binding.apply {
      shoe?.name = editShoeName.text.toString()
      invalidateAll()
      shoe?.company = editCompanyName.text.toString()
      shoe?.description = editDescriptionContent.text.toString()



      val action = DetailsFragmentDirections.actionDetailsFragmentToShoeListFragment(shoe?.copy(), order)
      findNavController().navigate(action)


  }

 }

 }




