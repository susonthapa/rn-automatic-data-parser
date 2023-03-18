package com.rn_automatic_data_parser.test

import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.squareup.moshi.Types

inline fun <reified T> ReadableMap.decode(): T {
    val hashMap = toHashMap()
    val jsonString = MoshiParser.toJsonString(hashMap, Map::class.java)!!
    return MoshiParser.fromJsonString<T>(jsonString, T::class.java)!!
}

inline fun <reified T> ReadableArray.decode(): List<T> {
    val arrayList = toArrayList()
    val jsonString = MoshiParser.toJsonString(arrayList, List::class.java)!!
    return MoshiParser.fromJsonString(
        jsonString,
        Types.newParameterizedType(List::class.java, T::class.java)
    )!!
}

fun Codable.encode(): ReadableMap {
    val json = MoshiParser.toJsonString(this, this::class.java)!!
    val hashMap = MoshiParser.fromJsonString<Map<String, *>>(json, Map::class.java)
    return Arguments.makeNativeMap(hashMap)
}

@JvmName("encodeCodable")
fun Collection<Codable>.encode(): ReadableArray {
    return encodeInternal(this)
}

@JvmName("encodeNumber")
fun Collection<Number>.encode(): ReadableArray {
    return encodeInternal(this)
}

@JvmName("encodeBoolean")
fun Collection<Boolean>.encode(): ReadableArray {
    return encodeInternal(this)
}

@JvmName("encodeString")
fun Collection<String>.encode(): ReadableArray {
    return encodeInternal(this)
}

private fun encodeInternal(args: Collection<*>): ReadableArray {
    val json = MoshiParser.toJsonString(args, List::class.java)!!
    val array = MoshiParser.fromJsonString<List<*>>(json, List::class.java)
    return Arguments.makeNativeArray(array)
}
