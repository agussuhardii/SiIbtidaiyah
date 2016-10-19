
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.SiswaModel;
import java.util.List;


public interface SiswaDao {
    public void save(SiswaModel infosiswaModel);

    public void update(SiswaModel infosiswaModel);

    public void delete(SiswaModel infosiswaModel);

    
    
    
    public SiswaModel getSiswa(String id_siswa);

    public List<SiswaModel> getSiswas();
}
