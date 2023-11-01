package p.ew6;
import p.aw6;
import java.io.Serializable;
import p.zh0;
import p.dp;
import java.lang.Object;
import p.jg2;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class ew6 implements aw6, Serializable	// class@001511 from classes.dex
{
    public final jg2 a;
    public final aw6 b;

    public void ew6(zh0 p0,dp p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof ew6 && (this.a.equals(p0.a) && this.b.equals(p0.b))) {
          b = true;
       }
       return b;
    }
    public final Object get(){
       return this.a.apply(this.b.get());
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       return "Suppliers.compose\("+this.a+", "+this.b+"\)";
    }
}
