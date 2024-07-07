package com.iscoding.firstkmm

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + "\n" + "FROM ISLAM"
}

actual fun getPlatform(): Platform = IOSPlatform()