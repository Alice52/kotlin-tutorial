package se.syntax.`class`

sealed class Result

class Success(val data: String) : Result()
class Error(val message: String) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Error -> println("Error: ${result.message}")
    }
}

fun main() {

    val successResult: Result = Success("Data received!")
    val errorResult: Result = Error("An error occurred!")

    handleResult(successResult)
    handleResult(errorResult)


}


