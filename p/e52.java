package p.e52;
import java.lang.Runnable;
import java.lang.Object;
import p.f52;
import java.lang.Class;
import p.b52;
import android.content.Context;
import p.si4;
import p.lu;
import p.fh5;
import p.la5;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import p.jf7;
import java.lang.String;
import p.h52;
import java.io.IOException;
import p.pz4;
import p.lz4;
import p.kf6;

public final class e52 implements Runnable	// class@00141e from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;

    public void e52(int p0,Object p1,boolean p2){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       e52 tc;
       int i1;
       lu olu1;
       h52 olu1;
       IOException olu11;
       switch (this.a){
           case 0:
             tc = this.c;
             e52 tb = this.b;
             tc.getClass();
             la5 l = f52.l;
             _monitor_enter(l);
             f52 a = tc.a;
             a.a();
             si4 osi4 = si4.a(a.a);
             lu olu = tc.c.j();
             if (osi4 != null) {
                osi4.e();
             }
             _monitor_exit(l);
             try{
                l = la5.v;
                lu b = olu.b;
                int i = 1;
                if (b == l) {
                   i1 = 1;
                label_0037 :
                   if (!i1) {
                      b = (b == la5.c)? 1: 0;
                      if (!b) {
                         if (tb == null) {
                            tc.d.getClass();
                            olu11 = (TextUtils.isEmpty(olu.c) || ((olu.f + olu.e) - (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + jf7.a)) < 0)? 1: 0;
                            if (!olu11) {
                            }
                         }
                         olu1 = tc.b(olu);
                      label_0077 :
                         tc.d(olu1);
                         b = (olu1.b == la5.t)? 1: 0;
                         if (b) {
                            tc.i(olu1.a);
                         }
                         l = ((b = olu1.b) == l)? 1: 0;
                         if (l) {
                            olu1 = new h52();
                            tc.g();
                         }else if(b != la5.b && b != la5.a){
                            i = 0;
                         }
                         if (i) {
                            olu11 = new IOException("Installation ID could not be validated with the Firebase servers \(maybe it was deleted\). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                            tc.g();
                         }else {
                            tc.h(olu1);
                         }
                      }
                   }
                   olu1 = tc.f(olu);
                   goto label_0077 ;
                }else {
                   i1 = 0;
                   goto label_0037 ;
                }
             }catch(p.h52 e0){
                e0.g();
             }
             break;
           default:
             tc = this.c;
             lz4 b1 = tc.b;
             Object g = (this.b != null)? pz4.G: pz4.H;
             b1.offer(g);
             tc.c();
             return;
       }
       return;
    }
}
