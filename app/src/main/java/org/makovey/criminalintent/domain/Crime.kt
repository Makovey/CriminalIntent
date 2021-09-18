package org.makovey.criminalintent.domain

import android.icu.text.SimpleDateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var time: String = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date()),
    var isSolved: Boolean = false,
    var suspect: String = "",
    var suspectNumber: String = ""
)