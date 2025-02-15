package com.example.mymoviekeep

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform