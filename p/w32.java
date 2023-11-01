package p.w32;
import java.io.File;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class w32	// class@002ab9 from classes.dex
{
    public final File a;
    public final List b;

    public void w32(File p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof w32) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return kg4.o("FilePathComponents\(root="+this.a+", segments=", this.b, ')');
    }
}
