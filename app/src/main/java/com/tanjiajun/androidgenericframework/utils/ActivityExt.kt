package com.tanjiajun.androidgenericframework.utils

import android.app.Activity
import com.tanjiajun.androidgenericframework.AndroidGenericFrameworkApplication
import com.tanjiajun.androidgenericframework.ui.BaseActivity
import com.tanjiajun.androidgenericframework.ui.ViewModelFactory

/**
 * Created by TanJiaJun on 2019-08-12.
 */
inline fun <reified T : BaseActivity> Activity.startActivity() =
        startActivity(android.content.Intent(this, T::class.java))

fun Activity.getViewModelFactory(): ViewModelFactory =
        ViewModelFactory((applicationContext as AndroidGenericFrameworkApplication).userRepository)