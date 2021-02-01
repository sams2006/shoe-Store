package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import kotlinx.android.synthetic.main.fragment_details.*


class ShoeListFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding : FragmentShoeListBinding = DataBindingUtil.inflate(inflater , R.layout.fragment_shoe_list , container , false)

        binding.buttonAdidas.setOnClickListener (
           Navigation.createNavigateOnClickListener(ShoeListFragmentDirections.actionShoeListFragmentToDetailsFragment("adidas",12 , R.drawable.item1 , "adidas" , "Feel fast and agile as a wild cat as you speed down city streets. These adidas Ultraboost DNA Shoes have a stretchy knit upper that adapts to the shape of your foot as you move. A leopard print adds an exotic look to the supportive cage and heel counter. Responsive cushioning keeps your stride energized.\n" +
                   "\n"))
        )
        binding.buttonNike.setOnClickListener(
                Navigation.createNavigateOnClickListener(ShoeListFragmentDirections.actionShoeListFragmentToDetailsFragment("Nike", 14 , R.drawable.item2 , "Nike" , "Feel fast and agile as a wild cat as you speed down city streets. These adidas Ultraboost DNA Shoes have a stretchy knit upper that adapts to the shape of your foot as you " +
                        "" +
                        "Feel fast and agile as a wild cat as you speed down city streets. These adidas Ultraboost DNA Shoes have a stretchy knit upper that adapts to the shape of your foot as you move. A leopard print adds an exotic look to the supportive cage and heel counter. Responsive cushioning keeps your stride energized.\n" +
                        "\nmove. A leopard print adds an exotic look to the supportive cage and heel counter. Responsive cushioning keeps your stride energized.\n " +
                        "\n"))
        )

        binding.fab.setOnClickListener(
                Navigation.createNavigateOnClickListener(ShoeListFragmentDirections.actionShoeListFragmentSelf())
        )

        return binding.root
    }


}