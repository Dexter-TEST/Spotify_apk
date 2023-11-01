package p.ee6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class ee6	// class@001470 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public void ee6(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,int p9){
       if ((p9 & 0x0100)) {
          p8 = null;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = null;
       this.k = null;
       this.l = null;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ee6) {
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
       if (!co5.c(this.g, p0.g)) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       if (!co5.c(this.i, p0.i)) {
          return false;
       }
       if (!co5.c(this.j, p0.j)) {
          return false;
       }
       if (!co5.c(this.k, p0.k)) {
          return false;
       }
       if (!co5.c(this.l, p0.l)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ee6 ti;
       int i = tp2.g(this.h, tp2.g(this.g, tp2.g(this.f, tp2.g(this.e, tp2.g(this.d, tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31), 31), 31), 31), 31);
       int i1 = 0;
       int i2 = ((ti = this.i) == null)? 0: ti.hashCode();
       i = (i + i2) * 31;
       i2 = ((ti = this.j) == null)? 0: ti.hashCode();
       i = (i + i2) * 31;
       i2 = ((ti = this.k) == null)? 0: ti.hashCode();
       i = (i + i2) * 31;
       if ((ti = this.l) != null) {
          i1 = ti.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("Share\(entityUri="+this.a+", destinationId="+this.b+", capability="+this.c+", shareId="+this.d+", sourcePageUri="+this.e+", sourcePage="+this.f+", integrationId="+this.g+", shareUrl="+this.h+", shareFormatId="+this.i+", systemDestination="+this.j+", creatorUri="+this.k+", interactionId=", this.l, ')');
    }
}
