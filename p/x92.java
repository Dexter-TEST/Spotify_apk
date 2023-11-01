package p.x92;
import p.bn5;
import java.util.concurrent.atomic.AtomicReference;
import p.zv6;
import java.lang.Object;
import p.iv6;
import p.y92;
import p.v92;
import java.lang.Throwable;
import p.co5;
import p.rl1;
import p.kv6;
import p.t92;
import java.lang.System;

public final class x92 implements bn5	// class@002c31 from classes.dex
{
    public final AtomicReference a;
    public final zv6 b;

    public void x92(AtomicReference p0,zv6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void subscribe(iv6 p0){
       y92 oy92;
       t92 ot92;
       t92[] ot92Array;
       while (true) {
          x92 ta = this.a;
          if ((oy92 = ta.get()) == null) {
             y92 oy921 = new y92(this.b.get(), ta);
             while (true) {
                if (ta.compareAndSet(null, oy921)) {
                   ta = 1;
                }else {
                   if (ta.get() != null) {
                      ot92 = 0;
                   }
                }
                if (!ta) {
                }else {
                   oy92 = oy921;
                }
             }
             oy92.b(ot92);
             return;
          }else {
             break ;
          }
       }
       ot92 = new t92(oy92, p0);
       p0.onSubscribe(ot92);
       while (true) {
          y92 c = oy92.c;
          if ((ot92Array = c.get()) == y92.z) {
             break ;
          }else {
             int len = ot92Array.length;
             int i = len + 1;
             t92[] ot92Array1 = new t92[i];
             System.arraycopy(ot92Array, 0, ot92Array1, 0, len);
             ot92Array1[len] = ot92;
             while (true) {
                if (c.compareAndSet(ot92Array, ot92Array1)) {
                   c = 1;
                }else {
                   if (c.get() != ot92Array) {
                      c = 0;
                   }else {
                      continue ;
                   }
                }
             }
             if (c) {
             }else {
                continue ;
             }
          }
       }
       if (ot92.isDisposed()) {
       }else {
          oy92.a();
          oy92.a.g(ot92);
          return;
       }
    }
}
