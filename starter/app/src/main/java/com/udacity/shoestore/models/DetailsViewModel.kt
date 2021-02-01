package com.udacity.shoestore.models

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel : ViewModel() {

    //val name = MutableLiveData<String>()



    init {
        Log.i("DetailsViewModel","DetailsViewModel Created !")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("DetailsViewModel","DetailsViewModel destroy")
    }
}