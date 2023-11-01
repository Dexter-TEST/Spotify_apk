package p.v80;
import p.fx5;
import p.xb1;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import p.nn6;
import p.u80;
import p.hp5;
import p.xe7;
import p.we7;
import java.lang.Long;
import p.u54;
import p.gg1;
import p.g70;

public final class v80 extends fx5	// class@00299d from classes.dex
{
    public final xb1 b;
    public final String c;
    public final String t;
    public final hp5 v;

    public void v80(xb1 p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = xe7.f(new u80(p0.c.get(1), this));
    }
    public final long f(){
       v80 tt;
       try{
          long l = -1;
          if ((tt = this.t) == null) {
          }else {
             byte[] a = we7.a;
             l = Long.parseLong(tt);
          }
          return l;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public final u54 x(){
       v80 tc;
       u54 ou54 = ((tc = this.c) == null)? null: gg1.P(tc);
       return ou54;
    }
    public final g70 y(){
       return this.v;
    }
}
