package com.example.myclassandobj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = User("Ivan", "id", 23) // экземпляр класса user - Обьект
        var user2 = User("Dima", "id1", 43)
        user.addAge(10)
        user.addAge(23)
        user.printUserInfo()
        user2.printUserInfo()

    }
}