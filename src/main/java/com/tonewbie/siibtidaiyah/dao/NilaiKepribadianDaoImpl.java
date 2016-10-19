
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.NilaiKepribadianModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class NilaiKepribadianDaoImpl implements NilaiKepribadianDao {
    private final SessionFactory sf;

    public NilaiKepribadianDaoImpl(SessionFactory sf) {
        this.sf = sf;
    }
    
    //methode untuk menyimpan data
    @Override
    public void save(NilaiKepribadianModel nilaikepribadianModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.save(nilaikepribadianModel);
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
    public void update(NilaiKepribadianModel nilaikepribadianModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.update(nilaikepribadianModel);
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
    public void delete(NilaiKepribadianModel nilaikepribadianModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.delete(nilaikepribadianModel);
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
    public NilaiKepribadianModel getNilaiKepribadian(String id_siswa) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            NilaiKepribadianModel nilaikepribadian = session.get(NilaiKepribadianModel.class, id_siswa);
            session.getTransaction().commit();
            return nilaikepribadian;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //fungsi untuk menampilkan seluruh data
    @Override
    public List<NilaiKepribadianModel> getNilaiKepribadian() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            List<NilaiKepribadianModel> list = session.createCriteria(NilaiKepribadianModel.class).list();
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
