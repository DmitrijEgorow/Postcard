package com.viable.postcard

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val postCardImageView: ImageView by lazy {
        findViewById(R.id.postcard_image)
    }

    private var audioPlayer: AudioPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        audioPlayer = AudioPlayer()

        postCardImageView.setOnClickListener {
            audioPlayer?.playFromRaw(this, R.raw.christmas)
        }
    }

    override fun onStop() {
        super.onStop()
        audioPlayer?.stopPlaying()
        audioPlayer = null
    }
}
