package org.makovey.criminalintent.model

import androidx.lifecycle.ViewModel
import org.makovey.criminalintent.database.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository: CrimeRepository = CrimeRepository.get()

    val crimesListLiveData = crimeRepository.getCrimes()
}