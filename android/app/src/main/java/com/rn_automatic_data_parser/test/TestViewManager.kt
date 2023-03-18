package com.rn_automatic_data_parser.test

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class TestViewManager : SimpleViewManager<TestView>() {
    override fun getName(): String {
        return "TestView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): TestView {
        return TestView(reactContext)
    }
}