package org.makovey.criminalintent.model

import androidx.lifecycle.ViewModel
import org.makovey.criminalintent.domain.Crime

class CrimeListViewModel : ViewModel() {

    val crimes = mutableListOf<Crime>()

    init {
        for(i in 0 until 50) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes.add(crime)
        }
    }
}