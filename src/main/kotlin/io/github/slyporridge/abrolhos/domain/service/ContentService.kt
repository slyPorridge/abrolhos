package io.github.slyporridge.abrolhos.domain.service

import io.github.slyporridge.abrolhos.resources.entities.Post
import io.github.slyporridge.abrolhos.resources.repository.ContentRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ContentService(
    private val contentRepository: ContentRepository
) {
    private val logger = LoggerFactory.getLogger(ContentService::class.java)

    fun createPost(post: Post) {
        logger.info("Content service will call repository")
        contentRepository.save(post)
    }

    fun getAllPosts(): List<Post> = contentRepository.findAll()

    fun getPostById(postId: UUID): Post? = contentRepository.findById(postId).get()

    fun updatePost(post: Post) = contentRepository.save(post)

    fun deletePost(postId: UUID) = contentRepository.deleteById(postId)
}
