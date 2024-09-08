package io.github.slyporridge.abrolhos.resources.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "posts", schema = "main")
data class Post(
    @Id
    @GeneratedValue
    val id: UUID,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val content: String,

    @Column(nullable = false)
    val authorId: UUID,

    @Column(nullable = false)
    val createdAt: LocalDateTime,

    @Column(nullable = true)
    val updatedAt: LocalDateTime?,

    @Column(nullable = false)
    val published: Boolean,

    @Column(nullable = false)
    val slug: String
    )
