package p.ls;
import p.yy0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class ls extends yy0	// class@001db8 from classes.dex
{
    public final String a;
    public final String b;
    public final long c;

    public void ls(String p0,String p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof yy0) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (this.c - p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       ls tc = this.c;
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ (int)((tc >> 32) ^ tc));
    }
    public final String toString(){
       return "Signal{name="+this.a+", code="+this.b+", address="+this.c+"}";
    }
}
