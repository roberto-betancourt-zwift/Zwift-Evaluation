package com.zwift.evaluation.data

import com.zwift.evaluation.domain.Peripheral
import com.zwift.evaluation.domain.PeripheralType
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random


fun getPeripherals(): Flow<Peripheral> = flow {
    while (true) {
        val delay = Random.nextLong(1000, 3000)
        delay(delay)
        emit(peripherals.random())
    }
}

private val peripherals = listOf(
    Peripheral(
        "Controller",
        Random.nextInt(-100, 0),
        Random.nextInt(0, 100),
        Random.nextInt(30, 50),
        "8c7bf21e-a9d2-4d1b-a08d-b7e7d2f12c1a",
        "1.0.0",
        PeripheralType.CONTROLLER
    ),
    Peripheral(
        "Trainer",
        Random.nextInt(-100, 0),
        Random.nextInt(0, 100),
        Random.nextInt(30, 50),
        "3f412cab-d1e2-441e-b87e-e2c07b7e28ab",
        "1.0.0",
        PeripheralType.TRAINER
    ),
    Peripheral(
        "HR Monitor",
        Random.nextInt(-100, 0),
        Random.nextInt(0, 100),
        Random.nextInt(30, 50),
        "10eb1a23-4e1c-4d9b-987d-278e2f3b11ac",
        "1.0.0",
        PeripheralType.HR_MONITOR
    ),
    Peripheral(
        "Smart Bike",
        Random.nextInt(-100, 0),
        Random.nextInt(0, 100),
        Random.nextInt(30, 50),
        "d59a07e1-7e0f-4b92-8f0e-e0d427f2f3cd",
        "1.0.0",
        PeripheralType.SMART_BIKE
    ),

    Peripheral(
        null,
        Random.nextInt(-100, 0),
        Random.nextInt(0, 100),
        Random.nextInt(30, 50),
        null,
        null,
        null
    )
)

fun getAvailableUpdates() = flow {
    delay(600)
    emit(availableUpdates)
}

private val availableUpdates = mapOf(
    PeripheralType.CONTROLLER to "1.0.0",
    PeripheralType.TRAINER to "1.5.0",
    PeripheralType.HR_MONITOR to "1.0.0",
    PeripheralType.SMART_BIKE to "1.0.1"
)
