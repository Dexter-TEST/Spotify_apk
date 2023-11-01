package p.cq5;
import p.gl6;
import p.fl6;
import java.lang.Object;
import p.tp5;
import p.co5;

public final class cq5 implements gl6	// class@00125b from classes.dex
{
    public final fl6 a;

    public void cq5(fl6 p0){
       this.a = p0;
    }
    public final Object a(tp5 p0){
       return this.a;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof cq5 || !co5.c(this.a, p0.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
