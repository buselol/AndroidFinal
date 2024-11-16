package com.example.androidprofinal  // Updated package name

import org.junit.Test
import org.junit.Assert.*  // Correct import

class CredentialsManagerTest {

    @Test
    fun givenEmptyPassword_thenReturnFalse() {
        val credentialsManager = CredentialsManager()

        val isEmailValid = credentialsManager.validateEmail("")  // Corrected function call

        assertFalse(isEmailValid)
    }
}
