package com.hotmail.antonioaren.museo.pintores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.hotmail.antonioaren.museo.R;
import com.hotmail.antonioaren.museo.data.DetailData;
import es.ulpgc.eite.framework.android.AndroidScreenView;

import java.util.List;


/**
 * Created by PedroAntonio on 14/03/2016.
 */
public class PintoresView extends AndroidScreenView implements I_PintoresView {


    private ListView _list;
    private MuseoAdapter _adapter;
    private int _position;

    @Override
    public int getListPosition(){
        return getPosition();
    }


    private int getPosition() {
        return _position;
    }

    private void setPosition(int position) {
       _position = position;
    }

    private ListView getlist() {
        return _list;
    }

    private void setlist(ListView list) {
        _list = list;
    }

    private MuseoAdapter getAdapter() {
        return _adapter;
    }

    private void setAdapter(MuseoAdapter adapter) {
        _adapter = adapter;
    }

    private I_PintoresPresenter getPintoresPresenter() {
        return (I_PintoresPresenter) getScreenPresenter();
    }

    @Override
    public void setPintoresLayout() {

        debug("setPintoresLayout");
        setContentView(getListLayout());
    }

    private int getListLayout(){
        return R.layout.pintores_view;
    }

    private int getRowLayout(){
        return R.layout.pintores_row;
    }

    private int getListView(){
        return R.id.listView;
    }

    @Override
    public void setPintoresCollection(List<DetailData> collection){
        getAdapter().clear();
        getAdapter().addAll(collection);
        getAdapter().notifyDataSetChanged();

    }

    @Override
    public void setListPosition(int position){
        getlist().setSelection(getPosition());
    }


//    @Override
//    public void setListPosition(){
//        getlist().setSelection(getPosition());
//    }

    @Override
    public void setPintoresList(){
        setlist((ListView) findViewById(getListView()));

    }
    @Override
    public void setMuseoAdapter(){
        setAdapter(new MuseoAdapter(this, getRowLayout()));

    }
    @Override
    public void setMuseoListAdapter(){
        getlist().setAdapter(getAdapter());

    }

    @Override
    public void setMuseoListListener(){
        getlist().setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                itemListenerClicked(position);

            }
        });
    }

    private void itemListenerClicked(int position) {
        setPosition(position);
        getPintoresPresenter().itemListenedClicked();


    }

    private class MuseoAdapter extends ArrayAdapter<DetailData>{
        private int _pintoresRowLayout;
        private PintoresView _pintoresListView;


        private PintoresView _getpintoresListView() {
            return _pintoresListView;
        }

        private int _getpintoresRowLayout() {
            return _pintoresRowLayout;
        }

        private void _setPintoresListView(PintoresView View) {
            _pintoresListView = View;
        }

        private void _setpintoresRowLayout(int layout) {
            _pintoresRowLayout = layout;
        }



        public MuseoAdapter(PintoresView _view, int _layout) {
            super(_view, _layout);
            _setPintoresListView(_view);
            _setpintoresRowLayout(_layout);

        }

        @Override
        public View getView(int position, View rowView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater)
                    _getpintoresListView().getSystemService(
                            (Context.LAYOUT_INFLATER_SERVICE));

            rowView = inflater.inflate(_getpintoresRowLayout(), parent, false);

            DetailData data = getItem(position);
            TextView titleView = (TextView) rowView.findViewById(R.id.lbl_title);
            titleView.setText(data.toString());
            return rowView;


        }
    }
}


