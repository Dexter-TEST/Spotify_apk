package p.jr7;
import java.lang.String;
import p.es3;
import java.lang.Object;
import p.co5;
import p.rq7;
import p.h51;
import p.zq0;
import p.kg4;
import java.lang.Math;
import java.lang.System;
import p.tp2;
import p.en6;
import java.lang.StringBuilder;
import p.hr7;

public final class jr7	// class@001b31 from classes.dex
{
    public final String a;
    public rq7 b;
    public final String c;
    public String d;
    public h51 e;
    public final h51 f;
    public long g;
    public final long h;
    public final long i;
    public zq0 j;
    public final int k;
    public int l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final int r;
    public final int s;
    public final int t;

    static {
       co5.l(es3.d("WorkSpec"), "tagWithPrefix\(\"WorkSpec\"\)");
    }
    public void jr7(String p0,rq7 p1,String p2,String p3,h51 p4,h51 p5,long p6,long p7,long p8,zq0 p9,int p10,int p11,long p12,long p13,long p14,long p15,boolean p16,int p17,int p18,int p19){
       int i = this;
       Object obj = p5;
       Object obj1 = p9;
       int i1 = p11;
       int i2 = p17;
       co5.o(p0, "id");
       co5.o(p1, "state");
       co5.o(p2, "workerClassName");
       co5.o(p4, "input");
       co5.o(obj, "output");
       co5.o(obj1, "constraints");
       kg4.t(i1, "backoffPolicy");
       kg4.t(i2, "outOfQuotaPolicy");
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = obj;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = obj1;
       i.k = p10;
       i.l = i1;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
       i.r = i2;
       i.s = p18;
       i.t = p19;
    }
    public void jr7(String p0,rq7 p1,String p2,String p3,h51 p4,h51 p5,long p6,long p7,long p8,zq0 p9,int p10,int p11,long p12,long p13,long p14,long p15,boolean p16,int p17,int p18,int p19,int p20){
       h51 c;
       h51 oh51;
       h51 oh511;
       int i4;
       int i = p19;
       rq7 orq7 = ((i & 0x02))? rq7.a: p1;
       String str = ((i & 0x08))? null: p3;
       String str1 = "EMPTY";
       if ((i & 0x10)) {
          c = h51.c;
          co5.l(c, str1);
          oh51 = c;
       }else {
          oh51 = p4;
       }
       if ((i & 0x20)) {
          c = h51.c;
          co5.l(c, str1);
          oh511 = c;
       }else {
          oh511 = p5;
       }
       long l = ((i & 0x40))? 0: p6;
       long l1 = ((i & 0x0080))? 0: p7;
       long l2 = ((i & 0x0100))? 0: p8;
       zq0 ozq0 = ((i & 0x0200))? zq0.i: p9;
       int i1 = ((i & 0x0400))? 0: p10;
       c = ((i & 0x0800))? 1: p11;
       long l3 = ((i & 0x1000))? 0x7530: p12;
       long l4 = ((i & 0x2000))? 0: p13;
       long l5 = ((i & 0x4000))? 0: p14;
       long l6 = ((0x8000 & i))? -1: p15;
       boolean b = ((0x10000 & i))? false: p16;
       int i2 = ((0x20000 & i))? 1: p17;
       int i3 = ((i & 0x40000))? 0: p18;
       super(p0, orq7, p2, str, oh51, oh511, l, l1, l2, ozq0, i1, c, l3, l4, l5, l6, b, i2, i3, 0);
       return;
    }
    public final long a(){
       long l1;
       jr7 ts;
       jr7 tk = this.k;
       int i = 0;
       int i1 = 1;
       int i2 = (this.b == rq7.a && tk > null)? 1: 0;
       if (i2) {
          if (this.l == 2) {
             i = 1;
          }
          long l = (i)? this.m * (long)tk: (long)Math.scalb((float)this.m, (tk - i1));
          tk = this.n;
          if ((l - 0x112a880) > 0) {
             l = 0x112a880;
          }
          l1 = tk + l;
       }else {
          long l2 = 0;
          if (this.c()) {
             jr7 tn = this.n;
             if ((ts = this.s) == null) {
                tn = tn + this.g;
             }
             jr7 ti = this.i;
             jr7 th = this.h;
             if (ti - th) {
                i = 1;
             }
             if (i) {
                if (ts == null) {
                   l2 = (long)-1 * ti;
                }
                tn = tn + th;
             }else if(ts == null){
                l2 = th;
             }
             l1 = l2 + tn;
          }else {
             jr7 tn1 = this.n;
             if (!(tn1 - l2)) {
                tn1 = System.currentTimeMillis();
             }
             l1 = tn1 + this.g;
          }
       }
       return l1;
    }
    public final boolean b(){
       return (co5.c(zq0.i, this.j) ^ 0x01);
    }
    public final boolean c(){
       boolean b = (this.h)? true: false;
       return b;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof jr7) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       if (this.g - p0.g) {
          return false;
       }
       if (this.h - p0.h) {
          return false;
       }
       if (this.i - p0.i) {
          return false;
       }
       if (!co5.c(this.j, p0.j)) {
          return false;
       }
       if (this.k != p0.k) {
          return false;
       }
       if (this.l != p0.l) {
          return false;
       }
       if (this.m - p0.m) {
          return false;
       }
       if (this.n - p0.n) {
          return false;
       }
       if (this.o - p0.o) {
          return false;
       }
       if (this.p - p0.p) {
          return false;
       }
       if (this.q != p0.q) {
          return false;
       }
       if (this.r != p0.r) {
          return false;
       }
       if (this.s != p0.s) {
          return false;
       }
       if (this.t != p0.t) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       jr7 td;
       int i = tp2.g(this.c, ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31), 31);
       int i1 = ((td = this.d) == null)? 0: td.hashCode();
       td = this.g;
       td = this.h;
       td = this.i;
       td = this.m;
       td = this.n;
       td = this.o;
       td = this.p;
       i = (((((((((en6.A(this.l) + ((((this.j.hashCode() + ((((((((this.f.hashCode() + ((this.e.hashCode() + ((i + i1) * 31)) * 31)) * 31) + (int)(td ^ (td >> 32))) * 31) + (int)(td ^ (td >> 32))) * 31) + (int)(td ^ (td >> 32))) * 31)) * 31) + this.k) * 31)) * 31) + (int)(td ^ (td >> 32))) * 31) + (int)(td ^ (td >> 32))) * 31) + (int)(td ^ (td >> 32))) * 31) + (int)(td ^ (td >> 32))) * 31;
       if ((td = this.q) != null) {
          i1 = 1;
       }
       return (((((en6.A(this.r) + ((i + i1) * 31)) * 31) + this.s) * 31) + this.t);
    }
    public final String toString(){
       return hr7.a("{WorkSpec: ", this.a, '}');
    }
}
