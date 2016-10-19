
package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.TahfidDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.TahfidTableModel;
import com.tonewbie.siibtidaiyah.model.TahfidModel;
import com.tonewbie.siibtidaiyah.view.TahfidView;
import java.util.List;
import javax.swing.JOptionPane;

public class TahfidController {
final private TahfidView view;
    private TahfidTableModel tableModel;
    private List<TahfidModel> list;
    private final static TahfidDao dao = HibernateUtil.getTAHFID_DAO();
    
    public TahfidController(TahfidView tahfidView) {
        this.view = tahfidView;
    }
    public void showData() {
        list = dao.getTahfid();
        tableModel = new TahfidTableModel(list);
        this.view.getTblTahfid().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        TahfidModel m = new TahfidModel();
            m.setSurat(view.getTxtSurat().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNis(view.getTxtNis().getText());

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
       TahfidModel m = new TahfidModel();
            m.setSurat(view.getTxtSurat().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNis(view.getTxtNis().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        TahfidModel m = new TahfidModel();
            m.setSurat(view.getTxtSurat().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinNilai().getValue().toString()));
            m.setNis(view.getTxtNis().getText());

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtSurat().setText("");
        view.getTxtNis().setText("");
        view.getSpinNilai().setValue(0);
        
    }
}