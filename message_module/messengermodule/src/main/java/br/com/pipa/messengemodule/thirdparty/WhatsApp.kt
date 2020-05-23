package br.com.pipa.messengemodule.thirdparty

import br.com.pipa.messengemodule.core.Messenger
import br.com.pipa.messengemodule.model.Message

internal object WhatsApp: Messenger {

    const val TAG = "WhatsApp"

    override fun sendMessage(message: Message) {
        TODO("Not yet implemented")
    }

}