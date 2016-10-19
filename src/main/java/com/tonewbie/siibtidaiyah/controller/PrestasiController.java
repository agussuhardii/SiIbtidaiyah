package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.PrestasiDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.PrestasiTableModel;
import com.tonewbie.siibtidaiyah.form.PrestasiView;
import com.tonewbie.siibtidaiyah.model.PrestasiModel;
import com.tonewbie.siibtidaiyah.model.enumfile.PrestasiEnum;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestasiController {
final private PrestasiView view;
    private PrestasiTableModel tableModel;
    private List<PrestasiModel> list;
    private final static PrestasiDao dao = HibernateUtil.getPRESTASI_DAO();
    public PrestasiController(PrestasiView prestasiView) {
        this.view = prestasiView;
    }
    public void showData() {
        list = dao.getPrestasi();
        tableModel = new PrestasiTableModel(list);
        this.view.getTblPrestasi().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        PrestasiModel m = new PrestasiModel();
            m.setIdPrestasi(view.getTxtId().getText());
            m.setNamaPrestasi(view.getTxtNama().getText());
                if(view.getComboJenis().getSelectedItem().equals("Beasiswa")){
                    m.setPrestasi(PrestasiEnum.Beasiswa);
                }else if(view.getComboJenis().getSelectedItem().equals("Lomba")){
                    m.setPrestasi(PrestasiEnum.Lomba);
                }else if(view.getComboJenis().getSelectedItem().equals("Rengking")){
                    m.setPrestasi(PrestasiEnum.Rengking);
                }
            m.setTingkatPrestasi(view.getTxtTingkat().getText());

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        PrestasiModel m = new PrestasiModel();
            m.setIdPrestasi(view.getTxtId().getText());
            m.setNamaPrestasi(view.getTxtNama().getText());
                if(view.getComboJenis().getSelectedItem().equals("Beasiswa")){
                    m.setPrestasi(PrestasiEnum.Beasiswa);
                }else if(view.getComboJenis().getSelectedItem().equals("Lomba")){
                    m.setPrestasi(PrestasiEnum.Lomba);
                }else if(view.getComboJenis().getSelectedItem().equals("Rengking")){
                    m.setPrestasi(PrestasiEnum.Rengking);
                }
            m.setTingkatPrestasi(view.getTxtTingkat().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        PrestasiModel m = new PrestasiModel();
            m.setIdPrestasi(view.getTxtId().getText());
            m.setNamaPrestasi(view.getTxtNama().getText());
                if(view.getComboJenis().getSelectedItem().equals("Beasiswa")){
                    m.setPrestasi(PrestasiEnum.Beasiswa);
                }else if(view.getComboJenis().getSelectedItem().equals("Lomba")){
                    m.setPrestasi(PrestasiEnum.Lomba);
                }else if(view.getComboJenis().getSelectedItem().equals("Rengking")){
                    m.setPrestasi(PrestasiEnum.Rengking);
                }
            m.setTingkatPrestasi(view.getTxtTingkat().getText());

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtId().setText("");
        view.getTxtNama().setText("");
        view.getComboJenis().setSelectedIndex(0);
        view.getTxtTingkat().setText("");
        
    }
}
   