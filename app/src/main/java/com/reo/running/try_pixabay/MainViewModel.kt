package com.reo.running.try_pixabay

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel(repository: PixabayRepository) : ViewModel() {
    val pixabayList: LiveData<Pixabay?> = repository.getRepository()

    companion object {
        class Factory(private val repository: PixabayRepository = PixabayRepository()) :
            ViewModelProvider.NewInstanceFactory() {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T =
                MainViewModel(repository) as T
        }
    }
}
