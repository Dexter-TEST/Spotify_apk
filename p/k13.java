package p.k13;
import java.lang.Object;
import java.lang.String;
import p.au2;
import p.n13;
import p.co5;
import p.a23;
import java.lang.Class;
import p.o13;
import p.tt2;

public final class k13	// class@001b87 from classes.dex
{

    public void k13(){
       super();
    }
    public static n13 a(String p0,au2 p1){
       co5.o(p0, "name");
       a23.b.getClass();
       return new n13(p0, o13.b(p1));
    }
    public static n13 b(tt2 p0){
       co5.o(p0, "other");
       if (p0 instanceof n13) {
       }else {
          n13 on13 = k13.a(p0.name(), p0.b());
       }
       return p0;
    }
}
