package com.hotmail.antonioaren.museo.pintores;

import com.hotmail.antonioaren.museo.mediator.MuseoMediatorCode;
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
    public void itemListenedClicked() {
        getPintoresModel().setPosition(getPintoresView().getListPosition());
        //startNextScreenWithFinish(MuseoMediatorCode.CLICK, false);
    }


    @Override
    public void createScreen() {
        debug("createScreen");

        getPintoresView().setPintoresLayout();
        getPintoresView().setPintoresList();
        getPintoresView().setMuseoAdapter();
        getPintoresView().setMuseoListAdapter();
        getPintoresView().setMuseoListListener();

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
