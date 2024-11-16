package com.example.androidprofinal

class CredentialsManager {

    fun validateEmail(inputEmail: String): Boolean {
        if (inputEmail.isBlank()) return false
        val regexPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        return inputEmail.matches(regexPattern.toRegex())
    }

    fun checkPassword(passwordInput: String): Boolean {
        return passwordInput.isNotBlank()
    }
}
