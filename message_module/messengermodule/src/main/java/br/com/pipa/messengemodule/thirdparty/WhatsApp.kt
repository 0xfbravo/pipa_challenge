package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.net.Uri
import br.com.pipa.messengemodule.model.Message


internal class WhatsApp(context: Context): AppMessenger(context,"com.whatsapp") {

    override fun getApiURL(message: Message): Uri {
        return Uri.parse("https://wa.me/${message.destination}?text=${message.text}")
    }

}