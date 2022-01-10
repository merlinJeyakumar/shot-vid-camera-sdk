package com.nativedevps.shotvid.main.ui.editor_screen

import android.os.Bundle
import com.nativedevps.shotvid.R
import com.nativedevps.shotvid.databinding.ActivitySplashBinding
import com.nativedevps.support.base_class.ActionBarActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditorScreenActivity : ActionBarActivity<ActivitySplashBinding, EditorScreenViewModel>(
    R.layout.activity_editor_screen,
    EditorScreenViewModel::class.java
) {

    override fun onInit(savedInstanceState: Bundle?) {
        initData()
        initListener()
        initPreview()
    }

    private fun initData() {
    }

    private fun initListener() {
    }

    private fun initPreview() {

    }
}
