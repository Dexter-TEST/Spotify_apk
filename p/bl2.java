package p.bl2;
import p.se;
import p.q12;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import p.dp0;
import p.t15;
import p.b08;
import p.hl2;
import java.lang.Object;
import p.w51;
import p.x3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import p.fy;
import java.util.Iterator;
import java.util.Set;
import com.google.android.gms.common.api.Scope;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import android.os.Message;
import android.os.Handler;
import android.os.IInterface;
import android.os.IBinder;
import p.ey;
import android.os.Bundle;
import p.i43;
import p.aj2;
import java.util.Collection;
import android.accounts.Account;
import p.h43;
import p.hy;
import p.u43;
import p.iy;
import android.os.DeadObjectException;
import java.lang.System;
import p.t08;
import java.lang.StringBuilder;
import android.util.Log;
import java.lang.Class;
import p.gy;
import p.cl2;
import p.jy;
import java.lang.IllegalArgumentException;

public abstract class bl2 implements se	// class@0010e7 from classes.dex
{
    public String a;
    public t08 b;
    public final Context c;
    public final b08 d;
    public final fy e;
    public final Object f;
    public final Object g;
    public u43 h;
    public cy i;
    public IInterface j;
    public final ArrayList k;
    public gy l;
    public int m;
    public final x3 n;
    public final x3 o;
    public final int p;
    public final String q;
    public String r;
    public fp0 s;
    public boolean t;
    public qx7 u;
    public final AtomicInteger v;
    public final yg0 w;
    public final Set x;
    public final Account y;
    public static final q12[] z;

    static {
       q12[] oq12Array = new q12[0];
       bl2.z = oq12Array;
    }
    public void bl2(Context p0,Looper p1,int p2,yg0 p3,dp0 p4,t15 p5){
       b08 g = b08.g;
       _monitor_enter(g);
       if (b08.h == null) {
          b08.h = new b08(p0.getApplicationContext());
       }
       _monitor_exit(g);
       g = b08.h;
       w51.k(p4);
       w51.k(p5);
       x3 ox3 = new x3(p4);
       x3 ox31 = new x3(p5);
       yg0 f = p3.f;
       super();
       this.a = null;
       this.f = new Object();
       this.g = new Object();
       this.k = new ArrayList();
       this.m = 1;
       this.s = null;
       this.t = false;
       this.u = null;
       this.v = new AtomicInteger(false);
       if (p0 != null) {
          this.c = p0;
          String str = "Looper must not be null";
          if (p1 != null) {
             w51.l(g, "Supervisor must not be null");
             this.d = g;
             this.e = new fy(this, p1);
             this.p = p2;
             this.n = ox3;
             this.o = ox31;
             this.q = f;
             this.w = p3;
             this.y = p3.a;
             yg0 c = p3.c;
             Iterator iterator = c.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (c.contains(iterator.next())) {
                   }else {
                      break ;
                   }
                }else {
                   this.x = c;
                   return;
                }
             }
             throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
          }else {
             throw new NullPointerException(str);
          }
       }else {
          throw new NullPointerException("Context must not be null");
       }
    }
    public static void p(bl2 p0){
       int i1;
       bl2 f = p0.f;
       _monitor_enter(f);
       int i = (p0.m == 3)? 1: 0;
       _monitor_exit(f);
       if (i) {
          p0.t = true;
          i1 = 5;
       }else {
          i1 = 4;
       }
       bl2 e = p0.e;
       e.sendMessage(e.obtainMessage(i1, p0.v.get(), 16));
       return;
    }
    public static boolean q(bl2 p0,int p1,int p2,IInterface p3){
       boolean b;
       bl2 f = p0.f;
       _monitor_enter(f);
       if (p0.m != p1) {
          _monitor_exit(f);
          b = false;
       }else {
          p0.o(p2, p3);
          _monitor_exit(f);
          b = true;
       }
       return b;
    }
    public abstract int a();
    public boolean b(){
       return false;
    }
    public abstract IInterface c(IBinder p0);
    public final void d(){
       this.v.incrementAndGet();
       bl2 tk = this.k;
       _monitor_enter(tk);
       int i = this.k.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.k.get(i1).e();
       }
       this.k.clear();
       _monitor_exit(tk);
       bl2 tg = this.g;
       _monitor_enter(tg);
       this.h = null;
       _monitor_exit(tg);
       this.o(1, null);
       return;
    }
    public final void e(String p0){
       this.a = p0;
       this.d();
    }
    public q12[] f(){
       return bl2.z;
    }
    public Bundle g(){
       return new Bundle();
    }
    public final void h(i43 p0,Set p1){
       bl2 ty;
       bl2 tg;
       aj2 uoaj2 = new aj2(this.p, this.r);
       uoaj2.t = this.c.getPackageName();
       uoaj2.x = this.g();
       if (p1 != null) {
          Scope[] scopeArray = new Scope[p1.size()];
          uoaj2.w = p1.toArray(scopeArray);
       }
       if (this.b()) {
          if ((ty = this.y) == null) {
             ty = new Account("<<default account>>", "com.google");
          }
          uoaj2.y = ty;
          if (p0 != null) {
             uoaj2.v = p0.a;
          }
       }
       uoaj2.z = bl2.z;
       q12[] oq12Array = this.f();
       try{
          uoaj2.A = oq12Array;
          tg = this.g;
          _monitor_enter(tg);
          if ((ty = this.h) != null) {
             ty.g(new hy(this, this.v.get()), uoaj2);
          label_0064 :
             _monitor_exit(tg);
          }else {
             goto label_0064 ;
          }
       }catch(android.os.DeadObjectException e0){
          tg = this.e;
          tg.sendMessage(tg.obtainMessage(6, this.v.get(), 3));
       }catch(java.lang.SecurityException e5){
          throw e5;
       }catch(android.os.RemoteException e0){
          bl2 te = this.e;
          te.sendMessage(te.obtainMessage(1, this.v.get(), -1, new iy(this, 8, null, null)));
       }catch(java.lang.RuntimeException e0){
       }
       return;
    }
    public final IInterface i(){
       bl2 tf = this.f;
       _monitor_enter(tf);
       if (this.m == 5) {
          throw new DeadObjectException();
       }
       if (!this.m()) {
          throw new IllegalStateException("Not connected. Call connect\(\) and wait for onConnected\(\) to be called.");
       }
       bl2 tj = this.j;
       w51.l(tj, "Client is connected but service is null");
       _monitor_exit(tf);
       return tj;
    }
    public abstract String j();
    public abstract String k();
    public boolean l(){
       return false;
    }
    public final boolean m(){
       bl2 tf = this.f;
       _monitor_enter(tf);
       boolean b = (this.m == 4)? true: false;
       _monitor_exit(tf);
       return b;
    }
    public final boolean n(){
       bl2 tm;
       bl2 tf = this.f;
       _monitor_enter(tf);
       boolean b = ((tm = this.m) != 2 && tm != 3)? false: true;
       _monitor_exit(tf);
       return b;
    }
    public final void o(int p0,IInterface p1){
       bl2 tl;
       bl2 tb;
       bl2 td;
       t08 a1;
       bl2 tq;
       String str = " on com.google.android.gms";
       String str1 = " on com.google.android.gms";
       int i = 0;
       boolean i1 = 1;
       int i2 = 4;
       int i3 = (p0 == i2)? 1: 0;
       int i4 = (p1 != null)? 1: 0;
       if (i3 == i4) {
          i = 1;
       }
       if (i) {
          bl2 tf = this.f;
          _monitor_enter(tf);
          this.m = p0;
          this.j = p1;
          if (p0 != i1) {
             if (p0 != 2 && p0 != 3) {
                if (p0 == i2) {
                   w51.k(p1);
                   System.currentTimeMillis();
                }
             }else if((tl = this.l) != null && (tb = this.b) != null){
                t08 a = tb.a;
                Log.e("GmsClient", new StringBuilder(((String.valueOf(a).length() + 70) + 22))+"Calling connect\(\) while still connected, missing disconnect\(\) for "+a+str1);
                td = this.d;
                a1 = this.b.a;
                w51.k(a1);
                this.b.getClass();
                String str2 = "com.google.android.gms";
                i4 = 4225;
                if (this.q == null) {
                   this.c.getClass();
                }
                td.a(a1, str2, i4, tl, this.b.b);
                this.v.incrementAndGet();
             }
             gy ogy = new gy(this, this.v.get());
             this.l = ogy;
             i1 = this.l();
             this.b = new t08(this.k(), i1);
             if (i1 && this.a() < 0x1110e58) {
                String str3 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ";
                str = String.valueOf(this.b.a);
                str3 = (str.length())? str3.concat(str): str3;
                throw new IllegalStateException(str3);
             }else {
                bl2 td1 = this.d;
                t08 a2 = this.b.a;
                w51.k(a2);
                this.b.getClass();
                String str4 = "com.google.android.gms";
                if ((tq = this.q) == null) {
                   tq = this.c.getClass().getName();
                }
                if (!td1.b(new cl2(4225, a2, str4, this.b.b), ogy, tq)) {
                   t08 a3 = this.b.a;
                   Log.e("GmsClient", new StringBuilder(((String.valueOf(a3).length() + 34) + 22))+"unable to connect to service: "+a3+str);
                   bl2 te = this.e;
                   te.sendMessage(te.obtainMessage(7, this.v.get(), -1, new jy(this, 16)));
                }
             }
          }else if((tl = this.l) != null){
             td = this.d;
             a1 = this.b.a;
             w51.k(a1);
             this.b.getClass();
             if (this.q == null) {
                this.c.getClass();
             }
             td.a(a1, "com.google.android.gms", 4225, tl, this.b.b);
             this.l = null;
          }
          _monitor_exit(tf);
          return;
       }else {
          throw new IllegalArgumentException();
       }
    }
}
