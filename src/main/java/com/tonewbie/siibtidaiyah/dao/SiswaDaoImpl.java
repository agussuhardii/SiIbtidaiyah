
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.SiswaModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class SiswaDaoImpl implements SiswaDao {
    private final SessionFactory sf;

    public SiswaDaoImpl(SessionFactory sf) {
        this.sf = sf;
    }
    
    //methode untuk menyimpan data
    @Override
    public void save(SiswaModel infosiswaModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.save(infosiswaModel);
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
    public void update(SiswaModel infosiswaModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.update(infosiswaModel);
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
    public void delete(SiswaModel infosiswaModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.delete(infosiswaModel);
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
    public SiswaModel getSiswa(String id_siswa) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            SiswaModel infosiswa = session.get(SiswaModel.class, id_siswa);
            session.getTransaction().commit();
            return infosiswa;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //fungsi untuk menampilkan seluruh data
    @Override
    public List<SiswaModel> getSiswas() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            List<SiswaModel> list = session.createCriteria(SiswaModel.class).list();
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
