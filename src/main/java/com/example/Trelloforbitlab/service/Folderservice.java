package com.example.Trelloforbitlab.service;

import com.example.Trelloforbitlab.model.Folders;
import com.example.Trelloforbitlab.repisitory.Folderrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Folderservice {

    @Autowired
    private Folderrepos folderrepos;

    public void addFolder(Folders folder){
        folderrepos.save(folder);
    }

    public List<Folders> getFolders(){
        return folderrepos.findAll();
    }

    public Folders getFolderById(Long id){
        return folderrepos.findById(id).orElse(null);
    }

}
