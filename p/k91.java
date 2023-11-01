package p.k91;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class k91	// class@001bca from classes.dex
{
    public final Class a;
    public final int b;

    public void k91(int p0,Class p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof k91 && (this.a == p0.a && this.b == p0.b))? true: false;
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ 0x00);
    }
    public final String toString(){
       k91 tb;
       String str1;
       StringBuilder str = "Dependency{anInterface="+this.a+", type=";
       if ((tb = this.b) == true) {
          str1 = "required";
       }else if(tb == null){
          str1 = "optional";
       }else {
          str1 = "set";
       }
       return str+str1+", direct="+true+"}";
    }
}
