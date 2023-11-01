package p.mh2;
import p.zv6;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler;
import p.q36;
import p.p36;
import p.o36;
import p.r36;
import p.aa2;

public final class mh2 implements zv6	// class@001e95 from classes.dex
{
    public final int a;

    public void mh2(int p0){
       this.a = p0;
       super();
    }
    public final Scheduler a(){
       switch (this.a){
           case 2:
             return o36.a;
           case 3:
             return p36.a;
           case 4:
             return q36.a;
           default:
             return r36.a;
       }
    }
    public final Object get(){
       switch (this.a){
           case 0:
             return null;
           case 1:
             return new aa2();
           case 2:
             return this.a();
           case 3:
             return this.a();
           case 4:
             return this.a();
           default:
             return this.a();
       }
    }
}
