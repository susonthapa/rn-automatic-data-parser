package com.rn_automatic_data_parser.test

import android.util.Log
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap

class TestModule : ReactContextBaseJavaModule() {
    override fun getName(): String {
        return "TestModule"
    }

    @ReactMethod
    fun testMap(param: ReadableMap, promise: Promise) {
        // convert the JS object to kotlin object
        val testMapArg = param.decode<TestMapArg>()
        Log.d(TAG, "testMethod: argument -> $testMapArg")

        // pass the kotlin object to JS object
        val readableMap = testMapArg.encode()
        promise.resolve(readableMap)
    }

    @ReactMethod
    fun testArray(param: ReadableArray, promise: Promise) {
        val testArrayArg = param.decode<TestArrayArg>()
        Log.d(TAG, "testArray: argument -> $testArrayArg")

        // pass the object to JS
        val readableArray = testArrayArg.encode()
        promise.resolve(readableArray)
    }

    companion object {
        const val TAG = "TestModule"
    }
}