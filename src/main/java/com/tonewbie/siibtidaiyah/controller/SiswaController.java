package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.SiswaDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.SiswaTableModel;
import com.tonewbie.siibtidaiyah.model.SiswaModel;
import com.tonewbie.siibtidaiyah.model.enumfile.JenisKelaminEnum;
import com.tonewbie.siibtidaiyah.model.enumfile.LkkEnum;
import com.tonewbie.siibtidaiyah.view.SiswaView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SiswaController {
final private SiswaView view;
    private final static SiswaDao dao = HibernateUtil.getSISWA_DAO();

    public SiswaController(SiswaView view) {
        this.view = view;
    }
    
    

    //metode simpan ke table infosiswa
    public void insert() {
        SiswaModel m = new SiswaModel();
            m.setNisn(view.getTxtNis().getText());
            m.setNik(view.getTxtNik().getText());
            m.setNamaSiswa(view.getTxtNama().getText());
            m.setTempatLahir(view.getTxtTempatLahir().getText());
            
                //save date format
                String date = view.getDatePickerLahir().getText();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
                Date d = null;
                try {
                    d = df.parse(date);
                } catch (ParseException ex) {
                    System.out.println("Error : "+ex.getMessage());
                }
            m.setTanggalLahir(d);
        
                //Save Jenis kelamin
                if(view.getRadioLaki().isSelected()){
                    m.setJenisKelamin(JenisKelaminEnum.Pria);
                }else{
                    m.setJenisKelamin(JenisKelaminEnum.Wanita);
                }
                
            m.setAsalSekolah(view.getTxtAsalSekolah().getText());
            m.setHobby(view.getTxtHoby().getText());
            m.setCita(view.getTxtCita2().getText());
            m.setJumlahSaudara(Integer.valueOf(view.getTxtNis().getText()));
            m.setAyah(view.getTxtNamaAyah().getText());
            m.setAlamat(view.getTxtAlamat().getText());
            
                if(view.getRadioLkkAda().isSelected()){
                    m.setLkk(LkkEnum.ada);
                }else{
                    m.setLkk(LkkEnum.tidak_ada);
                }
            
                //save agama
            m.setAgama(view.getComboAgama().getSelectedItem().toString());
         
        dao.save(m);
        clean();
    }

    public void update() {//methode update
        SiswaModel m = new SiswaModel();
            m.setNisn(view.getTxtNis().getText());
            m.setNik(view.getTxtNik().getText());
            m.setNamaSiswa(view.getTxtNama().getText());
            m.setTempatLahir(view.getTxtTempatLahir().getText());
            
                //save date format
                String date = view.getDatePickerLahir().getText();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
                Date d = null;
                try {
                    d = df.parse(date);
                } catch (ParseException ex) {
                    System.out.println("Error : "+ex.getMessage());
                }
            m.setTanggalLahir(d);
        
                //Save Jenis kelamin
                if(view.getRadioLaki().isSelected()){
                    m.setJenisKelamin(JenisKelaminEnum.Pria);
                }else{
                    m.setJenisKelamin(JenisKelaminEnum.Wanita);
                }
                
            m.setAsalSekolah(view.getTxtAsalSekolah().getText());
            m.setHobby(view.getTxtHoby().getText());
            m.setCita(view.getTxtCita2().getText());
            m.setJumlahSaudara(Integer.valueOf(view.getTxtNis().getText()));
            m.setAyah(view.getTxtNamaAyah().getText());
            m.setAlamat(view.getTxtAlamat().getText());
            
                if(view.getRadioLkkAda().isSelected()){
                    m.setLkk(LkkEnum.ada);
                }else{
                    m.setLkk(LkkEnum.tidak_ada);
                }
            
                //save agama
            m.setAgama(view.getComboAgama().getSelectedItem().toString());
         
        dao.update(m);
    }

    public void delete() {//methode delete
       SiswaModel m = new SiswaModel();
        m.setNisn(view.getTxtNis().getText());
        
        int a = JOptionPane.showConfirmDialog(null, "yakin Ingin menghapus id " + view.getTxtNis().getText(), "Hapus", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            dao.delete(m);
            JOptionPane.showMessageDialog(null, "Delete Record");
        }

    }

    public void clean() {//metode membersihkan textfild
        String i = "";
        view.getTxtNis().setText(i);
        view.getTxtNik().setText(i);
        view.getTxtNama().setText(i);
        view.getTxtTempatLahir().setText(i);
        view.getDatePickerLahir().setText(i);
        view.getRadioLaki().setSelected(true);
        view.getTxtAsalSekolah().setText(i);
        view.getTxtHoby().setText(i);
        view.getTxtCita2().setText(i);
        view.getSpinJumlahSaudara().setValue(0);
        view.getTxtNamaAyah().setText(i);
        view.getTxtAlamat().setText(i);
        view.getRadioLkkAda().setSelected(true);
        view.getComboAgama().setSelectedItem(0);
    }
}
   
