package p.z75;
import p.c85;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.d85;

public final class z75 extends c85	// class@002ea2 from classes.dex
{
    public final String a;

    public void z75(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(d85 p0,d85 p1,d85 p2){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof z75) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "PasswordChanged{password=***}";
    }
}
