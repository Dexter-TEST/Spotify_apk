package p.i00;
import p.q60;
import android.content.Context;
import p.ce7;
import java.lang.Object;
import java.lang.Boolean;
import android.content.IntentFilter;
import java.lang.String;
import android.os.Build$VERSION;
import android.content.Intent;
import p.co5;
import p.es3;
import p.k00;
import java.lang.Class;
import p.tq0;
import p.j00;
import p.ot6;
import android.content.BroadcastReceiver;

public final class i00 extends q60	// class@0018f6 from classes.dex
{
    public final int g;

    public void i00(Context p0,ce7 p1,int p2){
       this.g = p2;
       if (p2 != 1) {
          if (p2 != 2) {
             super(p0, p1);
             return;
          }else {
             super(p0, p1);
             return;
          }
       }else {
          super(p0, p1);
          return;
       }
    }
    public final Object a(){
       switch (this.g){
           case 0:
             return this.h();
           case 1:
             return this.h();
           default:
             return this.h();
       }
    }
    public final IntentFilter f(){
       IntentFilter intentFilter;
       switch (this.g){
           case 0:
             intentFilter = new IntentFilter();
             if (Build$VERSION.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
             }else {
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
             }
             return intentFilter;
             break;
           case 1:
           default:
             intentFilter = new IntentFilter();
             intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
             intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
             return intentFilter;
       }
       intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.BATTERY_OKAY");
       intentFilter.addAction("android.intent.action.BATTERY_LOW");
       return intentFilter;
    }
    public final void g(Intent p0){
       String action;
       int i;
       String str = "intent";
       switch (this.g){
           case 0:
             co5.o(p0, str);
             if ((action = p0.getAction()) != null) {
                es3.c().getClass();
                switch (action.hashCode()){
                    case 0x8f8c06d9:
                      if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                         this.c(Boolean.FALSE);
                      }
                      break;
                    case 0xfcb9a332:
                      if (action.equals("android.os.action.DISCHARGING")) {
                         this.c(Boolean.FALSE);
                      }
                      break;
                    case 0x388694fe:
                      if (action.equals("android.os.action.CHARGING")) {
                         this.c(Boolean.TRUE);
                      }
                      break;
                    case 0x3cbf870b:
                      if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                         this.c(Boolean.TRUE);
                      }
                      break;
                    default:
                }
             }
             break;
           case 1:
             co5.o(p0, str);
             if (p0.getAction() != null) {
                p0.getAction();
                es3.c().getClass();
                if ((action = p0.getAction()) != null) {
                   if ((i = action.hashCode()) != -1980154005) {
                      if (i == 0x1d398bfd && action.equals("android.intent.action.BATTERY_LOW")) {
                         this.c(Boolean.FALSE);
                      }
                   }else if(!action.equals("android.intent.action.BATTERY_OKAY")){
                      this.c(Boolean.TRUE);
                   }
                }
             }
             return;
             break;
           default:
             co5.o(p0, str);
             if (p0.getAction() != null) {
                p0.getAction();
                es3.c().getClass();
                if ((action = p0.getAction()) != null) {
                   if ((i = action.hashCode()) != -1181163412) {
                      if (i == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                         this.c(Boolean.TRUE);
                      }
                   }else if(!action.equals("android.intent.action.DEVICE_STORAGE_LOW")){
                      this.c(Boolean.FALSE);
                   }
                }
             }
             return;
       }
       return;
    }
    public final Boolean h(){
       Intent intent;
       Boolean fALSE;
       int intExtra;
       String action;
       int i = -1;
       String str = "status";
       String str1 = "getInitialState - null intent received";
       String str2 = "android.intent.action.BATTERY_CHANGED";
       boolean b = true;
       tq0 tb = this.b;
       switch (this.g){
           case 0:
             if ((intent = tb.registerReceiver(null, new IntentFilter(str2))) == null) {
                es3.c().a(j00.a, str1);
                fALSE = Boolean.FALSE;
             }else if(Build$VERSION.SDK_INT >= 23){
                if ((intExtra = intent.getIntExtra(str, i)) != 2 && intExtra != 5) {
                   b = false;
                }
             }else if(intent.getIntExtra("plugged", 0)){
             }
             fALSE = Boolean.valueOf(b);
             break;
           case 1:
             if ((intent = tb.registerReceiver(null, new IntentFilter(str2))) == null) {
                es3.c().a(k00.a, str1);
                fALSE = Boolean.FALSE;
             }else {
                float f = (float)intent.getIntExtra("level", i) / (float)intent.getIntExtra("scale", i);
                if (intent.getIntExtra(str, i) != b && (0x3e19999a - f) <= 0) {
                   b = false;
                }
                fALSE = Boolean.valueOf(b);
             }
             return fALSE;
             break;
           default:
             if ((intent = tb.registerReceiver(null, this.f())) != null && intent.getAction() != null) {
                if ((action = intent.getAction()) != null) {
                   if ((i = action.hashCode()) != -1181163412) {
                      if (i == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                      label_00b9 :
                         return Boolean.valueOf(b);
                      }
                   }else {
                      action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                   }
                }
                b = false;
                goto label_00b9 ;
             }else {
                goto label_00b9 ;
             }
       }
       return fALSE;
    }
}
