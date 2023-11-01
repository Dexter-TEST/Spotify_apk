package p.wb1;
import p.ec1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.StringBuilder;
import p.m95;
import p.yb1;
import p.c42;

public final class wb1	// class@002b00 from classes.dex
{
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public tb1 g;
    public int h;
    public final ec1 i;

    public void wb1(ec1 p0,String p1){
       this.i = p0;
       super();
       this.a = p1;
       p0.getClass();
       long[] olongArray = new long[2];
       this.b = olongArray;
       this.c = new ArrayList(2);
       this.d = new ArrayList(2);
       StringBuilder str = p1+'.';
       int i = str.length();
       for (int i1 = 0; i1 < 2; i1 = i1 + 1) {
          str = str.append(i1);
          this.c.add(this.i.a.c(str.toString()));
          str = str.append(".tmp");
          this.d.add(this.i.a.c(str.toString()));
          str.setLength(i);
       }
       return;
    }
    public final yb1 a(){
       if (this.e == null) {
          return null;
       }
       if (this.g != null || this.f != null) {
          return null;
       }
       wb1 tc = this.c;
       int i = tc.size();
       int i1 = 0;
       while (true) {
          wb1 ti = this.i;
          if (i1 < i) {
             if (!ti.G.f(tc.get(i1))) {
                try{
                   ti.k0(this);
                   break ;
                }catch(java.io.IOException e0){
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             this.h = this.h + 1;
             return new yb1(ti, this);
          }
       }
       return null;
    }
}
