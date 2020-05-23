package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.net.Uri
import br.com.pipa.messengemodule.model.Message

internal class Telegram(context: Context): AppMessenger(context, "org.telegram.messenger") {

    override fun getApiURL(message: Message): Uri {
        return Uri.parse("http://telegram.me/${message.destination}")
    }

}