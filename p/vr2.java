package p.vr2;
import p.nn6;
import p.g70;
import java.lang.Object;
import p.b57;
import p.e70;
import java.lang.String;
import p.co5;
import p.we7;
import p.wr2;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.fr2;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Math;

public final class vr2 implements nn6	// class@00038e from classes2.dex
{
    public final g70 a;
    public int b;
    public int c;
    public int t;
    public int v;
    public int w;

    public void vr2(g70 p0){
       super();
       this.a = p0;
    }
    public final void close(){
    }
    public final b57 e(){
       return this.a.e();
    }
    public final long o(e70 p0,long p1){
       long l;
       int i;
       co5.o(p0, "sink");
       while (true) {
          vr2 tv = this.v;
          l = -1;
          vr2 ta = this.a;
          if (tv == null) {
             ta.skip((long)this.w);
             this.w = 0;
             if (i = this.c & 0x04) {
                break ;
             }else {
                tv = this.t;
                int i1 = we7.t(ta);
                this.v = i1;
                this.b = i1;
                i1 = ta.readByte() & 0x00ff;
                int i2 = ta.readByte() & 0x00ff;
                this.c = i2;
                Logger v = wr2.v;
                if (v.isLoggable(Level.FINE)) {
                   v.fine(fr2.a(true, this.t, this.b, i1, this.c));
                }
                i2 = ta.readInt() & Integer.MAX_VALUE;
                this.t = i2;
                if (i1 == 9) {
                   if (i2 != tv) {
                      throw new IOException("TYPE_CONTINUATION streamId changed");
                   }
                   continue ;
                }else {
                   throw new IOException(i1+" != TYPE_CONTINUATION");
                }
             }
          }else {
             long l1 = ta.o(p0, Math.min(p1, (long)tv));
             if (!(l1 - l)) {
                return l;
             }
             this.v = this.v - (int)l1;
             return l1;
          }
       }
       return l;
    }
}
