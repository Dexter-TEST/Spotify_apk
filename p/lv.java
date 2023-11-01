package p.lv;
import java.lang.String;
import java.lang.Object;
import p.kv;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.StringBuilder;
import p.en6;

public final class lv	// class@001dd3 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;

    public void lv(String p0,String p1,String p2,String p3,String p4,long p5,boolean p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public static lv a(long p0,String p1,String p2,String p3,String p4,String p5,boolean p6){
       kv okv = new kv();
       okv.e(p1);
       okv.c(p2);
       okv.b(p3);
       okv.d(p4);
       okv.f = Long.valueOf(p0);
       okv.g = Boolean.valueOf(p6);
       okv.a = p5;
       return okv.a();
    }
    public final boolean equals(Object p0){
       lv ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof lv) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && (this.e.equals(p0.e) && (!(this.f - p0.f) && this.g == p0.g))))) {
             label_0054 :
                return b;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }
       b = false;
       goto label_0054 ;
    }
    public final int hashCode(){
       lv ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       lv tf = this.f;
       i = (((((((((((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ (int)((tf >> 32) ^ tf)) * 0xf4243;
       int i1 = (this.g != null)? 1231: 1237;
       return (i ^ i1);
    }
    public final String toString(){
       return en6.q("ShowEntity{tag="+this.a+", uri="+this.b+", name="+this.c+", description="+this.d+", publisher="+this.e+", created="+this.f+", explicit=", this.g, "}");
    }
}
