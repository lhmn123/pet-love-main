package com.stc.petlove.service;

import com.stc.petlove.entities.TaiKhoan;

import java.util.List;

public interface TaiKhoanService {

    public TaiKhoan createTaiKhoan (TaiKhoan taiKhoan);

    public TaiKhoan updateTaiKhoan(String id, TaiKhoan taiKhoan);

    public boolean deleteTaiKhoan(String id);

    public List<TaiKhoan> readAllTaiKhoan();

}
