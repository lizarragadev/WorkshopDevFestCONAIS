package com.miramicodigo.pokekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.miramicodigo.pokekotlin.adapter.PokemonAdapter
import com.miramicodigo.pokekotlin.model.PokemonResponse
import com.miramicodigo.pokekotlin.service.PokeInterface
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit
    lateinit var listaPokemonAdapter: PokemonAdapter
    var cantidadLote = 0
    var sePuedeCargar = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    private fun obtenerDatos(offset: Int) {


    }

}