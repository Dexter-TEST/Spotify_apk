package p.x75;
import p.y75;
import java.lang.String;
import java.lang.Object;

public final class x75 extends y75	// class@002c23 from classes.dex
{
    public final String a;

    public void x75(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof x75) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "ValidatePasswordStrength{password=***}";
    }
}
