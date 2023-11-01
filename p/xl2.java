package p.xl2;
import android.content.Context;
import java.lang.Object;
import android.graphics.Paint;
import p.uw5;
import p.vr2;
import java.util.ArrayList;
import p.nn6;
import p.hp5;
import p.xe7;
import p.ro2;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import p.co5;
import java.lang.System;
import p.j80;
import p.xq2;
import java.io.IOException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import p.g70;
import p.we7;
import p.e70;
import p.g43;
import p.vy;

public final class xl2	// class@002c9c from classes.dex
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public final Object g;
    public Object h;

    public void xl2(Context p0){
       super();
       this.d = 255;
       this.g = new Paint(1);
       this.h = new Paint();
       int i = uw5.k(p0, R.attr.pasteColorBackground);
       this.h.setColor(i);
       this.a = i;
    }
    public void xl2(vr2 p0){
       super();
       this.a = 4096;
       this.b = 4096;
       this.f = new ArrayList();
       this.g = xe7.f(p0);
       ro2[] oro2Array = new ro2[8];
       this.h = oro2Array;
       this.c = 7;
    }
    public final void a(Canvas p0){
       if (this.f != null) {
          p0.drawRect(0, 0, (float)this.c, (float)this.b, this.h);
          p0.restoreToCount(p0.save());
       }
       return;
    }
    public final void b(Canvas p0){
       if (this.f != null) {
          p0.translate(0, (float)(- this.e));
          p0.drawRect(0, 0, (float)this.c, (float)this.b, this.g);
          p0.restoreToCount(p0.save());
       }
       return;
    }
    public final int c(int p0){
       xl2 tc;
       int i = 0;
       if (p0 > 0) {
          int i1 = this.h.length - 1;
          while (true) {
             tc = this.c;
             if (i1 >= tc && p0 > 0) {
                object oobject = this.h[i1];
                co5.i(oobject);
                ro2 c = oobject.c;
                p0 = p0 - c;
                int i2 = this.e - c;
                this.e = i2;
                int i3 = this.d - 1;
                this.d = i3;
                i = i + 1;
                i1 = i1 - 1;
             }else {
                break ;
             }
          }
          xl2 th = this.h;
          System.arraycopy(th, (tc + 1), th, ((tc + 1) + i), this.d);
          this.c = this.c + i;
       }
       return i;
    }
    public final j80 d(int p0){
       ro2 a;
       int i2;
       int i = 1;
       int i1 = (p0 >= 0 && p0 <= (xq2.a.length - i))? 1: 0;
       if (i1) {
          a = xq2.a[p0].a;
       }else if((i2 = (this.c + i) + (p0 - xq2.a.length)) >= 0){
          xl2 th = this.h;
          if (i2 < th.length) {
             object oobject = th[i2];
             co5.i(oobject);
             a = oobject.a;
          }
       }
       throw new IOException(co5.K(Integer.valueOf((p0 + i)), "Header index too large "));
       return a;
    }
    public final void e(ro2 p0){
       ro2 c;
       this.f.add(p0);
       xl2 tb = this.b;
       int i = 0;
       if ((c = p0.c) > tb) {
          xl2 th = this.h;
          Arrays.fill(th, i, th.length, null);
          this.c = this.h.length - 1;
          this.d = i;
          this.e = i;
          return;
       }else {
          this.c(((this.e + c) - tb));
          xl2 th1 = this.h;
          if (((this.d + 1)) > th1.length) {
             ro2[] oro2Array = new ro2[(th1.length * 2)];
             System.arraycopy(th1, i, oro2Array, th1.length, th1.length);
             this.c = this.h.length - 1;
             this.h = oro2Array;
          }
          tb = this.c;
          this.c = tb - 1;
          this.h[tb] = p0;
          this.d = this.d + 1;
          this.e = this.e + c;
          return;
       }
    }
    public final void f(int p0,int p1){
       LinearGradient this.b;
       this.c = p0;
       if (this.b != p1) {
          this.b = p1;
          this.b = new LinearGradient(0, 0, 0, (float)this.b, 0, this.a, Shader$TileMode.CLAMP);
          this.f = this.b;
          this.g.setShader(this.b);
       }
       return;
    }
    public final j80 g(){
       j80 oj80;
       xl2 tg = this.g;
       int i = tg.readByte() & 0x00ff;
       int i1 = 0;
       int i2 = (((i & 0x0080)) == 128)? 1: 0;
       long l = (long)this.h(i, 127);
       if (i2) {
          e70 uoe70 = new e70();
          co5.o(tg, "source");
          vy c = g43.c;
          long l1 = 0;
          vy ovy = c;
          int i3 = 0;
          while ((l1 - l) < 0) {
             l1 = l1 + 1;
             int i4 = tg.readByte() & 0x00ff;
             i1 = i1 << 8;
             i1 = i1 | i4;
             i3 = i3 + 8;
             while (i3 >= 8) {
                i4 = i3 - 8;
                int i5 = i1 >> i4;
                i5 = i5 & 0x00ff;
                ovy = ovy.d;
                co5.i(ovy);
                ovy = ovy[i5];
                co5.i(ovy);
                if (ovy.d == null) {
                   uoe70.v0(ovy.b);
                   i3 = i3 - ovy.c;
                   ovy = c;
                }else {
                   i3 = i4;
                }
             }
          }
          while (i3 > 0) {
             int i6 = i3 - 8;
             i6 = i1 << i6;
             i6 = i6 & 0x00ff;
             vy d = ovy.d;
             co5.i(d);
             object oobject = d[i6];
             co5.i(oobject);
             if (oobject.d == null && oobject.c <= i3) {
                uoe70.v0(oobject.b);
                i3 = i3 - oobject.c;
                ovy = c;
             }else {
                break ;
             }
          }
          oj80 = uoe70.m0();
       }else {
          oj80 = tg.q(l);
       }
       return oj80;
    }
    public final int h(int p0,int p1){
       int i;
       int i1;
       if ((p0 = p0 & p1) < p1) {
          return p0;
       }
       p0 = 0;
       while (true) {
          i = this.g.readByte() & 0x00ff;
          if (i1 = i & 0x0080) {
             i = i & 0x7f;
             i = i << p0;
             p1 = p1 + i;
             p0 = p0 + 7;
          }else {
             break ;
          }
       }
       return (p1 + (i << p0));
    }
}
