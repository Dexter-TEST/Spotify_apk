package p.bt;
import p.pz5;
import java.lang.String;
import p.zs;
import p.at;
import java.lang.Object;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class bt implements pz5	// class@001134 from classes.dex
{
    public final String a;
    public final String b;
    public final int c;
    public final zs d;
    public final at e;

    public void bt(String p0,String p1,int p2,zs p3,at p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static bt b(String p0,String p1,int p2,zs p3,at p4){
       Integer integer;
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       if (p1 == null) {
          throw new NullPointerException("Null uid");
       }
       String str = ((integer = Integer.valueOf(p2)) == null)? " position": "";
       if (str.isEmpty()) {
          bt str1 = new bt(p0, p1, integer.intValue(), p3, p4);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final String a(){
       return this.a;
    }
    public final boolean equals(Object p0){
       bt td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bt) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && this.c == p0.c)) {
          bt d = p0.d;
          if ((td = this.d) == null) {
             if (d != null) {
             label_0044 :
                b = false;
             label_0045 :
                return b;
             }
          }else if(td.equals(d)){
          }
          p0 = p0.e;
          if ((d = this.e) == null) {
             if (p0 == null) {
                goto label_0045 ;
             }else {
                goto label_0044 ;
             }
          }else if(d.equals(p0)){
             goto label_0045 ;
          }else {
             goto label_0044 ;
          }
       }else {
          goto label_0044 ;
       }
    }
    public final int hashCode(){
       bt td;
       bt te;
       int i = 0xf4243;
       int i1 = (((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c) * i;
       int i2 = 0;
       int i3 = ((td = this.d) == null)? 0: td.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((te = this.e) != null) {
          i2 = te.hashCode();
       }
       return (i1 ^ i2);
    }
    public final int position(){
       return this.c;
    }
    public final String toString(){
       return "EpisodeRow{uri="+this.a+", uid="+this.b+", position="+this.c+", episodeInternal="+this.d+", progressInternal="+this.e+"}";
    }
}
