package org.makovey.criminalintent

import android.app.Application
import org.makovey.criminalintent.database.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}