package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.net.Uri
import br.com.pipa.messengemodule.model.Message


internal class WhatsApp(context: Context): AppMessenger(context,"com.whatsapp") {

    override fun getApiURL(message: Message): Uri {
        val cleanPhoneNumber = cleanPhoneNumber(message.destination)

        message.text?.let {
            return Uri.parse("https://wa.me/${cleanPhoneNumber}?text=${message.text}")
        }

        return Uri.parse("https://wa.me/${cleanPhoneNumber}")
    }

    private fun cleanPhoneNumber(phoneNumber: String): String {
        return phoneNumber.replace("\\D", "")
    }

}