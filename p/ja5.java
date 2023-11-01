package p.ja5;
import java.io.Serializable;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ka5;

public final class ja5 implements Serializable	// class@001a9b from classes.dex
{
    public final HashMap a;

    public void ja5(HashMap p0){
       co5.o(p0, "proxyEvents");
       super();
       this.a = p0;
    }
    private final Object readResolve(){
       return new ka5(this.a);
    }
}
