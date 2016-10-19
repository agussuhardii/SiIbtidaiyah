package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.RapotDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.RapotTableModel;
import com.tonewbie.siibtidaiyah.model.RapotModel;
import com.tonewbie.siibtidaiyah.view.RapotView;
import java.util.List;

public class RapotController {
final private RapotView view;
    private RapotTableModel tableModel;
    private List<RapotModel> list;
    private final static RapotDao dao = HibernateUtil.getRAPOT_DAO();
    public RapotController(RapotView rapotView) {
        this.view = rapotView;
    }
    public void showData() {
        list = dao.getRapot();
        tableModel = new RapotTableModel(list);
        //this.view.getTblRapot().setModel(tableModel);
        clean();
    }

    //metode simpan ke table Kelas
    public void insert() {
    }

    public void update() {//methode update
    }

    public void delete() {//methode delete

    }

    public void clean() {//metode membersihkan textfild
    }
}
    