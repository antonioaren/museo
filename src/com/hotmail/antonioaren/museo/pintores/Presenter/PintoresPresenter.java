package com.hotmail.antonioaren.museo.pintores.Presenter;

import com.hotmail.antonioaren.museo.mediator.MuseoMediatorCode;
import com.hotmail.antonioaren.museo.pintores.Model.I_PintoresModel;
import com.hotmail.antonioaren.museo.pintores.View.I_PintoresView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class PintoresPresenter extends AndroidScreenPresenter implements I_PintoresPresenter {

    //Metodo privado para obtener la vista de los pintores.
    private I_PintoresView getPintoresView(){
        return (I_PintoresView) getScreenView();
    }

    //Comunicación del modelo con el presentador.
    private I_PintoresModel getPintoresModel(){
        return (I_PintoresModel) getScreenModel();
    }


    @Override
    public void setListPosition(int position) { //al pulsar nos da la posicion de la lista!

        getPintoresModel().setPosition(position);

        debug("setListPosition","position",position);
        debug("setListPosition","Data",getPintoresModel().getData());

        startNextScreenWithFinish(MuseoMediatorCode.CLICK, false);
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getPintoresView().setPintoresScreen();
    }

    @Override
    public void backScreen() {

    }

    @Override
    public void resumeScreen() {
        getPintoresView().setPintoresCollection(getPintoresModel().getCollection());
        getPintoresView().setListPosition(getPintoresModel().getPosition());

    }

    @Override
    public void pauseScreen() {

    }

    @Override
    public void rotateScreen() {

    }

    @Override
    public void setScreenState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {

    }

    @Override
    public I_ScreenState getScreenState() {
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> aClass, int i) {
        return null;
    }



}
