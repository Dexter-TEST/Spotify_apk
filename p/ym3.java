package p.ym3;
import p.b5;
import p.an3;
import java.lang.Object;
import p.zu3;
import p.t00;
import p.yu3;
import java.lang.Class;
import p.gv0;
import java.lang.String;
import java.lang.Throwable;
import p.jl;
import com.spotify.base.java.logging.Logger;

public final class ym3 implements b5	// class@002de7 from classes.dex
{
    public final int a;
    public final an3 b;

    public void ym3(an3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       ym3 tb = this.b;
       switch (this.a){
           case 0:
             tb.d.onNext(new yu3());
             return;
           case 1:
             tb.d.onNext(new zu3());
             return;
           default:
             try{
                tb.getClass();
                tb.c.a();
             }catch(java.lang.Exception e0){
                jl.f("Unexpected error", e0);
                Object[] objArray = new Object[0];
                Logger.c(e0, "Unexpected error", objArray);
             }
             return;
       }
    }
}
