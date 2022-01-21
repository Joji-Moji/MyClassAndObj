package com.example.myclassandobj

import android.util.Log

class User(var name: String?, var id: String?, var age: Int?) {
    fun addAge(years: Int) : String{ // Возвращение в функциию String под Return
    age = age?.plus(years)

        return "User name: $name, user id: $id, user age: $age"
    }
    fun printUserInfo(){ /* шаблон дл облегчение кода, от большого колич повторяемого кода */
        Log.d ("MyLog","User name: $name, user id: $id, user age: $age")
    }
}