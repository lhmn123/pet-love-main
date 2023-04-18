package com.stc.petlove.service;

import com.stc.petlove.entities.LoaiThuCung;
import com.stc.petlove.repository.LoaiThuCungRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoaiThuCungServiceImplement implements LoaiThuCungService {

    @Autowired
    private LoaiThuCungRepository loaiThuCungRepository;

    @Override
    public LoaiThuCung createLoaiThuCung(LoaiThuCung loaiThuCung) {
        if(loaiThuCung!=null){
            return loaiThuCungRepository.save(loaiThuCung);
        }
        return null;
    }

    @Override
    public LoaiThuCung updateLoaiThuCung(String id, LoaiThuCung loaiThuCung) {
        LoaiThuCung ltc=loaiThuCungRepository.findById(id).get();
        if(ltc!=null){
            ltc.setMaLoaiThuCung(loaiThuCung.getMaLoaiThuCung());
            ltc.setTenLoaiThuCung(loaiThuCung.getTenLoaiThuCung());
            ltc.setTrangThai(loaiThuCung.isTrangThai());
            return loaiThuCungRepository.save(ltc);
        }
        return null;
    }

    @Override
    public boolean deteleLoaiThuCung(String id) {
        LoaiThuCung loaiThuCung=loaiThuCungRepository.findById(id).get();
        if(loaiThuCung!=null){
            loaiThuCungRepository.delete(loaiThuCung);
            return true;
        }
        return false;
    }

    @Override
    public List<LoaiThuCung> readAllLoaiThuCung() {
        return loaiThuCungRepository.findAll();
    }

}
