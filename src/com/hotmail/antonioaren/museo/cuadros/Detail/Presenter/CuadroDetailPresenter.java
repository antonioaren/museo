package com.hotmail.antonioaren.museo.cuadros.Detail.Presenter;

import com.hotmail.antonioaren.museo.cuadros.Detail.View.I_CuadroDetailsView;
import com.hotmail.antonioaren.museo.cuadros.Detail.Model.I_CuadroDetailsModel;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public class CuadroDetailPresenter extends AndroidScreenPresenter implements I_CuadroDetailPresenter {

    private int _mCode;
    private int _dCode;
    private int _position;
    private int _size;

    //Datos que el presentador tiene que tener obligatoriamente
    //MasterCode
    //Obtener la posicion (Position)
    //Tamaño (Size)

    private I_CuadroDetailsModel getCuadroDetailsModel(){
        return (I_CuadroDetailsModel) getScreenModel();
    }

    private I_CuadroDetailsView getCuadrosDetailView(){
        return (I_CuadroDetailsView) getScreenView();
    }




    @Override
    public int getCuadroMasterCode() {
        return _mCode;
    }

    @Override
    public void setCuadrosMasterCode(int mCode) {
        _mCode = mCode;
    }

    @Override
    public int getCuadrosDetailCode() {
        return _dCode;
    }

    @Override
    public void setCuadrosDetailCode(int dCode) {
        _dCode = dCode;
    }

    @Override
    public int getposition() {
        return _position;
    }

    @Override
    public void setposition(int position) {
        _position = position;
    }

    @Override
    public int getsize() {
        return _size;
    }

    @Override
    public void setsize(int size) {
        _size = size;
    }

    public CuadroDetailPresenter() {
        super();
    }


    @Override
    public void createScreen() {
        debug ("CreateScreen");
        getCuadrosDetailView().SetDetailLayout();


    }

    @Override
    public void backScreen() {

    }

    @Override
    public void resumeScreen() {
        getCuadrosDetailView().SetDetailLayout();


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
