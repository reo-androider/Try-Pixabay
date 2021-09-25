package com.reo.running.try_pixabay

class RemoteDataSource {
    suspend fun getRepository(): Pixabay? {
        try {
            val data = APIClient.retrofit.fetchRepository(
                "23172343-cbe15e83249e9253aae555eec",
                "vertical",
                "computer"
            )
            if (data.isSuccessful) {
                return data.body()
            } else {
                throw Exception()
            }
        } catch (throwable: Throwable) {
            throw throwable
        }
    }
}
