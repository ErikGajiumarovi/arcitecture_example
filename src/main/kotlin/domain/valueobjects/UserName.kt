package org.example.domain.valueobjects

import arrow.core.Either
import arrow.core.raise.either
import arrow.core.raise.ensure
import org.example.domain.models.Error

@JvmInline
value class UserName private constructor(val value: String) {
    companion object {
        fun create(value: String): Either<Error.UserNameError, UserName> = either {
            ensure(value.isNotBlank()) {
                Error.UserNameError(value)
            }

            UserName(value)
        }
    }
}

