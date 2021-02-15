package com.udacity.shoestore.models

import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailsBinding

class DetailsViewModel : ViewModel() {



     private val _shoeName = MutableLiveData<String>()
     val shoeName : LiveData<String>
     get() = _shoeName





    init {




        Log.i("DetailsViewModel","DetailsViewModel Created !")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("DetailsViewModel","DetailsViewModel destroy")
    }






}