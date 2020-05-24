package br.com.pipa.messengemodule.model

internal class Message(destination: String,
                       text: String? = null) {

    var destination: String = destination
        private set

    var text: String? = text
        private set

}