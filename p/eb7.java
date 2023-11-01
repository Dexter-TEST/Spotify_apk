package p.eb7;
import p.yt0;
import p.is6;
import java.lang.String;
import java.lang.Boolean;
import java.util.UUID;
import java.lang.Class;
import p.tf3;
import p.he3;
import java.lang.Object;
import p.gb6;
import p.m00;
import p.mg3;
import p.js6;
import p.rf3;
import p.qf3;
import java.util.Objects;
import p.vf3;
import p.u57;
import p.sx;
import p.rx;

public final class eb7 extends is6 implements yt0	// class@001458 from classes.dex
{
    public final Boolean t;
    public static final char[] v;

    static {
       eb7.v = "0123456789abcdef".toCharArray();
    }
    public void eb7(Boolean p0){
       super(0, UUID.class);
       this.t = p0;
    }
    public static final void e(byte[] p0,int p1,int p2){
       p0[p2] = (byte)(p1 >> 24);
       p2++;
       p0[p2] = (byte)(p1 >> 16);
       p2++;
       p0[p2] = (byte)(p1 >> 8);
       p2++;
       p0[p2] = (byte)p1;
    }
    public static void f(char[] p0,int p1,int p2){
       char[] v = eb7.v;
       p0[p2] = v[((p1 >> 12) & 0x0f)];
       p2++;
       p0[p2] = v[((p1 >> 8) & 0x0f)];
       p2++;
       p0[p2] = v[((p1 >> 4) & 0x0f)];
       p2++;
       p0[p2] = v[(p1 & 0x0f)];
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       p0.getClass();
    }
    public final mg3 b(gb6 p0,m00 p1){
       rf3 orf3;
       Boolean tRUE;
       if ((orf3 = js6.c(p1, p0, this.a)) != null) {
          if ((orf3 = orf3.b) == qf3.x) {
             tRUE = Boolean.TRUE;
          }else if(orf3 == qf3.w){
             tRUE = Boolean.FALSE;
          }else {
          label_0018 :
             tRUE = null;
          }
       }else {
          goto label_0018 ;
       }
       if (!Objects.equals(tRUE, this.t)) {
          return new eb7(tRUE);
       }else {
          return this;
       }
    }
    public final boolean isEmpty(gb6 p0,Object p1){
       boolean b = (!(p1.getLeastSignificantBits()) && !(p1.getMostSignificantBits()))? true: false;
       return b;
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       eb7 tt;
       boolean b;
       long mostSignific;
       if ((tt = this.t) != null) {
          b = tt.booleanValue();
       }else if(!p1 instanceof u57){
          p1.getClass();
          if (p1 instanceof u57) {
             b = true;
          }
       }
       b = false;
       int i = 4;
       int i1 = 8;
       if (b) {
          byte[] uobyteArray = new byte[16];
          mostSignific = p0.getMostSignificantBits();
          long leastSignifi = p0.getLeastSignificantBits();
          eb7.e(uobyteArray, (int)(mostSignific >> 32), 0);
          eb7.e(uobyteArray, (int)mostSignific, i);
          eb7.e(uobyteArray, (int)(leastSignifi >> 32), i1);
          eb7.e(uobyteArray, (int)leastSignifi, 12);
          p1.getClass();
          p1.J(sx.b, uobyteArray, 0, 16);
       }else {
          char[] uocharArray = new char[36];
          mostSignific = p0.getMostSignificantBits();
          int i2 = (int)(mostSignific >> 32);
          eb7.f(uocharArray, (i2 >> 16), 0);
          eb7.f(uocharArray, i2, i);
          uocharArray[8] = '-';
          i1 = (int)mostSignific;
          eb7.f(uocharArray, (i1 >> 16), 9);
          uocharArray[13] = '-';
          eb7.f(uocharArray, i1, 14);
          uocharArray[18] = '-';
          mostSignific = p0.getLeastSignificantBits();
          eb7.f(uocharArray, (int)(mostSignific >> 48), 19);
          uocharArray[23] = '-';
          eb7.f(uocharArray, (int)(mostSignific >> 32), 24);
          int i3 = (int)mostSignific;
          eb7.f(uocharArray, (i3 >> 16), 28);
          eb7.f(uocharArray, i3, 32);
          p1.y0(uocharArray, 0, 36);
       }
       return;
    }
}
