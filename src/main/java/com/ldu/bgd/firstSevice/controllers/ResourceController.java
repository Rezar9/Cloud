package com.ldu.bgd.firstSevice.controllers;

import com.ldu.bgd.firstSevice.dtos.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/resources")
@Slf4j
public class ResourceController {


    @GetMapping
    public ResponseEntity<String> getResources() {
        return ResponseEntity.ok("hgghjhjhjh");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getResourcesById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok("there was sent id: " + id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateResourcesById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok("resource with id: " + id + " is updated");
    }

    @PostMapping
    public ResponseEntity<User> saveResources(@RequestBody User user) {
        log.info("user {} is created", user);
        return ResponseEntity.ok(user);
    }
    @PostMapping("/params")
    public ResponseEntity<String> saveResourcesswitchParameters(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        log.info("id: {} name {}", id, name);
        return ResponseEntity.ok(String.format("id=%s name=%s", id, name));
    }

}
