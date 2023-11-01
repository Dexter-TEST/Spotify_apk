package com.spotify.lite.notification.CustomActionsReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p.eo5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.p54;
import p.r44;
import android.support.v4.media.session.d;
import android.support.v4.media.RatingCompat;
import android.media.Rating;
import android.media.session.MediaController$TransportControls;

public class CustomActionsReceiver extends BroadcastReceiver	// class@00091e from classes.dex
{
    public rf5 a;
    public static final int b;

    public void CustomActionsReceiver(){
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       r44 or44;
       eo5.s(this, p0);
       if (p1 != null && p1.getAction() != null) {
          String action = p1.getAction();
          action.getClass();
          if (action.equals("com.spotify.liteplayer.player.ACTION_FAVORITE") && (or44 = this.a.d()) != null) {
             d uod = or44.f();
             float f = (p1.getBooleanExtra("com.spotify.liteplayer.player.extra_favorite", false))? 0x3f800000: 0;
             uod.a.setRating(new RatingCompat(f, 1).b());
          }
       }
       return;
    }
}
