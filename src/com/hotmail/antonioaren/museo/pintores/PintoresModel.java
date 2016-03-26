package com.hotmail.antonioaren.museo.pintores;

import es.ulpgc.eite.framework.android.AndroidScreenModel;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class PintoresModel extends AndroidScreenModel implements I_PintoresModel {

    private I_PintoresPresenter getPintoresPresenter(){
        return (I_PintoresPresenter) getScreenPresenter();
    }

}
