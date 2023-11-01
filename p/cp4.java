package p.cp4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.bi5;
import io.reactivex.rxjava3.core.Observer;
import p.hy4;
import p.nx4;
import p.dv4;
import p.cs4;
import java.lang.Object;
import p.hp4;
import p.bp4;
import p.iy4;

public final class cp4 extends z1	// class@001251 from classes.dex
{
    public final int b;
    public final bi5 c;

    public void cp4(ObservableSource p0,bi5 p1,int p2){
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       cp4 tc = this.c;
       switch (this.b){
           case 0:
             ta.subscribe(new bp4(p0, tc));
             return;
           case 1:
             ta.subscribe(new hp4(p0, tc));
             return;
           case 2:
             ta.subscribe(new cs4(p0, tc, 1));
             return;
           case 3:
             ta.subscribe(new dv4(p0, tc));
             return;
           case 4:
             ta.subscribe(new nx4(p0, tc));
             return;
           case 5:
             ta.subscribe(new hy4(p0, tc));
             return;
           default:
             ta.subscribe(new iy4(p0, tc));
             return;
       }
    }
}
