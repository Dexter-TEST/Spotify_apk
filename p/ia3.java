package p.ia3;
import p.rn6;
import java.lang.String;
import p.b07;
import p.co6;
import p.o11;
import p.mi5;
import android.app.Application;
import java.lang.Object;
import p.co5;
import p.an5;
import android.content.Context;
import p.tn6;
import com.spotify.base.java.logging.Logger;
import java.lang.Class;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import p.da3;
import p.wn;
import p.xn;
import p.ic;
import java.lang.System;
import p.wn6;
import java.lang.StringBuilder;
import android.net.Uri;
import p.tp6;
import p.v84;
import p.yk3;
import android.content.Intent;

public final class ia3	// class@001955 from classes.dex
{
    public final tn6 a;
    public final o11 b;
    public final wn c;
    public final an5 d;
    public final Context e;
    public static final rn6 f;

    static {
       ia3.f = rn6.b.a("install_referrer_read");
    }
    public void ia3(co6 p0,o11 p1,mi5 p2,Application p3){
       co5.o(p3, "context");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new an5();
       this.e = p3.getApplicationContext();
    }
    public final void a(String p0){
       String str1;
       String str3;
       wn6 own61;
       tp6 b2;
       Object[] objArray1;
       String str = "";
       if ((str1 = this.c.b().g(mi5.h, str)) == null) {
       }else {
          str = str1;
       }
       Object[] objArray = new Object[0];
       Logger.e("InstallReferrer: ".concat(str), objArray);
       ia3 tb = this.b;
       tb.getClass();
       Iterator iterator = tb.w.iterator();
       while (true) {
          String str2 = null;
          if (iterator.hasNext()) {
             str3 = iterator.next();
             if (!str3.b(p0)) {
                continue ;
             }
          }else {
             str3 = str2;
          }
          if (str3 != null) {
             str2 = str3.a(p0);
          }
          iterator = (!tb.c.a().length())? 1: 0;
          if (str2 != null) {
             if (iterator) {
                o11 b = tb.b;
                b.getClass();
                b.c.getClass();
                wn6 own6 = b.b().edit();
                own6.c(mi5.f, str2);
                own6.b(mi5.g, System.currentTimeMillis());
                own6.e();
             }
             o11 b1 = tb.b;
             b1.getClass();
             own61 = b1.b().edit();
             own61.c(mi5.h, str2);
             own61.e();
          }
          str1 = "https://r.spotify.com/"+Uri.decode(p0);
          int i = ((b2 = v84.a(str1).b) != null && b2.length())? 0: 1;
          if (!((i ^ 1))) {
             own61 = 0;
          }else {
             this.b(str1);
             objArray1 = 1;
          }
          if (!own61) {
             int i1 = p0.length();
             i = 0;
             while (i < i1) {
                str2 = (p0.charAt(i) != '?')? 1: 0;
                if (!str2) {
                   p0 = p0.substring(0, i);
                   co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
                }
                i = i + 1;
             }
             if (v84.a(p0).c != yk3.d3) {
                this.b(p0);
             }
          }
          break ;
       }
       wn6 own62 = this.a.edit();
       own62.a(ia3.f, 1);
       own62.f();
       objArray1 = new Object[0];
       Logger.e("Install referrer read", objArray1);
       return;
    }
    public final void b(String p0){
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
       intent.setFlags(0x4000000);
       intent.setClassName(this.e, "WelcomeActivity.class");
       ia3 td = this.d;
       td.onNext(intent);
       td.onComplete();
    }
}
