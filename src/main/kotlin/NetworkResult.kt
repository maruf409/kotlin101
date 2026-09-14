package org.home

sealed  class NetworkResult {

    object Loading : NetworkResult()
    data class Success(val data : String) : NetworkResult()
    data class Failure(val error : Throwable) : NetworkResult()

}

fun hnadleResult(result: NetworkResult){

    switch(result){
        is NetworkResult.Loading -> println("Show Progree bar")
        is NetworkResult.Failure -> println("Got Data: ${result.data}")
        is NetworkResult.Success -> println("${result.data}")

    }

}