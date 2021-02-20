package com.udacity.shoestore

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {

    private var linearLayout: LinearLayout? = null

    private lateinit var binding: FragmentShoeListBinding


    @SuppressLint("ResourceType")
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)



        binding.fab.setOnClickListener(
                Navigation.createNavigateOnClickListener(ShoeListFragmentDirections.actionShoeListFragmentToDetailsFragment())
        )


        val args = ShoeListFragmentArgs.fromBundle(requireArguments())
        linearLayout = binding.addLinearLayout
        val textViewOrder = TextView(context)
        val textCompany = TextView(context)
        val textShoeName = TextView(context)
        val textDescription = TextView(context)
        textViewOrder.text = args.order
        textViewOrder.textSize = 24F
        textShoeName.text = args.shoe?.name
        textCompany.text = args.shoe?.company
        textDescription.text = args.shoe?.description
        linearLayout!!.addView(textViewOrder)
        linearLayout!!.addView(textShoeName)
        linearLayout!!.addView(textCompany)
        linearLayout!!.addView(textDescription)






        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}