/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.PembiasaanModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class PembiasaanTableModel extends AbstractTableModel{
    List<PembiasaanModel> list = new ArrayList<>();
    private final String header[] = {};

    public PembiasaanTableModel(List<PembiasaanModel> l) {
        this.list = l;
    }
    
    @Override
    public String getColumnName(int n){
        return header[n];
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
        PembiasaanModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0 : return m.getJenisKegiatan();
            case 1 : return m.getNilaiAngka();
            case 2 : return m.getNilaiHuruf();
            case 3 : return m.getNis();
            default: return null;
        }
    }
    
    
    
    
}
