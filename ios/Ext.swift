//
//  Ext.swift
//  rn_automatic_data_parser
//
//  Created by Susan Thapa on 18/03/2023.
//

import Foundation

extension ReadableMap {
  func decode<T: Codable>() throws -> T {
    let json = try JSONSerialization.data(withJSONObject: self)
    return try JSONDecoder().decode(T.self, from: json)
  }
}

extension ReadableArray {
  func decode<T: Codable>() throws -> [T] {
    let json = try JSONSerialization.data(withJSONObject: self)
    return try JSONDecoder().decode([T].self, from: json)
  }
}

extension Encodable {
  func encode() throws -> ReadableMap {
    let data = try JSONEncoder().encode(self)
    return try JSONSerialization.jsonObject(with: data, options: .allowFragments) as! ReadableMap
  }
}

extension Array where Element: Codable {
  func encode() throws -> ReadableArray {
    let data = try JSONEncoder().encode(self)
    return try JSONSerialization.jsonObject(with: data, options: .allowFragments) as! ReadableArray
  }
}
