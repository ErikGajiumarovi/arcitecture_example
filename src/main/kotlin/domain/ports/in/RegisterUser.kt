package org.example.domain.ports.`in`

import arrow.core.Either
import org.example.domain.entities.User
import org.example.domain.models.Error

interface RegisterUser {
    operator fun invoke(user: User): Either<Error, Unit>
}
