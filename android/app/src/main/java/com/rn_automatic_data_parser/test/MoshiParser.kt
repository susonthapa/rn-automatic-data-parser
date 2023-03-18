package com.rn_automatic_data_parser.test

import com.squareup.moshi.Moshi
import java.lang.reflect.Type

interface Codable

object MoshiParser {
    private val moshi = Moshi.Builder().build()

    fun <T> fromJsonString(json: String, type: Type): T? {
        return moshi.adapter<T>(type).fromJson(json)
    }

    fun <T> toJsonString(obj: T, type: Type): String? {
        return moshi.adapter<T>(type).toJson(obj)
    }
}