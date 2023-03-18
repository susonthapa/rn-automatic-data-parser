package com.rn_automatic_data_parser.test

import android.util.Log
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class TestViewManager : SimpleViewManager<TestView>() {
    override fun getName(): String {
        return "TestView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): TestView {
        return TestView(reactContext)
    }

    @ReactProp(name = "testProp")
    fun setTestProps(view: TestView, props: ReadableMap) {
        Log.d(TAG, "setTestProps: props -> $props")
    }

    companion object {
        const val TAG = "TestViewManager"
    }
}