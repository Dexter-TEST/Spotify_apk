package p.wj5;
import p.yf2;
import p.uj5;
import java.lang.Object;
import p.r45;
import p.u65;
import p.w87;
import java.lang.Class;
import p.u73;
import p.bk5;
import java.lang.String;
import p.ak5;
import java.lang.Throwable;

public final class wj5 implements yf2	// class@002b4c from classes.dex
{
    public final int a;
    public final uj5 b;

    public void wj5(uj5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       bk5 uobk5;
       int i = 0;
       wj5 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             Object[] objArray1 = new Object[]{tb.H,p0.getMessage()};
             return new ak5(String.format("Error fetching creative Id %s. %s", objArray1));
       }
       if (p0.c()) {
          u65 a = p0.b().a;
          a.getClass();
          p0 = p0.b().b;
          p0.getClass();
          uobk5 = new bk5(a, p0);
       }else {
          Object[] objArray = new Object[]{tb.H};
          uobk5 = new ak5(String.format("No message found with creative id %s.", objArray));
       }
       return uobk5;
    }
}
