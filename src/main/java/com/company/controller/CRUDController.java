package com.company.controller;

import com.company.entity.CRUD;
import com.company.service.CRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
public class CRUDController {
    CRUDService crudService = new CRUDService();

    @PostMapping("/create")
    public String create(@RequestBody CRUD crud) throws InterruptedException, ExecutionException {
        return crudService.create(crud);
    }

    @GetMapping("/get")
    public CRUD get(@RequestParam String number) throws InterruptedException, ExecutionException {
        return crudService.getByNumber(number);
    }

    @PutMapping("/update")
    public String update(@RequestBody CRUD crud) throws InterruptedException, ExecutionException {
        return crudService.update(crud);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam String number) throws InterruptedException, ExecutionException {
        return crudService.delete(number);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() throws InterruptedException, ExecutionException {
        return ResponseEntity.ok("Test GET endpoint is working !");
    }
}
