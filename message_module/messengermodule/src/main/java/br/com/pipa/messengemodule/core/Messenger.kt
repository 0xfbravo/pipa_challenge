package br.com.pipa.messengemodule.core

import br.com.pipa.messengemodule.model.Message

internal interface Messenger {

    fun sendMessage(message: Message)

}