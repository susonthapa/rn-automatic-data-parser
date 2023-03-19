package com.rn_automatic_data_parser.test

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TestArrayArg(
    val name: String,
    val age: Int,
    val details: Details,
) : Codable {
    @JsonClass(generateAdapter = true)
    data class Details(
        val hobby: String,
    ) : Codable
}

@JsonClass(generateAdapter = true)
data class TestMapArg(
    val arg: String,
    val value: Value,
) : Codable {
    @JsonClass(generateAdapter = true)
    data class Value(
        val test: String,
    ) : Codable
}