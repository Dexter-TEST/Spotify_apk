package p.fj3;
import p.ui7;
import android.view.View;
import p.l16;
import p.sc4;
import p.bm0;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.lang.String;
import p.is7;
import android.os.BaseBundle;
import java.util.AbstractMap;
import p.kg4;
import p.en6;
import p.ti7;
import android.os.Looper;
import p.ja3;
import java.lang.Runnable;
import p.ic;
import java.lang.Class;
import android.os.SystemClock;
import java.lang.Long;
import com.spotify.connectivity.connectiontype.ConnectionType;
import p.qi7;
import com.spotify.performance.viewloadtracking.events.proto.ViewLoadSequence;
import p.wf2;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.an5;
import java.util.ArrayList;
import java.util.Iterator;
import p.r81;
import p.co5;
import android.view.ViewTreeObserver;
import p.ej3;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.dz6;
import android.view.View$OnLayoutChangeListener;

public final class fj3 implements ui7	// class@0015da from classes.dex
{
    public final String a;
    public final wf2 b;
    public final View c;
    public final Handler d;
    public final int e;
    public String f;
    public String g;
    public final l16 h;
    public final sc4 i;
    public final Context j;
    public int k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final boolean n;
    public final ConnectivityUtil o;

    public void fj3(View p0,l16 p1,sc4 p2,bm0 p3,Bundle p4,Handler p5,Context p6,ConnectivityUtil p7){
       String str;
       int i;
       super();
       this.l = new LinkedHashMap();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       this.m = linkedHashMa;
       this.c = p0;
       this.h = p1;
       this.i = p2;
       this.d = p5;
       this.j = p6;
       this.b = p3;
       this.a = UUID.randomUUID().toString();
       this.e = is7.n(p6);
       this.o = p7;
       boolean b = true;
       if (p4 != null) {
          this.n = b;
          this.f = p4.getString("ViewLoadingTracker.PAGE_ID");
          linkedHashMa.put("restored_sequence_id", p4.getString("ViewLoadingTracker.SEQUENCE_ID"));
          this.g(2);
          if ((str = p4.getString("ViewLoadingTracker.STATE")) == null) {
             this.k = 5;
          }else if(i = en6.A(kg4.J(str))){
             if (i != b) {
                if (i != 2) {
                   if (i != 3) {
                      this.k = 5;
                   }else {
                      this.k = 3;
                      this.f();
                   }
                }else {
                   this.k = 2;
                   this.d();
                }
             }else {
                this.k = b;
                _monitor_enter(this);
                this.k(ti7.b);
                _monitor_exit(this);
             }
          }else {
             this.k = b;
          }
       }else {
          this.k = b;
       }
    }
    public synchronized final void a(){
       if (this.k != 2 && this.k != 3) {
          if (this.k == 4) {
             this.k = 6;
             this.i(5);
          }
       }else {
          this.k = 6;
          this.g(4);
          this.i(4);
       }
       return;
    }
    public synchronized final void b(){
       this.c(this.c);
    }
    public synchronized final void c(View p0){
       if (this.k == 2) {
          int i = 3;
          this.g(i);
          if (p0 == null) {
             this.i(i);
             this.k = 5;
          }else {
             this.k = i;
             if (this.d.getLooper() == Looper.myLooper()) {
                this.l(p0);
             }else {
                this.d.post(new ja3(this, 19, p0));
             }
          }
       }
       return;
    }
    public synchronized final void d(){
       this.b();
    }
    public synchronized final void e(){
       if (this.k == 2) {
          this.k = 7;
          this.g(6);
          this.i(6);
       }
       return;
    }
    public synchronized final void f(){
       if (this.k == 3) {
          this.k = 4;
          this.g(5);
          if (this.n == null) {
             this.j();
          }
       }
       return;
    }
    public final void g(int p0){
       this.i.a.getClass();
       this.l.put(kg4.g(p0), Long.valueOf(SystemClock.elapsedRealtime()));
    }
    public synchronized final void h(Bundle p0){
       p0.putString("ViewLoadingTracker.PAGE_ID", this.f);
       p0.putString("ViewLoadingTracker.SEQUENCE_ID", this.a);
       p0.putString("ViewLoadingTracker.STATE", kg4.A(this.k));
       if (this.k != 1 && (this.k != 2 && this.k != 3)) {
          if (this.k == 4) {
             this.k = 6;
             this.i(5);
          }
       }else {
          this.k = 6;
          this.g(4);
          this.i(4);
       }
       return;
    }
    public final void i(int p0){
       fj3 tf;
       qi7 oqi7 = ViewLoadSequence.o();
       oqi7.h(this.a);
       oqi7.k(this.b.invoke());
       oqi7.j(kg4.g(p0));
       oqi7.i(this.o.getConnectionType(this.j).toString());
       oqi7.d(this.l);
       oqi7.c(this.m);
       oqi7.e(this.e);
       if ((tf = this.f) != null) {
          oqi7.g(tf);
       }
       if ((tf = this.g) != null) {
          oqi7.f(tf);
       }
       tf = this.h;
       ViewLoadSequence viewLoadSequ = oqi7.build();
       _monitor_enter(tf);
       if (tf.a != null) {
          tf.d.onNext(viewLoadSequ);
       }else {
          tf.b.add(viewLoadSequ);
       }
       _monitor_exit(tf);
       return;
    }
    public final void j(){
       fj3 tf;
       qi7 oqi7 = ViewLoadSequence.o();
       oqi7.h(this.a);
       oqi7.k(this.b.invoke());
       oqi7.j(kg4.g(5));
       oqi7.i(this.o.getConnectionType(this.j).toString());
       oqi7.d(this.l);
       oqi7.c(this.m);
       oqi7.e(this.e);
       if ((tf = this.f) != null) {
          oqi7.g(tf);
       }
       if ((tf = this.g) != null) {
          oqi7.f(tf);
       }
       ViewLoadSequence viewLoadSequ = oqi7.build();
       Iterator iterator = this.h.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().getClass();
          co5.o(viewLoadSequ, "sequence");
       }
       return;
    }
    public synchronized final void k(ti7 p0){
       int i = 1;
       if (this.k == i) {
          this.k = 2;
          this.g(i);
          if (p0 != ti7.b) {
             this.m.put("reason", p0.a);
          }
          this.g = this.o.getConnectionType(this.j).toString();
       }
       return;
    }
    public synchronized final void l(View p0){
       p0.getViewTreeObserver().addOnGlobalLayoutListener(new ej3(this, p0, 0));
       p0.addOnLayoutChangeListener(new dz6(this, p0, 2));
    }
}
