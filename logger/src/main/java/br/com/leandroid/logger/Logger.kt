package br.com.leandroid.logger

import android.util.Log

class Logger {

    val TAG = "Logger"

    fun error(message: String) {
        error(TAG, message)
    }

    fun error(tag: String, message: String) {
        Log.e(tag, message)
    }
}