package com.hotmail.antonioaren.museo.pintores.Model;


import com.hotmail.antonioaren.museo.cuadros.Detail.data.DetailData;
import com.hotmail.antonioaren.museo.database.I_MuseoDatabase;
import com.hotmail.antonioaren.museo.pintores.Presenter.I_PintoresPresenter;
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

    private I_MuseoDatabase getMuseoDatabase(){
        return (I_MuseoDatabase) getScreenDatabase();
    }


    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setPosition(int pos) {
        this.position = pos;
    }

    @Override
    public List<DetailData> getCollection(){
        if (getMuseoDatabase().getDataList().size()==0) {
            fillCollection();
        }
        return getMuseoDatabase().getDataList();
    }

    private void fillCollection() {

        debug("fillCollection");

        //Aqui escribiremos los datos que vamos a poner en nuestro programa
        //Recorre vector de posiciones, desde 0 hasta 4 y con ello escribe lo que necesita en la pantalla principal

        for(int pos =0; pos <5; pos++){
            DetailData data = new DetailData("Pintor " + pos);
            getMuseoDatabase().saveData(data);
        }

    }

    @Override
    public DetailData getData(){
        return getMuseoDatabase().getDataList().get(getPosition());
    }
}
