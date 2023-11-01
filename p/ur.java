package p.ur;
import p.nt0;
import java.lang.String;
import p.m73;
import java.lang.Object;
import java.lang.Class;
import java.util.Map;
import p.w51;
import java.lang.StringBuilder;
import p.en6;

public final class ur extends nt0	// class@00290b from classes.dex
{
    public final String a;
    public final String b;
    public final m73 c;
    public final String d;

    public void ur(String p0,String p1,m73 p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof nt0) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          ur tc = this.c;
          tc.getClass();
          if (w51.q(tc, p0.c) && this.d.equals(p0.d)) {
          label_003d :
             return b;
          }
       }
       b = false;
       goto label_003d ;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return en6.p("ContextTrack{uri="+this.a+", uid="+this.b+", metadata="+this.c+", provider=", this.d, "}");
    }
}
