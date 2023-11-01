package p.d10;
import p.t57;
import p.u10;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;

public final class d10 extends t57	// class@0012b8 from classes.dex
{
    public final short c;
    public final short d;

    public void d10(t57 p0,int p1,int p2){
       super(p0);
       this.c = (short)p1;
       this.d = (short)p2;
    }
    public final void a(u10 p0,byte[] p1){
       int i2;
       int i = 0;
       while (true) {
          d10 td = this.d;
          if (i < td) {
             int i1 = 62;
             if (!i || (i == 31 || td > i1)) {
                p0.c(31, 5);
                if (td > i1) {
                   i2 = td - 31;
                   p0.c(i2, 16);
                }else if(!i){
                   p0.c(Math.min(td, 31), 5);
                }else {
                   i2 = td - 31;
                   p0.c(i2, 5);
                }
             }
             i2 = this.c + i;
             p0.c(p1[i2], 8);
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final String toString(){
       d10 tc = this.c;
       return "<"+tc+"::"+((tc + this.d) - 1)+'>';
    }
}
