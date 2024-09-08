package io.github.slyporridge.abrolhos.resources.repository

import io.github.slyporridge.abrolhos.resources.entities.Post
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ContentRepository : JpaRepository<Post, UUID>
