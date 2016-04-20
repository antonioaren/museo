package com.hotmail.antonioaren.museo.cuadros.Detail.Presenter;

/**
 * Created by PedroAntonio on 30/03/2016.
 */
public interface I_CuadroDetailPresenter {
    int getCuadroMasterCode();

    void setCuadrosMasterCode(int mCode);

    int getCuadrosDetailCode();

    void setCuadrosDetailCode(int dCode);

    int getposition();

    void setposition(int position);

    int getsize();

    void setsize(int size);
}
