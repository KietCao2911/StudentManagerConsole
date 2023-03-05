/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truon
 */
public class GiangVien {
    String MaGiangVien;
    String TenGiangVien;
    int Tuoi;
    boolean GioiTinh;
    List<GiangVien_LopHoc_MonHoc> giangVien_LopHoc_MonHocs = new ArrayList<>();
    public GiangVien(String MaGiangVien, String TenGiangVien, int Tuoi, boolean GioiTinh) {
        this.MaGiangVien = MaGiangVien;
        this.TenGiangVien = TenGiangVien;
        this.Tuoi = Tuoi;
        this.GioiTinh = GioiTinh;
    }

    public GiangVien() {
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public String getTenGiangVien() {
        return TenGiangVien;
    }

    public void setTenGiangVien(String TenGiangVien) {
        this.TenGiangVien = TenGiangVien;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
}
