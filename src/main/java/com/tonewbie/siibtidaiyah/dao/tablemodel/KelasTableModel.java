package com.tonewbie.siibtidaiyah.dao.tablemodel;

import com.tonewbie.siibtidaiyah.model.KelasModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KelasTableModel extends AbstractTableModel {

    private List<KelasModel> list = new ArrayList<>();
    final private String kelasHeader[] = {"ID", "Kelas"};//(id dan kelas) berdasarkan fild yang ada di database. beleh di rubah tetapih jumlah harus sesuai dengan yang ada di database

    public KelasTableModel(List<KelasModel> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return kelasHeader.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KelasModel model = list.get(rowIndex);
        
        switch(columnIndex){//jumlah dan fild berdasarkan yang ada di database
            case 0 : return model.getIdKelas();
            case 1 : return model.getNamaKelas();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return kelasHeader[columnIndex];
    }

}
