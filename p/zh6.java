package p.zh6;
import p.tw6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.jn5;
import p.ir2;

public final class zh6 implements tw6	// class@002efb from classes.dex
{
    public final String a;
    public final Object[] b;

    public void zh6(String p0){
       co5.o(p0, "query");
       super(p0, null);
    }
    public void zh6(String p0,Object[] p1){
       co5.o(p0, "query");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void b(jn5 p0){
       ir2.h(p0, this.b);
    }
    public final String f(){
       return this.a;
    }
}
