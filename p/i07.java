package p.i07;
import java.lang.String;
import java.lang.Object;
import p.co5;

public abstract class i07	// class@000233 from classes2.dex
{
    public final String a;
    public final boolean b;
    public r07 c;
    public long d;

    public void i07(String p0,boolean p1){
       co5.o(p0, "name");
       super();
       this.a = p0;
       this.b = p1;
       this.d = -1;
    }
    public abstract long a();
    public final String toString(){
       return this.a;
    }
}
