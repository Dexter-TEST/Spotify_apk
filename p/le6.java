package p.le6;
import java.lang.String;
import p.ml1;
import java.lang.Object;
import p.co5;
import com.google.protobuf.c;
import java.lang.StringBuilder;

public final class le6	// class@001d3b from classes.dex
{
    public final String a;
    public final String b;
    public final UtmParameters c;
    public final Map d;
    public final String e;
    public final LinkPreview f;

    public void le6(String p0){
       co5.o(p0, "spotifyUri");
       super();
       this.a = p0;
       this.b = null;
       this.c = null;
       this.d = ml1.a;
       this.e = null;
       this.f = null;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof le6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       le6 tb;
       le6 te;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i2 = (this.d.hashCode() + ((i + i2) * 31)) * 31;
       i = ((te = this.e) == null)? 0: te.hashCode();
       i2 = (i2 + i) * 31;
       if ((te = this.f) != null) {
          i1 = te.hashCode();
       }
       return (i2 + i1);
    }
    public final String toString(){
       return "ShareUrlRequest\(spotifyUri="+this.a+", contextUri="+this.b+", utmParameters="+this.c+", queryParameters="+this.d+", shareDestinationId="+this.e+", linkPreview="+this.f+')';
    }
}
