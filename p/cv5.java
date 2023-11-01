package p.cv5;
import java.util.concurrent.TimeUnit;
import android.net.Uri;
import java.lang.String;
import java.util.List;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import java.util.Collections;
import java.lang.System;
import java.lang.StringBuilder;
import p.tp2;
import java.util.Iterator;
import p.p77;

public final class cv5	// class@001286 from classes.dex
{
    public int a;
    public long b;
    public final Uri c;
    public final int d;
    public final String e;
    public final List f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final boolean q;
    public final Bitmap$Config r;
    public final int s;
    public static final long t;

    static {
       cv5.t = TimeUnit.SECONDS.toNanos(5);
    }
    public void cv5(Uri p0,int p1,String p2,List p3,int p4,int p5,boolean p6,boolean p7,int p8,boolean p9,float p10,float p11,float p12,boolean p13,boolean p14,Bitmap$Config p15,int p16){
       int i = this;
       super();
       i.c = p0;
       i.d = p1;
       i.e = p2;
       i.f = (p3 == null)? null: Collections.unmodifiableList(p3);
       i.g = p4;
       i.h = p5;
       i.i = p6;
       i.k = p7;
       i.j = p8;
       i.l = p9;
       i.m = p10;
       i.n = p11;
       i.o = p12;
       i.p = p13;
       i.q = p14;
       i.r = p15;
       i.s = p16;
       return;
    }
    public final boolean a(){
       boolean b = (this.g == null && this.h == null)? false: true;
       return b;
    }
    public final String b(){
       long l = System.nanoTime() - this.b;
       if ((l - cv5.t) > 0) {
          return this.d()+'+'+TimeUnit.NANOSECONDS.toSeconds(l)+'s';
       }
       return this.d()+'+'+TimeUnit.NANOSECONDS.toMillis(l)+"ms";
    }
    public final boolean c(){
       boolean b = (!this.a() && !(0 - this.m))? false: true;
       return b;
    }
    public final String d(){
       return tp2.n("[R", this.a, ']');
    }
    public final String toString(){
       cv5 td;
       cv5 tf;
       cv5 tg;
       StringBuilder str = "Request{";
       str = ((td = this.d) > null)? str+td: str+this.c;
       char c = ' ';
       if ((tf = this.f) != null && !tf.isEmpty()) {
          Iterator iterator = tf.iterator();
          while (iterator.hasNext()) {
             str = str.append(c).append(iterator.next().a());
          }
       }
       if ((tf = this.e) != null) {
          str = str+" stableKey\("+tf+')';
       }
       char c1 = ',';
       if ((tg = this.g) > null) {
          str = str+" resize\("+tg+c1+this.h+')';
       }
       if (this.i != null) {
          str = str+" centerCrop";
       }
       if (this.k != null) {
          str = str+" centerInside";
       }
       cv5 tm = this.m;
       if (0 - tm) {
          str = str+" rotation\("+tm;
          if (this.p != null) {
             str = str+" @ "+this.n+c1+this.o;
          }
          str = str+')';
       }
       if (this.q != null) {
          str = str+" purgeable";
       }
       if ((tf = this.r) != null) {
          str = str+c+tf;
       }
       return str+'}';
    }
}
