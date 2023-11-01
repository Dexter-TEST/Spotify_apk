package p.i93;
import p.nn6;
import p.hp5;
import java.util.zip.Inflater;
import java.lang.Object;
import p.b57;
import p.e70;
import java.lang.String;
import p.co5;
import p.u96;
import java.lang.Math;
import p.g70;
import p.x96;
import java.io.EOFException;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import p.kg4;
import java.lang.IllegalArgumentException;

public final class i93 implements nn6	// class@00023d from classes2.dex
{
    public final g70 a;
    public final Inflater b;
    public int c;
    public boolean t;

    public void i93(hp5 p0,Inflater p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void close(){
       if (this.t != null) {
          return;
       }
       this.b.end();
       this.t = true;
       this.a.close();
       return;
    }
    public final b57 e(){
       return this.a.e();
    }
    public final long o(e70 p0,long p1){
       long l;
       i93 tc;
       int i4;
       int i5;
       co5.o(p0, "sink");
       while (true) {
          int i = 0;
          int i1 = 1;
          int i2 = ((v3 = p1 - i) >= 0)? 1: 0;
          if (i2) {
             if (i2 = this.t ^ i1) {
                try{
                   i93 ta = this.a;
                   i93 tb = this.b;
                   if (v3) {
                      u96 ou96 = p0.t0(i1);
                      int i3 = ou96.c - 8192;
                      i3 = (int)Math.min(p1, (long)i3);
                      if (tb.needsInput() && !ta.F()) {
                         e70 a = ta.c().a;
                         co5.i(a);
                         u96 b = a.b;
                         i5 = a.c - b;
                         this.c = i5;
                         tb.setInput(a.a, b, i5);
                      }
                      i3 = tb.inflate(ou96.a, ou96.c, i3);
                      if ((tc = this.c) != null) {
                         i4 = tc - tb.getRemaining();
                         i5 = this.c - i4;
                         this.c = i5;
                         ta.skip((long)i4);
                      }
                      if (i3 > 0) {
                         i4 = ou96.c + i3;
                         ou96.c = i4;
                         l = (long)i3;
                         long l1 = p0.b + l;
                         p0.b = l1;
                      label_0087 :
                         if ((l - i) > 0) {
                            break ;
                         }else if(!tb.finished() && !tb.needsDictionary()){
                            if (ta.F()) {
                               throw new EOFException("source exhausted prematurely");
                            }
                            continue ;
                         }else {
                            return -1;
                         }
                      }else if(ou96.b == ou96.c){
                         p0.a = ou96.a();
                         x96.a(ou96);
                      }
                   }
                   l = i;
                   goto label_0087 ;
                }catch(java.util.zip.DataFormatException e10){
                   throw new IOException(e10);
                }
             }else {
                throw new IllegalStateException("closed".toString());
             }
          }else {
             throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p1).toString());
          }
       }
       return l;
    }
}
