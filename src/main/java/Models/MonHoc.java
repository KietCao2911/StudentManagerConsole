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
public class MonHoc {
    String MaMonHoc;
    String TenMonHoc;
List<GiangVien_LopHoc_MonHoc> giangVien_LopHoc_MonHocs = new ArrayList<>();
    public MonHoc(String MaMonHoc, String TenMonHoc) {
        this.MaMonHoc = MaMonHoc;
        this.TenMonHoc = TenMonHoc;
    }

    public MonHoc() {
    }

    public String getMaMonHoc() {
        return MaMonHoc;
    }

    public void setMaMonHoc(String MaMonHoc) {
        this.MaMonHoc = MaMonHoc;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String TenMonHoc) {
        this.TenMonHoc = TenMonHoc;
    }
    
}
