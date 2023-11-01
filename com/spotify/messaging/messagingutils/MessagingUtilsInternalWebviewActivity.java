package com.spotify.messaging.messagingutils.MessagingUtilsInternalWebviewActivity;
import p.ip6;
import android.os.Bundle;
import androidx.appcompat.app.a;
import p.ae2;
import androidx.fragment.app.k;
import java.lang.String;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import java.lang.Class;
import java.lang.Object;
import androidx.fragment.app.a;
import android.content.Intent;
import android.app.Activity;
import p.a84;
import android.os.BaseBundle;

public class MessagingUtilsInternalWebviewActivity extends ip6	// class@000a58 from classes.dex
{

    public void MessagingUtilsInternalWebviewActivity(){
       super();
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.setContentView(R.layout.activity_inapp_internal_webview_activity);
       int i = (this.y().D("inapp_internal_webview") != null)? 1: 0;
       if (!i) {
          ae2 uoae2 = this.y();
          uoae2.getClass();
          a uoa = new a(uoae2);
          Bundle uBundle = new Bundle();
          uBundle.putString("KEY_IN_APP_INTERNAL_WEBVIEW_URI", this.getIntent().getStringExtra("inapp_internalwebview_uri"));
          a84 uoa84 = new a84();
          uoa84.setArguments(uBundle);
          uoa.g(R.id.fragment_inapp_internal_webview, uoa84, "inapp_internal_webview", 1);
          uoa.e(false);
       }
       return;
    }
}
