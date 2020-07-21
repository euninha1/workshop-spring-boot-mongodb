package com.ninha.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ninha.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	Post findOne(String id);

	List<Post> findByTitleContainingIgnoreCase(String text); 
	
}
