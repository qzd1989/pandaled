package com.pandaled

import android.app.Application
import com.pandaled.data.local.AppDatabase
import com.pandaled.data.local.JsonFileManager
import com.pandaled.data.repository.ProjectRepository

class PandaLedApp : Application() {

    lateinit var database: AppDatabase
        private set

    lateinit var jsonFileManager: JsonFileManager
        private set

    lateinit var projectRepository: ProjectRepository
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this

        database = AppDatabase.getInstance(this)
        jsonFileManager = JsonFileManager(this)
        projectRepository = ProjectRepository(
            projectDao = database.projectDao(),
            jsonFileManager = jsonFileManager
        )
    }

    companion object {
        lateinit var instance: PandaLedApp
            private set
    }
}
