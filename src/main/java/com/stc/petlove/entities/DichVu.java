package com.stc.petlove.entities;

import com.stc.petlove.entities.embedded.GiaDichVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 4/11/23
 * Time      : 9:35 PM
 * Filename  : DichVu
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "dich-vu")
public class DichVu {

    @Id
    private String id;

    @Indexed(unique=true)
    // mã dịch vụ không được trùng
    private String maDichVu;

    private String tenDichVu;

    // nội dung là html
    private String noiDung;

    // Giá dịch vụ phụ thuộc vào loại thú cưng và cân nặng của thú cưng
    private List<GiaDichVu> giaDichVus = new ArrayList<>();

    private boolean trangThai = true;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMaDichVu() {
        return maDichVu;
    }
    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }
    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getNoiDung() {
        return noiDung;
    }
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public List<GiaDichVu> getGiaDichVus() {
        return giaDichVus;
    }
    public void setGiaDichVus(List<GiaDichVu> giaDichVus) {
        this.giaDichVus = giaDichVus;
    }

    public Boolean isTrangThai() {
        return trangThai;
    }
    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

}
