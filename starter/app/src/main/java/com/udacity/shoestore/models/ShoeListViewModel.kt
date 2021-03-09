package com.udacity.shoestore.models


import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListViewModel : ViewModel() {

    private val _order = MutableLiveData<String>()
    val order: LiveData<String> = _order

    private val _name = MutableLiveData<Editable>()
    val name: LiveData<Editable> = _name

    private val _company = MutableLiveData<Editable>()
    val company: LiveData<Editable> = _company

    private val _size = MutableLiveData<Editable>()
    val size: LiveData<Editable> = _size

    private val _describe = MutableLiveData<Editable>()
    val describe: LiveData<Editable> = _describe


    fun setOrder(yourOrder: String, shoeName: Editable, ShoeCompany: Editable, shoeSize: Editable, describe: Editable) {
        _order.value = yourOrder
        _name.value = shoeName
        _company.value = ShoeCompany
        _size.value = shoeSize
        _describe.value = describe
    }


}