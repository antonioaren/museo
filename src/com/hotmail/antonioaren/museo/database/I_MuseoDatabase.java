package com.hotmail.antonioaren.museo.database;


import com.hotmail.antonioaren.museo.data.DetailData;


import java.util.List;


public interface I_MuseoDatabase {


    DetailData getData(Long dataId);

    DetailData getDataBy(DatabaseClauseArg[] args);

    List<DetailData> getDataListBy(DatabaseClauseArg[] args);

    List<DetailData> getDataList();

    boolean deleteDataList();

    boolean deleteData(Long dataId);

    Long saveData(DetailData data);

    boolean updateData(DetailData data);
}
