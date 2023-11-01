package com.spotify.litelisteningexperience.share.ShareResultReceiver;
import p.b51;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import p.eo5;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import java.lang.Class;
import java.lang.Object;
import android.content.ComponentName;
import p.ee6;
import p.co5;
import p.fe6;

public class ShareResultReceiver extends b51	// class@000936 from classes.dex
{
    public fe6 a;

    public void ShareResultReceiver(){
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       Bundle extras;
       ComponentName uComponentNa;
       eo5.s(this, p0);
       if ((extras = p1.getExtras()) != null) {
          String str = extras.getString("entity_uri");
          str.getClass();
          String str1 = extras.getString("destination_id");
          str1.getClass();
          String str2 = extras.getString("capability");
          str2.getClass();
          String str3 = extras.getString("share_id");
          str3.getClass();
          String str4 = extras.getString("source_page_uri");
          str4.getClass();
          String str5 = extras.getString("source_page_id");
          str5.getClass();
          String str6 = extras.getString("share_url");
          str6.getClass();
          String packageName = ((uComponentNa = extras.get("android.intent.extra.CHOSEN_COMPONENT")) != null)? uComponentNa.getPackageName(): "";
          String str7 = packageName;
          String str8 = p0.getString(R.string.share_integration_id_lite);
          co5.o(str7, "integrationId");
          co5.o(str8, "shareUrl");
          ee6 v0 = new ee6(str, str1, str2, str3, str4, str5, str7, str8, str6, 3584);
          this.a.a(v0);
       }
       return;
    }
}
