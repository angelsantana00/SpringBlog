package com.codeup.springblog.repos;
import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostById(long id);

    Post findByTitle(String post_to_be_deleted);
}