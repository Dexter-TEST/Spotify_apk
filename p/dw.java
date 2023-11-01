package p.dw;
import p.pz5;
import java.lang.String;
import java.lang.Object;
import p.cw;
import java.lang.Integer;
import p.kg4;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class dw implements pz5	// class@0013d1 from classes.dex
{
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public void dw(String p0,String p1,int p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static dw b(int p0,String p1,String p2,String p3){
       cw uocw = new cw();
       if (p1 == null) {
          throw new NullPointerException("Null parentUri");
       }
       uocw.d = p1;
       if (p2 == null) {
          throw new NullPointerException("Null uri");
       }
       uocw.a = p2;
       if (p3 == null) {
          throw new NullPointerException("Null uid");
       }
       uocw.b = p3;
       uocw.c = Integer.valueOf(p0);
       String str = (uocw.a == null)? " uri": "";
       if (uocw.b == null) {
          str = str.concat(" uid");
       }
       if (uocw.c == null) {
          str = kg4.l(str, " position");
       }
       if (uocw.d == null) {
          str = kg4.l(str, " parentUri");
       }
       if (str.isEmpty()) {
          return new dw(uocw.a, uocw.b, uocw.c.intValue(), uocw.d);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final String a(){
       return this.a;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof dw) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (this.c != p0.c || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c) * 0xf4243) ^ this.d.hashCode());
    }
    public final int position(){
       return this.c;
    }
    public final String toString(){
       return en6.p("TrackRowEntity{uri="+this.a+", uid="+this.b+", position="+this.c+", parentUri=", this.d, "}");
    }
}
