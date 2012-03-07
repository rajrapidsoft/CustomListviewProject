package autostart.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.GetChars;
import android.util.Log;

public class AutoStartService extends Service {
	private static final String TAG = "AutoStartService";
	

	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.v(TAG, "Inside the onCreate()");
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.v(TAG, "Inside the onStartCommand()");
		return START_STICKY;

	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.v(TAG, "Inside the destroyApp()");
	}

}
