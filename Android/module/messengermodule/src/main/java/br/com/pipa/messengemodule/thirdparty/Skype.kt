package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.net.Uri
import br.com.pipa.messengemodule.model.Message

internal class Skype(context: Context): AppMessenger(context, "com.skype.raider") {

    override fun getApiURL(message: Message): Uri {
        return Uri.parse("skype:${message.destination}")
    }

}