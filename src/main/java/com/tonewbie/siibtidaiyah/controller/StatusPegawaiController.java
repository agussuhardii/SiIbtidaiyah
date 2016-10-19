package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.StatusPegawaiDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.StatusPegawaiTableModel;
import com.tonewbie.siibtidaiyah.model.StatusPegawaiModel;
import com.tonewbie.siibtidaiyah.model.enumfile.StatusPegawaiEnum;
import com.tonewbie.siibtidaiyah.model.enumfile.TugasUtamaPegawaiEnum;
import com.tonewbie.siibtidaiyah.view.StatusPegawaiView;
import java.util.List;
import javax.swing.JOptionPane;

public class StatusPegawaiController {
final private StatusPegawaiView view;
    private StatusPegawaiTableModel tableModel;
    private List<StatusPegawaiModel> list;
    private final static StatusPegawaiDao dao = HibernateUtil.getSTATUS_PEGAWAI_DAO();
    
    public StatusPegawaiController(StatusPegawaiView statuspegawaiView) {
        this.view = statuspegawaiView;
    }
    
    public void showData() {
        list = dao.getStatusPegawai();
        tableModel = new StatusPegawaiTableModel(list);
        this.view.getTblStatusPegawai().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        StatusPegawaiModel m = new StatusPegawaiModel();
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setStatus(StatusPegawaiEnum.PNS);
            m.setTempat(view.getTxtTempatTugas().getText());
            m.setTugasUtama(TugasUtamaPegawaiEnum.Keamanan);
            m.setTugasLain(view.getTxtTugasLuar().getText());

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        StatusPegawaiModel m = new StatusPegawaiModel();
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setStatus(StatusPegawaiEnum.PNS);
            m.setTempat(view.getTxtTempatTugas().getText());
            m.setTugasUtama(TugasUtamaPegawaiEnum.Keamanan);
            m.setTugasLain(view.getTxtTugasLuar().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void delete() {//methode delete
        StatusPegawaiModel m = new StatusPegawaiModel();
            m.setIdPegawai(view.getTxtIdPegawai().getText());
            m.setStatus(StatusPegawaiEnum.PNS);
            m.setTempat(view.getTxtTempatTugas().getText());
            m.setTugasUtama(TugasUtamaPegawaiEnum.Keamanan);
            m.setTugasLain(view.getTxtTugasLuar().getText());

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtIdPegawai().setText("");
        view.getTxtTempatTugas().setText("");
        view.getTxtTugasLuar().setText("");
    }
}
   