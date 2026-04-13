package org.example.domain.entities

import arrow.core.Either
import arrow.core.raise.either
import arrow.core.raise.ensure
import org.example.domain.models.Error
import org.example.domain.valueobjects.Age
import org.example.domain.valueobjects.UserName
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@ConsistentCopyVisibility
data class User @OptIn(ExperimentalUuidApi::class) private constructor(
    val id: Uuid,

    val name: UserName,
    val age: Age,
    val profession: Profession,
) {
    companion object {
        @OptIn(ExperimentalUuidApi::class)
        fun create(
            id: Uuid,
            name: UserName,
            age: Age,
            profession: Profession,
        ): Either<Error.ToOld, User> = either {
            if (profession == Profession.STRIPTIZERSHA) {
                ensure(age.value < 40) {
                    Error.ToOld
                }
            }

            User(id, name, age, profession)
        }
    }
}