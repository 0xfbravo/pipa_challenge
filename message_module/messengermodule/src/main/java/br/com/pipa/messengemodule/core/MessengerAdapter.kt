package br.com.pipa.messengemodule.core

import android.content.Context

interface MessengerAdapter {

    fun sendOnWhatsApp(context: Context, destination: String, predefinedMessage: String? = null)
    fun sendOnTelegram(context: Context, destination: String)
    fun sendOnFbMessenger(context: Context, destination: String)
    fun sendOnSkype(context: Context, destination: String)

}