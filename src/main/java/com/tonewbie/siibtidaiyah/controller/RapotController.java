package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.RapotDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.RapotTableModel;
import com.tonewbie.siibtidaiyah.model.RapotModel;
import com.tonewbie.siibtidaiyah.view.RapotView;
import java.util.List;
import javax.swing.JOptionPane;

public class RapotController {
final private RapotView view;
    private RapotTableModel tableModel;
    private List<RapotModel> list;
    private final static RapotDao dao = HibernateUtil.getRapotDao();
    public RapotController(RapotView rapotView) {
        this.view = rapotView;
    public void showData() {
        list = dao.getRapot();
        tableModel = new RapotTableModel(list);
        this.view.getTblRapot().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
        RapotModel m = new RapotModel();
        m.setIdRapot(view.getTxtId().getText());
        m.setIdSiswa(view.getTxtId().getText());
        m.setIdKelas(view.getTxtId().getText());
        m.setIdPelajaran(view.getTxtId().getText());
        m.setTahunAjaran(view.getTxtTahunAjaran().getText());
        m.setSemester(view.getTxtSemester().getText());
        m.setKkm(view.getTxtKkm().getText());
        m.setNilaiAngka(view.getTxtNilaiAngka().getText());
        m.setNilaiHuruf(view.getTxtNilaiHuruf().getText());
        m.setKeterangan(view.getTxtKeterangan().getText());
        m.setCatatanGuru(view.getTxtCatatanGuru().getText());
        dao.save(m);
        JOptionPane.showMessageDialog(null, "New record");
        showData();
    }

    public void update() {//methode update
        RapotModel m = new RapotModel();
        m.setIdRapot(view.getTxtId().getText());
        m.setIdSiswa(view.getTxtId().getText());
        m.setIdKelas(view.getTxtId().getText());
        m.setIdPelajaran(view.getTxtId().getText());
        m.setTahunAjaran(view.getTxtTahunAjaran().getText());
        m.setSemester(view.getTxtSemester().getText());
        m.setKkm(view.getTxtKkm().getText());
        m.setNilaiAngka(view.getTxtNilaiAngka().getText());
        m.setNilaiHuruf(view.getTxtNilaiHuruf().getText());
        m.setKeterangan(view.getTxtKeterangan().getText());
        m.setCatatanGuru(view.getTxtCatatanGuru().getText());

        dao.update(m);
        JOptionPane.showMessageDialog(null, "Update record");
        showData();
    }

    public void delete() {//methode delete
       RapotModel m = new RapotModel();
        m.setIdRapot(view.getTxtId().getText());
        m.setIdSiswa(view.getTxtId().getText());
        m.setIdKelas(view.getTxtId().getText());
        m.setIdPelajaran(view.getTxtId().getText());
        m.setTahunAjaran(view.getTxtTahunAjaran().getText());
        m.setSemester(view.getTxtSemester().getText());
        m.setKkm(view.getTxtKkm().getText());
        m.setNilaiAngka(view.getTxtNilaiAngka().getText());
        m.setNilaiHuruf(view.getTxtNilaiHuruf().getText());
        m.setKeterangan(view.getTxtKeterangan().getText());
        m.setCatatanGuru(view.getTxtCatatanGuru().getText());
        int a = JOptionPane.showConfirmDialog(null, "yakin Ingin menghapus id " + view.getTxtId().getText(), "Hapus", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            dao.delete(m);
            JOptionPane.showMessageDialog(null, "Delete Record");
            showData();
        }

    }

    public void clean() {//metode membersihkan textfild
        view.getTxtId().setText("");
        view.getTxtKehadiran().setText("");
    }
}
    