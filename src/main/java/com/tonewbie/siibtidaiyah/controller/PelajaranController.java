package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.PelajaranDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.PelajaranTableModel;
import com.tonewbie.siibtidaiyah.form.PelajaranView;
import com.tonewbie.siibtidaiyah.model.PelajaranModel;
import java.util.List;
import javax.swing.JOptionPane;

public class PelajaranController {
final private PelajaranView view;
    private PelajaranTableModel tableModel;
    private List<PelajaranModel> list;
    private final static PelajaranDao dao = HibernateUtil.getPELAJARAN_DAO();
    public PelajaranController(PelajaranView pelajaranView) {
        this.view = pelajaranView;
    }
    
    public void showData() {
        list = dao.getPelajaran();
        tableModel = new PelajaranTableModel(list);
        this.view.getTblPelajaran().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        PelajaranModel m = new PelajaranModel();
            m.setIdPelajaran(view.getTxtIdPelajaran().getText());
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setNamaPelajaran(view.getTxtNamaPelajaran().getText());

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        PelajaranModel m = new PelajaranModel();
            m.setIdPelajaran(view.getTxtIdPelajaran().getText());
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setNamaPelajaran(view.getTxtNamaPelajaran().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        PelajaranModel m = new PelajaranModel();
            m.setIdPelajaran(view.getTxtIdPelajaran().getText());
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setNamaPelajaran(view.getTxtNamaPelajaran().getText());

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtIdPegawai().setText("");
        view.getTxtIdPelajaran().setText("");
        view.getTxtNamaPelajaran().setText("");
    }
}
   