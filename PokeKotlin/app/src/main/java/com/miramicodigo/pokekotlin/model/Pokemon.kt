package com.miramicodigo.pokekotlin.model

import java.io.Serializable

class Pokemon : Serializable {
    lateinit var name: String
    lateinit var url: String

    var number: Int = 0
        get() {
            val urlParse = url.split("/".toRegex())
                    .dropLastWhile {
                        it.isEmpty()
                    }.toTypedArray()
            return Integer.parseInt(urlParse[urlParse.size - 1])
        }
}