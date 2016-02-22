package com.github.rabitarochan.kodb.handler

import java.sql.ResultSet
import kotlin.reflect.KClass

class BytesTypeHandler() : TypeHandler {

    override fun get(name: String, rs: ResultSet): Any {
        return rs.getBytes(name)
    }

    override fun getType(): KClass<*> {
        return Array<Byte>::class
    }

}