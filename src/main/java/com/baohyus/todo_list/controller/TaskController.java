package com.baohyus.todo_list.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public String getTasks() {
        // This is a placeholder for the actual task retrieval logic
        return "List of tasks";
    }
}
