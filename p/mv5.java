package p.mv5;
import java.lang.Object;
import android.graphics.BitmapFactory$Options;
import p.cv5;
import java.lang.Math;
import p.dm5;
import android.net.NetworkInfo;

public abstract class mv5	// class@001f13 from classes.dex
{

    public void mv5(){
       super();
    }
    public static void a(int p0,int p1,int p2,int p3,BitmapFactory$Options p4,cv5 p5){
       double d;
       if (p3 <= p1 && p2 <= p0) {
          p0 = 1;
       }else if(!p1){
          d = Math.floor((double)((float)p2 / (float)p0));
       }else if(!p0){
          d = Math.floor((double)((float)p3 / (float)p1));
       }else {
          p1 = (int)Math.floor((double)((float)p3 / (float)p1));
          p0 = (int)Math.floor((double)((float)p2 / (float)p0));
          if (p5.k != null) {
             p0 = Math.max(p1, p0);
          }else {
             p0 = Math.min(p1, p0);
          }
       }
       d = (int)d;
       p4.inSampleSize = d;
       p4.inJustDecodeBounds = false;
       return;
    }
    public static BitmapFactory$Options c(cv5 p0){
       cv5 r;
       BitmapFactory$Options options1;
       boolean b = p0.a();
       int i = ((r = p0.r) != null)? 1: 0;
       p0 = p0.q;
       if (!b && (!i && p0 == null)) {
          options1 = null;
       }else {
          BitmapFactory$Options options = new BitmapFactory$Options();
          options.inJustDecodeBounds = b;
          options.inInputShareable = p0;
          options.inPurgeable = p0;
          if (i) {
             options.inPreferredConfig = r;
          }
          options1 = options;
       }
       return options1;
    }
    public abstract boolean b(cv5 p0);
    public int d(){
       return 0;
    }
    public abstract dm5 e(cv5 p0,int p1);
    public boolean f(NetworkInfo p0){
       return false;
    }
}
