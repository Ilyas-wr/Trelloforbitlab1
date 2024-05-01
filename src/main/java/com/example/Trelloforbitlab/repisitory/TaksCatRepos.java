package com.example.Trelloforbitlab.repisitory;

import com.example.Trelloforbitlab.model.TaskCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaksCatRepos extends JpaRepository<TaskCategories,Long> {
}
