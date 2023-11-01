package p.sl0;
import java.lang.Object;
import p.mb0;
import p.zf2;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import java.lang.Class;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class sl0	// class@00264c from classes.dex
{
    public final Object a;
    public final mb0 b;
    public final zf2 c;
    public final Object d;
    public final Throwable e;

    public void sl0(Object p0,mb0 p1,zf2 p2,Object p3,Throwable p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void sl0(Object p0,mb0 p1,zf2 p2,CancellationException p3,int p4){
       mb0 omb0 = ((p4 & 0x02))? null: p1;
       zf2 ozf2 = ((p4 & 0x04))? null: p2;
       Throwable throwable = ((p4 & 0x10))? null: p3;
       super(p0, omb0, ozf2, null, throwable);
       return;
    }
    public static sl0 a(sl0 p0,mb0 p1,CancellationException p2,int p3){
       sl0 b;
       sl0 e;
       sl0 p0;
       int i = 0;
       sl0 osl0 = ((p3 & 0x01))? p0.a: i;
       if ((p3 & 0x02)) {
          b = p0.b;
       }
       sl0 osl01 = b;
       sl0 osl02 = ((p3 & 0x04))? p0.c: i;
       if ((p3 & 0x08)) {
          i = p0.d;
       }
       sl0 osl03 = i;
       if ((p3 & 0x10)) {
          e = p0.e;
       }
       p0.getClass();
       p0 = new sl0(osl0, osl01, osl02, osl03, e);
       return p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof sl0) {
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
       return true;
    }
    public final int hashCode(){
       sl0 ta;
       sl0 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = i1 * 31;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.d) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tb = this.e) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "CompletedContinuation\(result="+this.a+", cancelHandler="+this.b+", onCancellation="+this.c+", idempotentResume="+this.d+", cancelCause="+this.e+')';
    }
}
