package p.qu;
import p.kf5;
import java.lang.String;
import com.google.common.collect.d;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class qu extends kf5	// class@00241c from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d g;
    public final String h;

    public void qu(String p0,String p1,String p2,String p3,String p4,String p5,d p6,String p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof kf5) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || (!this.e.equals(p0.e) || (!this.f.equals(p0.f) || (!this.g.equals(p0.g) || !this.h.equals(p0.h)))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ this.f.hashCode()) * 0xf4243) ^ this.g.hashCode()) * 0xf4243) ^ this.h.hashCode());
    }
    public final String toString(){
       return en6.p("PlayOrigin{featureIdentifier="+this.a+", featureVersion="+this.b+", viewUri="+this.c+", externalReferrer="+this.d+", referrerIdentifier="+this.e+", deviceIdentifier="+this.f+", featureClasses="+this.g+", restrictionIdentifier=", this.h, "}");
    }
}
