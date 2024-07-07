package com.iscoding.firstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform