package oop_00000144521_AbrahamNieveroNathanael.week07

enum class AppState{
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Succes(val data: String): ApiResponse()
    data class Error(val message: String): ApiResponse()
    object Loading: ApiResponse()
}