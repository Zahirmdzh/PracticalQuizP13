package sg.edu.rp.c346.practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class WallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // to parse sms message
        // SMS messages are retrieved from the intent's extra using the key "pdus"

                Toast.makeText(context, "You have changed the wallpaper. "
                        ,Toast.LENGTH_LONG).show();

                //Task 1b
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id",R.id.radioButton1);
        if (id == R.id.radioButton1)
            Toast.makeText(context, R.string.btn1, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(context, R.string.btn2, Toast.LENGTH_LONG).show();


    }
}
