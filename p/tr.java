package p.tr;
import p.gt0;
import java.lang.String;
import p.r45;
import p.m73;
import java.lang.Object;
import java.lang.Class;
import java.util.Map;
import p.w51;
import java.lang.StringBuilder;

public final class tr extends gt0	// class@0027cd from classes.dex
{
    public final String a;
    public final String b;
    public final r45 c;
    public final m73 d;

    public void tr(String p0,String p1,r45 p2,m73 p3){
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
       if (!p0 instanceof gt0) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && this.c.equals(p0.c))) {
          tr td = this.d;
          td.getClass();
          if (w51.q(td, p0.d)) {
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
       return "ContextPage{pageUrl="+this.a+", nextPageUrl="+this.b+", tracks="+this.c+", metadata="+this.d+"}";
    }
}
