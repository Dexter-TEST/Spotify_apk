package p.ui;
import p.ou0;
import p.pu0;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ui	// class@0028bb from classes.dex
{
    public final ou0 a;
    public final pu0 b;

    public void ui(ou0 p0,pu0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ui) {
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
       ui tb;
       int i = this.a.hashCode() * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "SectionFieldMapping\(section="+this.a+", field="+this.b+')';
    }
}
