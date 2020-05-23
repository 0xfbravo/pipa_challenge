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

    private var facebookMessenger: AppMessenger? = null
    private var skype: AppMessenger? = null
    private var telegram: AppMessenger? = null
    private var whatsApp: AppMessenger? = null

    fun getFacebookMessenger(context: Context): AppMessenger {
        if (facebookMessenger != null)
            return facebookMessenger!!

        Log.d(TAG, "Creating FacebookMessenger : AppMessenger")
        facebookMessenger = FacebookMessenger(context)
        return facebookMessenger!!
    }

    fun getSkype(context: Context): AppMessenger {
        if (skype != null)
            return skype!!

        Log.d(TAG, "Creating Skype : AppMessenger")
        skype = Skype(context)
        return skype!!
    }

    fun getTelegram(context: Context): AppMessenger {
        if (telegram != null)
            return telegram!!

        Log.d(TAG, "Creating Telegram : AppMessenger")
        telegram = Telegram(context)
        return telegram!!
    }

    fun getWhatsApp(context: Context): AppMessenger {
        if (whatsApp != null)
            return whatsApp!!

        Log.d(TAG, "Creating WhatsApp : AppMessenger")
        whatsApp = WhatsApp(context)
        return whatsApp!!
    }

}