package p.ms;
import p.az0;
import java.lang.String;
import p.i73;
import java.lang.Object;
import java.lang.StringBuilder;

public final class ms extends az0	// class@001efb from classes.dex
{
    public final String a;
    public final int b;
    public final i73 c;

    public void ms(String p0,int p1,i73 p2){
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
       if (!p0 instanceof az0) {
          return false;
       }
       if (!this.a.equals(p0.a) || (this.b != p0.b || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return "Thread{name="+this.a+", importance="+this.b+", frames="+this.c+"}";
    }
}
