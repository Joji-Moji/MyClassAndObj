package com.example.myclassandobj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = User("Ivan", "id", 23) // экземпляр класса user - Обьект
        val userInfo = user.addAge(10) // возвращенный результат запишет в userInfo
        Log.d("MyLog", userInfo)


    }
}