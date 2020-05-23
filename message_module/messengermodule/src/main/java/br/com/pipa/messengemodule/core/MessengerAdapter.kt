package br.com.pipa.messengemodule.core

interface MessengerAdapter {

    fun sendOnWhatsApp(destination: String, predefinedMessage: String? = null)
    fun sendOnTelegram(destination: String)
    fun sendOnFbMessenger(destination: String)
    fun sendOnSkype(destination: String)

}