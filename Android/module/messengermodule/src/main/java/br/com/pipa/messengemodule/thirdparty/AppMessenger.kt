package br.com.pipa.messengemodule.thirdparty

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.util.Log
import br.com.pipa.messengemodule.model.Message

internal abstract class AppMessenger(private val context: Context,
                                     private val packageName: String) {

    abstract fun getApiURL(message: Message): Uri

    fun sendMessage(message: Message) {
        if (!isAppInstalled()) {
            navigateToStore()
            return
        }

        val apiData = getApiURL(message)
        val sendIntent = Intent()
        sendIntent.apply {
            action = Intent.ACTION_VIEW
            data = apiData
            setPackage(packageName)
        }

        Log.d(this::class.java.simpleName, "$packageName installed, redirecting to ${apiData}...")
        context.startActivity(sendIntent)
    }

    private fun navigateToStore() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.apply {
            data = Uri.parse("market://details?id=$packageName")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }

        Log.d(this::class.java.simpleName, "$packageName isn't installed, redirecting to Google Play...")
        context.startActivity(intent)
    }

    private fun isAppInstalled(): Boolean {
        return try {
            context.packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
            true
        }
        catch (e : Exception) {
            e.printStackTrace()
            false
        }
    }

}