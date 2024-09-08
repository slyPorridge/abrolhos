package io.github.slyporridge.abrolhos.resources.entities

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.UUID

data class Tag(
    @Id
    @GeneratedValue
    val id: UUID,

    @Column(nullable = false)
    val name: String
)
