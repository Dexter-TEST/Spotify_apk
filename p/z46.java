package p.z46;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class z46	// class@002e88 from classes.dex
{
    public final int a;
    public final boolean b;

    public void z46(int p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof z46) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       z46 tb;
       int i = this.a * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public final String toString(){
       return kg4.p("ScrollState\(positionToScroll="+this.a+", isScrollRequired=", this.b, ')');
    }
}
