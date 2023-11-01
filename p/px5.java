package p.px5;
import p.fh2;
import p.ox5;
import p.au0;
import java.lang.String;
import p.ux;
import p.ns5;
import java.lang.Class;
import java.lang.Object;
import p.ps5;
import p.co5;

public abstract class px5 extends ox5 implements fh2	// class@0022ee from classes.dex
{
    public final int b;

    public void px5(au0 p0){
       super(p0);
       this.b = 2;
    }
    public final int getArity(){
       return this.b;
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
