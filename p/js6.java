package p.js6;
import java.io.Serializable;
import p.mg3;
import java.lang.Object;
import java.lang.Class;
import p.he3;
import p.m00;
import p.gb6;
import p.rf3;
import p.m14;
import p.tf3;

public abstract class js6 extends mg3 implements Serializable	// class@001b39 from classes.dex
{
    public final Class a;
    public static final Object b;

    static {
       js6.b = new Object();
    }
    public void js6(Class p0){
       super();
       this.a = p0;
    }
    public void js6(Class p0,int p1){
       super();
       this.a = p0;
    }
    public void js6(he3 p0){
       super();
       this.a = p0.a;
    }
    public static rf3 c(m00 p0,gb6 p1,Class p2){
       if (p0 != null) {
          p1.getClass();
          return p0.d(null, p2);
       }else {
          p1.getClass();
          throw null;
       }
    }
    public void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       p0.getClass();
    }
    public final Class handledType(){
       return this.a;
    }
}
