package p.jz0;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import p.vr;
import p.ej5;
import p.bs;
import p.as;
import p.iz0;
import java.lang.Long;
import java.lang.Boolean;
import p.rs;

public abstract class jz0	// class@001b71 from classes.dex
{
    public static final Charset a;

    static {
       jz0.a = Charset.forName("UTF-8");
    }
    public void jz0(){
       super();
    }
    public final vr a(long p0,String p1,boolean p2){
       vr h;
       jz0 ojz0 = this;
       ej5 uoej5 = new ej5(ojz0);
       if ((h = ojz0.h) != null) {
          as uoas = new as(h);
          uoas.e = Long.valueOf(p0);
          uoas.a = Boolean.valueOf(p2);
          if (p1 != null) {
             uoas.g = new rs(p1);
             uoas.a();
          }
          uoej5.g = uoas.a();
       }
       return uoej5.b();
    }
}
