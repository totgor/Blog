package net.ddns.mvlomonosov.blog.repo;

import org.springframework.data.repository.CrudRepository;

import net.ddns.mvlomonosov.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
    
}
