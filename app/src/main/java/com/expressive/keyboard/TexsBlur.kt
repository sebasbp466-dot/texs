package com.expressive.keyboard

import android.content.Context

/** Ajustes propios de texs: blur de ventana (Android 12+). */
object TexsBlur {
    private fun p(c: Context) = c.getSharedPreferences("texs_blur", Context.MODE_PRIVATE)
    fun enabled(c: Context): Boolean = p(c).getBoolean("blur", true)
    fun overlay(c: Context): Boolean = p(c).getBoolean("overlay", false)
    fun radius(c: Context): Int = p(c).getInt("radius", 60)
    fun setEnabled(c: Context, v: Boolean) { p(c).edit().putBoolean("blur", v).apply() }
    fun setOverlay(c: Context, v: Boolean) { p(c).edit().putBoolean("overlay", v).apply() }
    fun setRadius(c: Context, v: Int) { p(c).edit().putInt("radius", v).apply() }
}
