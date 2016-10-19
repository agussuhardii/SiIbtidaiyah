/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.StatusPegawaiModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class StatusPegawaiTableModel extends AbstractTableModel{
    List<StatusPegawaiModel>list = new ArrayList<>();
    private final String[] header = {};

    public StatusPegawaiTableModel(List<StatusPegawaiModel> l) {
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
        StatusPegawaiModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0 : return m.getIdPegawai();
            case 1 : return m.getStatus();
            case 2 : return m.getTempat();
            case 3 : return m.getTugasUtama();
            case 4 : return m.getTugasLain();
            default:return null;
        }
    }
}
