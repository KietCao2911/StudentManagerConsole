/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author truon
 */
public class GiangVien_LopHoc_MonHoc {
    String MaGiangVien;
    String MaLopHoc;
    String MaMonHoc;
    GiangVien GiangVien;
    LopHoc LopHoc;
    MonHoc MonHoc;

    public GiangVien_LopHoc_MonHoc(String MaGiangVien, String MaLopHoc, String MaMonHoc, GiangVien GiangVien, LopHoc LopHoc, MonHoc MonHoc) {
        this.MaGiangVien = MaGiangVien;
        this.MaLopHoc = MaLopHoc;
        this.MaMonHoc = MaMonHoc;
        this.GiangVien = GiangVien;
        this.LopHoc = LopHoc;
        this.MonHoc = MonHoc;
    }

    public GiangVien_LopHoc_MonHoc() {
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public GiangVien getGiangVien() {
        return GiangVien;
    }

    public void setGiangVien(GiangVien GiangVien) {
        this.GiangVien = GiangVien;
    }

    public LopHoc getLopHoc() {
        return LopHoc;
    }

    public void setLopHoc(LopHoc LopHoc) {
        this.LopHoc = LopHoc;
    }

    public MonHoc getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(MonHoc MonHoc) {
        this.MonHoc = MonHoc;
    }
    
}
