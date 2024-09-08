package io.github.slyporridge.abrolhos.domain.entities

import java.time.LocalDateTime
import java.util.UUID

data class Author(
    val id: UUID,
    val blog: String,
    val email: String,
    val password: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
