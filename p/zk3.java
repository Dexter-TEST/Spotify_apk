package p.zk3;
import p.bl3;
import p.al3;
import p.dl3;
import java.lang.Object;
import p.cl3;

public final class zk3 extends bl3	// class@002f13 from classes.dex
{
    public final int v;

    public void zk3(al3 p0){
       this.v = 0;
       super(p0.b);
    }
    public void zk3(al3 p0,int p1){
       this.v = 1;
       super(p0.b);
    }
    public final Object next(){
       switch (this.v){
           case 0:
           default:
             return this.a().w;
       }
       return this.a();
    }
}
