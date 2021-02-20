package com.udacity.shoestore.models

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel : ViewModel() {


    private val _shoeList = MutableLiveData<Shoe>()
    val shoeList: LiveData<Shoe>
        get() = _shoeList


    init {


        Log.i("DetailsViewModel", "DetailsViewModel Created !")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("DetailsViewModel", "DetailsViewModel destroy")
    }


}