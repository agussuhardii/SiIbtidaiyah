
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.PegawaiModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PegawaiDaoImpl implements PegawaiDao {
    private final SessionFactory sf;

    public PegawaiDaoImpl(SessionFactory sf) {
        this.sf = sf;
    }
    
    //methode untuk menyimpan data
    @Override
    public void save(PegawaiModel pegawaiModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.save(pegawaiModel);
            session.getTransaction();
            transaction.commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    //methode untuk Ubah data
    @Override
    public void update(PegawaiModel pegawaiModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.update(pegawaiModel);
            session.getTransaction();
            transaction.commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    //methode untuk delete data
    @Override
    public void delete(PegawaiModel pegawaiModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.delete(pegawaiModel);
            session.getTransaction();
            transaction.commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    //fungsi untuk menampilkan data berdasarkan ID
    @Override
    public PegawaiModel getPegawai(String id_pegawai) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            PegawaiModel pegawai = session.get(PegawaiModel.class, id_pegawai);
            session.getTransaction().commit();
            return pegawai;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //fungsi untuk menampilkan seluruh data
    @Override
    public List<PegawaiModel> getPegawai() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            List<PegawaiModel> list = session.createCriteria(PegawaiModel.class).list();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
}
