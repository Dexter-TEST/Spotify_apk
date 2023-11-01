package p.vy;
import java.lang.Object;
import java.lang.Byte;
import java.lang.Class;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;

public final class vy	// class@002a91 from classes.dex
{
    public final int a;
    public int b;
    public int c;
    public Object d;

    public void vy(int p0){
       this.a = p0;
       if (p0 != 4) {
          if (p0 != 5) {
             super();
             return;
          }else {
             super();
             vy[] ovyArray = new vy[256];
             this.d = ovyArray;
             this.b = 0;
             this.c = 0;
             return;
          }
       }else {
          super();
          Object[] objArray = new Object[16];
          this.d = objArray;
          return;
       }
    }
    public void vy(int p0,int p1,int p2){
       this.a = p2;
       if (p2 != 5) {
          super();
          int[] ointArray = new int[]{p1,p0};
          this.d = Array.newInstance(Byte.TYPE, ointArray);
          this.b = p0;
          this.c = p1;
          return;
       }else {
          super();
          this.d = null;
          this.b = p0;
          if (!(p0 = p1 & 0x07)) {
             p0 = 8;
          }
          this.c = p0;
          return;
       }
    }
    public void vy(ByteBuffer p0){
       this.a = 3;
       super();
       this.d = p0;
       this.b = p0.position();
    }
    public final byte a(int p0,int p1){
       return this.d[p1][p0];
    }
    public final int b(int p0){
       int b;
       if ((b = this.d.get(((this.c / 8) + this.b))) < 0) {
          b = b + 256;
       }
       vy tc = this.c;
       int i = (tc % 8) - 8;
       if (p0 <= i) {
          b = ((b << (tc % 8)) & 0x00ff) >> ((i - p0) + (tc % 8));
          this.c = tc + p0;
       }else {
          p0 = p0 - i;
          b = this.b(i) << p0;
          b = b + this.b(p0);
       }
       this.d.position((this.b + (int)Math.ceil(((double)this.c / 8.00f))));
       return b;
    }
    public final void c(int p0,int p1,int p2){
       p1[p0] = (byte)p2;
    }
    public final void d(int p0,boolean p1,int p2){
       object oobject = this.d[p2];
       int i = (p1)? 1: 0;
       oobject[p0] = (byte)i;
       return;
    }
    public final String toString(){
       byte b;
       switch (this.a){
           case 2:
             StringBuilder str = new StringBuilder((((this.b * 2) * this.c) + 2));
             for (int i = 0; i < this.c; i = i + 1) {
                object oobject = this.d[i];
                int i1 = 0;
                while (i1 < this.b) {
                   if (b = oobject[i1]) {
                      str = (b != 1)? str.append("  "): str.append(" 1");
                   }else {
                      str = str.append(" 0");
                   }
                   i1 = i1 + 1;
                }
                str = str.append(10);
             }
             return str;
             break;
       }
       return super.toString();
    }
}
