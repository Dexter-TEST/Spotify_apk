package p.c90;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public final class c90	// class@0011bd from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;
    public static final c90 n;
    public static final c90 o;

    static {
       c90 v14 = new c90(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);
       c90.n = v14;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       co5.o(sECONDS, "timeUnit");
       long l = sECONDS.toSeconds((long)Integer.MAX_VALUE);
       int i = ((l - 0x7fffffff) > 0)? Integer.MAX_VALUE: (int)l;
       c90 sECONDS1 = new c90(false, false, -1, -1, false, false, false, i, -1, true, false, false, null);
       c90.o = sECONDS;
    }
    public void c90(boolean p0,boolean p1,int p2,int p3,boolean p4,boolean p5,boolean p6,int p7,int p8,boolean p9,boolean p10,boolean p11,String p12){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
    }
    public final String toString(){
       c90 tm;
       String str;
       if ((tm = this.m) == null) {
          str = "";
          if (this.a != null) {
             str = str+"no-cache, ";
          }
          if (this.b != null) {
             str = str+"no-store, ";
          }
          c90 tc = this.c;
          String str1 = ", ";
          int i = -1;
          if (tc != i) {
             str = str+"max-age="+tc+str1;
          }
          if ((tc = this.d) != i) {
             str = str+"s-maxage="+tc+str1;
          }
          if (this.e != null) {
             str = str+"private, ";
          }
          if (this.f != null) {
             str = str+"public, ";
          }
          if (this.g != null) {
             str = str+"must-revalidate, ";
          }
          if ((tc = this.h) != i) {
             str = str+"max-stale="+tc+str1;
          }
          if ((tc = this.i) != i) {
             str = str+"min-fresh="+tc+str1;
          }
          if (this.j != null) {
             str = str+"only-if-cached, ";
          }
          if (this.k != null) {
             str = str+"no-transform, ";
          }
          if (this.l != null) {
             str = str+"immutable, ";
          }
          tc = (!str.length())? 1: 0;
          if (tc) {
             return "";
          }else {
             str.delete((str.length() - 2), str.length());
             str = str;
             co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
             this.m = str;
          }
       }
       return str;
    }
}
