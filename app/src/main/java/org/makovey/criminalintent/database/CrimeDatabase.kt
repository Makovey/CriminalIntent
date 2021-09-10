package org.makovey.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.makovey.criminalintent.domain.Crime

@Database(entities = [Crime::class], version = 1)
@TypeConverters(CrimeTypeConverts::class)
abstract class CrimeDatabase : RoomDatabase() {

    abstract fun crimeDao(): CrimeDao
}