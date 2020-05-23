package br.com.pipa.messengemodule.model

internal class Message(private val destination: String,
                       private val message: String? = null)