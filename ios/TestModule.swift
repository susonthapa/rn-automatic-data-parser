//
//  TestModule.swift
//  rn_automatic_data_parser
//
//  Created by Susan Thapa on 18/03/2023.
//

import Foundation

@objc(TestModule)
class TestModule: NSObject {
  
  @objc func testMap(_ param: ReadableMap, _ resolve: RCTPromiseResolveBlock, _ reject: RCTPromiseRejectBlock) {
    do {
      // convert the JS object to Swift object
      let testMapArg: TestMapArg = try param.decode()
      NSLog("testMap: argument -> \(testMapArg)")
      
      // convert the Swift object to JS object
      let readableMap = try testMapArg.encode()
      resolve(readableMap)
    } catch {
      
    }
  }
  
  @objc func testArray(_ param: ReadableArray, _ resolve: RCTPromiseResolveBlock, _ reject: RCTPromiseRejectBlock) {
    do {
      // convert the JS array to Swift array
      let testArrayArg: [TestArrayArg] = try param.decode()
      NSLog("testArray: arguments -> \(testArrayArg)")
      
      // convert the Swift array to JS array
      let readableArray = try testArrayArg.encode()
      resolve(readableArray)
    } catch {
      
    }
  }
  
  @objc func testNumberArray(_ param: ReadableArray, _ resolve: RCTPromiseResolveBlock, _ reject: RCTPromiseRejectBlock) {
    do {
      let testArray: [Int] = try param.decode()
      NSLog("testNumberArray: \(testArray)")
      
      let readableArray = try testArray.encode()
      resolve(readableArray)
    } catch {
      
    }
  }
  
  @objc func testStringArray(_ param: ReadableArray, _ resolve: RCTPromiseResolveBlock, _ reject: RCTPromiseRejectBlock) {
    do {
      let testArray: [String] = try param.decode()
      NSLog("testStringArray: \(testArray)")
      
      let readableArray = try testArray.encode()
      resolve(readableArray)
    } catch {
      
    }
  }
  
  @objc func testBooleanArray(_ param: ReadableArray, _ resolve: RCTPromiseResolveBlock, _ reject: RCTPromiseRejectBlock) {
    do {
      let testArray: [Bool] = try param.decode()
      NSLog("testBooleanArray: \(testArray)")
      
      let readableArray = try testArray.encode()
      resolve(readableArray)
    } catch {
      
    }
  }
  
}
