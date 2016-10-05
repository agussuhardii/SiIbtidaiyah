/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah;

import com.tonewbie.siibtidaiyah.dao.KelasDao;
import com.tonewbie.siibtidaiyah.dao.KelasDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author agus
 */
public class HibernateUtil {
private static final SessionFactory SESSION_FACTORY;
    private static final KelasDao KELAS_DAO;

    static {
        try {
            SESSION_FACTORY = new Configuration().configure()
            .buildSessionFactory();
            KELAS_DAO = new KelasDaoImpl(SESSION_FACTORY);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static KelasDao getKelasDao() {
        return KELAS_DAO;
    }
}
