/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonewbie.siibtidaiyah;

import com.tonewbie.siibtidaiyah.dao.KehadiranDao;
import com.tonewbie.siibtidaiyah.dao.KehadiranDaoImpl;
import com.tonewbie.siibtidaiyah.dao.KelasDao;
import com.tonewbie.siibtidaiyah.dao.KelasDaoImpl;
import com.tonewbie.siibtidaiyah.dao.NilaiExtraDaoImpl;
import com.tonewbie.siibtidaiyah.dao.NilaiKepribadianDao;
import com.tonewbie.siibtidaiyah.dao.NilaiKepribadianDaoImpl;
import com.tonewbie.siibtidaiyah.dao.PegawaiDao;
import com.tonewbie.siibtidaiyah.dao.PegawaiDaoImpl;
import com.tonewbie.siibtidaiyah.dao.PelajaranDao;
import com.tonewbie.siibtidaiyah.dao.PelajaranDaoImpl;
import com.tonewbie.siibtidaiyah.dao.PembiasaanDao;
import com.tonewbie.siibtidaiyah.dao.PembiasaanDaoImpl;
import com.tonewbie.siibtidaiyah.dao.PrestasiDao;
import com.tonewbie.siibtidaiyah.dao.PrestasiDaoImpl;
import com.tonewbie.siibtidaiyah.dao.QiroatiDao;
import com.tonewbie.siibtidaiyah.dao.QiroatiDaoImpl;
import com.tonewbie.siibtidaiyah.dao.RapotDao;
import com.tonewbie.siibtidaiyah.dao.RapotDaoImpl;
import com.tonewbie.siibtidaiyah.dao.SiswaDao;
import com.tonewbie.siibtidaiyah.dao.SiswaDaoImpl;
import com.tonewbie.siibtidaiyah.dao.StatusPegawaiDao;
import com.tonewbie.siibtidaiyah.dao.StatusPegawaiDaoImpl;
import com.tonewbie.siibtidaiyah.dao.TahfidDao;
import com.tonewbie.siibtidaiyah.dao.TahfidDaoImpl;
import com.tonewbie.siibtidaiyah.dao.WaliKelasDao;
import com.tonewbie.siibtidaiyah.dao.WaliKelasDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tonewbie.siibtidaiyah.dao.NilaiExtraDao;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author agus
 */
public class HibernateUtil {
private static final SessionFactory SESSION_FACTORY;

private static final KelasDao KELAS_DAO;
private static final KehadiranDao KEHADIRAN_DAO;
private static final NilaiExtraDao NILAI_EEKSTRA_KULIKULER_DAO;
private static final NilaiKepribadianDao NILAI_KEPRIBADIAN_DAO;
private static final PegawaiDao PEGAWAI_DAO;
private static final PelajaranDao PELAJARAN_DAO;
private static final PembiasaanDao PEMBIASAAN_DAO;
private static final PrestasiDao PRESTASI_DAO;
private static final QiroatiDao QIROATI_DAO;
private static final RapotDao RAPOT_DAO;
private static final SiswaDao SISWA_DAO;
private static final StatusPegawaiDao STATUS_PEGAWAI_DAO;
private static final TahfidDao TAHFID_DAO;
private static final WaliKelasDao WALI_KELAS_DAO;
    

    static {
        try {
            SESSION_FACTORY = new Configuration().configure()
            .buildSessionFactory();
            KELAS_DAO = new KelasDaoImpl(SESSION_FACTORY);
            KEHADIRAN_DAO = new KehadiranDaoImpl(SESSION_FACTORY);
            NILAI_EEKSTRA_KULIKULER_DAO = new NilaiExtraDaoImpl(SESSION_FACTORY);
            NILAI_KEPRIBADIAN_DAO = new NilaiKepribadianDaoImpl(SESSION_FACTORY);
            PEGAWAI_DAO = new PegawaiDaoImpl(SESSION_FACTORY);
            PELAJARAN_DAO = new PelajaranDaoImpl(SESSION_FACTORY);
            PEMBIASAAN_DAO = new PembiasaanDaoImpl(SESSION_FACTORY);
            PRESTASI_DAO = new PrestasiDaoImpl(SESSION_FACTORY);
            QIROATI_DAO = new QiroatiDaoImpl(SESSION_FACTORY);
            SISWA_DAO = new SiswaDaoImpl(SESSION_FACTORY);
            RAPOT_DAO = new RapotDaoImpl(SESSION_FACTORY);
            STATUS_PEGAWAI_DAO = new StatusPegawaiDaoImpl(SESSION_FACTORY);
            TAHFID_DAO = new TahfidDaoImpl(SESSION_FACTORY);
            WALI_KELAS_DAO = new WaliKelasDaoImpl(SESSION_FACTORY);
            
            
            
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

    public static KehadiranDao getKEHADIRAN_DAO() {
        return KEHADIRAN_DAO;
    }

    public static SessionFactory getSESSION_FACTORY() {
        return SESSION_FACTORY;
    }

    public static KelasDao getKELAS_DAO() {
        return KELAS_DAO;
    }

    public static NilaiExtraDao getNILAI_EEKSTRA_KULIKULER_DAO() {
        return NILAI_EEKSTRA_KULIKULER_DAO;
    }

    public static NilaiKepribadianDao getNILAI_KEPRIBADIAN_DAO() {
        return NILAI_KEPRIBADIAN_DAO;
    }

    public static PegawaiDao getPEGAWAI_DAO() {
        return PEGAWAI_DAO;
    }

    public static PelajaranDao getPELAJARAN_DAO() {
        return PELAJARAN_DAO;
    }

    public static PembiasaanDao getPEMBIASAAN_DAO() {
        return PEMBIASAAN_DAO;
    }

    public static PrestasiDao getPRESTASI_DAO() {
        return PRESTASI_DAO;
    }

    public static QiroatiDao getQIROATI_DAO() {
        return QIROATI_DAO;
    }

    public static RapotDao getRAPOT_DAO() {
        return RAPOT_DAO;
    }

    public static SiswaDao getSISWA_DAO() {
        return SISWA_DAO;
    }

    public static StatusPegawaiDao getSTATUS_PEGAWAI_DAO() {
        return STATUS_PEGAWAI_DAO;
    }

    public static TahfidDao getTAHFID_DAO() {
        return TAHFID_DAO;
    }

    public static WaliKelasDao getWALI_KELAS_DAO() {
        return WALI_KELAS_DAO;
    }


    
    
    
    
    
    
    
    
}
