package com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import android.content.Context;
import java.lang.Object;
import p.hb4;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Boolean;
import android.os.Handler;
import android.content.ContentResolver;
import android.net.Uri;
import io.reactivex.rxjava3.core.ObservableEmitter;
import android.database.ContentObserver;
import java.lang.String;
import android.provider.Settings$Global;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor$1;
import p.gb4;
import p.tb0;
import android.os.Looper;
import p.if4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;
import p.jx1;
import p.aq3;

public class MobileDataDisabledMonitor	// class@00069f from classes.dex
{
    private final Context mContext;
    private final Observable mObservable;
    private static final String SETTING_MOBILE_DATA = "mobile_data";

    public void MobileDataDisabledMonitor(Context p0){
       super();
       this.mContext = p0.getApplicationContext();
       this.mObservable = Observable.defer(new hb4(0, this)).distinctUntilChanged().onErrorReturnItem(Boolean.FALSE);
    }
    public static void a(MobileDataDisabledMonitor p0,Handler p1,ContentResolver p2,Uri p3,ObservableEmitter p4){
       p0.lambda$observeMobileData$1(p1, p2, p3, p4);
    }
    public static Observable b(MobileDataDisabledMonitor p0){
       return p0.observeMobileData();
    }
    public static void c(ContentResolver p0,ContentObserver p1){
       MobileDataDisabledMonitor.lambda$observeMobileData$0(p0, p1);
    }
    private static boolean getMobileDataSettingDisabled(Context p0){
       int i = 1;
       if (Settings$Global.getInt(p0.getContentResolver(), "mobile_data", i) != i) {
       }else {
          i = false;
       }
       return i;
    }
    private static void lambda$observeMobileData$0(ContentResolver p0,ContentObserver p1){
       p0.unregisterContentObserver(p1);
    }
    private void lambda$observeMobileData$1(Handler p0,ContentResolver p1,Uri p2,ObservableEmitter p3){
       MobileDataDisabledMonitor$1 u1 = new MobileDataDisabledMonitor$1(this, p0, p3);
       p1.registerContentObserver(p2, false, u1);
       p3.setCancellable(new gb4(p1, false, u1));
       p3.onNext(Boolean.valueOf(this.getMobileDataDisabled()));
    }
    private Observable observeMobileData(){
       if4 v6 = new if4(this, new Handler(Looper.getMainLooper()), this.mContext.getContentResolver(), Settings$Global.getUriFor("mobile_data"), 1);
       return Observable.create(v6);
    }
    public boolean getMobileDataDisabled(){
       TelephonyManager systemServic;
       if ((systemServic = this.mContext.getSystemService("phone")) == null) {
          return false;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          int i = jx1.b(systemServic);
          int i1 = 0;
          while (i1 < i) {
             if (aq3.a(systemServic, i1) == 5) {
                return MobileDataDisabledMonitor.getMobileDataSettingDisabled(this.mContext);
             }
             i1 = i1 + 1;
          }
       }else if(systemServic.getSimState() == 5){
          return MobileDataDisabledMonitor.getMobileDataSettingDisabled(this.mContext);
       }
       return false;
    }
    public Observable isMobileDataDisabled(){
       return this.mObservable;
    }
}
