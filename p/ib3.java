package p.ib3;
import p.gb3;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ib3 extends gb3	// class@00195e from classes.dex
{
    public static final ib3 t;

    static {
       ib3.t = new ib3(1, 0);
    }
    public void ib3(int p0,int p1){
       super(p0, p1, 1);
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof ib3 && (this.isEmpty() && (p0.isEmpty() || (this.a == p0.a && this.b == p0.b))))? true: false;
       return b;
    }
    public final int hashCode(){
       int i = (this.isEmpty())? -1: (this.a * 31) + this.b;
       return i;
    }
    public final boolean isEmpty(){
       boolean b = (this.a > this.b)? true: false;
       return b;
    }
    public final String toString(){
       return this.a+".."+this.b;
    }
}
