package com.stc.petlove.controller;

import com.stc.petlove.entities.DatCho;
import com.stc.petlove.entities.embedded.ThongTinDatCho;
import com.stc.petlove.service.DatChoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datcho")
public class DatChoController {

    @Autowired
    private DatChoService datChoService;


    @GetMapping("/")
    public String test(){
        return "datcho";
    }

    @PostMapping("/add")
    public DatCho addDatCho(@RequestBody DatCho datCho){
        return datChoService.addDatCho(datCho);
    }

    @PostMapping("/addThongTinDC/{id}")
    public DatCho addThongTinDc(@PathVariable("id") String id, @RequestBody ThongTinDatCho thongTinDatCho){
        return datChoService.addThongTinDatCho(id,thongTinDatCho);
    }

    @PutMapping("/update")
    public DatCho updateDatCho(@RequestParam("id") String id, @RequestBody DatCho datCho){
        return datChoService.updateDatCho(String.valueOf(id),datCho);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteDatCho(@PathVariable("id") String id){
        return datChoService.deleteDatCho(String.valueOf(id));
    }

    @GetMapping("/list")
    public List<DatCho> getAllDatCho(){
        return datChoService.getAllDatCho();
    }

}
