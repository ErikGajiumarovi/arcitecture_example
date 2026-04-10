package org.example.domain.models

sealed interface Error {
    data class AgeError(val value: Int) : Error
    data class UserNameError(val value: String) : Error
    data class UserAlreadyExists(val value: String) : Error
}
