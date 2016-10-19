package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.view.NilaiExtraView;
import java.util.List;
import javax.swing.JOptionPane;
import com.tonewbie.siibtidaiyah.dao.NilaiExtraDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.NilaiExtraTableModel;
import com.tonewbie.siibtidaiyah.model.NilaiExtraModel;

public class NilaiEkstrakurikulerController {
    
    final private NilaiExtraView view;
    private NilaiExtraTableModel tableModel;
    private List<NilaiExtraModel> list;
    private final static NilaiExtraDao dao = HibernateUtil.getNILAI_EEKSTRA_KULIKULER_DAO();

    public NilaiEkstrakurikulerController(NilaiExtraView view) {
        this.view = view;
    }
    
    
    public void showData() {
        list = dao.getNilaiEkstrakulikuler();
        tableModel = new NilaiExtraTableModel(list);
        this.view.getTblNilai().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        NilaiExtraModel m = new NilaiExtraModel();
            m.setIdExtra(view.getTxtId().getText());
            m.setJenisExtra(view.getTxtJenis().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNisSiswa(view.getTxtNis().getText());
        

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        NilaiExtraModel m = new NilaiExtraModel();
            m.setIdExtra(view.getTxtId().getText());
            m.setJenisExtra(view.getTxtJenis().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNisSiswa(view.getTxtNis().getText());
        

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        NilaiExtraModel m = new NilaiExtraModel();
            m.setIdExtra(view.getTxtId().getText());
            m.setJenisExtra(view.getTxtJenis().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNisSiswa(view.getTxtNis().getText());
        

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtId().setText("");
        view.getTxtJenis().setText("");
        view.getTxtId().setText("");
        view.getSpinNilai().setValue(0);
    }
}

