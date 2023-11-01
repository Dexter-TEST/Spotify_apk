package p.bm3;
import p.em3;
import p.h51;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class bm3 extends em3	// class@0010f1 from classes.dex
{
    public final h51 a;

    public void bm3(){
       super();
       this.a = h51.c;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 != null && bm3.class == p0.getClass()) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() + (bm3.class.getName().hashCode() * 31));
    }
    public final String toString(){
       return "Failure {mOutputData="+this.a+'}';
    }
}
