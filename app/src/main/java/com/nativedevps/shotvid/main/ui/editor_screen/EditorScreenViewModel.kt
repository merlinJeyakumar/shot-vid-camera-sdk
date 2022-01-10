package com.nativedevps.shotvid.main.ui.editor_screen

import android.app.Application
import android.util.Log
import com.nativedevps.domain.datasources.local.SettingsConfigurationSource
import com.nativedevps.domain.datasources.remote.firebase.FirebaseAuthenticationService
import com.nativedevps.domain.model.configuration.AppConfiguration
import com.nativedevps.domain.model.configuration.UserProfile
import com.nativedevps.support.base_class.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import javax.inject.Inject

@HiltViewModel
class EditorScreenViewModel @Inject constructor(application: Application) : BaseViewModel(application) {

    override fun onCreate() {

    }
}