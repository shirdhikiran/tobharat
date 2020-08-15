package com.dbs.cmsautomation.tasks.rest;

import com.dbs.cmsautomation.tasks.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/tasks")
@CrossOrigin(origins = "http://localhost:4200")
public class TasksController {

    @Autowired
    DelivarablesRespository delivarablesRespository;

    @Autowired
    BlockersRespository blockersRespository;

    @Autowired
    HighlightsRepository highlightsRespository;

    @GetMapping(path="/testTasks")
    String testTasks(){
        return "Hey i am here";
    }

    @PostMapping(path="/saveDelivarables")
    public @ResponseBody
    Optional<Delivarables> saveDelivarables(@RequestBody Delivarables delivarable){

        System.out.println("delivarable"+delivarable);
        final Delivarables save = delivarablesRespository.save(delivarable);
        return Optional.ofNullable(save);
    }
    @PostMapping(path="/saveBlockers")
    public @ResponseBody
    Optional<Blockers> saveBlockers(@RequestBody Blockers blockers){

        System.out.println("blockers"+blockers);
        final Blockers save = blockersRespository.save(blockers);
        return Optional.ofNullable(save);
    }
    @PostMapping(path="/saveHighlights")
    public @ResponseBody
    Optional<Highlights> saveHighlights(@RequestBody Highlights highlights){

        System.out.println("highlights"+highlights);
        final Highlights save = highlightsRespository.save(highlights);
        return Optional.ofNullable(save);
    }
}
