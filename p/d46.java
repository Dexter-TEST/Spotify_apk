package p.d46;
import p.ex0;
import p.i0;
import p.au0;
import p.xw0;
import java.lang.Object;
import p.b17;
import p.ye7;
import p.zf2;
import p.w51;

public class d46 extends i0 implements ex0	// class@0012d9 from classes.dex
{
    public final au0 c;

    public void d46(au0 p0,xw0 p1){
       super(p1, true);
       this.c = p0;
    }
    public final boolean A(){
       return true;
    }
    public void M(Object p0){
       this.c.d(b17.w(p0));
    }
    public final ex0 a(){
       d46 tc = this.c;
       if (tc instanceof ex0) {
       }else {
          tc = null;
       }
       return tc;
    }
    public void g(Object p0){
       w51.O(ye7.E(this.c), b17.w(p0), null);
    }
}
