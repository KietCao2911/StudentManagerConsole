/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author truon
 */
public class SinhVien {
    private String Ten;
    private int Tuoi;
    private int MSSV; 
    private String NgaySinh;
    private boolean GioiTinh;

    public SinhVien(String Ten, int Tuoi, int MSSV, String NgaySinh, boolean GioiTinh) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.MSSV = MSSV;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    public SinhVien() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
}
