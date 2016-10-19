/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.NilaiExtraModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class NilaiExtraTableModel extends AbstractTableModel {

    private List<NilaiExtraModel> list = new ArrayList<>();
    final private String[] header = {};

    public NilaiExtraTableModel(List<NilaiExtraModel> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return header[columnIndex];
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
        NilaiExtraModel m = list.get(rowIndex);
        switch(columnIndex){
            case 0: return m.getIdExtra();
            case 1: return m.getJenisExtra();
            case 2: return m.getNilaiAngka();
            case 3: return m.getNilaiHuruf();
            case 4: return m.getNisSiswa();
            default: return null;
        }
    }
    
    
}
