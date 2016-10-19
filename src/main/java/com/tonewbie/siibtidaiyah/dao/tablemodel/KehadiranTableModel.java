/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.KehadiranModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class KehadiranTableModel extends AbstractTableModel{
    private List<KehadiranModel> list = new ArrayList<>();
    final private String Header[] = {"Nis", "Kehadiran", "Ijin", "Sakit", "Tanpa Keterangan"};

    public KehadiranTableModel(List<KehadiranModel> l) {
        this.list = l;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return Header[columnIndex];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return Header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KehadiranModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0: return m.getNis();
            case 1: return m.getKehadiran();
            case 2: return m.getIjin();
            case 3: return m.getSakit();
            case 4: return m.getTanpaKeterangan();
            default:return  null;
        }
    }

    
}
