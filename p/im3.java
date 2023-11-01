package p.im3;
import java.util.AbstractList;
import java.util.List;
import java.lang.Object;
import p.ap5;
import java.lang.Math;
import java.math.RoundingMode;
import p.ye7;

public class im3 extends AbstractList	// class@0019c0 from classes.dex
{
    public final List a;
    public final int b;

    public void im3(int p0,List p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final Object get(int p0){
       ap5.f(p0, this.size());
       im3 tb = this.b;
       p0 = p0 * tb;
       im3 ta = this.a;
       return ta.subList(p0, Math.min((tb + p0), ta.size()));
    }
    public final boolean isEmpty(){
       return this.a.isEmpty();
    }
    public final int size(){
       return ye7.s(this.a.size(), this.b, RoundingMode.CEILING);
    }
}
