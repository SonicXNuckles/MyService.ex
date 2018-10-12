package com.example.moham.myservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class Service1:Service( )
{
    override fun onBind(intent: Intent?): IBinder? {

        return null

    }
        var mplayer: MediaPlayer?=null
        override fun onCreate() {
            super.onCreate()
            mplayer = MediaPlayer.create(this@Service1,
                    R.raw.dj)
        }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mplayer!!.start()
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        mplayer!!.stop()
        super.onDestroy()

    }

    }



