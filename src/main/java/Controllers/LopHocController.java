/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.DataContext;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;

/**
 *
 * @author truon
 */
public class LopHocController {
    DataContext _context;

    public LopHocController(DataContext _context) {
        this._context = _context;
    }

    

    public LopHocController() {
    }
    public ArrayList<Models.LopHoc> Get()
    {
        return _context.LopHocs;
    }
    public Models.LopHoc Add(Models.LopHoc body)
    {
        _context.LopHocs.add(body);
        return body;
    }
}
