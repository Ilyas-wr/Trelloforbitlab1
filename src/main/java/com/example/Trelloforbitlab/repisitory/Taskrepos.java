package com.example.Trelloforbitlab.repisitory;

import com.example.Trelloforbitlab.model.Folders;
import com.example.Trelloforbitlab.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Taskrepos extends JpaRepository<Tasks, Long> {

    List<Tasks> findAllByFolderId(Long folderId);

}
