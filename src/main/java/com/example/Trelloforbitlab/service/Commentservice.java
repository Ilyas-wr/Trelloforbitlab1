package com.example.Trelloforbitlab.service;

import com.example.Trelloforbitlab.model.Comments;
import com.example.Trelloforbitlab.repisitory.CommentsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Commentservice {
    @Autowired
    private CommentsRep commentsRep;
    public List<Comments> getComment(){
        return commentsRep.findAll();
    }
}
