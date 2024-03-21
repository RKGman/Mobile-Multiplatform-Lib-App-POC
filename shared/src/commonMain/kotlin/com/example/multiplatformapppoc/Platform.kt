package com.example.multiplatformapppoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform