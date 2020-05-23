package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.net.Uri
import br.com.pipa.messengemodule.model.Message

internal class Telegram(context: Context): AppMessenger(context, "") {

    override fun getApiURL(message: Message): Uri {
        TODO("Not yet implemented")
    }

}