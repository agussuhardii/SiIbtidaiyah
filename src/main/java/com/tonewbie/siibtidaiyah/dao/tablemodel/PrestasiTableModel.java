/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.PrestasiModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class PrestasiTableModel extends AbstractTableModel{
    List<PrestasiModel> list = new ArrayList<>();
    final private String[] header = {};

    public PrestasiTableModel(List<PrestasiModel> list) {
        this.list = list;
    }
    
    @Override
    public String getColumnName(int ColumnIndex){
        return header[ColumnIndex];
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
        PrestasiModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0 : return m.getIdPrestasi();
            case 1 : return m.getNamaPrestasi();
            case 2 : return m.getPrestasi();
            case 3 : return m.getTingkatPrestasi();
            default: return null;
        }
    }
    
    
    
}
