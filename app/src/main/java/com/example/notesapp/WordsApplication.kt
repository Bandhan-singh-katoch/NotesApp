package com.example.notesapp

import android.app.Application

class WordsApplication:Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}