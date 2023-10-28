package com.example.mad_practical_6_21012021061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.content.Intent
import android.media.MediaPlayer

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playButton=findViewById<FloatingActionButton>(R.id.playbutton)
        val stopButton=findViewById<FloatingActionButton>(R.id.stop)
        val mediaPlayer:MediaPlayer=MediaPlayer.create(this,R.raw.scam)
        playButton.setOnClickListener{

            if(!mediaPlayer.isPlaying){
                mediaPlayer.start()
                playButton.setImageResource(R.drawable.baseline_pause_24)
            }
            else{
                mediaPlayer.pause()
                playButton.setImageResource(R.drawable.baseline_play_arrow_24)
            }
        }

            }

        }


