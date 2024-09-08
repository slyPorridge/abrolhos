package io.github.slyporridge.abrolhos.resources.entities

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.UUID

data class PostTag(
    @Id
    @GeneratedValue
    val postId: UUID,
    @Id
    @GeneratedValue
    val tagId: UUID
)
