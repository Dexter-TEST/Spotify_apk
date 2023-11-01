package com.spotify.compression.extraction.AppUpdatedBroadcastReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import com.spotify.compression.extraction.ExtractCompressedLibraryWorker;

public class AppUpdatedBroadcastReceiver extends BroadcastReceiver	// class@000598 from classes.dex
{

    public void AppUpdatedBroadcastReceiver(){
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       if (p1 != null && "android.intent.action.MY_PACKAGE_REPLACED".equals(p1.getAction())) {
          ExtractCompressedLibraryWorker.h(p0);
       }
       return;
    }
}
