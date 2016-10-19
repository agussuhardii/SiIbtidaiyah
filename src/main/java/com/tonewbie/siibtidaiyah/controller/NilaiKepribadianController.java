package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.NilaiKepribadianDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.NilaiKepribadianTableModel;
import com.tonewbie.siibtidaiyah.dao.tablemodel.NilaiKepribadianTableModel;
import com.tonewbie.siibtidaiyah.model.NilaiKepribadianModel;
import com.tonewbie.siibtidaiyah.model.NilaiKepribadianModel;
import com.tonewbie.siibtidaiyah.view.NilaiKepribadianView;
import com.tonewbie.siibtidaiyah.view.NilaiKepribadianView;
import java.util.List;
import javax.swing.JOptionPane;

public class NilaiKepribadianController {
final private NilaiKepribadianView view;
    private NilaiKepribadianTableModel tableModel;
    private List<NilaiKepribadianModel> list;
    private final static NilaiKepribadianDao dao = HibernateUtil.getNILAI_KEPRIBADIAN_DAO();
    
    public NilaiKepribadianController(NilaiKepribadianView nilaikepribadianView) {
        this.view = nilaikepribadianView;
    }
    public void showData() {
        list = dao.getNilaiKepribadian();
        tableModel = new NilaiKepribadianTableModel(list);
        this.view.getTblNilaiKepribadian().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        NilaiKepribadianModel m = new NilaiKepribadianModel();
            m.setNisSiswa(view.getTxtNis().getText());
            m.setPerkembangan(view.getTxtPerkembangan().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        NilaiKepribadianModel m = new NilaiKepribadianModel();
            m.setNisSiswa(view.getTxtNis().getText());
            m.setPerkembangan(view.getTxtPerkembangan().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        NilaiKepribadianModel m = new NilaiKepribadianModel();
            m.setNisSiswa(view.getTxtNis().getText());
            m.setPerkembangan(view.getTxtPerkembangan().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtNis().setText("");
        view.getTxtPerkembangan().setText("");
        view.getSpinNilai().setValue(0);
    }
}
