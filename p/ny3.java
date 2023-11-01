package p.ny3;
import p.py3;
import java.lang.String;
import p.vu5;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class ny3 implements py3	// class@002072 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final vu5 d;

    public void ny3(String p0,String p1,String p2,vu5 p3){
       co5.o(p0, "trackUri");
       co5.o(p1, "provider");
       co5.o(p2, "providerLyricsId");
       co5.o(p3, "reportType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ny3) {
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
       return "ReportEffect\(trackUri="+this.a+", provider="+this.b+", providerLyricsId="+this.c+", reportType="+this.d+')';
    }
}
