package com.viable.postcard

import android.content.Context
import android.media.MediaPlayer
import androidx.annotation.RawRes

class AudioPlayer {
    private var mediaPlayer: MediaPlayer? = null

    fun playFromRaw(context: Context, @RawRes fileId: Int) {
        stopPlaying()
        mediaPlayer = MediaPlayer.create(context, fileId)
        mediaPlayer?.setOnCompletionListener {
            mediaPlayer?.start()
        }
        mediaPlayer?.start()
    }

    fun stopPlaying() {
        mediaPlayer?.stop()
    }

}