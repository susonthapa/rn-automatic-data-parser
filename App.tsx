/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  Button,
  NativeModules, SafeAreaView, StatusBar
} from 'react-native';

const TestModule = NativeModules.TestModule


function App(): JSX.Element {

  return (
    <SafeAreaView>
      <StatusBar />
      <Button title='Pass Object' onPress={async () => {
        const response = await TestModule.testMap(
          {
            arg: 'Button Clicked',
            value: {
              test: 'Button Clicked',
            }
          }
        )
        console.log('Got Object: ', response);

      }} />
      <Button title='Pass Array' onPress={async () => {
        const response = await TestModule.testArray(
          [
            {
              name: 'Bob',
              age: 35,
              details: {
                hobby: 'Coding',
              },
            },
            {
              name: 'Ali',
              age: 25,
              details: {
                hobby: 'Signing',
              },
            },
          ])
        console.log('Got Array: ', response);
      }} />
    </SafeAreaView>
  );
}

export default App;
