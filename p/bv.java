package p.bv;
import p.zq7;
import java.lang.Boolean;
import p.sc1;
import p.dt5;
import p.lv1;
import p.m73;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.util.Map;
import p.w51;
import java.lang.StringBuilder;
import p.en6;

public final class bv	// class@001146 from classes.dex
{
    public final boolean a;
    public final lv1 b;
    public final m73 c;
    public final String d;
    public static final bv e;

    static {
       zq7 ozq7 = new zq7();
       ozq7.a = Boolean.FALSE;
       ozq7.b = new sc1();
       ozq7.c = dt5.x;
       ozq7.t = null;
       bv.e = ozq7.i();
    }
    public void bv(boolean p0,lv1 p1,m73 p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final bv a(lv1 p0){
       zq7 ozq7 = new zq7(this);
       ozq7.b = p0;
       return ozq7.i();
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bv) {
          return false;
       }
       if (this.a == p0.a && this.b.equals(p0.b)) {
          bv tc = this.c;
          tc.getClass();
          if (w51.q(tc, p0.c)) {
             p0 = p0.d;
             if ((tc = this.d) == null) {
                if (p0 == null) {
                label_0039 :
                   return b;
                }
             }else if(tc.equals(p0)){
                goto label_0039 ;
             }
          }
       }
       b = false;
       goto label_0039 ;
    }
    public final int hashCode(){
       bv td;
       int i = (this.a != null)? 1231: 1237;
       i = (((((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243;
       int i1 = ((td = this.d) == null)? 0: td.hashCode();
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("PreviewToolModel{devEnabled="+this.a+", displayMode="+this.b+", events="+this.c+", errorMessage=", this.d, "}");
    }
}
