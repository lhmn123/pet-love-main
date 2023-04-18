package com.stc.petlove.controller;

import com.stc.petlove.entities.TaiKhoan;
import com.stc.petlove.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.stc.petlove.repository.TaiKhoanRepository;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/taiKhoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @PostMapping("/create")
    public TaiKhoan createTaiKhoan(@RequestBody TaiKhoan taiKhoan){
        return taiKhoanService.createTaiKhoan(taiKhoan);
    }

    @PutMapping("/update/{id}")
    public TaiKhoan updateTaiKhoan(@PathVariable("id") String id, @RequestBody TaiKhoan taiKhoan){
        return taiKhoanService.updateTaiKhoan(String.valueOf(id),taiKhoan);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteTaiKhoan(@PathVariable("id") String id){
        return taiKhoanService.deleteTaiKhoan(String.valueOf(id));
    }

    @GetMapping("/read")
    public List<TaiKhoan> readAllTaiKhoan(){
        return taiKhoanService.readAllTaiKhoan();
    }

}
