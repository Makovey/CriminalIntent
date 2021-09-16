package org.makovey.criminalintent.model

import androidx.lifecycle.ViewModel
import org.makovey.criminalintent.database.CrimeRepository
import org.makovey.criminalintent.domain.Crime

class CrimeListViewModel : ViewModel() {

    private val crimeRepository: CrimeRepository = CrimeRepository.get()

    val crimesListLiveData = crimeRepository.getCrimes()

    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}