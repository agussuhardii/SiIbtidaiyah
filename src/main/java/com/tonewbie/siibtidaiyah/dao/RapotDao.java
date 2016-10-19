
package com.tonewbie.siibtidaiyah.dao;

import com.tonewbie.siibtidaiyah.model.RapotModel;
import java.util.List;

public interface RapotDao {
    public void save(RapotModel rapotModel);

    public void update(RapotModel rapotModel);

    public void delete(RapotModel rapotModel);

    
    
    
    public RapotModel getRapot(String id_rapot);

    public List<RapotModel> getRapot();
}
