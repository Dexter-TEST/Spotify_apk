package p.aa5;
import p.nn6;
import p.g70;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import p.u96;
import p.b57;
import java.lang.Math;
import java.lang.IllegalStateException;
import p.kg4;
import java.lang.IllegalArgumentException;

public final class aa5 implements nn6	// class@000161 from classes2.dex
{
    public final g70 a;
    public final e70 b;
    public u96 c;
    public int t;
    public boolean v;
    public long w;

    public void aa5(g70 p0){
       co5.o(p0, "upstream");
       super();
       this.a = p0;
       e70 uoe70 = p0.c();
       this.b = uoe70;
       uoe70 = uoe70.a;
       this.c = uoe70;
       u96 b = (uoe70 != null)? uoe70.b: -1;
       this.t = b;
       return;
    }
    public final void close(){
       this.v = true;
    }
    public final b57 e(){
       return this.a.e();
    }
    public final long o(e70 p0,long p1){
       e70 a1;
       co5.o(p0, "sink");
       int i = 0;
       int i1 = ((v3 = p1) >= 0)? 1: 0;
       if (i1) {
          if ((this.v ^ 0x01)) {
             aa5 tc = this.c;
             aa5 tb = this.b;
             if (tc != null) {
                e70 a = tb.a;
                if (tc == a) {
                   co5.i(a);
                   if (this.t == a.b) {
                   label_002a :
                      i = 1;
                   }
                }
             }else {
                goto label_002a ;
             }
             if (i) {
                if (!v3) {
                   return 0;
                }else if(!this.a.a((this.w + 1))){
                   return -1;
                }else if(this.c == null && (a1 = tb.a) != null){
                   this.c = a1;
                   this.t = a1.b;
                }
                p1 = Math.min(p1, (tb.b - this.w));
                this.b.g0(this.w, p1, p0);
                this.w = this.w + p1;
                return p1;
             }else {
                throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
             }
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p1).toString());
       }
    }
}
