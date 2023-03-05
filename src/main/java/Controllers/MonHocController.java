/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.DataContext;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author truon
 */
public class MonHocController {
    DataContext _context ;

    public MonHocController() {
    }

    public MonHocController(DataContext _context) {
        this._context = _context;
    }
    public ArrayList<Models.MonHoc> Get()
    {
        return _context.MonHocs;
    }
    public Models.MonHoc GetID(String ID)
    {
        Models.MonHoc  value;
        int size = _context.MonHocs.size();
        for(int i = 0 ;i<size;i++)
        {
            if(_context.MonHocs.get(i).getMaMonHoc().trim() == ID.trim())
            {
                return _context.MonHocs.get(i);
                        }
           
        }
        return null;
    }
    public boolean Add(Models.MonHoc body)
    {
        boolean valid = checkIsValid(body.getMaMonHoc());
        if(valid)
        {
            return false;
        }
        _context.MonHocs.add(body);
        return true;
    }
    public boolean checkIsValid(String ID)
    {
        for(int i= 0;i<_context.MonHocs.size();i++)
        {
            if(_context.MonHocs.get(i).getMaMonHoc() == ID);
            {
            return true;
            }
        }
        return false;
    }
}
