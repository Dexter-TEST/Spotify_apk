package p.eg;
import p.gg;
import p.jg;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.os.PowerManager;
import p.qo5;
import android.content.IntentFilter;
import p.z97;
import java.lang.System;
import p.eb3;
import android.location.LocationManager;
import android.location.Location;
import p.y97;
import java.util.Calendar;

public final class eg extends gg	// class@001484 from classes.dex
{
    public final int c;
    public final jg t;
    public final Object v;

    public void eg(jg p0,Context p1){
       this.c = 0;
       this.t = p0;
       super(p0);
       this.v = p1.getApplicationContext().getSystemService("power");
    }
    public void eg(jg p0,qo5 p1){
       this.c = 1;
       this.t = p0;
       super(p0);
       this.v = p1;
    }
    public final IntentFilter d(){
       IntentFilter intentFilter;
       switch (this.c){
           case 0:
           default:
             intentFilter = new IntentFilter();
             intentFilter.addAction("android.intent.action.TIME_SET");
             intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
             intentFilter.addAction("android.intent.action.TIME_TICK");
             return intentFilter;
       }
       intentFilter = new IntentFilter();
       intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
       return intentFilter;
    }
    public final int f(){
       z97 a;
       Location location1;
       long l2;
       boolean i3;
       eg uoeg = this;
       int i = 2;
       eg v = uoeg.v;
       switch (uoeg.c){
           case 0:
             if (!v.isPowerSaveMode()) {
                i = 1;
             }
             break;
           default:
             qo5 c = v.c;
             boolean b = false;
             int i1 = ((c.b - System.currentTimeMillis()) > 0)? 1: 0;
             if (i1) {
                a = c.a;
             }else {
                Location location = null;
                if (!eb3.b(v.a, "android.permission.ACCESS_COARSE_LOCATION")) {
                   String str = "network";
                   try{
                      if (v.b.isProviderEnabled(str)) {
                         location1 = v.b.getLastKnownLocation(str);
                      label_0055 :
                         if (!eb3.b(v.a, "android.permission.ACCESS_FINE_LOCATION")) {
                            String str1 = "gps";
                            try{
                               if (v.b.isProviderEnabled(str1)) {
                                  location = v.b.getLastKnownLocation(str1);
                               }
                            }catch(java.lang.Exception e0){
                            }
                         }
                         if (location != null && location1 != null) {
                            if ((location.getTime() - location1.getTime()) > 0) {
                            label_008a :
                               location1 = location;
                            }
                         }else if(location != null){
                            goto label_008a ;
                         }
                         if (location1 != null) {
                            qo5 c1 = v.c;
                            long l = System.currentTimeMillis();
                            if (y97.d == null) {
                               y97.d = new y97();
                            }
                            y97 d = y97.d;
                            long l1 = 0x5265c00;
                            y97 oy97 = d;
                            oy97.a((l - l1), location1.getLatitude(), location1.getLongitude());
                            oy97.a(l, location1.getLatitude(), location1.getLongitude());
                            if (d.c == 1) {
                               b = true;
                            }
                            y97 oy971 = d.a;
                            y97 oy972 = d.b;
                            d.a((l + l1), location1.getLatitude(), location1.getLongitude());
                            oy97 = d.b;
                            int i2 = -1;
                            if ((oy972 - i2) && (oy971 - i2)) {
                               if ((l - oy971) > 0) {
                                  l2 = oy97 + 0;
                               }else if((l - oy972) > 0){
                                  l2 = oy971 + 0;
                               }else {
                                  l2 = oy972 + 0;
                               }
                               l2 = l2 + 0xea60;
                            }else {
                               l2 = 0x2932e00 + l;
                            }
                            c1.a = b;
                            c1.b = l2;
                            a = c.a;
                         }else if((i3 = Calendar.getInstance().get(11)) >= 6 && i3 < 22){
                            b = 1;
                         }
                         i3 = b;
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
                location1 = location;
                goto label_0055 ;
             }
             if (!a) {
                i = 1;
             }
             return i;
       }
       return i;
    }
    public final void g(){
       eg tt = this.t;
       switch (this.c){
           case 0:
           default:
             tt.n(true, true);
             return;
       }
       tt.n(true, true);
       return;
    }
}
