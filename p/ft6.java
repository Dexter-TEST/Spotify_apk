package p.ft6;
import p.ir0;
import java.lang.Object;
import java.lang.String;
import p.qm0;
import p.lm0;
import com.spotify.litesettings.settings.AccountActivity;
import p.yq5;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.p54;
import p.bo;
import java.lang.Boolean;
import java.lang.Class;
import android.os.Handler;
import p.co;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import p.n6;
import p.vk4;
import p.jc7;
import androidx.fragment.app.Fragment;
import p.cw0;
import p.aq6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.jj5;
import p.r45;
import p.t00;
import p.lf5;
import p.u65;
import p.yl6;
import p.fn0;
import p.py0;
import java.util.Collection;
import p.wn6;
import p.tn6;
import p.rn6;
import java.util.Iterator;
import p.fr0;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import p.vv7;
import android.app.PendingIntent;
import p.sj4;
import p.lo;
import java.lang.CharSequence;
import android.app.Notification;
import p.rj4;
import p.uj4;
import p.ic;
import java.lang.System;
import p.gk4;
import p.qy1;
import p.a3;
import p.gt;
import p.oz1;
import org.json.JSONObject;
import p.zq7;
import p.ft;
import java.lang.NullPointerException;

public final class ft6 implements ir0	// class@001636 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void ft6(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void ft6(String p0,String p1){
       this.a = 6;
       super();
       this.c = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       Object[] objArray;
       String str;
       a3 v;
       int i = 0;
       int i1 = 1;
       ft6 tc = this.c;
       ft6 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             objArray = new Object[i1];
             objArray[i] = tc;
             Logger.c(p0, "Error moving storage to %s", objArray);
             p0 = tb.getString(R.string.storage_location_moving_notification_failed_title);
             str = tb.getString(R.string.storage_location_moving_notification_failed_text);
             lo.c(tb);
             sj4 osj4 = new sj4(tb, "channel_id_default");
             osj4.g = PendingIntent.getActivity(tb, i, xj0.z0(tb, "spotify.intent.action.STORAGE_SETTINGS").setFlags(0x10000000), vv7.d(i));
             osj4.e(p0);
             osj4.d(str);
             sj4 w = osj4.w;
             w.tickerText = sj4.c(p0);
             p0 = new rj4();
             p0.c = sj4.c(str);
             osj4.g(p0);
             w.icon = 0x7f07059d;
             osj4.j = i1;
             tb.a.getClass();
             w.when = System.currentTimeMillis();
             osj4.q = "err";
             new gk4(tb).a(R.id.storage_notification_error, osj4.b());
             tb.a();
             return;
           case 1:
             wn6 own6 = tb.c.edit();
             own6.c(py0.f, p0);
             own6.e();
             Iterator iterator = tc.iterator();
             while (iterator.hasNext()) {
                iterator.next().accept(p0);
             }
             return;
             break;
           case 2:
             tb.getClass();
             u65 b = p0.b;
             b.getClass();
             p0 = p0.a;
             p0.getClass();
             int i2 = (tb.e != null && ((tb.d.equals(p0) ^ i1)))? 1: 0;
             if (i2) {
                tb.h.b(i1);
                tb.f = i;
                tb.e = i;
                tb.c.e();
                tb.g.onNext(Boolean.FALSE);
             }
             tb.e = b.equals(tc);
             tb.d = p0;
             return;
             break;
           case 3:
             tb.getClass();
             tb.L.onNext(r45.d(tc.toString()));
             return;
           case 4:
             tb.startActivity(tc);
             return;
           case 5:
             tb.getClass();
             if (p0.booleanValue()) {
                tc.b.removeCallbacksAndMessages(null);
                tc.c.e();
                p54 a = tb.a;
                n6.g(a, xj0.z0(a, "spotify.intent.action.PLAYER_SERVICE"));
             }
             return;
             break;
           case 6:
             objArray = new Object[]{tc,tb};
             Logger.c(p0, "seeMore\(%s, %s\)", objArray);
             return;
           case 8:
             tb.e = p0;
             tc.g();
             return;
           default:
             tb.getClass();
             qy1 d = tb.d;
             if (p0.a.c()) {
                d.onError(p0.a.b().z);
             }else {
                p0 = p0.b.b();
                str = p0.getString("id");
                String str1 = p0.getString("name");
                p0 = p0.optString("email");
                zq7 ozq7 = new zq7(14);
                if (str != null) {
                   ozq7.a = str;
                   if ((v = tc.v) != null) {
                      ozq7.b = v;
                      if (str1 != null) {
                         ozq7.c = str1;
                         p0.getClass();
                         ozq7.t = new jj5(p0);
                         d.onNext(ozq7.b());
                      }else {
                         throw new NullPointerException("Null userName");
                      }
                   }else {
                      throw new NullPointerException("Null token");
                   }
                }else {
                   throw new NullPointerException("Null userId");
                }
             }
             return;
       }
    }
}
