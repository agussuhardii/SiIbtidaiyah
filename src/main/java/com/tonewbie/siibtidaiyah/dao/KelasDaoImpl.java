package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.KelasModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class KelasDaoImpl implements KelasDao{
    
    private final SessionFactory sf;

    public KelasDaoImpl(SessionFactory sf) {
        this.sf = sf;
    }
    
    //methode untuk menyimpan data
    @Override
    public void save(KelasModel kelasModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.save(kelasModel);
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
    public void update(KelasModel kelasModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.update(kelasModel);
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
    public void delete(KelasModel kelasModel) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            session.delete(kelasModel);
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
    public KelasModel getKelas(String id_kelas) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            KelasModel kelas = session.get(KelasModel.class, id_kelas);
            session.getTransaction().commit();
            return kelas;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //fungsi untuk menampilkan seluruh data
    @Override
    public List<KelasModel> getKelass() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.beginTransaction();
            List<KelasModel> list = session.createCriteria(KelasModel.class).list();
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
