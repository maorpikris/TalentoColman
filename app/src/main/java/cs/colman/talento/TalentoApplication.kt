package cs.colman.talento

import android.app.Application
import android.util.Log
import cs.colman.talento.data.local.AppDatabase

const val TAG = "TalentoApplication"

class TalentoApplication : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }

    override fun onCreate() {
        super.onCreate()
    }
}
