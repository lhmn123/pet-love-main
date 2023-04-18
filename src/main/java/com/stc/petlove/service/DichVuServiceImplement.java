package com.stc.petlove.service;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.embedded.GiaDichVu;
import com.stc.petlove.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import com.stc.petlove.repository.DichVuRepository;

import java.util.List;
import java.util.Optional;

public class DichVuServiceImplement implements DichVuService{

    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public DichVu addGiaDichVu(String id, GiaDichVu giaDichVu) {
        Optional<DichVu> dichVu=dichVuRepository.findById(id);
        if(dichVu==null){
            throw new NotFoundException(String.format("Id  %s không tồn tại",id));
        }
        dichVu.get().getGiaDichVus().add(giaDichVu);
        return dichVuRepository.save(dichVu.get());
    }

    @Override
    public DichVu addDichVu(DichVu dichVu) {
        return null;
    }

    @Override
    public DichVu updateDichVu(String id, DichVu dichVu) {
        return null;
    }

    @Override
    public boolean deleteDichVu(String id) {
        return false;
    }

    @Override
    public List<DichVu> getAllDichVu() {
        return null;
    }
}
