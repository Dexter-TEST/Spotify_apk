package p.la;
import p.ma;
import p.j46;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class la extends ma	// class@001d1a from classes.dex
{
    public final j46 a;

    public void la(j46 p0){
       co5.o(p0, "item");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof la) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "SingleItemPickerItemClicked\(item="+this.a+')';
    }
}
