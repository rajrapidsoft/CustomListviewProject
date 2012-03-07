package autostart.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;

public class BootBroadCaster extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {

			Intent i = new Intent();
			i.setAction("autostart.service.AutoStartService");
			context.startService(i);
		}

	}

}
