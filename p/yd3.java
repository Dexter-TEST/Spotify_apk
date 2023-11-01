package p.yd3;
import p.ve5;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.xd3;
import java.lang.Integer;

public class yd3 extends ve5	// class@002d96 from classes.dex
{

    public void yd3(){
       super();
    }
    public final void a(Throwable p0,Throwable p1){
       co5.o(p0, "cause");
       co5.o(p1, "exception");
       Integer a = ((a = xd3.a) != null && a.intValue() < 19)? 0: 1;
       if (a) {
          p0.addSuppressed(p1);
       }else {
          super.a(p0, p1);
       }
       return;
    }
}
