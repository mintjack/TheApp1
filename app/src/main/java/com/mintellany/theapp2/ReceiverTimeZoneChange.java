package com.mintellany.theapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReceiverTimeZoneChange extends BroadcastReceiver {

  @Override
  public void onReceive(Context context, Intent intent) {
    Intent i = new Intent(context, AlarmClockService.class);
    i.putExtra(AlarmClockService.COMMAND_EXTRA, AlarmClockService.COMMAND_TIMEZONE_CHANGE);
    context.startService(i);
  }

}
