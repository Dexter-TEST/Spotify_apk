package com.spotify.share.socialimpl.util.ShareResultReceiver;
import p.b51;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.base.java.logging.Logger;
import android.content.BroadcastReceiver;
import p.eo5;
import android.os.Bundle;
import android.os.BaseBundle;
import android.content.ComponentName;

public final class ShareResultReceiver extends b51	// class@000c23 from classes.dex
{

    public void ShareResultReceiver(){
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       Bundle extras;
       ComponentName uComponentNa;
       co5.o(p0, "context");
       co5.o(p1, "intent");
       Object[] objArray = new Object[]{p1};
       Logger.e("onReceive: %s", objArray);
       eo5.s(this, p0);
       if ((extras = p1.getExtras()) == null) {
          return;
       }
       co5.i(extras.getString("entity_uri"));
       co5.i(extras.getString("share_id"));
       extras.getString("source_page_uri");
       co5.i(extras.getString("source_page_id"));
       extras.getInt("destination_id");
       co5.i(extras.getString("destination_capability"));
       co5.i(extras.getString("integration_id"));
       co5.i(extras.getString("share_url"));
       if ((uComponentNa = extras.get("android.intent.extra.CHOSEN_COMPONENT")) != null) {
          String packageName = uComponentNa.getPackageName();
       }
       extras.getString("share_format_id");
       extras.getString("creator_uri");
       co5.N("shareMenuLogger");
       throw null;
    }
}
