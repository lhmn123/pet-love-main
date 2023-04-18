package com.stc.petlove.controller;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.LoaiThuCung;
import com.stc.petlove.entities.embedded.GiaDichVu;
import com.stc.petlove.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dichvu")

public class DichVuController {
    @Autowired
    private DichVuService dichVuService;

    @GetMapping("/")
    public String test(){
        return "dichvu";
    }

    @PostMapping("/add")
    public DichVu addDichVu(@RequestBody DichVu dichVu){
        return dichVuService.addDichVu(dichVu);
    }

    @PostMapping("/addGiaDichVu/{id}")
    public DichVu addGiaDichVu(@PathVariable("id") String id, @RequestBody GiaDichVu giaDichVu){
        return dichVuService.addGiaDichVu(id,giaDichVu);
    }

    @PutMapping("/update")
    public DichVu updateDichVu(@RequestParam("id") String id, @RequestBody DichVu dichVu){
        return dichVuService.updateDichVu(String.valueOf(id),dichVu);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteDichVu(@PathVariable("id") String id){
        return dichVuService.deleteDichVu(String.valueOf(id));
    }

    @GetMapping("/list")
    public List<DichVu> getAllDichVu(){
        return dichVuService.getAllDichVu();
    }

}
