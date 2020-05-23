package br.com.pipa.messengemodule.core

import android.util.Log
import br.com.pipa.messengemodule.model.Message
import br.com.pipa.messengemodule.thirdparty.FacebookMessenger
import br.com.pipa.messengemodule.thirdparty.Skype
import br.com.pipa.messengemodule.thirdparty.Telegram
import br.com.pipa.messengemodule.thirdparty.WhatsApp

class MessengerFacade: MessengerAdapter {

    companion object {
        private const val TAG = "MessengerFacade"
    }

    override fun sendOnWhatsApp(destination: String, predefinedMessage: String?) {
        val message = Message(destination, predefinedMessage)
        Log.d(TAG, "Sending $message on WhatsApp")
        WhatsApp.sendMessage(message)
    }

    override fun sendOnTelegram(destination: String) {
        val message = Message(destination)
        Log.d(TAG, "Sending $message on Telegram")
        Telegram.sendMessage(message)
    }

    override fun sendOnFbMessenger(destination: String) {
        val message = Message(destination)
        Log.d(TAG, "Sending $message on Facebook Messenger")
        FacebookMessenger.sendMessage(message)
    }

    override fun sendOnSkype(destination: String) {
        val message = Message(destination)
        Log.d(TAG, "Sending $message on Skype")
        Skype.sendMessage(message)
    }

}