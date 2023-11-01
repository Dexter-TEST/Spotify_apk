package p.ez7;
import java.lang.Object;
import p.ap5;
import java.util.Arrays;
import java.lang.String;
import p.ix7;
import java.lang.Math;
import java.lang.System;

public final class ez7	// class@00152c from classes.dex
{
    public byte[] a;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;

    public void ez7(){
       super();
       byte[] uobyteArray = new byte[4096];
       this.a = uobyteArray;
       this.b = 0;
       this.e = -1;
       this.c = -1;
       this.h = false;
       this.f = 30;
       this.d = -1;
       this.g = -1;
       this.i = null;
    }
    public final int a(byte[] p0,int p1,int p2){
       int i;
       int len;
       int i3;
       if ((i = this.c(30, p1, p2, p0)) == -1) {
          return -1;
       }
       if (!(this.c - -1)) {
          ez7 ta = this.a;
          int i1 = 0;
          int i2 = ap5.G(ta, i1);
          long l = (long)((ap5.G(ta, 2) << 16) | i2) & 0xffffffff;
          this.c = l;
          if (!(l - 0x4034b50)) {
             this.h = i1;
             ta = this.a;
             i1 = ap5.G(ta, 18);
             this.d = (long)((ap5.G(ta, 20) << 16) | i1) & 0xffffffff;
             this.g = ap5.G(this.a, 8);
             this.e = ap5.G(this.a, 26);
             i1 = (this.e + 30) + ap5.G(this.a, 28);
             this.f = i1;
             if ((len = this.a.length) < i1) {
                do {
                } while ((len = len + len) < i1);
                this.a = Arrays.copyOf(this.a, len);
             }
          }else {
             this.h = true;
          }
       }
       if ((i3 = this.c(this.f, (p1 + i), (p2 - i), p0)) == -1) {
          return -1;
       }else {
          i = i + i3;
          if (this.h == null && this.i == null) {
             this.i = new String(this.a, 30, this.e);
          }
          return i;
       }
    }
    public final ix7 b(){
       ez7 uoez7 = this;
       ez7 b = uoez7.b;
       ez7 f = uoez7.f;
       if (b < f) {
          ix7 b1 = new ix7(uoez7.i, uoez7.d, uoez7.g, true, uoez7.h, Arrays.copyOf(uoez7.a, b));
          return b;
       }else {
          ix7 f1 = new ix7(uoez7.i, uoez7.d, uoez7.g, false, uoez7.h, Arrays.copyOf(uoez7.a, f));
          uoez7.b = 0;
          uoez7.e = -1;
          uoez7.c = -1;
          uoez7.h = false;
          uoez7.f = 30;
          uoez7.d = -1;
          uoez7.g = -1;
          uoez7.i = null;
          return f;
       }
    }
    public final int c(int p0,int p1,int p2,byte[] p3){
       ez7 tb;
       if ((tb = this.b) >= p0) {
          return 0;
       }
       p2 = Math.min(p2, (p0 - tb));
       System.arraycopy(p3, p1, this.a, this.b, p2);
       p1 = this.b + p2;
       this.b = p1;
       if (p1 < p0) {
          return -1;
       }
       return p2;
    }
}
