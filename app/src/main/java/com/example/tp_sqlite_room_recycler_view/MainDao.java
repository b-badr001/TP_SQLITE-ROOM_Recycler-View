package com.example.tp_sqlite_room_recycler_view;

import android.app.UiAutomation;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MainDao {

    @Insert(onConflict =REPLACE)
    void insert(MainData mainData);

    @Query("UPDATE table_name SET text= :sText where ID=:sID")
    void update(int sID, String sText);

    @Query("SELECT * FROM table_name")
    List<MainData> getAll();

    @Delete
    void delete(MainData mainData);

    @Delete
    void reset(List<MainData> mainData);
}
