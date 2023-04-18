package com.stc.petlove.controller;

import com.stc.petlove.entities.LoaiThuCung;
import com.stc.petlove.service.LoaiThuCungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.stc.petlove.repository.LoaiThuCungRepository;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/loaiThuCung")
public class LoaiThuCungController {
    @Autowired
    private LoaiThuCungService loaiThuCungService;

    @PostMapping("/create")
    public LoaiThuCung createLoaiThuCung(@RequestBody LoaiThuCung loaiThuCung){
        return loaiThuCungService.createLoaiThuCung(loaiThuCung);
    }

    @PutMapping("/update/{id}")
    public LoaiThuCung updateLoaiThuCung(@PathVariable("id") String id, @RequestBody LoaiThuCung loaiThuCung){
        return loaiThuCungService.updateLoaiThuCung(String.valueOf(id),loaiThuCung);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteLoaiThuCung(@PathVariable("id") String id){
        return loaiThuCungService.deteleLoaiThuCung(String.valueOf(id));
    }

    @GetMapping("/read")
    public List<LoaiThuCung> readAllLoaiThuCung(){
        return loaiThuCungService.readAllLoaiThuCung();
    }

}
