package p.lb7;
import p.pf7;
import p.pc;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import p.ye7;
import p.ll1;
import java.lang.Class;
import p.co5;
import java.lang.StringBuilder;

public final class lb7 implements pf7	// class@001d22 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public static final lb7 f;

    static {
       pc opc = new pc(16, 0);
       lb7 opc1 = new lb7("", null, null, null, null);
       lb7.f = opc;
    }
    public void lb7(String p0,String p1,String p2,Integer p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final List a(){
       int i = (!this.a.length())? 1: 0;
       List list = (i)? ye7.J("empty path node name"): ll1.a;
       return list;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       lb7 olb7 = lb7.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(olb7, class)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type com.spotify.ubi.android.eventdefinitions.internal.UbiEventPathNode");
          if (!co5.c(this.a, p0.a)) {
             return false;
          }else if(!co5.c(this.b, p0.b)){
             return false;
          }else if(!co5.c(this.c, p0.c)){
             return false;
          }else if(!co5.c(this.d, p0.d)){
             return false;
          }else if(!co5.c(this.e, p0.e)){
             return false;
          }else {
             return true;
          }
       }
    }
    public final int hashCode(){
       lb7 tb;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tb = this.c) != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tb = this.d) != null)? tb.intValue(): 0;
       i = (i + i2) * 31;
       if ((tb = this.e) != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       lb7 tb;
       lb7 te = this.e;
       lb7 td = this.d;
       lb7 tc = this.c;
       lb7 ta = this.a;
       if ((tb = this.b) != null || (tc != null || (td != null || te != null))) {
          StringBuilder str = ta+"\(";
          boolean b = pc.e(str, "id", tb, false);
          int i = pc.e(str, "uri", tc, b) & b;
          int i1 = pc.e(str, "pos", td, i) & i;
          pc.e(str, "reason", te, i1);
          ta = str+"\)";
          co5.l(ta, "{\n            val asStri…"\)\"\).toString\(\)\n        }");
       }
       return ta;
    }
}
