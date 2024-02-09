package com.ismael.springboot.streamschedule.controller;

import com.ismael.springboot.streamschedule.model.LiveStream;
import org.springframework.http.HttpStatus;

import com.ismael.springboot.streamschedule.repository.LiveStreamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Add this import statement

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }


    // GET http://local:8080/streams
    @GetMapping
    public List<LiveStream> findAll() {
        // Your implementation here
        return repository.findAll(); // Change this to your actual logic
    }

    // GET http://local:8080/streams/1242152155256-45125-55455
    @GetMapping ("/{id}")
    public LiveStream findById(@PathVariable String id){

        return repository.findById(id);
    }

    // POST http://local:8080/streams/

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping

    public LiveStream create(@RequestBody LiveStream stream){

        return repository.create(stream);
    }
}
