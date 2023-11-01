package p.gb7;
import p.kb7;
import p.hb7;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Iterable;
import p.zf2;
import p.dj0;
import p.hr7;

public abstract class gb7	// class@0016db from classes.dex
{
    public final kb7 a;
    public final hb7 b;
    public final List c;

    public void gb7(kb7 p0,hb7 p1,ArrayList p2){
       co5.o(p0, "location");
       co5.o(p2, "errors");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       Class class = this.getClass();
       Class class1 = (p0 != null)? p0.getClass(): null;
       if (!co5.c(class, class1)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type com.spotify.ubi.android.eventdefinitions.UbiEvent<*, *>");
          if (!co5.c(this.a, p0.a)) {
             return false;
          }else if(!co5.c(this.b, p0.b)){
             return false;
          }else if(!co5.c(this.c, p0.c)){
             return false;
          }else {
             return true;
          }
       }
    }
    public int hashCode(){
       return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }
    public String toString(){
       StringBuilder str = "{where="+this.a+"; parent="+this.b;
       String str1 = (this.c.isEmpty())? "": "; errors=".concat(dj0.q0(this.c, ";", null, null, null, 62));
       return hr7.a(str, str1, '}');
    }
}
