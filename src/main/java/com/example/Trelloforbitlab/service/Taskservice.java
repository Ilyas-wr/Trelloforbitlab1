package com.example.Trelloforbitlab.service;

import com.example.Trelloforbitlab.model.Tasks;
import com.example.Trelloforbitlab.repisitory.Taskrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Taskservice {
    @Autowired
    private Taskrepos taskrepos;

    public List<Tasks> getAllTasks() {
        return taskrepos.findAll();
    }

    public Tasks getTaskById(Long id) {
        return taskrepos.findById(id).orElse(null);
    }

    public void addTask(Tasks task) {
        taskrepos.save(task);
    }

    public List<Tasks> getAllTasksByFolderId(Long folderId) {
        return taskrepos.findAllByFolderId(folderId);
    }
}
