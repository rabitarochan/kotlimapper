package com.github.rabitarochan.kotlimapper.handler

import com.github.rabitarochan.kotlimapper.WrappedResultSet
import java.sql.PreparedStatement
import kotlin.reflect.KClass

class BytesTypeHandler() : TypeHandler {

    override fun getValue(rs: WrappedResultSet, name: String): Any? {
        return rs.bytes(name)
    }

    override fun setValue(ps: PreparedStatement, parameterIndex: Int, value: Any) {
        ps.setBytes(parameterIndex, value as ByteArray)
    }

    override fun getType(): KClass<*> {
        return ByteArray::class
    }

}
