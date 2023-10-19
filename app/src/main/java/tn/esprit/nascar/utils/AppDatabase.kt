package tn.esprit.nascar.utils

import androidx.room.Database
import androidx.room.RoomDatabase
import tn.esprit.nascar.dao.EventDao
import tn.esprit.nascar.models.Events
import tn.esprit.nascar.models.News

//TODO 10 Change this class to an abstract class that inherit from ROOMDatabase
@Database(entities = [Events::class,News::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
abstract fun eventDao() : EventDao

companion object{
        //TODO 11 Apply the Design Pattern singleton


    }
}