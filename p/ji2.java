package p.ji2;
import java.lang.Comparable;
import p.ub3;
import p.cq7;
import java.lang.Object;

public final class ji2 implements Comparable	// class@001adf from classes.dex
{
    public final int a;
    public final cq7 b;
    public final boolean c;

    public void ji2(ub3 p0,int p1,cq7 p2,boolean p3,boolean p4){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public final int compareTo(Object p0){
       return (this.a - p0.a);
    }
}
