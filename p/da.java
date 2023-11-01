package p.da;
import p.ma;
import p.de5;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class da extends ma	// class@001311 from classes.dex
{
    public final de5 a;

    public void da(de5 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof da) {
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
       return "InsertItemFromSearch\(itemFromSearch="+this.a+')';
    }
}
