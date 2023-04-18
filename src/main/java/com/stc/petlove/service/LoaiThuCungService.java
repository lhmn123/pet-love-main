package com.stc.petlove.service;

import com.stc.petlove.entities.LoaiThuCung;

import java.util.List;

public interface LoaiThuCungService {

    public LoaiThuCung createLoaiThuCung(LoaiThuCung loaiThuCung);

    public LoaiThuCung updateLoaiThuCung(String id, LoaiThuCung loaiThuCung);

    public boolean deteleLoaiThuCung(String id);

    public List<LoaiThuCung> readAllLoaiThuCung();

}
