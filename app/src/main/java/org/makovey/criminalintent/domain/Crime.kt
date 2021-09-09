package org.makovey.criminalintent.domain

import java.text.SimpleDateFormat
import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: String = SimpleDateFormat("dd-MM-yyyy hh:mm").format(Calendar.getInstance().time),
    var isSolved: Boolean = false,
    var requiredPolice: Boolean = false
)