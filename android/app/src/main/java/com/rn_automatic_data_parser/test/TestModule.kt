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
    fun unsafeAccess(promise: Promise) {
        try {
            val value: Int? = null
            val sum = value!! + 10
            promise.resolve(sum)
        } catch (e: Exception) {
            promise.reject(e)
        }
    }

    @ReactMethod
    fun safeAccess(promise: Promise) {
        try {
            val value: Int? = null
            val sum = value!! + 10
            promise.resolve(sum)
        } catch (e: Exception) {
            promise.reject(e)
        }
    }

    @ReactMethod
    fun unsafeCast(promise: Promise) {
        try {
            val value: Int = 10
            val castValue: String = value as String
            promise.resolve(castValue)
        } catch (e: Exception) {
            promise.reject(e)
        }
    }

    @ReactMethod
    fun safeCast(promise: Promise) {
        try {
            val value: Int = 10
            val castValue: String = value as String
            promise.resolve(castValue)
        } catch (e: Exception) {
            promise.reject(e)
        }
    }


    @ReactMethod
    fun testMap(param: ReadableMap, promise: Promise) {
        // convert the JS object to kotlin object
        val testMapArg = param.decode<TestMapArg>()
        Log.d(TAG, "testMap: argument -> $testMapArg")

        // pass the kotlin object to JS object
        val readableMap = testMapArg.encode()
        promise.resolve(readableMap)
    }

    @ReactMethod
    fun testArray(param: ReadableArray, promise: Promise) {
        // decode from JS
        val testArray = param.decode<TestArrayArg>()
        Log.d(TAG, "testArray: argument -> $testArray")

        // pass to JS
        val readableArray = testArray.encode()
        promise.resolve(readableArray)
    }

    @ReactMethod
    fun testNumberArray(param: ReadableArray, promise: Promise) {
        // decode from JS
        val testArray = param.decode<Int>()
        Log.d(TAG, "testNumberArray: argument -> $testArray")

        // pass to JS
        val readableArray = testArray.encode()
        promise.resolve(readableArray)
    }

    @ReactMethod
    fun testStringArray(param: ReadableArray, promise: Promise) {
        val testArray = param.decode<String>()
        Log.d(TAG, "testStringArray: argument -> $testArray")

        val readableArray = testArray.encode()
        promise.resolve(readableArray)
    }

    @ReactMethod
    fun testBooleanArray(param: ReadableArray, promise: Promise) {
        val testArray = param.decode<Boolean>()
        Log.d(TAG, "testBooleanArray: argument -> $testArray")

        val readableArray = testArray.encode()
        promise.resolve(readableArray)
    }

    companion object {
        const val TAG = "TestModule"
    }
}