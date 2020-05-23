package br.com.pipa.pipaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.pipa.messengemodule.core.MessengerFacade

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val messenger = MessengerFacade()
        messenger.sendOnWhatsApp(this, "+5511123445567")
    }
}
