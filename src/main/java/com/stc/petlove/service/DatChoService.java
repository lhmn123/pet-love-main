package com.stc.petlove.service;

import com.stc.petlove.entities.DatCho;
import com.stc.petlove.entities.embedded.ThongTinDatCho;

import java.util.List;

public interface DatChoService {

    DatCho addThongTinDatCho(String id, ThongTinDatCho thongTinDatCho);

    public DatCho addDatCho(DatCho datCho);

    public DatCho updateDatCho(String id, DatCho datCho);

    public boolean deleteDatCho(String id);

    public List<DatCho> getAllDatCho();
}
