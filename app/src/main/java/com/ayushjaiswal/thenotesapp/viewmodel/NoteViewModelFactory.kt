package com.ayushjaiswal.thenotesapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ayushjaiswal.thenotesapp.repository.NoteRepository

class NoteViewModelFactory(val app:Application,val noteRepository: NoteRepository):ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepository) as T
    }
}