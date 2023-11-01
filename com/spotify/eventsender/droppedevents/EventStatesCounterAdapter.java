package com.spotify.eventsender.droppedevents.EventStatesCounterAdapter;
import com.google.gson.b;
import p.jg3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tv1;
import p.ef1;
import java.lang.IllegalStateException;
import p.wg3;
import java.lang.Integer;
import java.lang.Number;

public final class EventStatesCounterAdapter extends b	// class@0008a5 from classes.dex
{

    public void EventStatesCounterAdapter(){
       super();
    }
    public final Object b(jg3 p0){
       co5.o(p0, "input");
       tv1 otv1 = new tv1();
       p0.f();
       while (true) {
          if (p0.h0()) {
             if (co5.c(p0.o0(), "c")) {
                p0.b();
                while (true) {
                   if (p0.h0()) {
                      p0.b();
                      if (!p0.h0()) {
                         throw new IllegalStateException("No index in saved state".toString());
                      }
                      int i = p0.m0();
                      if (p0.h0()) {
                         p0.J();
                         otv1.a[i] = new ef1(p0.n0(), 0);
                      }else {
                         break ;
                      }
                   }else {
                      p0.J();
                   }
                }
                throw new IllegalStateException("No count in saved state".toString());
             }
          }else {
             p0.T();
             return otv1;
          }
       }
    }
    public final void c(wg3 p0,Object p1){
       co5.o(p0, "out");
       co5.o(p1, "value");
       p0.x();
       p0.g0("c");
       p0.f();
       p1 = p1.a;
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (oobject.b()) {
             p0.f();
             p0.m0(Integer.valueOf(i));
             p0.k0(oobject.b());
             p0.J();
          }
          i = i + 1;
       }
       p0.J();
       p0.T();
       return;
    }
}
