package com.example.Trelloforbitlab.repisitory;

import com.example.Trelloforbitlab.model.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface Folderrepos extends JpaRepository<Folders,Long> {
}
