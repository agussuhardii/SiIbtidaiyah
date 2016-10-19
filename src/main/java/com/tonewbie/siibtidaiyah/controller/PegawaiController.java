package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.PegawaiDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.PegawaiTableModel;
import com.tonewbie.siibtidaiyah.form.PegawaiView;
import com.tonewbie.siibtidaiyah.model.PegawaiModel;
import com.tonewbie.siibtidaiyah.model.enumfile.JenisKelaminEnum;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PegawaiController {
final private PegawaiView view;
    private PegawaiTableModel tableModel;
    private List<PegawaiModel> list;
    private final static PegawaiDao dao = HibernateUtil.getPEGAWAI_DAO();
    
    public PegawaiController(PegawaiView pegawaiView) {
        this.view = pegawaiView;
    }
    
    

    //metode simpan ke table Kelas
    public void insert() {
        PegawaiModel m = new PegawaiModel();
        m.setIdPegawai(view.getTxtId().getText());
        m.setNip(view.getTxtNip().getText());
        m.setNuptk(view.getTxtNuptk().getText());
        m.setNik(view.getTxtNik().getText());
        m.setNamaPegawai(view.getTxtNama().getText());
        m.setTempatLahir(view.getTxtTempatLahir().getText());
            String date = view.getJPicketLahir().getText();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
                Date d = new Date();
                try {
                    d = df.parse(date);
                } catch (ParseException ex) {
                    System.out.println("Error : "+ex.getMessage());
                }
        m.setTanggalLahir(d);
        
        if(view.getRadioPria().isSelected()){
                    m.setJenisKelamin(JenisKelaminEnum.Pria);
                }else{
                    m.setJenisKelamin(JenisKelaminEnum.Wanita);
                }
        
        m.setAlamat(view.getAreaAlamat().getText());
        m.setHp(view.getTxtHP().getText());
        m.setAgama(view.getComboAgama().getSelectedItem().toString());
        m.setJenjang(view.getTxtJenjang().getText());
        m.setLulus(Integer.valueOf(view.getSpinnerTahunLulus().getValue().toString()));
        m.setSk(view.getTxtSK().getText());

        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
    }

    public void update() {//methode update
        PegawaiModel m = new PegawaiModel();
        m.setIdPegawai(view.getTxtId().getText());
        m.setNip(view.getTxtNip().getText());
        m.setNuptk(view.getTxtNuptk().getText());
        m.setNik(view.getTxtNik().getText());
        m.setNamaPegawai(view.getTxtNama().getText());
        m.setTempatLahir(view.getTxtTempatLahir().getText());
            String date = view.getJPicketLahir().getText();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
                Date d = new Date();
                try {
                    d = df.parse(date);
                } catch (ParseException ex) {
                    System.out.println("Error : "+ex.getMessage());
                }
        m.setTanggalLahir(d);
        
        if(view.getRadioPria().isSelected()){
                    m.setJenisKelamin(JenisKelaminEnum.Pria);
                }else{
                    m.setJenisKelamin(JenisKelaminEnum.Wanita);
                }
        
        m.setAlamat(view.getAreaAlamat().getText());
        m.setHp(view.getTxtHP().getText());
        m.setAgama(view.getComboAgama().getSelectedItem().toString());
        m.setJenjang(view.getTxtJenjang().getText());
        m.setLulus(Integer.valueOf(view.getSpinnerTahunLulus().getValue().toString()));
        m.setSk(view.getTxtSK().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "New record");
    }

    public void delete() {//methode delete
        PegawaiModel m = new PegawaiModel();
        m.setIdPegawai(view.getTxtId().getText());
        m.setNip(view.getTxtNip().getText());
        m.setNuptk(view.getTxtNuptk().getText());
        m.setNik(view.getTxtNik().getText());
        m.setNamaPegawai(view.getTxtNama().getText());
        m.setTempatLahir(view.getTxtTempatLahir().getText());
            String date = view.getJPicketLahir().getText();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
                Date d = new Date();
                try {
                    d = df.parse(date);
                } catch (ParseException ex) {
                    System.out.println("Error : "+ex.getMessage());
                }
        m.setTanggalLahir(d);
        
        if(view.getRadioPria().isSelected()){
                    m.setJenisKelamin(JenisKelaminEnum.Pria);
                }else{
                    m.setJenisKelamin(JenisKelaminEnum.Wanita);
                }
        
        m.setAlamat(view.getAreaAlamat().getText());
        m.setHp(view.getTxtHP().getText());
        m.setAgama(view.getComboAgama().getSelectedItem().toString());
        m.setJenjang(view.getTxtJenjang().getText());
        m.setLulus(Integer.valueOf(view.getSpinnerTahunLulus().getValue().toString()));
        m.setSk(view.getTxtSK().getText());

        dao.delete(m);
        JOptionPane.showMessageDialog(null, "New record");

    }

    public void clean() {//metode membersihkan textfild
    }
}