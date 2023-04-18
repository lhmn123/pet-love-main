package com.stc.petlove.service;

import com.stc.petlove.entities.DatCho;
import com.stc.petlove.entities.embedded.ThongTinDatCho;
import com.stc.petlove.exceptions.NotFoundException;
import com.stc.petlove.utils.EnumTrangThaiDatCho;
import org.springframework.beans.factory.annotation.Autowired;
import com.stc.petlove.repository.DatChoRepository;

import java.util.List;
import java.util.Optional;

public class DatChoServiceImplement implements DatChoService{
    @Autowired
    private DatChoRepository datChoRepository;

    @Override
    public DatCho createDatCho(DatCho datCho) {
        if(datCho!=null){
            return datChoRepository.save(datCho);
        }
        return null;
    }

    @Override
    public DatCho updateDatCho(String id, DatCho datCho) {
        DatCho dc=datChoRepository.findById(id).get();
        if(dc!=null){
            dc.setEmail(datCho.getEmail());
            dc.setCanDan(datCho.getCanDan());
            dc.setThongTinDatChos(datCho.getThongTinDatChos());
            dc.setThoiGian(datCho.getThoiGian());
            dc.setTrangThaiDatCho(EnumTrangThaiDatCho.DAT_CHO.name());
            dc.setTrangThai(true);
            return datChoRepository.save(dc);
        }
        return null;
    }

    @Override
    public boolean deleteDatCho(String id) {
        DatCho datCho=datChoRepository.findById(id).get();
        if(datCho!=null){
            datChoRepository.delete(datCho);
            return true;
        }
        return false;
    }

    @Override
    public List<DatCho> readAllDatCho() {
        return datChoRepository.findAll();
    }
}
