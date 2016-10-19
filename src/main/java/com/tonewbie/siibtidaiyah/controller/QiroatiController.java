package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.QiroatiDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.QiroatiTableModel;
import com.tonewbie.siibtidaiyah.model.QiroatiModel;
import com.tonewbie.siibtidaiyah.view.QiroatiView;
import java.util.List;
import javax.swing.JOptionPane;

public class QiroatiController {
final private QiroatiView view;
    private QiroatiTableModel tableModel;
    private List<QiroatiModel> list;
    private final static QiroatiDao dao = HibernateUtil.getQIROATI_DAO();
    
    public QiroatiController(QiroatiView qiroatiView) {
        this.view = qiroatiView;
    }
    
    public void showData() {
        list = dao.getQiroati();
        tableModel = new QiroatiTableModel(list);
        this.view.getTblQiroati().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        QiroatiModel m = new QiroatiModel();
            m.setJilid(view.getTxtJilid().getText());
            m.setHalaman(Integer.valueOf(view.getSpinHalaman().getValue().toString()));
            m.setAyat(view.getTxtAyat().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinAngka().getValue().toString()));
        
        

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        QiroatiModel m = new QiroatiModel();
            m.setJilid(view.getTxtJilid().getText());
            m.setHalaman(Integer.valueOf(view.getSpinHalaman().getValue().toString()));
            m.setAyat(view.getTxtAyat().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinAngka().getValue().toString()));
        
        

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        QiroatiModel m = new QiroatiModel();
            m.setJilid(view.getTxtJilid().getText());
            m.setHalaman(Integer.valueOf(view.getSpinHalaman().getValue().toString()));
            m.setAyat(view.getTxtAyat().getText());
            m.setNilaiAngka(Integer.valueOf(view.getSpinAngka().getValue().toString()));
        
        

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtAyat().setText("");
        view.getTxtJilid().setText("");
        view.getSpinAngka().setValue(0);
        view.getSpinHalaman().setValue(0);
    }
}
   