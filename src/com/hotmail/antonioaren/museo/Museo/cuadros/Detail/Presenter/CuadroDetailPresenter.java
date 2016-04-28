package com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Presenter;

import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.View.I_CuadroDetailsView;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.Model.I_CuadroDetailsModel;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data.DetailData;
import com.hotmail.antonioaren.museo.Museo.cuadros.Detail.state.CuadroDetailState;
import com.hotmail.antonioaren.museo.mediator.MuseoMediatorCode;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObservable;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public class CuadroDetailPresenter extends AndroidScreenPresenter implements I_CuadroDetailPresenter, I_ScreenObservable {


    private I_CuadroDetailsModel getCuadroDetailsModel(){
        return (I_CuadroDetailsModel) getScreenModel();
    }

    private I_CuadroDetailsView getCuadrosDetailView(){
        return (I_CuadroDetailsView) getScreenView();
    }

    @Override
    public void deleteData() {
        //state será un objeto de CuadroDetailState (obtiene modelo del detalle. Los datos)
        debug("deleteData");

//      CuadroDetailState state = new CuadroDetailState(getCuadroDetailsModel().getData());

//      notifyScreenObservers((I_ScreenObservable) this, MuseoMediatorCode.DELETE, state);

        notifyScreenObservers((I_ScreenObservable) this, MuseoMediatorCode.DELETE, null);
        finishScreen();
    }

    @Override
    public void createScreen() {
        debug ("CreateScreen");
        //ponemos el Layout
        getCuadrosDetailView().setCuadrosDetailLayout();

        //Ponemos los datos
        getCuadroDetailsModel().setData(new DetailData());

        //Ponemos el boton
        getCuadrosDetailView().setDetailsButtonListener();
    }

    @Override
    public void backScreen() {

    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen");
        //detalle de cuadros/datos/obtener desde el modelo/metodo getData
        getCuadrosDetailView().setDetailData(getCuadroDetailsModel().getData());

    }

    @Override
    public void pauseScreen() {

    }

    @Override
    public void rotateScreen() {

    }

    @Override
    public void setScreenState(
            Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState", "view", view.getSimpleName());
        debug("setScreenState", "code", code);

        if(state!= null){
            CuadroDetailState _state = (CuadroDetailState) state;
            getCuadroDetailsModel().setData(_state.getData());
        }


    }

    @Override
    public I_ScreenState getScreenState() {

        CuadroDetailState state = new CuadroDetailState(getCuadroDetailsModel().getData());
        return state;

    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        //En este caso este estado si no tiene mas pantallas no se haria nada. No hay Next State
        return null;
    }


    @Override
    public void updateObservableState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {

        debug("updateObservableState", "view", view.getSimpleName());
        debug("updateObservableState", "code", code);



    }
}
