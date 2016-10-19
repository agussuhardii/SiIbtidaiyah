
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.PelajaranModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PelajaranDaoImpl implements PelajaranDao{
    private final SessionFactory sf;

    public PelajaranDaoImpl(SessionFactory sf) {
        this.sf = sf;
    }
    
    //methode untuk menyimpan data
    @Override
    public void save(PelajaranModel pelajaranModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.save(pelajaranModel);
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
    public void update(PelajaranModel pelajaranModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.update(pelajaranModel);
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
    public void delete(PelajaranModel pelajaranModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.delete(pelajaranModel);
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
    public PelajaranModel getPelajaran(String id_pelajaran) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            PelajaranModel pelajaran = session.get(PelajaranModel.class, id_pelajaran);
            session.getTransaction().commit();
            return pelajaran;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //fungsi untuk menampilkan seluruh data
    @Override
    public List<PelajaranModel> getPelajaran() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            List<PelajaranModel> list = session.createCriteria(PelajaranModel.class).list();
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
