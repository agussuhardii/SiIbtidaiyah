
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.TahfidModel;
import java.util.List;

public interface TahfidDao {
    public void save(TahfidModel tahfidModel);

    public void update(TahfidModel tahfidModel);

    public void delete(TahfidModel tahfidModel);

    
    
    
    public TahfidModel getTahfid(String id_tahfid);

    public List<TahfidModel> getTahfid();
}
