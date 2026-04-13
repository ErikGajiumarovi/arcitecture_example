package org.example

import arrow.core.raise.context.bind
import arrow.core.raise.either
import org.example.application.RegisterUserService
import org.example.domain.entities.Profession
import org.example.domain.entities.User
import org.example.domain.valueobjects.Age
import org.example.domain.valueobjects.UserName
import org.example.infrastructure.InMemoryUserRepository
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@OptIn(ExperimentalUuidApi::class)
fun main() {
    val repository = InMemoryUserRepository()
    val registerUser = RegisterUserService(
        userExist = repository,
        saveUser = repository,
    )

    val result = either {
        val user = User.create(
            id = Uuid.random(),
            name = UserName.create("Erik").bind(),
            age = Age.create(30).bind(),
            profession = Profession.SANTECHNIK,
        ).bind()

        registerUser(user).bind()
        "User registered: ${user.name.value}"
    }

    println(result)
}
