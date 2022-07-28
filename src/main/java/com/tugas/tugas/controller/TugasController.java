package com.tugas.tugas.controller;

import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v2/")
public class TugasController {
    @GetMapping("/Users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object>getUsers(){
        HttpHeaders headers =new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();

        res.put("code", "200");
        res.put("message", "ini GET");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }
    @PostMapping("/Users")
    public ResponseEntity<Object>createUsers() {
        HttpHeaders headers =new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String, Object> res = new HashMap<>();
        res.put("code", "200");
        res.put("message", "ini POST");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);

    }
    @DeleteMapping("/Users")
    public ResponseEntity<Object>deleteUsers() {
        HttpHeaders headers =new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String, Object> res = new HashMap<>();
        res.put("code", "200");
        res.put("message", "Ini Delete");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

}

