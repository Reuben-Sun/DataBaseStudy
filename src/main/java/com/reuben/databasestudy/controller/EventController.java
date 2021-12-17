package com.reuben.databasestudy.controller;

import com.reuben.databasestudy.entity.Event;
import com.reuben.databasestudy.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventMapper eventMapper;


    @GetMapping("/selectAll")
    List<Event> selectAll(){
        List<Event> events = eventMapper.selectAll();
        return events;
    }

    @PostMapping("/addEvent")
    int insertTeam(@RequestBody Event event){
        int i = eventMapper.insertEvent(event);
        return i;
    }

    @PostMapping("/updateEvent")
    int updateTeam(@RequestBody Event event){
        int i = eventMapper.updateEvent(event);
        return i;
    }

    @GetMapping("/deleteEvent")
    int deleteTeam(int id){
        int i = eventMapper.deleteEvent(id);
        return i;
    }
}
