package com.hotmail.antonioaren.museo.pintores;

import com.hotmail.antonioaren.museo.data.DetailData;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

import java.util.List;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class PintoresModel extends AndroidScreenModel implements I_PintoresModel {
    private  int position;

    private I_PintoresPresenter getPintoresPresenter(){
        return (I_PintoresPresenter) getScreenPresenter();
    }
//Empecemos con DataBase. prueba1 para cualquier error.


    public int getPosition() {
        return position;
    }

    public void setPosition(int pos) {
        this.position = pos;
    }

    public List<DetailData> getCollection(){
        return null;
    }
}
