package p.as2;
import java.io.Closeable;
import p.fr2;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import p.f70;
import java.lang.Object;
import p.e70;
import p.wq2;
import java.util.ArrayList;
import java.lang.Math;
import p.el6;
import java.io.IOException;
import p.qc6;
import p.co5;
import java.util.Arrays;
import p.mo1;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.util.logging.Level;
import p.we7;
import java.lang.StringBuilder;

public final class as2 implements Closeable	// class@00016b from classes2.dex
{
    public final f70 a;
    public final boolean b;
    public final e70 c;
    public int t;
    public boolean v;
    public final wq2 w;
    public static final Logger x;

    static {
       as2.x = Logger.getLogger(fr2.class.getName());
    }
    public void as2(f70 p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
       e70 uoe70 = new e70();
       this.c = uoe70;
       this.t = 0x4000;
       this.w = new wq2(uoe70);
    }
    public synchronized final void J(int p0,ArrayList p1,boolean p2){
       if (this.v != null) {
          throw new IOException("closed");
       }
       this.w.d(p1);
       e70 b = this.c.b;
       long l = Math.min((long)this.t, b);
       int i = (!(p1 = b - l))? 4: 0;
       if (p2) {
          i = i | 0x01;
       }
       this.x(p0, (int)l, 1, i);
       this.a.I(this.c, l);
       if (p1 > 0) {
          this.j0(p0, (b - l));
       }
       return;
    }
    public synchronized final void T(int p0,boolean p1,int p2){
       if (this.v != null) {
          throw new IOException("closed");
       }
       int i = (p1)? 1: 0;
       this.x(0, 8, 6, i);
       this.a.writeInt(p0);
       this.a.writeInt(p2);
       this.a.flush();
       return;
    }
    public synchronized final void b(qc6 p0){
       wq2 e;
       co5.o(p0, "peerSettings");
       if (this.v != null) {
          throw new IOException("closed");
       }
       as2 tt = this.t;
       qc6 a = p0.a;
       if ((a & 0x20)) {
          tt = p0.b[5];
       }
       this.t = tt;
       int i = ((a & 0x02))? p0.b[1]: -1;
       if (i != -1) {
          tt = this.w;
          int i1 = ((a & 0x02))? p0.b[1]: -1;
          tt.getClass();
          i1 = Math.min(i1, 0x4000);
          if ((e = tt.e) != i1) {
             if (i1 < e) {
                tt.c = Math.min(tt.c, i1);
             }
             tt.d = true;
             tt.e = i1;
             e = tt.i;
             if (i1 < e) {
                if (!i1) {
                   wq2 f = tt.f;
                   Arrays.fill(f, 0, f.length, null);
                   tt.g = tt.f.length - 1;
                   tt.h = 0;
                   tt.i = 0;
                }else {
                   tt.a((e - i1));
                }
             }
          }
       }
       this.x(0, 0, 4, 1);
       this.a.flush();
       return;
    }
    public synchronized final void close(){
       this.v = true;
       this.a.close();
    }
    public synchronized final void f(boolean p0,int p1,e70 p2,int p3){
       if (this.v != null) {
          throw new IOException("closed");
       }
       this.x(p1, p3, 0, p0);
       if (p3 > 0) {
          co5.i(p2);
          this.a.I(p2, (long)p3);
       }
       return;
    }
    public synchronized final void flush(){
       if (this.v != null) {
          throw new IOException("closed");
       }
       this.a.flush();
       return;
    }
    public synchronized final void g0(int p0,mo1 p1){
       co5.o(p1, "errorCode");
       if (this.v != null) {
          throw new IOException("closed");
       }
       int i = (p1.a != -1)? 1: 0;
       if (i) {
          this.x(p0, 4, 3, 0);
          this.a.writeInt(p1.a);
          this.a.flush();
          return;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public synchronized final void h0(qc6 p0){
       co5.o(p0, "settings");
       if (this.v != null) {
          throw new IOException("closed");
       }
       this.x(0, (Integer.bitCount(p0.a) * 6), 4, 0);
       int i = 0;
       while (i < 10) {
          int i1 = i + 1;
          int i2 = 1;
          int i3 = i2 << i;
          if (!(i3 = i3 & p0.a)) {
             i2 = 0;
          }
          if (i2) {
             if (i != 4) {
                i2 = (i != 7)? i: 4;
             }else {
                i2 = 3;
             }
             this.a.writeShort(i2);
             this.a.writeInt(p0.b[i]);
          }
          i = i1;
       }
       this.a.flush();
       return;
    }
    public synchronized final void i0(int p0,long p1){
       if (this.v != null) {
          throw new IOException("closed");
       }
       int i = ((p1) && (p1 - 0x7fffffff) <= 0)? 1: 0;
       if (i) {
          this.x(p0, 4, 8, 0);
          this.a.writeInt((int)p1);
          this.a.flush();
          return;
       }else {
          throw new IllegalArgumentException(co5.K(Long.valueOf(p1), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
       }
    }
    public final void j0(int p0,long p1){
       while (true) {
          int i = 0;
          if ((p1 - i) > 0) {
             long l = Math.min((long)this.t, p1);
             p1 = p1 - l;
             int i1 = (int)l;
             i = (!(p1 - i))? 4: 0;
             this.x(p0, i1, 9, i);
             this.a.I(this.c, l);
          }else {
             break ;
          }
       }
       return;
    }
    public final void x(int p0,int p1,int p2,int p3){
       Logger x = as2.x;
       boolean b = false;
       if (x.isLoggable(Level.FINE)) {
          x.fine(fr2.a(b, p0, p1, p2, p3));
       }
       int i = (p1 <= this.t)? 1: 0;
       if (i) {
          if (!((Integer.MIN_VALUE & p0))) {
             b = true;
          }
          if (b) {
             as2 ta = this.a;
             co5.o(ta, "<this>");
             ta.writeByte(((p1 >> 16) & 0x00ff));
             ta.writeByte(((p1 >> 8) & 0x00ff));
             ta.writeByte((p1 & 0x00ff));
             ta.writeByte((p2 & 0x00ff));
             ta.writeByte((p3 & 0x00ff));
             ta.writeInt((p0 & Integer.MAX_VALUE));
             return;
          }else {
             throw new IllegalArgumentException(co5.K(Integer.valueOf(p0), "reserved bit set: ").toString());
          }
       }else {
          throw new IllegalArgumentException("FRAME_SIZE_ERROR length > "+this.t+": "+p1.toString());
       }
    }
    public synchronized final void y(int p0,mo1 p1,byte[] p2){
       co5.o(p2, "debugData");
       if (this.v != null) {
          throw new IOException("closed");
       }
       int i = 0;
       int i1 = (p1.a != -1)? 1: 0;
       if (i1) {
          this.x(i, (p2.length + 8), 7, i);
          this.a.writeInt(p0);
          this.a.writeInt(p1.a);
          if (!p2.length) {
             i = 1;
          }
          if ((i ^ 0x01)) {
             this.a.write(p2);
          }
          this.a.flush();
          return;
       }else {
          throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
       }
    }
}
