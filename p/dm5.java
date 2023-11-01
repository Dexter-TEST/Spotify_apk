package p.dm5;
import p.we3;
import p.ja4;
import p.xl0;
import java.lang.Object;
import android.graphics.Bitmap;
import p.nn6;
import p.ud5;
import p.lf7;
import java.lang.AssertionError;
import java.lang.NullPointerException;
import java.lang.String;
import p.gg1;
import android.util.Log;
import java.lang.StringBuilder;
import p.vu6;
import java.lang.StringBuffer;
import p.nf6;
import p.v54;

public final class dm5 implements we3	// class@001376 from classes.dex
{
    public final int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public void dm5(int p0,ja4 p1,xl0 p2){
       this.a = 4;
       super();
       this.c = "method-execution";
       this.d = p1;
       this.e = p2;
       this.b = p0;
    }
    public void dm5(Bitmap p0,nn6 p1,ud5 p2,int p3){
       this.a = 3;
       super();
       int i = 1;
       int i1 = (p0 != null)? 1: 0;
       if (p1 == null) {
          i = 0;
       }
       if (i1 != i) {
          this.d = p0;
          this.e = p1;
          this.c = p2;
          this.b = p3;
          return;
       }else {
          throw new AssertionError();
       }
    }
    public void dm5(Bitmap p0,ud5 p1){
       this.a = 3;
       if (p0 == null) {
          throw new NullPointerException("bitmap == null");
       }
       super(p0, null, p1, 0);
       return;
    }
    public void dm5(String p0,String p1){
       int i = 2;
       this.a = i;
       super();
       this.d = p1;
       this.c = p0;
       this.e = new gg1(p0);
       while (7 >= i && !Log.isLoggable(this.c, i)) {
          i = i + 1;
       }
       this.b = i;
       return;
    }
    public void dm5(String p0,String[] p1){
       String str;
       this.a = 2;
       if (!p1.length) {
          str = "";
       }else {
          StringBuilder str1 = '[';
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = p1[i];
             if (str1.length() > 1) {
                str1 = str1.append(",");
             }
             str1 = str1.append(oobject);
          }
          str = str1+']'+' ';
       }
       super(p0, str);
       return;
    }
    public void dm5(nn6 p0,ud5 p1){
       this.a = 3;
       if (p0 == null) {
          throw new NullPointerException("source == null");
       }
       super(null, p0, p1, 0);
       return;
    }
    public final String toString(){
       StringBuffer str;
       dm5 tc;
       int i;
       switch (this.a){
           case 4:
             str = "";
             tc = this.c;
             if ((i = tc.lastIndexOf(45)) != -1) {
                tc = tc.substring((i + 1));
             }
             break;
           default:
             return super.toString();
       }
       return str+tc+"\("+this.d.a()+"\)";
    }
}
