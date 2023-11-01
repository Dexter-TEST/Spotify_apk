package p.zb1;
import p.i07;
import java.lang.Object;
import java.lang.String;
import p.op5;
import java.lang.System;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.np5;
import p.co5;
import java.util.ArrayList;
import java.net.Socket;
import p.we7;
import p.r07;
import p.dc1;
import p.i20;
import p.el6;
import p.gp5;
import p.xe7;

public final class zb1 extends i07	// class@0003f0 from classes2.dex
{
    public final int e;
    public final Object f;

    public void zb1(int p0,Object p1,String p2){
       this.e = p0;
       this.f = p1;
       super(p2, true);
    }
    private long b(){
       zb1 tf = this.f;
       long l = System.nanoTime();
       Iterator iterator = tf.e.iterator();
       int i = 0;
       long l1 = Long.MIN_VALUE;
       np5 onp5 = null;
       int i1 = 0;
       while (iterator.hasNext()) {
          np5 onp51 = iterator.next();
          co5.l(onp51, "connection");
          _monitor_enter(onp51);
          if (tf.b(onp51, l) > 0) {
             i1 = i1 + 1;
          }else {
             i = i + 1;
             long l2 = l - onp51.q;
             if ((l2 - l1) > 0) {
                onp5 = onp51;
                l1 = l2;
             }
          }
          _monitor_exit(onp51);
       }
       op5 b = tf.b;
       if ((l1 - b) < 0 && i <= tf.a) {
          if (i > 0) {
             b = b - l1;
          }else if(i1 > 0){
             b = -1;
          }
       }else {
          co5.i(onp5);
          _monitor_enter(onp5);
          if ((onp5.p.isEmpty() ^ 1)) {
             _monitor_exit(onp5);
          }else if((onp5.q + l1) - l){
             _monitor_exit(onp5);
          }else {
             onp5.j = true;
             tf.e.remove(onp5);
             _monitor_exit(onp5);
             np5 d = onp5.d;
             co5.i(d);
             we7.e(d);
             if (tf.e.isEmpty()) {
                tf.c.a();
             }
          }
          b = 0;
       }
       return b;
    }
    public final long a(){
       switch (this.e){
           case 0:
             zb1 tf = this.f;
             _monitor_enter(tf);
             if (tf.F != null && tf.G == null) {
                int i = 1;
                try{
                   tf.n0();
                }catch(java.io.IOException e0){
                   e0.H = i;
                }
                try{
                   if (e0.T()) {
                      e0.k0();
                      e0.C = 0;
                   }
                }catch(java.io.IOException e0){
                   e0.I = i;
                   e0.A = xe7.d(new i20());
                }
                _monitor_exit(e0);
             }else {
                _monitor_exit(tf);
             }
             break;
           default:
             return this.b();
       }
       return -1;
    }
}
