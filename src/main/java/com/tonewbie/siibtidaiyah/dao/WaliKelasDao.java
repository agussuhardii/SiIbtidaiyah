
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.WaliKelasModel;
import java.util.List;

public interface WaliKelasDao {
    public void save(WaliKelasModel walikelasModel);

    public void update(WaliKelasModel walikelasModel);

    public void delete(WaliKelasModel walikelasModel);

    
    
    
    public WaliKelasModel getWaliKelas(String id_pegawai);

    public List<WaliKelasModel> getWaliKelas();
}
