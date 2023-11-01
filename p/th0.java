package p.th0;
import p.vh0;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import p.mf3;
import java.lang.IndexOutOfBoundsException;
import p.i80;
import p.xe7;
import p.s74;
import p.w36;
import com.google.protobuf.a;
import p.vf;
import p.se7;
import java.lang.CharSequence;
import p.qe7;
import p.re7;
import p.gd7;
import java.lang.System;

public final class th0 extends vh0	// class@00276c from classes.dex
{
    public final byte[] I;
    public final int J;
    public int K;

    public void th0(byte[] p0,int p1){
       super();
       int i = 0;
       int i1 = i + p1;
       if ((((i | p1) | (p0.length - i1))) >= 0) {
          this.I = p0;
          this.K = i;
          this.J = i1;
          return;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.length),Integer.valueOf(i),Integer.valueOf(p1)};
          throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objArray));
       }
    }
    public final int K0(){
       return (this.J - this.K);
    }
    public final void L0(byte p0){
       try{
          th0 tK = this.K;
          this.K = tK + 1;
          this.I[tK] = p0;
          return;
       }catch(java.lang.IndexOutOfBoundsException e5){
          Object[] objArray = new Object[]{Integer.valueOf(this.K),Integer.valueOf(this.J),Integer.valueOf(1)};
          throw new mf3(String.format("Pos: %d, limit: %d, len: %d", objArray), e5);
       }
    }
    public final void M0(int p0,boolean p1){
       this.a1(p0, 0);
       this.L0((byte)p1);
    }
    public final void N0(byte[] p0,int p1){
       this.c1(p1);
       this.f1(p0, 0, p1);
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
       this.a1(p0, 5);
       this.R0(p1);
    }
    public final void R0(int p0){
       try{
          th0 tI = this.I;
          th0 tK = this.K;
          int i = tK + 1;
          tI[tK] = (byte)(p0 & 0x00ff);
          int i1 = i + 1;
          tI[i] = (byte)((p0 >> 8) & 0x00ff);
          i = i1 + 1;
          tI[i1] = (byte)((p0 >> 16) & 0x00ff);
          this.K = i + 1;
          tI[i] = (byte)((p0 >> 24) & 0x00ff);
          return;
       }catch(java.lang.IndexOutOfBoundsException e5){
          Object[] objArray = new Object[]{Integer.valueOf(this.K),Integer.valueOf(this.J),Integer.valueOf(1)};
          throw new mf3(String.format("Pos: %d, limit: %d, len: %d", objArray), e5);
       }
    }
    public final void S0(int p0,long p1){
       this.a1(p0, 1);
       this.T0(p1);
    }
    public final void T0(long p0){
       try{
          th0 tI = this.I;
          th0 tK = this.K;
          int i = tK + 1;
          tI[tK] = (byte)((int)p0 & 0x00ff);
          int i1 = i + 1;
          tI[i] = (byte)((int)(p0 >> 8) & 0x00ff);
          i = i1 + 1;
          tI[i1] = (byte)((int)(p0 >> 16) & 0x00ff);
          i1 = i + 1;
          tI[i] = (byte)((int)(p0 >> 24) & 0x00ff);
          i = i1 + 1;
          tI[i1] = (byte)((int)(p0 >> 32) & 0x00ff);
          i1 = i + 1;
          tI[i] = (byte)((int)(p0 >> 40) & 0x00ff);
          i = i1 + 1;
          tI[i1] = (byte)((int)(p0 >> 48) & 0x00ff);
          this.K = i + 1;
          tI[i] = (byte)((int)(p0 >> 56) & 0x00ff);
          return;
       }catch(java.lang.IndexOutOfBoundsException e6){
          Object[] objArray = new Object[]{Integer.valueOf(this.K),Integer.valueOf(this.J),Integer.valueOf(1)};
          throw new mf3(String.format("Pos: %d, limit: %d, len: %d", objArray), e6);
       }
    }
    public final void U0(int p0,int p1){
       this.a1(p0, 0);
       this.V0(p1);
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
       th0 tK = this.K;
       try{
          int i = vh0.G0(p0.length());
          th0 tJ = this.J;
          th0 tI = this.I;
          if (i == vh0.G0((p0.length() * 3))) {
             int i1 = tK + i;
             this.K = i1;
             i1 = se7.a.p0(p0, tI, i1, (tJ - i1));
             this.K = tK;
             this.c1(((i1 - tK) - i));
             this.K = i1;
          }else {
             this.c1(se7.b(p0));
             th0 tK1 = this.K;
             this.K = se7.a.p0(p0, tI, tK1, (tJ - tK1));
          }
       }catch(p.re7 e1){
          this.K = tK;
          this.J0(p0, e1);
       }catch(java.lang.IndexOutOfBoundsException e7){
          throw new mf3(e7);
       }
       return;
    }
    public final void a1(int p0,int p1){
       this.c1(((p0 << 3) | p1));
    }
    public final void b1(int p0,int p1){
       this.a1(p0, 0);
       this.c1(p1);
    }
    public final void c1(int p0){
       th0 tI;
       th0 tK;
       try{
          while (true) {
             int i = p0 & 0x80;
             tI = this.I;
             if (!i) {
                break ;
             }else {
                tK = this.K;
                int i1 = tK + 1;
                this.K = i1;
                i1 = p0 & 0x7f;
                i1 = i1 | 0x0080;
                tI[tK] = (byte)i1;
                p0 = p0 >> 7;
             }
          }
          tK = this.K;
          this.K = tK + 1;
          tI[tK] = (byte)p0;
          return;
       }catch(java.lang.IndexOutOfBoundsException e5){
          Object[] objArray = new Object[]{Integer.valueOf(this.K),Integer.valueOf(this.J),Integer.valueOf(1)};
          throw new mf3(String.format("Pos: %d, limit: %d, len: %d", objArray), e5);
       }
    }
    public final void d1(int p0,long p1){
       this.a1(p0, 0);
       this.e1(p1);
    }
    public final void e1(long p0){
       long l1;
       th0 tK;
       long l = 7;
       th0 tJ = this.J;
       th0 tI = this.I;
       if (vh0.H && ((tJ - this.K)) >= 10) {
          while (true) {
             l1 = p0 & -128;
             if (!(l1)) {
                break ;
             }else {
                tK = this.K;
                int i = tK + 1;
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
          return;
       }else {
          try{
             while (true) {
                l1 = p0 & -128;
                if (!(l1)) {
                   break ;
                }else {
                   tK = this.K;
                   int i2 = tK + 1;
                   this.K = i2;
                   i2 = (int)p0 & 0x7f;
                   i2 = i2 | 0x0080;
                   tI[tK] = (byte)i2;
                   p0 = p0 >> l;
                }
             }
             tK = this.K;
             this.K = tK + 1;
             tI[tK] = (byte)(int)p0;
             return;
          }catch(java.lang.IndexOutOfBoundsException e11){
             Object[] objArray = new Object[]{Integer.valueOf(this.K),Integer.valueOf(tJ),Integer.valueOf(1)};
             throw new mf3(String.format("Pos: %d, limit: %d, len: %d", objArray), e11);
          }
       }
    }
    public final void f1(byte[] p0,int p1,int p2){
       try{
          System.arraycopy(p0, p1, this.I, this.K, p2);
          this.K = this.K + p2;
          return;
       }catch(java.lang.IndexOutOfBoundsException e4){
          Object[] objArray = new Object[]{Integer.valueOf(this.K),Integer.valueOf(this.J),Integer.valueOf(p2)};
          throw new mf3(String.format("Pos: %d, limit: %d, len: %d", objArray), e4);
       }
    }
    public final void l0(byte[] p0,int p1,int p2){
       this.f1(p0, p1, p2);
    }
}
