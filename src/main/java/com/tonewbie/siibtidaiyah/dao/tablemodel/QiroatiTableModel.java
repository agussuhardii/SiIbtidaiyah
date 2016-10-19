/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.QiroatiModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class QiroatiTableModel extends AbstractTableModel{
    List<QiroatiModel> list = new ArrayList<>();
    final private String header[] = {};

    public QiroatiTableModel(List<QiroatiModel> l) {
        this.list = l;
    }
    
    @Override
    public String getColumnName(int i){
        return header[i];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        QiroatiModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0 : return m.getJilid();
            case 1 : return m.getHalaman();
            case 2 : return m.getAyat();
            case 3 : return m.getNilaiAngka();
            case 4 : return m.getNis();
            default:return null;
        }
    }
    
    
}
