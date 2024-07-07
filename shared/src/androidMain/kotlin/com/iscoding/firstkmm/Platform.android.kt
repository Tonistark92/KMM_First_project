package com.iscoding.firstkmm

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}" + "\n" + "FROM ISLAM"
}

actual fun getPlatform(): Platform = AndroidPlatform()