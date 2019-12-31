package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.roomdb.database.AppDatabase
import com.example.roomdb.entity.BookEntity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db= Room.databaseBuilder(applicationContext,AppDatabase::class.java,"BookDB").build()

        //insertCase
        Thread{
            var bookEntity=BookEntity()
            bookEntity.bookid=1
            bookEntity.bookName="Kotlin for Android Developer"
            db.bookDao().saveBooks(bookEntity)

            //fetch Records
            db.bookDao().getAllBooks().forEach(){
                Log.i("Fetch Records","Id:${it.bookid}")
                Log.i("Fetch Records","Name:${it.bookName}")
            }

        }.start()
    }
}
