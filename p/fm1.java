package p.fm1;
import android.content.Context;
import java.lang.String;
import android.graphics.Typeface;
import java.lang.Object;
import java.util.Arrays;
import p.gm1;
import java.lang.Integer;
import java.util.HashMap;
import android.content.res.Resources;
import java.lang.Number;
import android.graphics.fonts.Font$Builder;
import android.graphics.fonts.Font;
import p.co5;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.Typeface$CustomFallbackBuilder;
import java.util.List;
import android.graphics.fonts.FontStyle;

public abstract class fm1	// class@0015f3 from classes.dex
{

    public static Typeface a(Context p0,int p1,String[] p2){
       Typeface typeface;
       Integer integer;
       int i2;
       int i3;
       Typeface typeface2;
       int i = Arrays.deepHashCode(p2);
       if ((typeface = gm1.a.get(Integer.valueOf(i))) != null) {
          return typeface;
       }
       int len = p2.length;
       Typeface typeface1 = null;
       Typeface$CustomFallbackBuilder uCustomFallb = typeface1;
       int i1 = 0;
       while (i1 < len) {
          object oobject = p2[i1];
          HashMap b = gm1.b;
          if ((integer = b.get(oobject)) == null) {
             integer = Integer.valueOf(p0.getResources().getIdentifier(oobject, "font", p0.getPackageName()));
             b.put(oobject, integer);
          }
          if ((i2 = integer.intValue()) > 0) {
             Font uFont = new Font$Builder(p0.getResources(), i2).build();
             co5.l(uFont, "Builder\(context.resources, fontResId\).build\(\)");
             FontFamily uFontFamily = new FontFamily$Builder(uFont).build();
             co5.l(uFontFamily, "Builder\(font\).build\(\)");
             if (uCustomFallb == null) {
                uCustomFallb = new Typeface$CustomFallbackBuilder(uFontFamily);
             }else {
                uCustomFallb.addCustomFallback(uFontFamily);
             }
          }
          i1 = i1 + 1;
       }
       if (uCustomFallb != null) {
          if (gm1.c.contains(Integer.valueOf(p1))) {
             i3 = 700;
          }else if(gm1.d.contains(Integer.valueOf(p1))){
             i3 = 900;
          }else {
             i3 = 400;
          }
          uCustomFallb.setStyle(new FontStyle(i3, 0));
       }
       if (uCustomFallb != null && (typeface2 = uCustomFallb.build()) != null) {
          gm1.a.put(Integer.valueOf(i), typeface2);
          typeface1 = typeface2;
       }
       return typeface1;
    }
}
