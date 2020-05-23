package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.net.Uri
import br.com.pipa.messengemodule.model.Message

internal class FacebookMessenger(context: Context): AppMessenger(context, "com.facebook.orca") {

    override fun getApiURL(message: Message): Uri {
        return Uri.parse("fb-messenger://user/${message.destination}")
    }

}