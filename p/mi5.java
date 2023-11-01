package p.mi5;
import p.wn;
import p.xn;
import p.sf1;
import p.xf1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Enum;
import p.wf1;
import p.mv3;
import p.kv3;
import java.util.concurrent.TimeUnit;
import p.eb3;
import p.rn6;
import p.b07;
import p.ve6;
import android.content.Context;
import p.zg0;
import p.o26;
import p.ay6;
import p.wf2;
import p.tn6;
import p.ic;
import java.lang.Class;
import java.lang.System;

public final class mi5 implements wn, xn	// class@001ea1 from classes.dex
{
    public final ve6 a;
    public final Context b;
    public final zg0 c;
    public final ay6 d;
    public static final long e;
    public static final rn6 f;
    public static final rn6 g;
    public static final rn6 h;

    static {
       long l;
       int a;
       long b;
       long l1;
       xf1 c;
       xf1 v = xf1.v;
       String str = "unit";
       co5.o(v, str);
       int i = 0;
       if (v.compareTo(xf1.t) <= 0) {
          l = co5.u((long)1, v, xf1.b) << 1;
          a = wf1.a;
       }else {
          l = (long)1;
          c = xf1.b;
          b = co5.u(0x3ffffffffffa14bf, c, v);
          long l2 = - b;
          mv3 omv3 = new mv3(l2, b);
          b = ((l2 - l) <= 0 && (l - omv3.b) <= 0)? 1: 0;
          if (b) {
             l = co5.u(l, v, c) << 1;
             a = wf1.a;
          }else {
             c = xf1.c;
             co5.o(c, "targetUnit");
             l = (eb3.e(c.a.convert(l, v.a), 0xc000000000000001, 0x3fffffffffffffff) << 1) + 1;
             a = wf1.a;
          }
       }
       int i1 = ((a = (int)l & 1) == 1)? 1: 0;
       b = sf1.b;
       long a1 = sf1.a;
       if (i1) {
          i1 = ((l - a1) && (l - b))? 0: 1;
          if ((i1 ^ 1)) {
             l1 = l >> 1;
          }else {
          label_0089 :
             c = xf1.c;
             co5.o(c, str);
             if (!(l - a1)) {
                l1 = Long.MAX_VALUE;
             }else if(!(l - b)){
                l1 = Long.MIN_VALUE;
             }else {
                l = l >> 1;
                if (!a) {
                   i = 1;
                }
                v = (i)? xf1.b: c;
                co5.o(v, "sourceUnit");
                l1 = c.a.convert(l, v.a);
             }
          }
       }else {
          goto label_0089 ;
       }
       mi5.e = l1;
       b07 b1 = rn6.b;
       mi5.f = b1.a("registration_app_attribution_referrer");
       mi5.g = b1.a("registration_app_attribution_referrer_timestamp");
       mi5.h = b1.a("registration_install_attribution_referrer");
    }
    public void mi5(ve6 p0,Context p1,zg0 p2){
       co5.o(p0, "preferencesFactory");
       co5.o(p1, "context");
       co5.o(p2, "clock");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new ay6(new o26(9, this));
    }
    public final String a(){
       String str;
       long l = this.b().b(mi5.g, 0);
       if ((str = this.b().g(mi5.f, null)) != null) {
          this.c.getClass();
          l = (((l + mi5.e) - System.currentTimeMillis()) > 0)? 1: 0;
          if (l) {
          label_0033 :
             return str;
          }
       }
       str = "";
       goto label_0033 ;
    }
    public final tn6 b(){
       return this.d.getValue();
    }
}
