/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.KelasModel;
import com.tonewbie.siibtidaiyah.model.SiswaModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author agus
 */
public class SiswaTableModel extends AbstractTableModel {

    
    
    private List<SiswaModel> list = new ArrayList<>();
    private final String header[] = {""};

    public SiswaTableModel(List<SiswaModel> l) {
        this.list = l;
    }
    
    
    

    @Override
    public String getColumnName(int ColumnIndex) {
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
        SiswaModel m = list.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return m.getNisn();
            case 1:
                return m.getNik();
            case 2:
                return m.getNamaSiswa();
            case 3:
                return m.getTempatLahir();
            case 4:
                return m.getTanggalLahir();
            case 5:
                return m.getJenisKelamin();
            case 6:
                return m.getAsalSekolah();
            case 7:
                return m.getHobby();
            case 8:
                return m.getCita();
            case 9:
                return m.getJumlahSaudara();
            case 10:
                return m.getAyah();
            case 11:
                return m.getAlamat();
            case 12:
                return m.getLkk();
            case 13:
                return m.getAgama();
            default:
                return null;
        }

    }

}
