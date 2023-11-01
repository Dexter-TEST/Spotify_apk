package p.xp6;
import p.mv5;
import java.lang.String;
import java.util.regex.Pattern;
import p.tm5;
import p.pf1;
import p.rp;
import android.graphics.Paint;
import p.wd5;
import android.graphics.Canvas;
import java.util.List;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hv5;
import p.av5;
import android.graphics.Bitmap;
import java.io.IOException;
import p.cv5;
import p.dm5;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import p.jg2;
import p.k07;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import android.graphics.Color;
import java.lang.Class;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import p.ud5;

public final class xp6 extends mv5	// class@002cc3 from classes.dex
{
    public final tm5 a;
    public final pf1 b;
    public final jg2 c;
    public final Paint d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;

    static {
       xp6.e = Pattern.compile("url:\([^:]+\)");
       xp6.f = Pattern.compile("upper-gradient:\([^:]+\)");
       xp6.g = Pattern.compile("lower-gradient:\([^:]+\)");
    }
    public void xp6(tm5 p0,pf1 p1){
       super();
       this.d = new Paint(3);
       this.a = p0;
       this.b = p1;
       this.c = new rp(24);
    }
    public static void g(wd5 p0,Canvas p1,int p2,List p3,Paint p4,boolean p5){
       Bitmap uBitmap;
       int i1;
       int i2;
       int i = p2 / 2;
       Rect rect = new Rect();
       ArrayList uArrayList = new ArrayList(p3.size());
       Iterator iterator = p3.iterator();
       while (iterator.hasNext()) {
          hv5 ohv5 = p0.g("spotify:image:".append(iterator.next()).toString());
          hv5 b = ohv5.b;
          try{
             b.b(i, i);
             if ((uBitmap = ohv5.c()) != null) {
                uArrayList.add(uBitmap);
             }
          }catch(java.io.IOException e0){
          }
       }
       if (i1 = uArrayList.size()) {
          if (i1 != 1 && i1 != 2) {
             i1 = 0;
             while (i1 < 4) {
                int i3 = (!(i2 = i1 % 2))? 0: i;
                int i4 = (i1 < 2)? 0: i;
                i2 = (!i2)? i: p2;
                int i5 = (i1 < 2)? i: p2;
                rect.set(i3, i4, i2, i5);
                if (i1 < uArrayList.size()) {
                   p1.drawBitmap(uArrayList.get(i1), null, rect, p4);
                }else {
                   p1.drawRect(rect, p4);
                }
                i1++;
             }
          }else {
             rect.set(0, 0, p2, p2);
             p1.drawBitmap(uArrayList.get(0), null, rect, p4);
          }
       }else if(!p5){
          p1.drawPaint(p4);
       }else {
          throw new IOException("No images");
       }
       return;
    }
    public final boolean b(cv5 p0){
       String str = String.valueOf(p0.c);
       boolean b = (!str.startsWith("spotify:mosaic:") && !str.startsWith("spotify:dailymix:mosaic:"))? false: true;
       return b;
    }
    public final dm5 e(cv5 p0,int p1){
       Bitmap uBitmap1;
       xp6 oxp6 = this;
       cv5 uocv5 = p0;
       wd5 owd5 = oxp6.a.get();
       int i = (p0.a())? Math.min(uocv5.h, uocv5.g): 300;
       Bitmap uBitmap = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
       Object obj = oxp6.c.apply(uBitmap);
       String str = String.valueOf(uocv5.c);
       xp6 d = oxp6.d;
       int i1 = 15;
       char c = ':';
       if (str.startsWith("spotify:mosaic:")) {
          xp6.g(owd5, obj, i, k07.a(c).b(str.substring(i1)), d, true);
       }else {
          List list = k07.a(',').b(k07.a(c).b(str.substring(24)).get(0));
          Paint paint = new Paint(d);
          Matcher matcher = xp6.f.matcher(str);
          Matcher matcher1 = xp6.g.matcher(str);
          int i2 = 1;
          String str1 = "#";
          String str2 = (matcher.find())? str1+matcher.group(i2): "#f8f8f8";
          String str3 = (matcher1.find())? str1+matcher1.group(i2): "#1e3264";
          int i3 = Color.parseColor(str2);
          int i4 = Color.parseColor(str3);
          oxp6.b.getClass();
          float f = (float)Color.red(i4);
          float f1 = (float)Color.green(i4);
          float f2 = (float)Color.blue(i4);
          float[] uofloatArray = new float[]{((float)Color.red(i3) - f) / 0x437f0000,0,0,0,f,((float)Color.green(i3) - f1) / 0x437f0000,0,0,0,f1,((float)Color.blue(i3) - f2) / 0x437f0000,0,0,0,f2,0,0,0,0x3f800000,0};
          ColorMatrix uofloatArray1 = new ColorMatrix();
          uofloatArray1.postConcat(pf1.a);
          uofloatArray1.postConcat(new ColorMatrix(uofloatArray));
          paint.setColorFilter(new ColorMatrixColorFilter(uofloatArray1));
          xp6.g(owd5, obj, i, list, paint, false);
          Matcher matcher2 = xp6.e.matcher(str);
          Rect rect = new Rect(0, 0, i, i);
          while (matcher2.find()) {
             hv5 ohv5 = owd5.g("https://".append(matcher2.group(1)).toString());
             hv5 b = ohv5.b;
             try{
                b.b(i, i);
                if ((uBitmap1 = ohv5.c()) != null) {
                   obj.drawBitmap(uBitmap1, null, rect, d);
                }
             }catch(java.io.IOException e0){
             }
          }
       }
       return new dm5(uBitmap, ud5.t);
    }
}
