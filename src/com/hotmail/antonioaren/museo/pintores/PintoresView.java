package com.hotmail.antonioaren.museo.pintores;


import com.hotmail.antonioaren.museo.R;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.framework.core.screen.I_ScreenPresenter;


/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class PintoresView extends AndroidScreenView implements I_PintoresView{

    private I_PintoresPresenter getPintoresPresenter(){
        return (I_PintoresPresenter) getScreenPresenter();
    }

    @Override
    public void setPintoresLayout() {

        debug("setPintoresLayout");
        setContentView(R.layout.pintores_view);
    }
}
