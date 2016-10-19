package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.KelasDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.KelasTableModel;
import com.tonewbie.siibtidaiyah.model.KelasModel;
import com.tonewbie.siibtidaiyah.view.KelasView;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class KelasController {

    final private KelasView view;
    private KelasTableModel tableModel;
    private List<KelasModel> list;
    private final static KelasDao dao = HibernateUtil.getKelasDao();// untuk koneksi ke database

    public KelasController(KelasView view) {
        this.view = view;
    }



    

    //methode untuk menampilkan data ke table model
    public void showData() {
        list = dao.getKelass();
        tableModel = new KelasTableModel(list);
        this.view.getTblKelas().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        KelasModel m = new KelasModel();
        m.setIdKelas(view.getTxtId().getText());
        m.setNamaKelas(view.getTxtKelas().getText());

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        KelasModel m = new KelasModel();
        m.setIdKelas(view.getTxtId().getText());
        m.setNamaKelas(view.getTxtKelas().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "Update record");
        showData();
    }

    public void delete() {//methode delete
        KelasModel m = new KelasModel();
        m.setIdKelas(view.getTxtId().getText());
        m.setNamaKelas(view.getTxtKelas().getText());
        int a = JOptionPane.showConfirmDialog(null, "yakin Ingin menghapus id " + view.getTxtId().getText(), "Hapus", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            dao.delete(m);
            JOptionPane.showMessageDialog(null, "Delete Record");
            showData();
        }

    }
    
    public void selectedData(){
        view.getTblKelas().getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if(view.getTblKelas().getSelectedRow() != -1){
                int i = view.getTblKelas().getSelectedRow();
                view.getTxtId().setText(view.getTblKelas().getValueAt(i, 0).toString());
                view.getTxtKelas().setText(view.getTblKelas().getValueAt(i, 1).toString());
                
            }
        });
    }

    public void clean() {//metode membersihkan textfild
        view.getTxtId().setText("");
        view.getTxtKelas().setText("");
    }
}
