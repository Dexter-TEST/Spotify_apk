package p.y97;
import java.lang.Object;
import java.lang.Math;

public final class y97	// class@002d76 from classes.dex
{
    public long a;
    public long b;
    public int c;
    public static y97 d;

    public void y97(){
       super();
    }
    public void y97(long p0,long p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(long p0,double p1,double p2){
       y97 oy97 = this;
       long l = 0xdc6d62da00;
       float f = (float)(p0 - l) / 86400000.00f;
       float f1 = (0.02f * f) + 6.24f;
       double d = (double)f1;
       double d1 = (((Math.sin((double)(f1 * 3.00f)) * 0x3ed5f61cc0000000) + ((Math.sin((double)(2.00f * f1)) * 0x3f36e05b00000000) + ((Math.sin(d) * 0x3fa11c5fc0000000) + d))) + 0x3ffcbed85e1ce332) + 0x400921fb54442d18;
       double d2 = (- p2) / 360.00f;
       double d3 = (double)((float)Math.round(((double)(f - 0x3a6bedfa) - d2)) + 0x3a6bedfa) + d2;
       d = (Math.sin(d) * 0x3f75b573eab367a1) + d3;
       d3 = (Math.sin((2.00f * d1)) * 0xbf7c432ca57a786c) + d;
       d = Math.asin((Math.sin(0x3fda31a380000000) * Math.sin(d1)));
       d2 = 0x3f91df46a0000000 * p1;
       d1 = (Math.sin(0xbfbaceea00000000) - (Math.sin(d) * Math.sin(d2))) / (Math.cos(d) * Math.cos(d2));
       long l1 = -1;
       if ((0x3ff0000000000000 - d1) >= 0) {
          oy97.c = 1;
          oy97.a = l1;
          oy97.b = l1;
          return;
       }else if((d1 - 0xbff0000000000000) <= 0){
          oy97.c = 0;
          oy97.a = l1;
          oy97.b = l1;
          return;
       }else {
          d = (double)(float)(Math.acos(d1) / 0x401921fb54442d18);
          oy97.a = Math.round(((d3 + d) * 86400000.00f)) + l;
          long l2 = Math.round(((d3 - d) * 86400000.00f)) + l;
          oy97.b = l2;
          oy97.c = ((l2 - p0) < 0 && (oy97.a - p0) > 0)? 0: 1;
          return;
       }
    }
}
