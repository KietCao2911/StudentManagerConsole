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
public class LopHoc {
    String MaLop;
    String TenLop;
List<GiangVien_LopHoc_MonHoc> giangVien_LopHoc_MonHocs = new ArrayList<>();
    public LopHoc(String MaLop, String TenLop) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
    }
    
    public LopHoc() {
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
    
    
    
}
