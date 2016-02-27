package com.github.rabitarochan.kodb.extractor.defaults

import com.github.rabitarochan.kodb.extractor.ResultSetExtractor
import java.sql.ResultSet
import kotlin.reflect.KClass

class DoubleExtractor() : ResultSetExtractor<Double> {

    override fun extract(rs: ResultSet): Double {
        return rs.getDouble(firstColumnIndex)
    }

    override fun getTargetType(): KClass<*> {
        return Double::class
    }
}