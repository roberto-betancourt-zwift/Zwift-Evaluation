package com.zwift.evaluation.domain

data class Peripheral(
    val name: String?,
    val rssi: Int?,
    val battery: Int?,
    val temperature: Int?,
    val id: String?,
    val version: String?,
    val type: PeripheralType?
)