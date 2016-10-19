package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.KehadiranDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.KehadiranTableModel;
import com.tonewbie.siibtidaiyah.model.KehadiranModel;
import com.tonewbie.siibtidaiyah.view.KehadiranView;
import java.util.List;
import javax.swing.event.ListSelectionEvent;

public class KehadiranController {

    final private KehadiranView view;
    private KehadiranTableModel tableModel;
    private List<KehadiranModel> list;
    private final static KehadiranDao dao = HibernateUtil.getKEHADIRAN_DAO();

    public KehadiranController(KehadiranView kehadiranView) {
        this.view = kehadiranView;
    }

    public void showData() {
        list = dao.getKehadiran();
        tableModel = new KehadiranTableModel(list);
        this.view.getTblKehadiran().setModel(tableModel);
        clean();
    }

    
    //metode simpan ke table Kehadiran
    public void insert() {
        KehadiranModel m = new KehadiranModel();
            m.setNis(view.getTxtNis().getText());
            m.setKehadiran(Integer.valueOf(view.getSpinKehadiran().getValue().toString()));
            m.setIjin(Integer.valueOf(view.getSpinIjin().getValue().toString()));
            m.setSakit(Integer.valueOf(view.getSpinSakit().getValue().toString()));
            m.setTanpaKeterangan(Integer.valueOf(view.getSpinTanpaKeterangan().getValue().toString()));
        dao.save(m);
        //showData();
    }

    public void update() {//methode update
        KehadiranModel m = new KehadiranModel();
            m.setNis(view.getTxtNis().getText());
            m.setKehadiran(Integer.valueOf(view.getSpinKehadiran().getValue().toString()));
            m.setIjin(Integer.valueOf(view.getSpinIjin().getValue().toString()));
            m.setSakit(Integer.valueOf(view.getSpinSakit().getValue().toString()));
            m.setTanpaKeterangan(Integer.valueOf(view.getSpinTanpaKeterangan().getValue().toString()));
        dao.update(m);
    }

    public void selectedData(){
        view.getTblKehadiran().getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if(view.getTblKehadiran().getSelectedRow() != -1){
                int i = view.getTblKehadiran().getSelectedRow();
                view.getTxtNis().setText(view.getTblKehadiran().getValueAt(i, 0).toString());
                view.getSpinKehadiran().setValue(view.getTblKehadiran().getValueAt(i, 1).toString());
                view.getSpinIjin().setValue(view.getTblKehadiran().getValueAt(i, 2).toString());
                view.getSpinSakit().setValue(view.getTblKehadiran().getValueAt(i, 3).toString());
                view.getSpinTanpaKeterangan().setValue(view.getTblKehadiran().getValueAt(i, 4).toString());
                
                
            }
        });
    }
    

    public void clean() {//metode membersihkan textfild
        view.getTxtNis().setText("");
        view.getSpinKehadiran().setValue(0);
        view.getSpinIjin().setValue(0);
        view.getSpinSakit().setValue(0);
        view.getSpinTanpaKeterangan().setValue(0);
    }
}
