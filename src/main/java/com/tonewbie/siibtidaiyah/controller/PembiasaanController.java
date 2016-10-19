package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.PembiasaanDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.PembiasaanTableModel;
import com.tonewbie.siibtidaiyah.model.PembiasaanModel;
import com.tonewbie.siibtidaiyah.view.PembiasaanView;
import java.util.List;
import javax.swing.JOptionPane;

public class PembiasaanController {
final private PembiasaanView view;
    private PembiasaanTableModel tableModel;
    private List<PembiasaanModel> list;
    private final static PembiasaanDao dao = HibernateUtil.getPEMBIASAAN_DAO();
    public PembiasaanController(PembiasaanView pembiasaanView) {
        this.view = pembiasaanView;
    }
    
    public void showData() {
        list = dao.getPembiasaan();
        tableModel = new PembiasaanTableModel(list);
        this.view.getTblPembiasaan().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        PembiasaanModel m = new PembiasaanModel();
            m.setJenisKegiatan(view.getTxtKegiatan().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNis(view.getTxtNis().getText());
       
                       
        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        PembiasaanModel m = new PembiasaanModel();
            m.setJenisKegiatan(view.getTxtKegiatan().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNis(view.getTxtNis().getText());
       
                       
        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        PembiasaanModel m = new PembiasaanModel();
            m.setJenisKegiatan(view.getTxtKegiatan().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNis(view.getTxtNis().getText());
       
                       
        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtId().setText("");
        view.getTxtKegiatan().setText("");
        view.getSpinNilai().setValue(0);
        view.getTxtNis().setText("");
    }
}
