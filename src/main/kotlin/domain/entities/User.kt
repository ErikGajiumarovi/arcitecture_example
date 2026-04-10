package org.example.domain.entities

import org.example.domain.valueobjects.Age
import org.example.domain.valueobjects.UserName
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class User @OptIn(ExperimentalUuidApi::class) constructor(
    val id: Uuid,

    val name: UserName,
    val age: Age,
    val profession: Profession,
)