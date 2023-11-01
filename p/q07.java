package p.q07;
import p.i07;
import java.lang.Object;
import java.lang.String;
import p.wf2;
import p.tr2;
import java.lang.Class;
import p.as2;
import java.io.IOException;

public final class q07 extends i07	// class@000307 from classes2.dex
{
    public final int e;
    public final Object f;

    public void q07(int p0,Object p1,String p2){
       this.e = p0;
       this.f = p1;
       super(p2, true);
    }
    public final long a(){
       q07 tf = this.f;
       switch (this.e){
           case 0:
           default:
             try{
                tf.getClass();
                tf.P.T(2, false, false);
             }catch(java.io.IOException e0){
                tf.f(e0);
             }
             return -1;
       }
       tf.invoke();
       return -1;
    }
}
