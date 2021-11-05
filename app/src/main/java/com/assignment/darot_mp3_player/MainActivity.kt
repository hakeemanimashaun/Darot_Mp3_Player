package com.assignment.darot_mp3_player

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
     lateinit var player: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                var playButton = findViewById<Button>(R.id.play_button)
                var stopButton = findViewById<Button>(R.id.stop_button)
                var pauseButton = findViewById<Button>(R.id.pause_button)

                player = MediaPlayer.create(applicationContext, R.raw.early_momo_vector_ft_goodgirl_la)
                playButton.setOnClickListener {
                    player.start()
                }
                pauseButton.setOnClickListener {
                if (player.isPlaying){
                    player.pause()


                }

                }

                stopButton.setOnClickListener {
                    if(player.isPlaying) {
                        player.stop()
                        player.reset()
                        player.release()
                    }
                }
            }
    }
