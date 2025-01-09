package com.pcmdam.paucasascafeteria

import com.pcmdam.paucasascafeteria.User


class LoginProvider {

    companion object {

        fun login(username: String, password: String): Boolean {
            val user = userName.find { it.username == username && it.password == password }
            return user != null
        }

        fun addUser(username: String, password: String) {
            val nouUser = User(username, password)
            userName.add(username.length+1, nouUser)
        }


        private val userName = mutableListOf<User>(
            User("Pau", "1234"),
            User("Enaitz", "1234"),
        )
    }
}