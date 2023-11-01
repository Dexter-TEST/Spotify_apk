package p.du;
import p.zs;
import java.util.List;
import p.dw;
import p.at;
import java.lang.Object;
import java.util.ArrayList;
import p.zq7;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class du	// class@0013bf from classes.dex
{
    public final zs a;
    public final List b;
    public final dw c;
    public final at d;

    public void du(zs p0,List p1,dw p2,at p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static du a(zs p0,at p1,dw p2,ArrayList p3){
       zq7 ozq7 = new zq7(10);
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       ozq7.a = p0;
       ozq7.c = p2;
       ozq7.t = p1;
       ozq7.b = p3;
       return new du(p0, p3, p2, p1);
    }
    public final boolean equals(Object p0){
       du tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof du) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          du c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_003e :
                b = false;
             label_003f :
                return b;
             }
          }else if(tc.equals(c)){
          }
          p0 = p0.d;
          if ((c = this.d) == null) {
             if (p0 == null) {
                goto label_003f ;
             }else {
                goto label_003e ;
             }
          }else if(c.equals(p0)){
             goto label_003f ;
          }else {
             goto label_003e ;
          }
       }else {
          goto label_003e ;
       }
    }
    public final int hashCode(){
       du tc;
       du td;
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = 0;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((td = this.d) != null) {
          i2 = td.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "OfflineEpisode{entity="+this.a+", images="+this.b+", rowInternal="+this.c+", progressInternal="+this.d+"}";
    }
}
