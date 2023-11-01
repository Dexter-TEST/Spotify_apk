package p.up2;
import java.lang.Object;
import java.lang.Class;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class up2	// class@0028f4 from classes.dex
{
    public boolean a;
    public boolean b;
    public int c;
    public ArrayList d;

    public void up2(){
       super();
    }
    public final boolean equals(Object p0){
       byte[] uobyteArray1;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || up2.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       ListIterator listIterator = this.d.listIterator();
       p0 = p0.d.listIterator();
       do {
          if (listIterator.hasNext() && p0.hasNext()) {
             byte[] uobyteArray = listIterator.next();
             uobyteArray1 = p0.next();
             if (uobyteArray == null) {
             }else if(!Arrays.equals(uobyteArray, uobyteArray1)){
             }
             break ;
          }else if(!listIterator.hasNext() && !p0.hasNext()){
             b = false;
          }
          return b;
       } while (uobyteArray1 != null);
       return false;
    }
    public final int hashCode(){
       up2 td;
       int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
       int i1 = ((td = this.d) != null)? td.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return "Array{nal_unit_type="+this.c+", reserved="+this.b+", array_completeness="+this.a+", num_nals="+this.d.size()+'}';
    }
}
