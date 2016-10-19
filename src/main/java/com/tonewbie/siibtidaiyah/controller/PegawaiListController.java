/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah.controller;

import com.tonewbie.siibtidaiyah.HibernateUtil;
import com.tonewbie.siibtidaiyah.dao.PegawaiDao;
import com.tonewbie.siibtidaiyah.dao.tablemodel.PegawaiTableModel;
import com.tonewbie.siibtidaiyah.model.PegawaiModel;
import com.tonewbie.siibtidaiyah.view.PegawaiListView;
import java.util.List;

/**
 *
 * @author agus
 */
public class PegawaiListController {
    PegawaiListView view;
    private PegawaiTableModel tableModel;
    private List<PegawaiModel> list;
    private final static PegawaiDao dao = HibernateUtil.getPEGAWAI_DAO();

    public PegawaiListController(PegawaiListView listView) {
        this.view = listView;
    }
    
    public void showData() {
        list = dao.getPegawai();
        tableModel = new PegawaiTableModel(list);
        this.view.getTblPegawai().setModel(tableModel);
    }
    
}
