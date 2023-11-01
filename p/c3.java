package p.c3;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.d3;

public final class c3 implements Serializable	// class@00118f from classes.dex
{
    public final String a;
    public final String b;

    public void c3(String p0,String p1){
       co5.o(p1, "appId");
       super();
       this.a = p0;
       this.b = p1;
    }
    private final Object readResolve(){
       return new d3(this.a, this.b);
    }
}
