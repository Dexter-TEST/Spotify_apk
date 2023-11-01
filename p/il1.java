package p.il1;
import p.xw0;
import java.io.Serializable;
import java.lang.Object;
import p.ng2;
import java.lang.String;
import p.co5;
import p.ww0;
import p.vw0;

public final class il1 implements xw0, Serializable	// class@0019b5 from classes.dex
{
    public static final il1 a;

    static {
       il1.a = new il1();
    }
    public void il1(){
       super();
    }
    private final Object readResolve(){
       return il1.a;
    }
    public final Object J(Object p0,ng2 p1){
       return p0;
    }
    public final xw0 T(xw0 p0){
       co5.o(p0, "context");
       return p0;
    }
    public final vw0 f(ww0 p0){
       co5.o(p0, "key");
       return null;
    }
    public final int hashCode(){
       return 0;
    }
    public final String toString(){
       return "EmptyCoroutineContext";
    }
    public final xw0 y(ww0 p0){
       co5.o(p0, "key");
       return this;
    }
}
