//
//  Models.swift
//  rn_automatic_data_parser
//
//  Created by Susan Thapa on 18/03/2023.
//

import Foundation

typealias ReadableMap = [String: Any]
typealias ReadableArray = [Any]

struct TestArrayArg: Codable {
  let name: String
  let age: Int
  let details: Details
  
  struct Details: Codable {
    let hobby: String
  }
}

struct TestMapArg: Codable {
  let arg: String
  let value: Value
  
  struct Value: Codable {
    let test: String
  }
}
