package jp.techacademy.madoka.inagaki.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TimezonBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context,"タイムゾーンが変化しました", Toast.LENGTH_SHORT).show()
    }
}
