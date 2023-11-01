package p.vy3;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class vy3	// class@002a8c from classes.dex
{
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public void vy3(String p0,ArrayList p1,String p2,String p3){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof vy3) {
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
       return true;
    }
    public final int hashCode(){
       return (this.d.hashCode() + tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("LyricsReportModel\(reportTypeList="+this.a+", trackUri="+this.b+", provider="+this.c+", providerLyricsId=", this.d, ')');
    }
}
