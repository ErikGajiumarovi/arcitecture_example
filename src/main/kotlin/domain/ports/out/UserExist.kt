package org.example.domain.ports.out

import arrow.core.Either
import org.example.domain.entities.User
import org.example.domain.models.Error

interface UserExist {
    fun exists(user: User): Either<Error, Boolean>
}
