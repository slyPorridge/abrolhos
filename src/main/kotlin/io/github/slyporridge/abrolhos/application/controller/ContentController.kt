package io.github.slyporridge.abrolhos.application.controller

import io.github.slyporridge.abrolhos.domain.service.ContentService
import io.github.slyporridge.abrolhos.resources.entities.Post
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/posts")
class ContentController(
    private val contentService: ContentService
) {

    private val logger = LoggerFactory.getLogger(ContentService::class.java)

    /* TODO() add filters by STATUS, if published or not,
                          by TAGS,
                          by DATE and
                          by WORDS IN TITLE
              add pagination */

    @PostMapping
    fun createPost(@RequestBody post: Post) {
        logger.info("Controller will call service to create post")
        contentService.createPost(post)
    }

    @GetMapping
    fun getAllPosts(): List<Post> = contentService.getAllPosts()

    @GetMapping("/{id}")
    fun getPostById(@PathVariable postId: UUID): Post? = contentService.getPostById(postId)

    @PatchMapping("/{id}")
    fun updatePost(@RequestBody post: Post) = contentService.updatePost(post)

    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable postId: UUID) = contentService.deletePost(postId)
}
