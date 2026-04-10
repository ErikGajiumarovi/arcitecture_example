package org.example

import arrow.core.Either
import kotlin.test.Test
import kotlin.test.assertEquals

class ArrowDependencyTest {
    @Test
    fun `either can be used from arrow core`() {
        val result: Either<String, Int> = Either.Right(42)

        assertEquals(42, result.getOrNull())
    }
}
