package com.stc.petlove.service;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.embedded.GiaDichVu;

import java.util.List;

public interface DichVuService {

    public DichVu createDichVu(DichVu dichVu);

    public DichVu updateDichVu(String id, DichVu dichVu);

    public boolean deleteDichVu(String id);

    public List<DichVu> readAllDichVu();

}
