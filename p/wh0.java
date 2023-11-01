package p.wh0;
import java.io.Flushable;
import java.io.FileOutputStream;
import java.lang.Object;
import p.k80;
import java.io.OutputStream;
import p.mf3;
import java.lang.System;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.String;

public final class wh0 implements Flushable	// class@002b35 from classes.dex
{
    public final byte[] a;
    public final int b;
    public int c;
    public final OutputStream t;

    public void wh0(FileOutputStream p0,byte[] p1){
       super();
       this.t = p0;
       this.a = p1;
       this.c = 0;
       this.b = p1.length;
    }
    public static int a(int p0,k80 p1){
       return ((wh0.b(p1.a.length) + p1.a.length) + wh0.d(p0));
    }
    public static int b(int p0){
       if (!((p0 & 0x80))) {
          return 1;
       }
       if (!((p0 & 0xc000))) {
          return 2;
       }
       if (!((0xffe00000 & p0))) {
          return 3;
       }
       if (!((p0 & 0xf0000000))) {
          return 4;
       }
       return 5;
    }
    public static int d(int p0){
       return wh0.b(((p0 << 3) | 0x00));
    }
    public static int f(int p0,int p1){
       return (wh0.b(p1) + wh0.d(p0));
    }
    public static int g(int p0,long p1){
       int i;
       p0 = wh0.d(p0);
       if (!((-128 & p1))) {
          i = 1;
       }else if(!((-16384 & p1))){
          i = 2;
       }else if(!((-2097152 & p1))){
          i = 3;
       }else if(!((-268435456 & p1))){
          i = 4;
       }else if(!((0xfffffff800000000 & p1))){
          i = 5;
       }else if(!((0xfffffc0000000000 & p1))){
          i = 6;
       }else if(!((0xfffe000000000000 & p1))){
          i = 7;
       }else if(!((0xff00000000000000 & p1))){
          i = 8;
       }else if(!((p1 & Long.MIN_VALUE))){
          i = 9;
       }else {
          i = 10;
       }
       return (p0 + i);
    }
    public final void flush(){
       if (this.t != null) {
          this.h();
       }
       return;
    }
    public final void h(){
       wh0 tt;
       if ((tt = this.t) == null) {
          throw new mf3();
       }
       tt.write(this.a, 0, this.c);
       this.c = 0;
       return;
    }
    public final void i(int p0,k80 p1){
       this.o(p0, 2);
       this.n(p1.a.length);
       k80 a = p1.a;
       int len = a.length;
       wh0 tc = this.c;
       wh0 tb = this.b;
       int i = tb - tc;
       wh0 ta = this.a;
       if (i >= len) {
          System.arraycopy(a, 0, ta, tc, len);
          this.c = this.c + len;
       }else {
          System.arraycopy(a, 0, ta, tc, i);
          int i1 = i + 0;
          len = len - i;
          this.c = tb;
          this.h();
          if (len <= tb) {
             System.arraycopy(a, i1, ta, 0, len);
             this.c = len;
          }else {
             ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(a);
             long l = (long)i1;
             if (!(l - uByteArrayIn.skip(l))) {
                while (len > 0) {
                   a = Math.min(len, tb);
                   if ((i1 = uByteArrayIn.read(ta, 0, a)) == a) {
                      this.t.write(ta, 0, i1);
                      len = len - i1;
                   }else {
                      throw new IllegalStateException("Read failed.");
                   }
                }
             }else {
                throw new IllegalStateException("Skip failed.");
             }
          }
       }
       return;
    }
    public final void j(int p0,int p1){
       this.o(p0, 0);
       if (p1 >= 0) {
          this.n(p1);
       }else {
          long l = (long)p1;
          while (true) {
             long l1 = -128 & l;
             if (!(l1)) {
                break ;
             }else {
                int i = (int)l & 0x7f;
                i = i | 0x0080;
                this.l(i);
                l = l >> 7;
             }
          }
          this.l((int)l);
       }
       return;
    }
    public final void l(int p0){
       byte b = (byte)p0;
       if (this.c == this.b) {
          this.h();
       }
       wh0 tc = this.c;
       this.c = tc + 1;
       this.a[tc] = b;
       return;
    }
    public final void n(int p0){
       int i;
       while (i = p0 & 0x80) {
          i = p0 & 0x7f;
          i = i | 0x0080;
          this.l(i);
          p0 = p0 >> 7;
       }
       this.l(p0);
       return;
    }
    public final void o(int p0,int p1){
       this.n(((p0 << 3) | p1));
    }
    public final void p(int p0,int p1){
       this.o(p0, 0);
       this.n(p1);
    }
    public final void q(int p0,long p1){
       this.o(p0, 0);
       while (true) {
          long l = -128 & p1;
          if (!(l)) {
             break ;
          }else {
             p0 = (int)p1 & 0x7f;
             p0 = p0 | 0x0080;
             this.l(p0);
             p1 = p1 >> 7;
          }
       }
       this.l((int)p1);
       return;
    }
}
