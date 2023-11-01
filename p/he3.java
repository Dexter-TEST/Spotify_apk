package p.he3;
import java.io.Serializable;
import java.lang.reflect.Type;
import p.dw5;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.fa7;

public abstract class he3 extends dw5 implements Serializable, Type	// class@001835 from classes.dex
{
    public final Class a;
    public final int b;
    public final Object c;
    public final Object t;
    public final boolean v;

    public void he3(Class p0,int p1,Object p2,Object p3,boolean p4){
       super();
       this.a = p0;
       this.b = p0.getName().hashCode() + p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public he3 a(){
       return this.g();
    }
    public he3 d(){
       return null;
    }
    public abstract StringBuilder e(StringBuilder p0);
    public abstract boolean equals(Object p0);
    public abstract StringBuilder f(StringBuilder p0);
    public he3 g(){
       return null;
    }
    public boolean h(){
       boolean b = (this.t == null && this.c == null)? false: true;
       return b;
    }
    public final int hashCode(){
       return this.b;
    }
    public final boolean i(Class p0){
       boolean b = (this.a == p0)? true: false;
       return b;
    }
    public abstract boolean j();
    public final boolean k(){
       boolean b = (this.a == Object.class)? true: false;
       return b;
    }
    public final boolean l(){
       return this.a.isPrimitive();
    }
    public abstract he3 m(Class p0,fa7 p1,he3 p2,he3[] p3);
    public abstract he3 n();
}
