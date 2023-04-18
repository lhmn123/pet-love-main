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
@RequestMapping("/dichVu")

public class DichVuController {
    @Autowired
    private DichVuService dichVuService;

    @PostMapping("/create")
    public DichVu createDichVu(@RequestBody DichVu dichVu){
        return dichVuService.createDichVu(dichVu);
    }

    @PutMapping("/update/{id}")
    public DichVu updateDichVu(@PathVariable("id") String id, @RequestBody DichVu dichVu){
        return dichVuService.updateDichVu(String.valueOf(id),dichVu);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteDichVu(@PathVariable("id") String id){
        return dichVuService.deleteDichVu(String.valueOf(id));
    }

    @GetMapping("/read")
    public List<DichVu> readAllDichVu(){
        return dichVuService.readAllDichVu();
    }

}
