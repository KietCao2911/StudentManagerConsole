/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanager;

import Controllers.LopHocController;
import Controllers.MonHocController;
import Models.DataContext;
import Models.LopHoc;
import Models.MonHoc;

/**
 *
 * @author truon
 */
public class StudentManager {

    public static void main(String[] args) {
        DataContext _context = new DataContext();
        MonHocController lhc = new MonHocController(_context);
        MonHoc lh = new MonHoc("19TINTT","Lop tin tien tien");
        lhc.Add(lh);
        lhc.Add(lh);
        lhc.Add(lh);
        lhc.Get();
        lhc.Get();
    }
}
