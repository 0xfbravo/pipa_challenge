package br.com.pipa.messengemodule.core

import android.content.Context
import android.util.Log
import br.com.pipa.messengemodule.thirdparty.AppMessenger
import br.com.pipa.messengemodule.thirdparty.FacebookMessenger
import br.com.pipa.messengemodule.thirdparty.Skype
import br.com.pipa.messengemodule.thirdparty.Telegram
import br.com.pipa.messengemodule.thirdparty.WhatsApp

internal object ThirdPartyFactory {

    const val TAG = "ThirdPartyFactory"

    var facebookMessenger: AppMessenger? = null
    var skype: AppMessenger? = null
    var telegram: AppMessenger? = null
    var whatsApp: AppMessenger? = null

    fun createFacebookMessenger(context: Context): AppMessenger {
        if (facebookMessenger != null)
            return facebookMessenger!!

        Log.d(TAG, "Creating FacebookMessenger : AppMessenger")
        facebookMessenger = FacebookMessenger(context)
        return facebookMessenger!!
    }

    fun createSkype(context: Context): AppMessenger {
        if (skype != null)
            return skype!!

        Log.d(TAG, "Creating Skype : AppMessenger")
        skype = Skype(context)
        return skype!!
    }

    fun createTelegram(context: Context): AppMessenger {
        if (telegram != null)
            return telegram!!

        Log.d(TAG, "Creating Telegram : AppMessenger")
        telegram = Telegram(context)
        return telegram!!
    }

    fun createWhatsApp(context: Context): AppMessenger {
        if (whatsApp != null)
            return whatsApp!!

        Log.d(TAG, "Creating WhatsApp : AppMessenger")
        whatsApp = WhatsApp(context)
        return whatsApp!!
    }

}