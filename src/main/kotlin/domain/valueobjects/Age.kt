package org.example.domain.valueobjects

import arrow.core.Either
import arrow.core.raise.either
import arrow.core.raise.ensure
import org.example.domain.models.Error

@JvmInline
value class Age private constructor(val value: Int) {
    companion object {
        fun create(value: Int): Either<Error.AgeError, Age> = either {
            ensure(value in 19..69) {
                Error.AgeError(value)
            }

            Age(value)
        }
    }
}
