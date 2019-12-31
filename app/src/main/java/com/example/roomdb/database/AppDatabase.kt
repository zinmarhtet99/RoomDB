package com.example.roomdb.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdb.dao.BookDAO
import com.example.roomdb.entity.BookEntity

@Database(entities=[(BookEntity::class)],version=1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun bookDao():BookDAO
}