package p.fw6;
import p.aw6;
import java.io.Serializable;
import p.g15;
import java.lang.Object;
import p.io2;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class fw6 implements aw6, Serializable	// class@001651 from classes.dex
{
    public final Object a;

    public void fw6(g15 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 instanceof fw6) {
          return io2.j(this.a, p0.a);
       }
       return false;
    }
    public final Object get(){
       return this.a;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       return "Suppliers.ofInstance\("+this.a+"\)";
    }
}
