
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.NilaiKepribadianModel;
import java.util.List;

public interface NilaiKepribadianDao {
   public void save(NilaiKepribadianModel nilaikepribadianModel);

    public void update(NilaiKepribadianModel nilaikepribadianModel);

    public void delete(NilaiKepribadianModel nilaikepribadianModel);

    
    
    
    public NilaiKepribadianModel getNilaiKepribadian (String id_siswa);

    public List<NilaiKepribadianModel> getNilaiKepribadian(); 
}
