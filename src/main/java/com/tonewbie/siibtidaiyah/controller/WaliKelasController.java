package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.WaliKelasDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.WaliKelasTableModel;
import com.tonewbie.siibtidaiyah.model.WaliKelasModel;
import com.tonewbie.siibtidaiyah.view.WaliKelasView;
import java.util.List;
import javax.swing.JOptionPane;

public class WaliKelasController {
    final private WaliKelasView view;
    private WaliKelasTableModel tableModel;
    private List<WaliKelasModel> list;
    private final static WaliKelasDao dao = HibernateUtil.getWALI_KELAS_DAO();
    public WaliKelasController(WaliKelasView walikelasView) {
        this.view = walikelasView;
    }
    public void showData() {
        list = dao.getWaliKelas();
        tableModel = new WaliKelasTableModel(list);
        this.view.getTblWali().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        WaliKelasModel m = new WaliKelasModel();
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setIdKelas(view.getTxtIdKelas().getText());
            m.setJmlSiswa(Integer.valueOf(view.getSpinNilai().getValue().toString()));

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
       WaliKelasModel m = new WaliKelasModel();
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setIdKelas(view.getTxtIdKelas().getText());
            m.setJmlSiswa(Integer.valueOf(view.getSpinNilai().getValue().toString()));

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        WaliKelasModel m = new WaliKelasModel();
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setIdKelas(view.getTxtIdKelas().getText());
            m.setJmlSiswa(Integer.valueOf(view.getSpinNilai().getValue().toString()));

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtIdKelas().setText("");
        view.getTxtIdPegawai().setText("");
        view.getSpinNilai().setValue(0);
    }
}