package p.ms3;
import p.qb4;
import java.lang.String;
import java.lang.Object;
import p.tp2;
import p.ac;
import java.util.Objects;
import p.zt;
import p.vt1;
import p.te5;
import p.wk7;
import p.tk7;
import java.lang.Class;
import p.rt1;
import p.vk7;
import p.ht1;
import p.ys1;
import p.jt;
import java.util.Iterator;
import java.util.Set;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import com.spotify.base.java.logging.Logger;
import java.lang.StringBuilder;
import p.xt;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import p.en6;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;

public final class ms3 implements qb4	// class@001ef6 from classes.dex
{
    public final int a;
    public final Object b;

    public void ms3(String p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          super();
          p0 = (p0.isEmpty())? "": tp2.m("[", p0, "] ");
          this.b = p0;
          return;
       }else {
          super();
          this.b = p0;
          return;
       }
    }
    public void ms3(ac p0){
       this.a = 2;
       super();
       this.b = p0;
    }
    public static ms3 h(String p0){
       return new ms3(p0, 0);
    }
    public static ms3 i(String p0){
       return new ms3(p0, 1);
    }
    public final void a(Object p0,Object p1){
       int i;
       switch (this.a){
           case 0:
           case 1:
             Objects.toString(p1);
             break;
           default:
             wk7 s = wk7.S;
             wk7 owk7 = (te5.a(p0.a))? s: new tk7(p0.a);
             p1.getClass();
             if (p1 instanceof rt1) {
                this.g(owk7, s, 39, "skip_next_button");
             }else if(p1 instanceof ht1){
                i = (p0.j != null)? 22: 23;
                this.g(owk7, owk7, i, "play_pause_button");
             }else if(p1 instanceof ys1){
                i = (p0.h != null)? 15: 16;
                this.g(owk7, owk7, i, "heart_button");
             }
             return;
       }
       return;
    }
    public final void b(Object p0,jt p1){
       switch (this.a){
           case 0:
             break;
           case 1:
             Objects.toString(p1.a);
             p0 = p1.b.iterator();
             while (p0.hasNext()) {
                Objects.toString(p0.next());
             }
             return;
             break;
           default:
             return;
       }
       p0 = p1.b.iterator();
       while (p0.hasNext()) {
          p0.next();
       }
       return;
    }
    public final void c(Object p0,Object p1,Exception p2){
       Object[] objArray;
       ms3 tb = this.b;
       switch (this.a){
           case 0:
             objArray = new Object[]{tb,p0,p1};
             Logger.c(p2, "%sFATAL ERROR: exception updating model \'%s\' with event \'%s\'", objArray);
             return;
           case 1:
             objArray = new Object[]{p0,p1};
             Log.e(tb, String.format("FATAL ERROR: exception updating model \'%s\' with event \'%s\'", objArray), p2);
             return;
           default:
             return;
       }
    }
    public final void d(Object p0){
       switch (this.a){
           case 0:
           case 1:
           default:
             return;
       }
       return;
    }
    public final void e(Object p0,Exception p1){
       ms3 tb = this.b;
       switch (this.a){
           case 0:
             Object[] objArray = new Object[]{tb,p0};
             Logger.c(p1, "%sFATAL ERROR: exception during initialization from model \'%s\'", objArray);
             return;
           case 1:
             Log.e(tb, "FATAL ERROR: exception during initialization from model \'"+p0+"\'", p1);
             return;
           default:
             return;
       }
    }
    public final void f(Object p0,Object p1,xt p2){
       switch (this.a){
           case 0:
             break;
           case 1:
             if (p2.b()) {
                Objects.toString(p2.c());
             }
             p0 = p2.b.iterator();
             while (p0.hasNext()) {
                Objects.toString(p0.next());
             }
             return;
             break;
           default:
             return;
       }
       if (p2.b()) {
          p2.c();
       }
       p0 = p2.b.iterator();
       while (p0.hasNext()) {
          p0.next();
       }
       return;
    }
    public final void g(vk7 p0,vk7 p1,int p2,String p3){
       ms3 tb = this.b;
       tb.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/now-playing-bar");
       owo3.h(p0.a());
       owo3.g(p1.a());
       owo3.d("hit");
       owo3.c(en6.e(p2));
       owo3.e(p3);
       tb.a.a(owo3.build());
    }
}
