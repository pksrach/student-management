package com.samrach.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class IndexController {
    @GetMapping()
    public ResponseEntity<Map<String, Object>> index() {
        Map<String, Object> map = new HashMap<>();
        map.put("date", Calendar.getInstance().getTime());
        map.put("health", true);
        map.put("version", "1.0.0");

        return ResponseEntity.ok(map);
    }
}
