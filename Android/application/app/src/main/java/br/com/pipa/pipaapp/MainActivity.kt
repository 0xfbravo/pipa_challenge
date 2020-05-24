package br.com.pipa.pipaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import br.com.pipa.messengemodule.core.MessengerAdapter
import br.com.pipa.messengemodule.core.MessengerFacade
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private val messenger: MessengerAdapter = MessengerFacade()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        destination.doOnTextChanged { text, _, _, _ ->
            changeButtonStates(text.isNullOrEmpty())
        }

        whatsApp.setOnClickListener { handleWhatsAppClick() }
        telegram.setOnClickListener { handleTelegramClick() }
        fbMessenger.setOnClickListener { handleFbMessengerClick() }
        skype.setOnClickListener { handleSkypeClick() }
    }

    private fun changeButtonStates(isNullOrEmpty: Boolean) {
        buttonsLayout.alpha = if (isNullOrEmpty) 0.3f else 1f
        whatsApp.isClickable = !isNullOrEmpty
        telegram.isClickable = !isNullOrEmpty
        fbMessenger.isClickable = !isNullOrEmpty
        skype.isClickable = !isNullOrEmpty
    }

    private fun handleWhatsAppClick() {
        messenger.sendOnWhatsApp(this, destination.text.toString(), text.text.toString())
    }

    private fun handleTelegramClick() {
        messenger.sendOnTelegram(this, destination.text.toString())
    }

    private fun handleFbMessengerClick() {
        try {
            val id = destination.text.toString().toLong()
            messenger.sendOnFbMessenger(this, destination.text.toString())
        }
        catch (e : Exception) {
            Toast.makeText(this, "O Facebook atualmente só aceita IDs para iniciar conversas.", Toast.LENGTH_LONG).show()
        }
    }

    private fun handleSkypeClick() {
        messenger.sendOnSkype(this, destination.text.toString())
    }

}
