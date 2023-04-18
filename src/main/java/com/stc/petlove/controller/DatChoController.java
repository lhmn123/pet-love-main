package com.stc.petlove.controller;

import com.stc.petlove.entities.DatCho;
import com.stc.petlove.service.DatChoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datCho")
public class DatChoController {

    @Autowired
    private DatChoService datChoService;

    @PostMapping("/create")
    public DatCho createDatCho(@RequestBody DatCho datCho){
        return datChoService.createDatCho(datCho);
    }

    @PutMapping("/update/{id}")
    public DatCho updateDatCho(@PathVariable("id") String id, @RequestBody DatCho datCho){
        return datChoService.updateDatCho(String.valueOf(id),datCho);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteDatCho(@PathVariable("id") String id){
        return datChoService.deleteDatCho(String.valueOf(id));
    }

    @GetMapping("/read")
    public List<DatCho> readAllDatCho(){
        return datChoService.readAllDatCho();
    }

}
