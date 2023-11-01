package p.aw;
import p.pz5;
import java.lang.String;
import p.zv;
import p.zs;
import java.lang.Object;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import p.r45;
import java.lang.StringBuilder;

public final class aw implements pz5	// class@00100a from classes.dex
{
    public final String a;
    public final String b;
    public final int c;
    public final zv d;
    public final zs e;

    public void aw(String p0,String p1,int p2,zv p3,zs p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static aw b(String p0,String p1,int p2,zv p3,zs p4){
       Integer integer;
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       if (p1 == null) {
          throw new NullPointerException("Null uid");
       }
       String str = ((integer = Integer.valueOf(p2)) == null)? " position": "";
       if (str.isEmpty()) {
          aw str1 = new aw(p0, p1, integer.intValue(), p3, p4);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final String a(){
       return this.a;
    }
    public final r45 c(){
       return r45.a(this.e);
    }
    public final r45 d(){
       return r45.a(this.d);
    }
    public final boolean equals(Object p0){
       aw td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof aw) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && this.c == p0.c)) {
          aw d = p0.d;
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
       aw td;
       aw te;
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
       return "TrackEpisodeRow{uri="+this.a+", uid="+this.b+", position="+this.c+", trackInternal="+this.d+", episodeInternal="+this.e+"}";
    }
}
