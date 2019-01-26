package com.unsplash.pickerandroid.photopicker.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.unsplash.pickerandroid.photopicker.domain.Repository

/**
 * View model factory for the photo screen.
 * This will use the repository to create the view model.
 */
class PickerViewModelFactory constructor(private val repository: Repository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PickerViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PickerViewModel(repository) as T
        } else {
            throw IllegalArgumentException("unknown model class $modelClass")
        }
    }
}
