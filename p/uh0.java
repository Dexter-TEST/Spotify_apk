package p.uh0;
import p.vh0;
import java.io.OutputStream;
import java.lang.Math;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import p.i80;
import p.xe7;
import p.s74;
import p.w36;
import com.google.protobuf.a;
import java.lang.Object;
import p.vf;
import p.se7;
import java.lang.CharSequence;
import p.qe7;
import p.mf3;
import java.lang.IndexOutOfBoundsException;
import p.re7;
import p.gd7;
import java.lang.System;

public final class uh0 extends vh0	// class@0028ab from classes.dex
{
    public final byte[] I;
    public final int J;
    public int K;
    public final OutputStream L;

    public void uh0(OutputStream p0,int p1){
       super();
       if (p1 < 0) {
          throw new IllegalArgumentException("bufferSize must be >= 0");
       }
       p1 = Math.max(p1, 20);
       byte[] uobyteArray = new byte[p1];
       this.I = uobyteArray;
       this.J = p1;
       if (p0 == null) {
          throw new NullPointerException("out");
       }
       this.L = p0;
       return;
    }
    public final int K0(){
       throw new UnsupportedOperationException("spaceLeft\(\) can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
    public final void L0(byte p0){
       if (this.K == this.J) {
          this.k1();
       }
       uh0 tK = this.K;
       this.K = tK + 1;
       this.I[tK] = p0;
       return;
    }
    public final void M0(int p0,boolean p1){
       this.l1(11);
       this.h1(p0, 0);
       uh0 tK = this.K;
       this.K = tK + 1;
       this.I[tK] = (byte)p1;
    }
    public final void N0(byte[] p0,int p1){
       this.c1(p1);
       this.m1(p0, 0, p1);
    }
    public final void O0(int p0,i80 p1){
       this.a1(p0, 2);
       this.P0(p1);
    }
    public final void P0(i80 p0){
       this.c1(p0.size());
       p0.s(this);
    }
    public final void Q0(int p0,int p1){
       this.l1(14);
       this.h1(p0, 5);
       this.f1(p1);
    }
    public final void R0(int p0){
       this.l1(4);
       this.f1(p0);
    }
    public final void S0(int p0,long p1){
       this.l1(18);
       this.h1(p0, 1);
       this.g1(p1);
    }
    public final void T0(long p0){
       this.l1(8);
       this.g1(p0);
    }
    public final void U0(int p0,int p1){
       this.l1(20);
       this.h1(p0, 0);
       if (p1 >= 0) {
          this.i1(p1);
       }else {
          this.j1((long)p1);
       }
       return;
    }
    public final void V0(int p0){
       if (p0 >= 0) {
          this.c1(p0);
       }else {
          this.e1((long)p0);
       }
       return;
    }
    public final void W0(int p0,s74 p1,w36 p2){
       this.a1(p0, 2);
       this.c1(p1.getSerializedSize(p2));
       p2.g(p1, this.F);
    }
    public final void X0(s74 p0){
       this.c1(p0.getSerializedSize());
       p0.writeTo(this);
    }
    public final void Y0(int p0,String p1){
       this.a1(p0, 2);
       this.Z0(p1);
    }
    public final void Z0(String p0){
       uh0 tK;
       try{
          int i = p0.length() * 3;
          int i1 = vh0.G0(i);
          int i2 = i1 + i;
          uh0 tJ = this.J;
          if (i2 > tJ) {
             byte[] uobyteArray = new byte[i];
             i = se7.a.p0(p0, uobyteArray, 0, i);
             this.c1(i);
             this.m1(uobyteArray, 0, i);
             return;
          }else if(i2 > (tJ - this.K)){
             this.k1();
          }
          try{
             i = vh0.G0(p0.length());
             tK = this.K;
             uh0 tI = this.I;
             if (i == i1) {
                i1 = tK + i;
                this.K = i1;
                i1 = se7.a.p0(p0, tI, i1, (tJ - i1));
                this.K = tK;
                this.i1(((i1 - tK) - i));
                this.K = i1;
             }else {
                i = se7.b(p0);
                this.i1(i);
                this.K = se7.a.p0(p0, tI, this.K, i);
             }
          }catch(p.re7 e0){
             this.K = tK;
             throw e0;
          }catch(java.lang.ArrayIndexOutOfBoundsException e0){
             throw new mf3(e0);
          }
       }catch(p.re7 e0){
          this.J0(p0, e0);
       }
       return;
    }
    public final void a1(int p0,int p1){
       this.c1(((p0 << 3) | p1));
    }
    public final void b1(int p0,int p1){
       this.l1(20);
       this.h1(p0, 0);
       this.i1(p1);
    }
    public final void c1(int p0){
       this.l1(5);
       this.i1(p0);
    }
    public final void d1(int p0,long p1){
       this.l1(20);
       this.h1(p0, 0);
       this.j1(p1);
    }
    public final void e1(long p0){
       this.l1(10);
       this.j1(p0);
    }
    public final void f1(int p0){
       uh0 tK = this.K;
       int i = tK + 1;
       uh0 tI = this.I;
       tI[tK] = (byte)(p0 & 0x00ff);
       int i1 = i + 1;
       tI[i] = (byte)((p0 >> 8) & 0x00ff);
       i = i1 + 1;
       tI[i1] = (byte)((p0 >> 16) & 0x00ff);
       this.K = i + 1;
       tI[i] = (byte)((p0 >> 24) & 0x00ff);
    }
    public final void g1(long p0){
       uh0 tK = this.K;
       int i = tK + 1;
       uh0 tI = this.I;
       tI[tK] = (byte)(int)(p0 & 255);
       int i1 = i + 1;
       tI[i] = (byte)(int)((p0 >> 8) & 255);
       i = i1 + 1;
       tI[i1] = (byte)(int)((p0 >> 16) & 255);
       i1 = i + 1;
       tI[i] = (byte)(int)(255 & (p0 >> 24));
       i = i1 + 1;
       tI[i1] = (byte)((int)(p0 >> 32) & 0x00ff);
       i1 = i + 1;
       tI[i] = (byte)((int)(p0 >> 40) & 0x00ff);
       i = i1 + 1;
       tI[i1] = (byte)((int)(p0 >> 48) & 0x00ff);
       this.K = i + 1;
       tI[i] = (byte)((int)(p0 >> 56) & 0x00ff);
    }
    public final void h1(int p0,int p1){
       this.i1(((p0 << 3) | p1));
    }
    public final void i1(int p0){
       int i;
       uh0 tK;
       int i1;
       uh0 tI = this.I;
       if (vh0.H) {
          while (i = p0 & 0x80) {
             tK = this.K;
             i1 = tK + 1;
             this.K = i1;
             long l = (long)tK;
             i = p0 & 0x7f;
             i = i | 0x0080;
             gd7.s(tI, l, (byte)i);
             p0 = p0 >> 7;
          }
          tK = this.K;
          this.K = tK + 1;
          gd7.s(tI, (long)tK, (byte)p0);
       }else {
          while (i = p0 & 0x80) {
             tK = this.K;
             i1 = tK + 1;
             this.K = i1;
             i1 = p0 & 0x7f;
             i1 = i1 | 0x0080;
             tI[tK] = (byte)i1;
             p0 = p0 >> 7;
          }
          tK = this.K;
          this.K = tK + 1;
          tI[tK] = (byte)p0;
       }
       return;
    }
    public final void j1(long p0){
       long l1;
       uh0 tK;
       int i;
       long l = 7;
       uh0 tI = this.I;
       if (vh0.H) {
          while (true) {
             l1 = p0 & -128;
             if (!(l1)) {
                break ;
             }else {
                tK = this.K;
                i = tK + 1;
                this.K = i;
                l1 = (long)tK;
                int i1 = (int)p0 & 0x7f;
                i1 = i1 | 0x0080;
                gd7.s(tI, l1, (byte)i1);
                p0 = p0 >> l;
             }
          }
          tK = this.K;
          this.K = tK + 1;
          gd7.s(tI, (long)tK, (byte)(int)p0);
       }else {
          while (true) {
             l1 = p0 & -128;
             if (!(l1)) {
                break ;
             }else {
                tK = this.K;
                i = tK + 1;
                this.K = i;
                i = (int)p0 & 0x7f;
                i = i | 0x0080;
                tI[tK] = (byte)i;
                p0 = p0 >> l;
             }
          }
          tK = this.K;
          this.K = tK + 1;
          tI[tK] = (byte)(int)p0;
       }
       return;
    }
    public final void k1(){
       this.L.write(this.I, 0, this.K);
       this.K = 0;
    }
    public final void l0(byte[] p0,int p1,int p2){
       this.m1(p0, p1, p2);
    }
    public final void l1(int p0){
       if (((this.J - this.K)) < p0) {
          this.k1();
       }
       return;
    }
    public final void m1(byte[] p0,int p1,int p2){
       uh0 tK = this.K;
       uh0 tJ = this.J;
       int i = tJ - tK;
       uh0 tI = this.I;
       if (i >= p2) {
          System.arraycopy(p0, p1, tI, tK, p2);
          this.K = this.K + p2;
       }else {
          System.arraycopy(p0, p1, tI, tK, i);
          p1 = p1 + i;
          p2 = p2 - i;
          this.K = tJ;
          this.k1();
          if (p2 <= tJ) {
             System.arraycopy(p0, p1, tI, 0, p2);
             this.K = p2;
          }else {
             this.L.write(p0, p1, p2);
          }
       }
       return;
    }
}
