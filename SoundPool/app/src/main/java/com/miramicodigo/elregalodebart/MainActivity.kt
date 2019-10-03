package com.miramicodigo.elregalodebart

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.SoundPool
import android.media.AudioAttributes
import android.view.View

lateinit var spIdiota: SoundPool
lateinit var spCallate: SoundPool
lateinit var spVeteAlDiablo: SoundPool
var resIdiota = 0
var resCallate = 0
var resVeteAlDiablo = 0

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        createSoundPool()
    }

    private fun createSoundPool() {
        val attributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()
        spIdiota = SoundPool.Builder()
            .setAudioAttributes(attributes)
            .build()
        spCallate = SoundPool.Builder()
            .setAudioAttributes(attributes)
            .build()
        spVeteAlDiablo = SoundPool.Builder()
            .setAudioAttributes(attributes)
            .build()
        loadSoundPool()
    }

    fun loadSoundPool() {
        resIdiota = spIdiota.load(applicationContext, R.raw.idiota, 1)
        resCallate = spCallate.load(applicationContext, R.raw.callate, 1)
        resVeteAlDiablo = spVeteAlDiablo.load(applicationContext, R.raw.vete_al_diablo, 1)
    }
    fun idiota(v: View) {
        if(resIdiota != 0) {
            spIdiota.play(resIdiota, 1.0F, 1.0F,
                0, 0, 1F)
        }
    }
    fun callate(v: View) {
        if(resCallate != 0) {
            spCallate.play(resCallate, 1.0F, 1.0F,
                0, 0, 1F)
        }
    }

    fun veteAlDiablo(v: View) {
        if(resVeteAlDiablo != 0) {
            spVeteAlDiablo.play(resVeteAlDiablo, 1.0F, 1.0F,
                0, 0, 1F)
        }
    }
}
