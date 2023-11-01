package p.kg7;
import p.jg7;
import p.v95;
import p.vv7;
import java.lang.String;

public abstract class kg7 extends jg7	// class@001c0d from classes.dex
{
    public v95[] a;
    public String b;
    public int c;
    public final int d;

    public void kg7(){
       super();
       this.a = null;
       this.c = 0;
    }
    public void kg7(kg7 p0){
       super();
       this.a = null;
       this.c = 0;
       this.b = p0.b;
       this.d = p0.d;
       this.a = vv7.n(p0.a);
    }
    public v95[] getPathData(){
       return this.a;
    }
    public String getPathName(){
       return this.b;
    }
    public void setPathData(v95[] p0){
       if (!vv7.e(this.a, p0)) {
          this.a = vv7.n(p0);
       }else {
          kg7 ta = this.a;
          int i = 0;
          while (i < p0.length) {
             ta[i].a = p0[i].a;
             int i1 = 0;
             while (true) {
                v95 b = p0[i].b;
                if (i1 < b.length) {
                   ta[i].b[i1] = b[i1];
                   i1 = i1 + 1;
                }else {
                   break ;
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
