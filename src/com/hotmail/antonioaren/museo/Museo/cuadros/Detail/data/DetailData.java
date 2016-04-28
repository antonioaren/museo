package com.hotmail.antonioaren.museo.Museo.cuadros.Detail.data;

import org.droidpersistence.annotation.Column;
import org.droidpersistence.annotation.PrimaryKey;
import org.droidpersistence.annotation.Table;

/**
 * Created by PedroAntonio on 26/03/2016.
 */

@Table(name ="museo")
public class DetailData {

    @PrimaryKey (autoIncrement = true)
    @Column (name = "id")
    private  long id;
    

    @Column (name = "label")
    private String label;


    public DetailData() {
        setLabel ("");
    }

    public DetailData(String txt) {
        setLabel (txt);
    }

    public long getId() {
        return id;
    }

    public void setId(long valor) {
        id = valor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String txt) {
        label = txt;
    }

    @Override
    //Singletone para crear un objeto de tipo DetailData. Con esto controlamos que no haya mas objetos creados.
    //Es decir un unico objeto para la clase.
    public boolean equals(Object obj) {
        if (obj instanceof DetailData){
            DetailData data = (DetailData) obj;

            if (data.getId()== getId()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return getLabel();
    }
}
