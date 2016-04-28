package com.hotmail.antonioaren.museo.Museo.cuadros.Master.Presenter;

import com.hotmail.antonioaren.museo.Museo.cuadros.Master.View.I_CuadrosView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class CuadrosPresenter extends AndroidScreenPresenter implements I_CuadrosPresenter {

    private I_CuadrosView getCuadrosView() {
       return (I_CuadrosView) getScreenView();
    }
    @Override
    public void createScreen() {
        getCuadrosView().setLayout();
    }

    @Override
    public void backScreen() {

    }

    @Override
    public void resumeScreen() {

    }

    @Override
    public void pauseScreen() {

    }

    @Override
    public void rotateScreen() {

    }

    //Estados----------------

    @Override
    public void setScreenState(
            Class<? extends I_ScreenView> view, int code, I_ScreenState state) {

        debug("setScreenState", "view", view.getSimpleName() );
        debug("setScreenState", "code", code );



    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState" );


        return null;
    }

    @Override
    public I_ScreenState getNextState(
            Class<? extends I_ScreenView> view, int code) {
        return null;
    }
}