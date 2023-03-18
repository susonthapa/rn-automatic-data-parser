/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  Button,
  NativeModules,
  requireNativeComponent,
  SafeAreaView, StatusBar
} from 'react-native';

const TestView = requireNativeComponent('TestView')
const TestModule = NativeModules.TestModule


function App(): JSX.Element {

  return (
    <SafeAreaView>
      <StatusBar />
      <TestView
        style={{
          width: 100,
          height: 100,
        }}
        testProp={{
          name: 'Susan',
          age: 100,
          details: {
            happy: true,
            status: 'Developer',
          }
        }} />
      <Button title='Click Me!' onPress={() => TestModule.testMethod({
        arg: 'Button Clicked',
        value: {
          test: 'Button Clicked',
        }
      })} />
    </SafeAreaView>
  );
}

export default App;
