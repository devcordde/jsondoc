package me.schlaubi.jsondoc.shared.entites

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

/**
 * Object that can be serialized to JSON.
 */
interface JsonSerializable {

    /**
     * Serializes the object into a JSON formatted String.
     */
    fun toJson(): String = objectMapper.writeValueAsString(this)

    companion object {
        /**
         * Creates an instance of [T] from [json].
         */
        inline fun <reified T : JsonSerializable> fromJson(json: String): T = objectMapper.readValue(json)

        /**
         * [ObjectMapper] used for Serialization.
         * @see fromJson
         * @see toJson
         */
        val objectMapper: ObjectMapper = ObjectMapper().apply {
            registerKotlinModule()

        }
    }
}