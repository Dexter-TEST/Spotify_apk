package p.yp5;
import p.ob3;
import p.lp5;
import java.util.List;
import p.l67;
import p.bv5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.cx5;
import p.mw1;
import p.ps2;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import p.pb3;
import java.lang.NullPointerException;

public final class yp5 implements ob3	// class@0003e1 from classes2.dex
{
    public final lp5 a;
    public final List b;
    public final int c;
    public final l67 d;
    public final bv5 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public void yp5(lp5 p0,List p1,int p2,l67 p3,bv5 p4,int p5,int p6,int p7){
       co5.o(p0, "call");
       co5.o(p1, "interceptors");
       co5.o(p4, "request");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public static yp5 a(yp5 p0,int p1,l67 p2,bv5 p3,int p4){
       yp5 c;
       yp5 d;
       yp5 e;
       yp5 "request";
       if ((p4 & 0x01)) {
          c = p0.c;
       }
       yp5 oyp5 = c;
       if ((p4 & 0x02)) {
          d = p0.d;
       }
       yp5 oyp51 = d;
       if ((p4 & 0x04)) {
          e = p0.e;
       }
       yp5 oyp52 = e;
       yp5 oyp53 = ((p4 & 0x08))? p0.f: 0;
       yp5 oyp54 = ((p4 & 0x10))? p0.g: 0;
       yp5 oyp55 = ((p4 & 0x20))? p0.h: 0;
       p0.getClass();
       co5.o(oyp52, "request");
       "request" = new yp5(p0.a, p0.b, oyp5, oyp51, oyp52, oyp53, oyp54, oyp55);
       return "request";
    }
    public final cx5 b(bv5 p0){
       yp5 tc;
       yp5 td;
       int i2;
       cx5 uocx5;
       co5.o(p0, "request");
       yp5 tb = this.b;
       int i = 0;
       int i1 = ((tc = this.c) < tb.size())? 1: 0;
       if (i1) {
          this.i = this.i + 1;
          String str = " must call proceed\(\) exactly once";
          if ((td = this.d) != null) {
             if (td.d.b(p0.a)) {
                i2 = (this.i == 1)? 1: 0;
                if (!i2) {
                   throw new IllegalStateException("network interceptor "+tb.get((tc - 1))+str.toString());
                }
             }else {
                throw new IllegalStateException("network interceptor "+tb.get((tc - 1))+" must retain the same host and port".toString());
             }
          }
          i2 = tc + 1;
          yp5 oyp5 = yp5.a(this, i2, null, p0, 58);
          pb3 opb3 = tb.get(tc);
          if ((uocx5 = opb3.intercept(oyp5)) != null) {
             if (td != null) {
                oyp5 = (i2 < tb.size() && oyp5.i != 1)? 0: 1;
                if (!oyp5) {
                   throw new IllegalStateException("network interceptor "+opb3+str.toString());
                }
             }
             if (uocx5.x != null) {
                i = 1;
             }
             if (i) {
                return uocx5;
             }else {
                throw new IllegalStateException("interceptor "+opb3+" returned a response with no body".toString());
             }
          }else {
             throw new NullPointerException("interceptor "+opb3+" returned null");
          }
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
}
