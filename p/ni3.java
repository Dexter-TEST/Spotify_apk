package p.ni3;
import java.util.List;
import p.sv3;
import java.lang.String;
import p.wd;
import p.qd;
import p.j8;
import p.rd;
import p.uv1;
import p.o11;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Long;
import p.qv3;
import java.util.Locale;
import java.lang.Integer;
import java.util.Iterator;

public final class ni3	// class@001fe3 from classes.dex
{
    public final List a;
    public final sv3 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final wd i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final qd q;
    public final j8 r;
    public final rd s;
    public final List t;
    public final int u;
    public final boolean v;
    public final uv1 w;
    public final o11 x;

    public void ni3(List p0,sv3 p1,String p2,long p3,int p4,long p5,String p6,List p7,wd p8,int p9,int p10,int p11,float p12,float p13,float p14,float p15,qd p16,j8 p17,List p18,int p19,rd p20,boolean p21,uv1 p22,o11 p23){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
       i.r = p17;
       i.t = p18;
       i.u = p19;
       i.s = p20;
       i.v = p21;
       i.w = p22;
       i.x = p23;
    }
    public final String a(String p0){
       ni3 oni3;
       StringBuilder str = en6.r(p0)+this.c+"\n";
       ni3 tb = this.b;
       Long longx = null;
       if ((oni3 = tb.g.f(this.f, longx)) != null) {
          str = str+"\t\tParents: "+oni3.c;
          oni3 = tb.g.f(oni3.f, longx);
          while (oni3 != null) {
             str = str.append("->").append(oni3.c);
             oni3 = tb.g.f(oni3.f, longx);
          }
          str = str+p0+"\n";
       }
       tb = this.h;
       if (!tb.isEmpty()) {
          str = str+p0+"\tMasks: "+tb.size()+"\n";
       }
       if ((tb = this.j) != null && (oni3 = this.k) != null) {
          Object[] objArray = new Object[]{Integer.valueOf(tb),Integer.valueOf(oni3),Integer.valueOf(this.l)};
          str = str+p0+"\tBackground: "+String.format(Locale.US, "%dx%d %X\n", objArray);
       }
       tb = this.a;
       if (!tb.isEmpty()) {
          str = str+p0+"\tShapes:\n";
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             str = str.append(p0).append("\t\t").append(iterator.next()).append("\n");
          }
       }
       return str;
    }
    public final String toString(){
       return this.a("");
    }
}
