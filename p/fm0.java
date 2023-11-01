package p.fm0;
import androidx.activity.result.a;
import androidx.fragment.app.k;
import p.c7;
import java.lang.Object;
import androidx.activity.a;
import p.b7;
import android.os.Handler;
import android.os.Looper;
import p.yx5;
import java.lang.Runnable;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ClassLoader;
import android.content.Context;
import java.lang.String;
import p.n6;
import java.util.HashSet;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.w51;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Arrays;
import p.en6;
import android.os.Build$VERSION;
import p.m6;
import java.lang.Class;
import android.app.Activity;
import p.j6;
import p.l6;
import android.os.Parcelable;
import p.lb3;
import android.content.IntentSender;
import p.h6;

public final class fm0 extends a	// class@0015f2 from classes.dex
{
    public final a i;

    public void fm0(k p0){
       this.i = p0;
       super();
    }
    public final void b(int p0,c7 p1,Object p2){
       b7 uob7;
       Bundle uBundle;
       String[] stringArray;
       fm0 ti = this.i;
       if ((uob7 = p1.b(ti, p2)) != null) {
          new Handler(Looper.getMainLooper()).post(new yx5(this, p0, uob7, 1));
          return;
       }else {
          Intent intent = p1.a(ti, p2);
          if (intent.getExtras() != null && intent.getExtras().getClassLoader() == null) {
             intent.setExtrasClassLoader(ti.getClassLoader());
          }
          p2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
          if (intent.hasExtra(p2)) {
             intent.removeExtra(p2);
             uBundle = intent.getBundleExtra(p2);
          }else {
             uBundle = null;
          }
          if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
             String[] stringArrayE = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
             int i = 0;
             if (stringArrayE == null) {
                stringArrayE = new String[i];
             }
             HashSet hashSet = new HashSet();
             int i1 = 0;
             while (true) {
                if (i1 < stringArrayE.length) {
                   if (!TextUtils.isEmpty(stringArrayE[i1])) {
                      if (!w51.D() && TextUtils.equals(stringArrayE[i1], "android.permission.POST_NOTIFICATIONS")) {
                         hashSet.add(Integer.valueOf(i1));
                      }
                      i1 = i1 + 1;
                   }else {
                      throw new IllegalArgumentException(en6.p("Permission request for permissions ", Arrays.toString(stringArrayE), " must not contain null or empty values"));
                   }
                }else if((i1 = hashSet.size()) > 0){
                   stringArray = new String[(stringArrayE.length - i1)];
                }else {
                   stringArray = stringArrayE;
                }
                if (i1 > 0) {
                   if (i1 != stringArrayE.length) {
                      i1 = 0;
                      while (i < stringArrayE.length) {
                         if (!hashSet.contains(Integer.valueOf(i))) {
                            int i2 = i1 + 1;
                            stringArray[i1] = stringArrayE[i];
                            i1 = i2;
                         }
                         i++;
                      }
                   }
                }
                if (Build$VERSION.SDK_INT >= 23) {
                   if (ti instanceof m6) {
                      ti.getClass();
                   }
                   j6.b(ti, stringArrayE, p0);
                   break ;
                }else if(ti instanceof l6){
                   new Handler(Looper.getMainLooper()).post(new yx5(stringArray, ti, p0, 4));
                   break ;
                }
             }
          }else if("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent.getAction())){
             lb3 parcelableEx = intent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
             try{
                h6.c(ti, parcelableEx.a, p0, parcelableEx.b, parcelableEx.c, parcelableEx.t, 0, uBundle);
             }catch(android.content.IntentSender$SendIntentException e10){
                new Handler(Looper.getMainLooper()).post(new yx5(this, p0, e10, 2));
             }
          }else {
             h6.b(ti, intent, p0, uBundle);
          }
          return;
       }
    }
}
