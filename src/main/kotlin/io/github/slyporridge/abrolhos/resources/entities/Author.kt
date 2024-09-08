package io.github.slyporridge.abrolhos.resources.entities

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "authors", schema = " main")
data class Author(
    @Id
    @GeneratedValue
    val id: UUID,

    @Column(nullable = false)
    val blog: String,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val createdAt: LocalDateTime,

    @Column(nullable = false)
    val updatedAt: LocalDateTime
)
