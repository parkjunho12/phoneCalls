package com.jun.phonecall.Common

import android.app.Application
import io.realm.Realm

class GlobalApplication : Application() {
    companion object{
        lateinit var realm : Realm
    }

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}