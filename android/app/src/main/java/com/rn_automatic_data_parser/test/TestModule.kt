package com.rn_automatic_data_parser.test

import android.util.Log
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap

class TestModule : ReactContextBaseJavaModule() {
    override fun getName(): String {
        return "TestModule"
    }

    @ReactMethod
    fun testMethod(param: ReadableMap) {
        Log.d(TAG, "testMethod: param -> $param")
    }

    companion object {
        const val TAG = "TestModule"
    }
}