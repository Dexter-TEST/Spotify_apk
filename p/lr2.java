package p.lr2;
import p.i07;
import java.lang.String;
import p.tr2;
import java.lang.Class;
import java.lang.Object;
import p.as2;
import java.io.IOException;

public final class lr2 extends i07	// class@0002a6 from classes2.dex
{
    public final tr2 e;
    public final int f;
    public final int g;

    public void lr2(String p0,tr2 p1,int p2,int p3){
       this.e = p1;
       this.f = p2;
       this.g = p3;
       super(p0, true);
    }
    public final long a(){
       lr2 tf = this.f;
       lr2 tg = this.g;
       lr2 te = this.e;
       try{
          te.getClass();
          te.P.T(tf, true, tg);
       }catch(java.io.IOException e0){
          te.f(e0);
       }
       return -1;
    }
}
