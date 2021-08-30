package com.cocokaribou.blabla_lee

import java.text.SimpleDateFormat
import java.util.*

class DateUtil {
    private val YEAR_FORMAT = "yyyy"
    private val MONTH_FORMAT = "MM"
    private val DAY_FORMAT = "dd"

    fun getDate(date: Long, pattern: String): String {
        try {
            val formatter: SimpleDateFormat = SimpleDateFormat(pattern, Locale.KOREA)
            val d = Date(date)
            return formatter.format(d).toUpperCase()
        } catch (e: Exception) {
            return ""
        }
    }

}