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
      <Button title='Pass Primitive' onPress={async () => {
        const numberArray = await TestModule.testNumberArray([1, 10, 20])
        console.log('Got Primitive Number Array: ', numberArray);

        const stringArray = await TestModule.testStringArray(['Apple', 'Banana'])
        console.log('Got Primitive String Array: ', stringArray);

        const booleanArray = await TestModule.testBooleanArray([true, false, true])
        console.log('Got Primitive Boolean Array: ', booleanArray);
      }} />
    </SafeAreaView>
  );
}

export default App;
