package com.example.Trelloforbitlab.controller;

import com.example.Trelloforbitlab.model.Folders;
import com.example.Trelloforbitlab.model.Tasks;
import com.example.Trelloforbitlab.service.Folderservice;
import com.example.Trelloforbitlab.service.Taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private Folderservice folderservice;

    @Autowired
    private Taskservice taskservice;

    @GetMapping(value = "/home")
    public String Mainpage(Model model) {
        model.addAttribute("allfolders", folderservice.getFolders());
        return "index";
    }




    @PostMapping(value = "/addfolder")
    public String AddFolder(@RequestParam(value = "folderName") String folderName) {
        Folders folder = new Folders();
        folder.setName(folderName);
        folderservice.addFolder(folder);
        return "redirect:/";
    }


    @GetMapping(value = "/folders/details/{id}")
    public String details(@PathVariable(value = "id") Long id, Model model) {
        Folders folder = folderservice.getFolderById(id);
        model.addAttribute("detailFolder",folder);
        List<Tasks> taskByfolder =taskservice.getAllTasksByFolderId(id);
        model.addAttribute("AllTaskByFolder",taskByfolder);
        return "details";
    }


    @PostMapping(value = "/addTask")
    public String addTask(@RequestParam(value = "TaskName") String TaskName,
                          @RequestParam(value = "TaskDesc") String TaskDesc,
                          @PathVariable(value = "folderId") Long folderId ) {
        Tasks task = new Tasks();
        task.setTitle(TaskName);
        task.setDescription(TaskDesc);
        task.setId(folderId);
        task.setStatus(0);


        taskservice.addTask(task);
        return "redirect:/detailsFolder/"+folderId;
    }

    @GetMapping(value = "/folders/detailsFolder/detailsTask/{taskId}")
    public String detailsTask(@PathVariable(value = "taskId") Long taskId, Model model) {
        Tasks task = taskservice.getTaskById(taskId);
        model.addAttribute("TaskbyFolder",task);
        return "redirect:/detailsTask";
    }
}
