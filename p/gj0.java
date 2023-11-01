package p.gj0;
import p.hj0;
import java.lang.Object;

public final class gj0	// class@001719 from classes.dex
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final hj0 j;

    public void gj0(hj0 p0,int p1,int p2){
       this.j = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.a();
    }
    public final void a(){
       gj0 tj = this.j;
       hj0 a = tj.a;
       hj0 b = tj.b;
       int i = Integer.MAX_VALUE;
       gj0 ogj0 = this.a;
       int i1 = Integer.MAX_VALUE;
       int i2 = Integer.MAX_VALUE;
       int i3 = Integer.MIN_VALUE;
       int i4 = Integer.MIN_VALUE;
       int i5 = Integer.MIN_VALUE;
       int i6 = 0;
       while (ogj0 <= this.b) {
          int i7 = a[ogj0];
          i6 = i6 + b[i7];
          int i8 = i7 >> 10;
          i8 = i8 & 0x1f;
          int i9 = i7 >> 5;
          i9 = i9 & 0x1f;
          i7 = i7 & 0x1f;
          if (i8 > i3) {
             i3 = i8;
          }
          if (i8 < i) {
             i = i8;
          }
          if (i9 > i4) {
             i4 = i9;
          }
          if (i9 < i1) {
             i1 = i9;
          }
          if (i7 > i5) {
             i5 = i7;
          }
          if (i7 < i2) {
             i2 = i7;
          }
          ogj0 = ogj0 + 1;
       }
       this.d = i;
       this.e = i3;
       this.f = i1;
       this.g = i4;
       this.h = i2;
       this.i = i5;
       this.c = i6;
       return;
    }
}
