package org.example.application

import arrow.core.Either
import arrow.core.raise.bind
import arrow.core.raise.either
import arrow.core.raise.ensure
import org.example.domain.entities.User
import org.example.domain.models.Error
import org.example.domain.ports.`in`.RegisterUser
import org.example.domain.ports.out.SaveUser
import org.example.domain.ports.out.UserExist

class RegisterUserService(
    private val userExist: UserExist,
    private val saveUser: SaveUser,
) : RegisterUser {
    override fun invoke(user: User): Either<Error, Unit> = either {
        ensure(!userExist.exists(user).bind()) {
            Error.UserAlreadyExists(user.name.value)
        }

        saveUser.save(user).bind()
    }
}
