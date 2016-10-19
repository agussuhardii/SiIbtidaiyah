package com.tonewbie.siibtidaiyah.dao;


import com.tonewbie.siibtidaiyah.model.KelasModel;
import java.util.List;

public interface KelasDao {
    public void save(KelasModel kelasModel);

    public void update(KelasModel kelasModel);

    public void delete(KelasModel kelasModel);

    
    
    
    public KelasModel getKelas(String id_kelas);

    public List<KelasModel> getKelass();
}
