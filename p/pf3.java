package p.pf3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Integer;

public final class pf3	// class@00224e from classes.dex
{
    public final int a;
    public final int b;
    public static final pf3 c;

    static {
       pf3.c = new pf3(0, 0);
    }
    public void pf3(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.getClass() != pf3.class) {
          return false;
       }
       if (p0.a != this.a || p0.b != this.b) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b + this.a);
    }
    public final String toString(){
       if (this == pf3.c) {
          return "EMPTY";
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.a),Integer.valueOf(this.b)};
       return String.format("\(enabled=0x%x,disabled=0x%x\)", objArray);
    }
}
