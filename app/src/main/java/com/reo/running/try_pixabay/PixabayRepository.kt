package com.reo.running.try_pixabay

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData

class PixabayRepository(
    private val remoteDataSource: RemoteDataSource = RemoteDataSource()
) {
    fun getRepository(): LiveData<Pixabay?> {
        return liveData {
            val repos = remoteDataSource.getRepository()
            emit(repos)
        }
    }
}
