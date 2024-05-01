package com.example.Trelloforbitlab.service;

import com.example.Trelloforbitlab.model.TaskCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskCategoriesService {
    @Autowired
    private TaskCategoriesService taskCatRepos;

    public List<TaskCategories> getAllTaskCategories() {
        return taskCatRepos.findAll();
    }

}
