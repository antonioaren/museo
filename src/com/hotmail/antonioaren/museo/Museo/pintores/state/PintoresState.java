package com.hotmail.antonioaren.museo.Museo.pintores.state;

import es.ulpgc.eite.framework.core.screen.I_ScreenState;

/**
 * Created by PedroAntonio on 26/03/2016.
 */
public class PintoresState implements I_ScreenState {

    private int position;

    public PintoresState(){
        setPosition(0);
    }

    public PintoresState(int pos) {
        position = pos;
    }

    public void setPosition(int pos) {
        position=pos;
    }

    public int getPosition(){
        return position;
    }
}
