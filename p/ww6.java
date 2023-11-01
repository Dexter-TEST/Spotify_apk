package p.ww6;
import p.fh2;
import p.du0;
import p.au0;
import java.lang.String;
import p.ux;
import p.ns5;
import java.lang.Class;
import java.lang.Object;
import p.ps5;
import p.co5;

public abstract class ww6 extends du0 implements fh2	// class@002bbf from classes.dex
{
    public final int t;

    public void ww6(au0 p0){
       super(p0);
       this.t = 2;
    }
    public final int getArity(){
       return this.t;
    }
    public final String toString(){
       String str;
       if (this.a == null) {
          ns5.a.getClass();
          str = ps5.a(this);
          co5.l(str, "renderLambdaToString\(this\)");
       }else {
          str = super.toString();
       }
       return str;
    }
}
