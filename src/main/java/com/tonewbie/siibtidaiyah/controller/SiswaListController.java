/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.SiswaDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.SiswaTableModel;
import com.tonewbie.siibtidaiyah.model.SiswaModel;
import com.tonewbie.siibtidaiyah.view.SiswaListView;
import java.util.List;

/**
 *
 * @author agus
 */
public class SiswaListController {
    private final SiswaListView view;
    
    private SiswaTableModel tableModel;
    private List<SiswaModel> list;
    private final static SiswaDao dao = HibernateUtil.getSISWA_DAO();

    public SiswaListController(SiswaListView view) {
        this.view = view;
    }
    
    public void showData() {
        list = dao.getSiswas();
        tableModel = new SiswaTableModel(list);
        this.view.getTblSiswa().setModel(tableModel);
    }
    
}
