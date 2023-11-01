package p.yx5;
import java.lang.Runnable;
import java.util.ArrayList;
import java.util.List;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Collection;
import java.lang.NullPointerException;
import java.lang.String;
import p.bz7;
import p.fj1;
import java.util.Arrays;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;
import android.app.NotificationManager;
import p.ey6;
import android.content.Intent;
import p.md3;
import androidx.recyclerview.widget.RecyclerView;
import p.jd3;
import p.zr5;
import p.dr5;
import java.lang.Class;
import p.u44;
import p.uw5;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.Context;
import p.l6;
import p.j11;
import p.fm0;
import android.content.IntentSender$SendIntentException;
import java.io.Serializable;
import androidx.activity.result.a;
import p.b7;
import java.lang.Integer;
import java.util.HashMap;
import p.j7;
import p.z6;
import android.os.Bundle;
import p.zx5;
import p.jd;

public final class yx5 implements Runnable	// class@002e48 from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object t;

    public void yx5(int p0,ArrayList p1){
       this.a = 6;
       super(p1, p0, null);
    }
    public void yx5(Object p0,int p1,Object p2,int p3){
       this.a = p3;
       this.t = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void yx5(Object p0,Object p1,int p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super();
    }
    public void yx5(Object p0,Object p1,int p2,int p3,int p4){
       this.a = p3;
       this.t = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public void yx5(List p0,int p1,Throwable p2){
       this.a = 6;
       super();
       if (p0 == null) {
          throw new NullPointerException("initCallbacks cannot be null");
       }
       this.c = new ArrayList(p0);
       this.b = p1;
       this.t = p2;
       return;
    }
    public void yx5(bz7 p0,int p1,String p2){
       this.a = 11;
       super();
       this.c = p0;
       this.b = p1;
       this.t = p2;
    }
    public void yx5(fj1 p0,int p1){
       this.a = 6;
       fj1[] uofj1Array = new fj1[1];
       if (p0 == null) {
          throw new NullPointerException("initCallback cannot be null");
       }
       uofj1Array[0] = p0;
       super(Arrays.asList(uofj1Array), p1, null);
       return;
    }
    public final void run(){
       String str;
       j7 oj7;
       u44 b1;
       md3 q;
       dr5 itemAnimator;
       int i = 0;
       int i1 = 1;
       yx5 tb = this.b;
       yx5 tc = this.c;
       yx5 tt = this.t;
       switch (this.a){
           case 0:
             tt.a(tb, tc);
             return;
           case 1:
             b7 b = tc.b;
             if ((str = tt.b.get(Integer.valueOf(tb))) != null) {
                if ((oj7 = tt.f.get(str)) != null && (oj7 = oj7.a) != null) {
                   if (tt.e.remove(str)) {
                      oj7.b(b);
                   }
                }else {
                   tt.h.remove(str);
                   tt.g.put(str, b);
                }
             }
             return;
             break;
           case 2:
             tt.a(tb, i, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", tc));
             return;
           case 3:
             tt.getClass();
             throw null;
           case 4:
             int[] ointArray = new int[tc.length];
             PackageManager packageManag = tt.getPackageManager();
             String packageName = tt.getPackageName();
             int len = tc.length;
             for (; i < len; i = i + 1) {
                ointArray[i] = packageManag.checkPermission(tc[i], packageName);
             }
             tt.onRequestPermissionsResult(tb, tc, ointArray);
             return;
             break;
           case 5:
             if ((b1 = tc.b) != null) {
                b1.p(tb);
             }
             return;
             break;
           case 6:
             int i2 = tc.size();
             if (tb != i1) {
                for (; i < i2; i = i + 1) {
                   tc.get(i).a();
                }
             }else {
                for (; i < i2; i = i + 1) {
                   tc.get(i).b();
                }
             }
             return;
             break;
           case 7:
             if ((q = tt.q) != null && (q.isAttachedToWindow() && (tc.k == null && tc.e.c() != -1))) {
                if ((itemAnimator = tt.q.getItemAnimator()) == null || !itemAnimator.f()) {
                   q = tt.p;
                   int i3 = q.size();
                   int i4 = 0;
                   while (i4 < i3) {
                      if (q.get(i4).l == null) {
                         i = 1;
                         break ;
                      }
                      i4 = i4 + 1;
                   }
                   if (!i) {
                      tt.m.getClass();
                   }
                }
                tt.q.post(this);
             }
             return;
             break;
           case 8:
             tc.a(tt, tb);
             return;
           case 9:
             tt.v.notify(tb, tc);
             return;
           case 10:
             tt.G(tc, tb);
             return;
           default:
             try{
                tc.getClass();
                tc.h(tt, tb);
             }catch(p.yq3 e0){
                Object[] objArray = new Object[i1];
                objArray[i] = e0;
                bz7.g.f("notifyModuleCompleted failed", objArray);
             }
             return;
       }
    }
}
