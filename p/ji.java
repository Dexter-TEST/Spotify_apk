package p.ji;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.ki;

public final class ji implements Serializable	// class@001ae5 from classes.dex
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String t;

    public void ji(String p0,boolean p1,boolean p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    private final Object readResolve(){
       return new ki(this.a, this.b, this.c, this.t);
    }
}
