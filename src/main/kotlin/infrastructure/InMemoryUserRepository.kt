package org.example.infrastructure

import arrow.core.Either
import arrow.core.right
import org.example.domain.entities.User
import org.example.domain.models.Error
import org.example.domain.ports.out.SaveUser
import org.example.domain.ports.out.UserExist

class InMemoryUserRepository : SaveUser, UserExist {
    private val usersByName = mutableMapOf<String, User>()

    override fun exists(user: User): Either<Error, Boolean> =
        usersByName.containsKey(user.name.value).right()

    override fun save(user: User): Either<Error, Unit> {
        usersByName[user.name.value] = user
        return Unit.right()
    }
}
