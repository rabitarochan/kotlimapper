package com.github.rabitarochan.kodb.handler

import java.sql.PreparedStatement
import java.sql.ResultSet
import kotlin.reflect.KClass

class JavaShortTypeHandler() : TypeHandler {

    override fun getValue(rs: ResultSet, name: String): Any? {
        return rs.getShort(name)
    }

    override fun setValue(ps: PreparedStatement, parameterIndex: Int, value: Any) {
        ps.setShort(parameterIndex, value as Short)
    }

    override fun getType(): KClass<*> {
        @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
        return java.lang.Short::class
    }

}
