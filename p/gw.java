package p.gw;
import p.o11;
import p.t97;
import com.google.common.collect.c;
import p.ys5;
import java.lang.NullPointerException;
import java.lang.String;
import p.ty0;
import p.ju;
import java.lang.Object;
import java.lang.StringBuilder;

public final class gw	// class@001795 from classes.dex
{
    public final ty0 a;
    public final c b;
    public final c c;
    public final c d;
    public final ju e;
    public static final gw f;

    static {
       ys5 v;
       o11 oo11 = new o11(25);
       oo11.b = new t97();
       if ((v = ys5.v) == null) {
          throw new NullPointerException("Null formatCapabilities");
       }
       oo11.c = v;
       oo11.t = v;
       oo11.v = v;
       oo11.w = null;
       gw.f = oo11.m();
    }
    public void gw(ty0 p0,c p1,c p2,c p3,ju p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       gw te;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gw) {
          return false;
       }
       if (this.a.equals(p0.a) && (this.b.equals(p0.b) && (this.c.equals(p0.c) && this.d.equals(p0.d)))) {
          p0 = p0.e;
          if ((te = this.e) == null) {
             if (p0 == null) {
             label_0044 :
                return b;
             }
          }else if(te.equals(p0)){
             goto label_0044 ;
          }
       }
       b = false;
       goto label_0044 ;
    }
    public final int hashCode(){
       gw te;
       int i = (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243;
       int i1 = ((te = this.e) == null)? 0: te.hashCode();
       return (i ^ i1);
    }
    public final String toString(){
       return "TriggerEngineModel{triggerListState="+this.a+", formatCapabilities="+this.b+", actionCapabilities="+this.c+", triggerTypes="+this.d+", pendingTrigger="+this.e+"}";
    }
}
