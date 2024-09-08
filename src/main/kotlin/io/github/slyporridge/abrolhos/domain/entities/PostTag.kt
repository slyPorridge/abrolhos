package io.github.slyporridge.abrolhos.domain.entities

import java.util.UUID

data class PostTag(
    val postId: UUID,
    val tagId: UUID
)
