package org.example.domain.ports.out

import arrow.core.Either
import org.example.domain.entities.User
import org.example.domain.models.Error

interface SaveUser {
    fun save(user: User): Either<Error, Unit>
}
