package p.zk;
import p.wy7;
import p.bu0;
import p.k30;
import p.vc1;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Float;
import p.eb4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import p.rz1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p.sz1;
import java.util.concurrent.FutureTask;
import p.jr3;
import java.util.concurrent.Callable;
import java.lang.Runnable;
import p.si4;
import p.t5;
import android.app.AlertDialog;
import p.xy5;
import p.m91;
import p.y9;
import p.gg1;
import p.b7;
import p.g54;
import p.pk;
import java.util.Set;
import p.mk;
import p.wh6;
import java.lang.StringBuilder;
import p.en6;
import p.mi;
import p.zy5;
import java.util.Iterator;
import p.b93;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.lt;
import p.xy7;
import android.os.Bundle;
import java.lang.Class;
import android.os.BaseBundle;
import java.lang.Boolean;
import java.util.HashMap;
import p.uy7;
import p.ty7;
import p.io2;
import p.ox7;
import p.rb4;
import p.w42;
import java.util.concurrent.CopyOnWriteArrayList;
import p.kr;
import p.rn1;
import java.lang.Exception;
import p.m07;
import p.wr;
import p.n51;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;
import p.ob;
import p.ns4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ir2;
import p.yf2;
import p.co5;
import p.su7;
import java.util.concurrent.atomic.AtomicReference;
import p.ol2;
import android.os.Message;
import android.os.Handler;
import android.app.Dialog;
import p.j07;

public final class zk implements wy7, bu0, k30, vc1	// class@002f18 from classes.dex
{
    public Object a;
    public Object b;

    public void zk(){
       super();
    }
    public void zk(int p0,int p1){
       super();
       int[] ointArray = new int[]{p0,p1};
       this.a = ointArray;
       this.b = new float[2]{0,0x3f800000};
    }
    public void zk(int p0,int p1,int p2){
       super();
       int[] ointArray = new int[]{p0,p1,p2};
       this.a = ointArray;
       this.b = new float[3]{0,0x3f000000,0x3f800000};
    }
    public void zk(Object p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void zk(Object p0,Object p1,int p2){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void zk(ArrayList p0,ArrayList p1){
       super();
       int i = p0.size();
       int[] ointArray = new int[i];
       this.a = ointArray;
       float[] uofloatArray = new float[i];
       this.b = uofloatArray;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.a[i1] = p0.get(i1).intValue();
          this.b[i1] = p1.get(i1).floatValue();
       }
       return;
    }
    public void zk(eb4 p0){
       this.b = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("search_bar", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = false;
       this.a = ojb7.a();
    }
    public void zk(rz1 p0){
       super();
       this.b = new CountDownLatch(1);
       sz1.c().execute(new FutureTask(new jr3(this, 0, p0)));
    }
    public void zk(si4 p0){
       this.b = p0;
       super();
       jb7 ojb7 = p0.a.b();
       lb7 v6 = new lb7("input_field", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = false;
       this.a = ojb7.a();
    }
    public void zk(t5 p0,AlertDialog p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void zk(xy5 p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 10);
    }
    public void zk(y9 p0,gg1 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       this.a.u("boot_id", this.b.o());
    }
    public final void b(pk p0){
       int i2;
       String str1;
       int i3;
       ArrayList orDefault;
       mk omk = p0.keySet();
       if (omk.isEmpty()) {
          return;
       }
       int i = 0;
       int i1 = 999;
       if (p0.c > i1) {
          pk opk = new pk(i1);
          wh6 c = p0.c;
          i = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          while (true) {
             if (i < c) {
                opk.put(p0.h(i), p0.j(i));
                i = i + 1;
                if ((i2 = i2 + 1) == i1) {
                   this.b(opk);
                   opk = new pk(i1);
                }
             }else if(i2 > 0){
                this.b(opk);
                break ;
             }
             break ;
          }
          return;
       }else {
          StringBuilder str = en6.r("SELECT `url`,`width`,`height`,`parent_uri` FROM `images` WHERE `parent_uri` IN \(");
          wh6 c1 = omk.a.c;
          mi.c(c1, str);
          zy5 ozy5 = zy5.x((c1 + i), str+"\)");
          Iterator iterator = omk.iterator();
          i2 = 1;
          while (true) {
             Iterator iterator1 = iterator;
             if (iterator1.hasNext()) {
                if ((str1 = iterator1.next()) == null) {
                   ozy5.z(i2);
                }else {
                   ozy5.s(i2, str1);
                }
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          Cursor uCursor = vv7.J(this.a, ozy5, i);
          if ((i3 = ej4.y(uCursor, "parent_uri")) == -1) {
             uCursor.close();
             return;
          }else {
             while (uCursor.moveToNext()) {
                if (!uCursor.isNull(i3)) {
                   Integer integer = null;
                   if ((orDefault = p0.getOrDefault(uCursor.getString(i3), integer)) != null) {
                      String str2 = (uCursor.isNull(i))? integer: uCursor.getString(i);
                      Integer integer1 = (uCursor.isNull(1))? integer: Integer.valueOf(uCursor.getInt(1));
                      if (!uCursor.isNull(2)) {
                         integer = Integer.valueOf(uCursor.getInt(2));
                      }
                      orDefault.add(lt.a(integer1, integer, str2));
                   }
                }
             }
             uCursor.close();
             return;
          }
       }
    }
    public final Object c(){
       int intx;
       Boolean tRUE;
       zk ta = this.a;
       zk tb = this.b;
       ta.getClass();
       if (!(intx = tb.getInt("session_id"))) {
          tRUE = Boolean.TRUE;
       }else {
          xy7 d = ta.d;
          Integer integer = Integer.valueOf(intx);
          if (!d.containsKey(integer)) {
             tRUE = Boolean.TRUE;
          }else {
             uy7 ouy7 = d.get(integer);
             tRUE = (ouy7.c.d == 6)? Boolean.FALSE: Boolean.valueOf((ox7.U(ouy7.c.d, tb.getInt(io2.C("status", xy7.d(tb)))) ^ 0x01));
          }
       }
       return tRUE;
    }
    public final boolean d(){
       String str = this.a.s("boot_id");
       String str1 = this.b.o();
       if (str != null && str.equals(str1)) {
          return false;
       }
       this.a.u("boot_id", str1);
       return true;
    }
    public final void dispose(){
       this.b.y.remove(this.a);
    }
    public final void e(kr p0){
       this.a.b();
       this.a.c();
       this.b.h(p0);
       this.a.r();
       this.a.m();
    }
    public final void f(Exception p0){
       zk ta = this.a;
       zk tb = this.b;
       if (p0 != null) {
          ta.a(p0);
       }else {
          ta.b(tb);
       }
       return;
    }
    public final Observable g(Single p0){
       this.b.getClass();
       Observable observable = p0.toObservable().compose(new ns4(0)).onErrorReturn(ir2.A);
       co5.l(observable, "toObservable\(\)\n         …rn { Result.failure\(it\) }");
       return observable;
    }
    public final void h(){
       t5 c = this.b.c;
       c.c.set(null);
       ol2 n = c.x.n;
       n.sendMessage(n.obtainMessage(3));
       if (this.a.isShowing()) {
          this.a.dismiss();
       }
       return;
    }
    public final Object j(j07 p0){
       return this.a.call();
    }
}
