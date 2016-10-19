/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.RapotModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class RapotTableModel extends AbstractTableModel {

    List<RapotModel> list = new ArrayList<>();
    private final String[] header = {};

    public RapotTableModel(List<RapotModel> l) {
        this.list = l;
    }

    @Override
    public String getColumnName(int i) {
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
        RapotModel m = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getIdRaport();
            case 1:
                return m.getNis();
            case 2:
                return m.getIdKelas();
            case 3:
                return m.getIdPelajaran();
            case 4:
                return m.getTahunPelajaran();
            case 5:
                return m.getSmester();
            case 6:
                return m.getKkm();
            case 7:
                return m.getNilaiAngka();
            case 8:
                return m.getKeterangan();
            case 9:
                return m.getCatatanGuru();
            default:
                return null;
        }
    }
}
