package br.com.pipa.messengemodule.core

import android.content.Context
import android.util.Log
import br.com.pipa.messengemodule.model.Message

class MessengerFacade: MessengerAdapter {

    companion object {
        private const val TAG = "MessengerFacade"
    }

    override fun sendOnWhatsApp(context: Context, destination: String, predefinedMessage: String?) {
        val message = Message(destination, predefinedMessage)
        Log.d(TAG, "Sending $message on WhatsApp")
        ThirdPartyFactory.whatsApp?.sendMessage(message)
    }

    override fun sendOnTelegram(context: Context, destination: String) {
        val message = Message(destination)
        Log.d(TAG, "Sending $message on Telegram")
        ThirdPartyFactory.telegram?.sendMessage(message)
    }

    override fun sendOnFbMessenger(context: Context, destination: String) {
        val message = Message(destination)
        Log.d(TAG, "Sending $message on Facebook Messenger")
        ThirdPartyFactory.facebookMessenger?.sendMessage(message)
    }

    override fun sendOnSkype(context: Context, destination: String) {
        val message = Message(destination)
        Log.d(TAG, "Sending $message on Skype")
        ThirdPartyFactory.skype?.sendMessage(message)
    }

}