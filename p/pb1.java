package p.pb1;
import java.io.Serializable;
import p.qb1;
import java.lang.Object;
import java.lang.Comparable;
import java.lang.Integer;
import java.lang.String;

public final class pb1 extends qb1 implements Serializable	// class@002229 from classes.dex
{
    public static final pb1 b;

    static {
       pb1.b = new pb1();
    }
    public void pb1(){
       super(true);
    }
    private Object readResolve(){
       return pb1.b;
    }
    public final Integer a(Comparable p0){
       int i;
       Integer integer;
       if ((i = p0.intValue()) == Integer.MAX_VALUE) {
          integer = null;
       }else {
          i++;
          integer = Integer.valueOf(i);
       }
       return integer;
    }
    public final Integer b(Comparable p0){
       int i;
       Integer integer;
       if ((i = p0.intValue()) == Integer.MIN_VALUE) {
          integer = null;
       }else {
          i--;
          integer = Integer.valueOf(i);
       }
       return integer;
    }
    public final String toString(){
       return "DiscreteDomain.integers\(\)";
    }
}
