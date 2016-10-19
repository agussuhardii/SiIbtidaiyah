
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.PrestasiModel;
import java.util.List;

public interface PrestasiDao {
    public void save(PrestasiModel prestasiModel);

    public void update(PrestasiModel prestasiModel);

    public void delete(PrestasiModel prestasiModel);

    
    
    
    public PrestasiModel getPrestasi(String id_siswa);

    public List<PrestasiModel> getPrestasi();
}
