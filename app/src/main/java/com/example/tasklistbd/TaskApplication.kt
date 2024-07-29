package com.example.tasklistbd

import android.app.Application
import com.example.tasklistbd.data.TaskRoomDatabase

class TaskApplication : Application() {

    val database: TaskRoomDatabase by lazy {
        TaskRoomDatabase.getDatabase(this)
    }

}