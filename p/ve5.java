package p.ve5;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import p.co5;
import p.ue5;
import java.lang.reflect.Method;
import p.lo5;
import p.h02;

public class ve5	// class@0029d9 from classes.dex
{

    public void ve5(){
       super();
    }
    public void a(Throwable p0,Throwable p1){
       Method a;
       co5.o(p0, "cause");
       co5.o(p1, "exception");
       if ((a = ue5.a) != null) {
          Object[] objArray = new Object[]{p1};
          a.invoke(p0, objArray);
       }
       return;
    }
    public lo5 b(){
       return new h02();
    }
}
