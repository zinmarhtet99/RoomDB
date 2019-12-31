package com.example.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomdb.entity.BookEntity

@Dao
interface BookDAO {

    @Insert
    fun saveBooks(book: BookEntity)

    @Query(value="Select * from BookEntity")
    fun getAllBooks():List<BookEntity>
}