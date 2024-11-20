package ru.solorepeat.Catsgram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/перваячасть/v1/board")
public class RequestClassMapping {

    @GetMapping
    public void getBoard() {
        // Обработка GET-запроса по пути "/перваячасть/v1/board"
    }

//    @RequestMapping(path = "/tasks", method = RequestMethod.GET)
//    public List<Task> getAllTasks() {
//        // Обработка GET-запроса по пути "/api/v1/board/tasks"
//    }

//    @GetMapping("/groups")
//    public List<Group> getGroups() {
//        // Обработка GET-запроса по пути "/api/v1/board/groups"
//    }


}
