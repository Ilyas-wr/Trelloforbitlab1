package com.example.Trelloforbitlab.repisitory;

import com.example.Trelloforbitlab.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
@Repository
public interface CommentsRep extends JpaRepository<Comments, Long> {
}
