/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.NilaiKepribadianModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class NilaiKepribadianTableModel extends AbstractTableModel{
    List<NilaiKepribadianModel> list = new ArrayList<>();
    private final String[] header = {};

    public NilaiKepribadianTableModel(List<NilaiKepribadianModel> l) {
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
        NilaiKepribadianModel m = list.get(rowIndex);
        switch (columnIndex){
            case 0 : return m.getNisSiswa();
            case 1 : return m.getPerkembangan();
            case 2 : return m.getNilaiAngka();
            default:return null;
        }
    }
    
}
