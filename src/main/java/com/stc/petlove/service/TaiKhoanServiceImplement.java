package com.stc.petlove.service;

import com.stc.petlove.entities.TaiKhoan;
import com.stc.petlove.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaiKhoanServiceImplement implements TaiKhoanService{

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;


    @Override
    public TaiKhoan createTaiKhoan(TaiKhoan taiKhoan) {
        if (taiKhoan!=null){
            return taiKhoanRepository.save(taiKhoan);
        }
        return null;
    }

    @Override
    public TaiKhoan updateTaiKhoan(String id, TaiKhoan taiKhoan) {
        TaiKhoan tk=taiKhoanRepository.findById(id).get();
        if(tk!=null){
            tk.setName(taiKhoan.getName());
            tk.setEmail(taiKhoan.getEmail());
            tk.setPassword(taiKhoan.getPassword());
            tk.setDienThoai(taiKhoan.getDienThoai());
            tk.setRoles(taiKhoan.getRoles());
            tk.setTrangThai(taiKhoan.isTrangThai());
            return taiKhoanRepository.save(tk);
        }
        return null;
    }

    @Override
    public boolean deleteTaiKhoan(String id) {
        TaiKhoan taiKhoan=taiKhoanRepository.findById(id).get();
        if(taiKhoan!=null){
            taiKhoanRepository.delete(taiKhoan);
            return true;
        }
        return false;
    }

    @Override
    public List<TaiKhoan> readAllTaiKhoan() {
        return taiKhoanRepository.findAll();
    }

}
