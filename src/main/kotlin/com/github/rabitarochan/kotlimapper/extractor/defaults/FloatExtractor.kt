package com.github.rabitarochan.kotlimapper.extractor.defaults

import com.github.rabitarochan.kotlimapper.WrappedResultSet
import com.github.rabitarochan.kotlimapper.extractor.ResultSetExtractor
import kotlin.reflect.KClass

class FloatExtractor() : ResultSetExtractor<Float> {

    override fun extract(rs: WrappedResultSet): Float? {
        return rs.float(firstColumnIndex)
    }

    override fun getTargetType(): KClass<*> {
        TODO()
    }

    override fun getTargetTypes(): Array<KClass<*>> {
        @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
        return arrayOf(Float::class, java.lang.Float::class)
    }

}
