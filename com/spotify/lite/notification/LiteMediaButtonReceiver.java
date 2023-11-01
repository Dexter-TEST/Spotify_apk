package com.spotify.lite.notification.LiteMediaButtonReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p.eo5;
import java.lang.String;
import java.lang.Object;
import p.p54;
import p.r44;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import java.lang.Class;
import android.os.Parcelable;

public class LiteMediaButtonReceiver extends BroadcastReceiver	// class@00091f from classes.dex
{
    public rf5 a;

    public void LiteMediaButtonReceiver(){
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       r44 or44;
       eo5.s(this, p0);
       if (p1 != null) {
          String str = "android.intent.action.MEDIA_BUTTON";
          if (str.equals(p1.getAction())) {
             String str1 = "android.intent.extra.KEY_EVENT";
             if (p1.hasExtra(str1)) {
                if ((or44 = this.a.d()) == null) {
                   return;
                }else if(str.equals(p1.getAction()) && p1.hasExtra(str1)){
                   KeyEvent parcelableEx = (Build$VERSION.SDK_INT >= 33)? p1.getParcelableExtra(str1, KeyEvent.class): p1.getParcelableExtra(str1);
                   or44.a(parcelableEx);
                }
                return;
             }
          }
       }
       String.valueOf(p1);
       return;
    }
}
