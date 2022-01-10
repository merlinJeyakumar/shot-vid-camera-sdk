package com.nativedevps.shotvid

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

open class BaseTest {
    fun runOnNewThread(callback: suspend CoroutineScope.() -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            callback()
        }
    }
}