package p.pb7;
import p.gb7;
import p.kb7;
import p.hb7;
import java.util.ArrayList;
import p.ib7;
import java.lang.Object;
import java.lang.Class;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class pb7 extends gb7	// class@00222f from classes.dex
{
    public final ib7 d;

    public void pb7(kb7 p0,hb7 p1,ArrayList p2,ib7 p3){
       super(p0, p1, p2);
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || !co5.c(pb7.class, p0.getClass())) {
          return b;
       }
       if (!super.equals(p0)) {
          return b;
       }
       return co5.c(this.d, p0.d);
    }
    public final int hashCode(){
       return (this.d.hashCode() + (super.hashCode() * 31));
    }
    public final String toString(){
       return "interaction = "+this.d+' '+super.toString();
    }
}
