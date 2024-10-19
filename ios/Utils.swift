//
//  Utils.swift
//  RVLife
//
//  Created by Susan Thapa on 08/10/2024.
//  Copyright © 2024 Social Knowledge. All rights reserved.
//

import Foundation

// Utility function to safely unwrap optionals
func unwrap<T>(
    _ optional: T?,
    errorMessage _: String = "Failed to unwrap optional"
) throws -> T {
    guard let value = optional else {
        throw NSError(domain: "unwrap error", code: 2)
    }
    return value
}

// Utility function to safely cast optionals
func cast<T>(
    _ value: Any?,
    to _: T.Type,
    errorMessage _: String = "Failed to cast optional"
) throws -> T {
    guard let castedValue = value as? T else {
        throw NSError(domain: "cast error", code: 3)
    }
    return castedValue
}
