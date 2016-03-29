package com.hotmail.antonioaren.museo.pintores;

import com.hotmail.antonioaren.museo.data.DetailData;

import java.util.List;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public interface I_PintoresModel {
    int getPosition();

    void setPosition(int pos);

    List<DetailData> getCollection();
}
