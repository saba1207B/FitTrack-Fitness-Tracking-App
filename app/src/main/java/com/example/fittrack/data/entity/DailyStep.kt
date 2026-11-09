// Copyright (c) 2026 Sabareesh M (saba1207B). All Rights Reserved.
// All rights reserved. No public license is granted.

package com.example.fittrack.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_steps")
data class DailyStep(
    @PrimaryKey
    val dateEpochDay: Long, // LocalDate.toEpochDay()
    val steps: Int,
    val lastUpdated: Long = System.currentTimeMillis()
)
