/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  requireNativeComponent,
  SafeAreaView, StatusBar, View
} from 'react-native';

const TestView = requireNativeComponent('TestView')


function App(): JSX.Element {

  return (
    <SafeAreaView>
      <StatusBar />
      <TestView style={{
        width: 100,
        height: 100,
      }} />
    </SafeAreaView>
  );
}

export default App;
