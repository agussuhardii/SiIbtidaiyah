/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.PegawaiModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class PegawaiTableModel extends AbstractTableModel{
    List<PegawaiModel> list = new ArrayList<>();
    private final String[] header = {};
    
    public PegawaiTableModel(List<PegawaiModel> l) {
        this.list = l;
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
        PegawaiModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0: return m.getIdPegawai();
            case 1: return m.getNip();
            case 2: return m.getNuptk();
            case 3: return m.getNip();
            case 4: return m.getNamaPegawai();
            case 5: return m.getTempatLahir();
            case 6: return m.getTanggalLahir();
            case 7: return m.getJenisKelamin();
            case 8: return m.getAlamat();
            case 9: return m.getHp();
            case 10: return m.getAgama();
            case 11: return m.getJenjang();
            case 12: return m.getLulus();
            case 13: return m.getSk();
            default: return null;
        }
    }  
}
