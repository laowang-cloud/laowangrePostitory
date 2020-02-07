package com.example.bangbangxia.controller;

import com.example.bangbangxia.domain.RespPageBean;
import com.example.bangbangxia.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/getTaskByPage")
    public RespPageBean getTaskByPage(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer size){
        return  taskService.getTaskByPage(page,size);
    }
}
