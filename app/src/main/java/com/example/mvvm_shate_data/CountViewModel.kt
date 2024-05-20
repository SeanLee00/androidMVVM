package com.example.mvvm_shate_data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun increment() {
        counter.value = (counter.value ?: 0) + 1
    }

    fun decrement() {
        counter.value = (counter.value ?: 0) - 1
    }

    fun getCounter(): LiveData<Int> = counter
}