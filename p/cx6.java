package p.cx6;
import p.k51;
import java.lang.Object;
import p.dx6;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class cx6	// class@001299 from classes.dex
{
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public static final cx6[] i;

    static {
       cx6[] uocx6Array = new cx6[30];
       cx6 v8 = new cx6(false, 3, 5, 8, 8, 1);
       uocx6Array[0] = v8;
       v8 = new cx6(false, 5, 7, 10, 10, 1);
       uocx6Array[1] = v8;
       v8 = new cx6(true, 5, 7, 16, 6, 1);
       uocx6Array[2] = v8;
       v8 = new cx6(false, 8, 10, 12, 12, 1);
       uocx6Array[3] = v8;
       v8 = new cx6(true, 10, 11, 14, 6, 2);
       uocx6Array[4] = v8;
       v8 = new cx6(false, 12, 12, 14, 14, 1);
       uocx6Array[5] = v8;
       v8 = new cx6(true, 16, 14, 24, 10, 1);
       uocx6Array[6] = v8;
       v8 = new cx6(false, 18, 14, 16, 16, 1);
       uocx6Array[7] = v8;
       v8 = new cx6(false, 22, 18, 18, 18, 1);
       uocx6Array[8] = v8;
       v8 = new cx6(true, 22, 18, 16, 10, 2);
       uocx6Array[9] = v8;
       v8 = new cx6(false, 30, 20, 20, 20, 1);
       uocx6Array[10] = v8;
       v8 = new cx6(true, 32, 24, 16, 14, 2);
       uocx6Array[11] = v8;
       v8 = new cx6(false, 36, 24, 22, 22, 1);
       uocx6Array[12] = v8;
       v8 = new cx6(false, 44, 28, 24, 24, 1);
       uocx6Array[13] = v8;
       v8 = new cx6(true, 49, 28, 22, 14, 2);
       uocx6Array[14] = v8;
       v8 = new cx6(false, 62, 36, 14, 14, 4);
       uocx6Array[15] = v8;
       v8 = new cx6(false, 86, 42, 16, 16, 4);
       uocx6Array[16] = v8;
       v8 = new cx6(false, 114, 48, 18, 18, 4);
       uocx6Array[17] = v8;
       v8 = new cx6(false, 144, 56, 20, 20, 4);
       uocx6Array[18] = v8;
       v8 = new cx6(false, 174, 68, 22, 22, 4);
       uocx6Array[19] = v8;
       v8 = new cx6(false, 204, 84, 24, 24, 4, 102, 42);
       uocx6Array[20] = v8;
       v8 = new cx6(false, 280, 112, 14, 14, 16, 140, 56);
       uocx6Array[21] = v8;
       v8 = new cx6(false, 368, 144, 16, 16, 16, 92, 36);
       uocx6Array[22] = v8;
       v8 = new cx6(false, 456, 192, 18, 18, 16, 114, 48);
       uocx6Array[23] = v8;
       v8 = new cx6(false, 576, 224, 20, 20, 16, 144, 56);
       uocx6Array[24] = v8;
       v8 = new cx6(false, 696, 272, 22, 22, 16, 174, 68);
       uocx6Array[25] = v8;
       v8 = new cx6(false, 816, 336, 24, 24, 16, 136, 56);
       uocx6Array[26] = v8;
       v8 = new cx6(false, 1050, 408, 18, 18, 36, 175, 68);
       uocx6Array[27] = v8;
       v8 = new cx6(false, 1304, 496, 20, 20, 36, 163, 62);
       uocx6Array[28] = v8;
       uocx6Array[29] = new k51();
       cx6.i = uocx6Array;
    }
    public void cx6(boolean p0,int p1,int p2,int p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5, p1, p2);
    }
    public void cx6(boolean p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public static cx6 e(int p0,dx6 p1){
       object oobject;
       cx6[] i = cx6.i;
       int i1 = 0;
       while (true) {
          if (i1 >= 30) {
             throw new IllegalArgumentException("Can\'t find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(p0)));
          }
          oobject = i[i1];
          if (p1 == dx6.b && (oobject.a != null || (p1 == dx6.c && (oobject.a == null || p0 > oobject.b)))) {
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       return oobject;
    }
    public int a(int p0){
       return this.g;
    }
    public final int b(){
       cx6 tf;
       int i = 1;
       if ((tf = this.f) != i) {
          i = 2;
          if (tf != i && tf != 4) {
             if (tf != 16) {
                if (tf == 36) {
                   return 6;
                }else {
                   throw new IllegalStateException("Cannot handle this number of data regions");
                }
             }else {
                return 4;
             }
          }
       }
       return i;
    }
    public int c(){
       return (this.b / this.g);
    }
    public final int d(){
       cx6 tf;
       int i = 1;
       if ((tf = this.f) != i) {
          int i1 = 2;
          if (tf != i1) {
             i = 4;
             if (tf != i) {
                if (tf != 16) {
                   if (tf == 36) {
                      return 6;
                   }else {
                      throw new IllegalStateException("Cannot handle this number of data regions");
                   }
                }else {
                   return i;
                }
             }else {
                return i1;
             }
          }
       }
       return i;
    }
    public final String toString(){
       StringBuilder str = "";
       String str1 = (this.a != null)? "Rectangular Symbol:": "Square Symbol:";
       cx6 td = this.d;
       cx6 te = this.e;
       return str+str1+" data region "+td+'x'+te+", symbol size "+((this.b() * td) + (this.b() << 1))+'x'+((this.d() * te) + (this.d() << 1))+", symbol data size "+(this.b() * td)+'x'+(this.d() * te)+", codewords "+this.b+'+'+this.c;
    }
}
