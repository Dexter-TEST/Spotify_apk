package p.ua7;
import p.vf;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontStyle;
import p.jy6;
import java.lang.Math;
import android.content.Context;
import p.xb2;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font$Builder;
import p.yb2;
import java.lang.String;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.Typeface$CustomFallbackBuilder;
import p.dc2;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.lang.Throwable;
import java.io.InputStream;
import java.lang.RuntimeException;

public final class ua7 extends vf	// class@002876 from classes.dex
{

    public void ua7(){
       super(4);
    }
    public static Font O(FontFamily p0,int p1){
       int i3;
       int i = ((p1 & 0x01))? 700: 400;
       int i1 = 0;
       int i2 = 1;
       p1 = ((p1 & 0x02))? 1: 0;
       FontStyle uFontStyle = new FontStyle(i, p1);
       Font font = p0.getFont(i1);
       i = ua7.P(uFontStyle, font.getStyle());
       while (i2 < p0.getSize()) {
          Font font1 = p0.getFont(i2);
          if ((i3 = ua7.P(uFontStyle, font1.getStyle())) < i) {
             font = font1;
             i = i3;
          }
          i2 = i2 + 1;
       }
       return font;
    }
    public static int P(FontStyle p0,FontStyle p1){
       int i = Math.abs((jy6.b(p0) - jy6.b(p1))) / 100;
       int i1 = (jy6.s(p0) == jy6.s(p1))? 0: 2;
       return (i + i1);
    }
    public final Typeface f(Context p0,xb2 p1,Resources p2,int p3){
       Typeface typeface = null;
       try{
          p1 = p1.a;
          int len = p1.length;
          FontFamily$Builder uBuilder = typeface;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             try{
                Font$Builder uBuilder1 = new Font$Builder(p2, oobject.f).setWeight(oobject.b);
                int i1 = (oobject.c != null)? 1: 0;
                Font uFont = uBuilder1.setSlant(i1).setTtcIndex(oobject.e).setFontVariationSettings(oobject.d).build();
                if (uBuilder == null) {
                   uBuilder = new FontFamily$Builder(uFont);
                }else {
                   uBuilder.addFont(uFont);
                }
                i = i + 1;
             }catch(java.io.IOException e0){
             }
          }
          if (uBuilder == null) {
             return typeface;
          }
          FontFamily uFontFamily = uBuilder.build();
          Typeface$CustomFallbackBuilder uCustomFallb = new Typeface$CustomFallbackBuilder(uFontFamily);
          typeface = uCustomFallb.setStyle(ua7.O(uFontFamily, p3).getStyle()).build();
          return typeface;
       }catch(java.lang.Exception e0){
       }
    }
    public final Typeface h(Context p0,dc2[] p1,int p2){
       ParcelFileDescriptor parcelFileDe;
       ContentResolver contentResol = p0.getContentResolver();
       try{
          int i = 0;
          int len = p1.length;
          FontFamily$Builder uBuilder = i;
          int i1 = 0;
          try{
             while (i1 < len) {
                object oobject = p1[i1];
                try{
                   if ((parcelFileDe = contentResol.openFileDescriptor(oobject.a, "r", i)) == null) {
                      if (parcelFileDe == null) {
                      label_0054 :
                         i1 = i1 + 1;
                      }
                   }else {
                      Font$Builder uBuilder1 = new Font$Builder(parcelFileDe).setWeight(oobject.c);
                      int i2 = (oobject.d != null)? 1: 0;
                      Font uFont = uBuilder1.setSlant(i2).setTtcIndex(oobject.b).build();
                      if (uBuilder == null) {
                         uBuilder = new FontFamily$Builder(uFont);
                      }else {
                         uBuilder.addFont(uFont);
                      }
                   }
                   parcelFileDe.close();
                   goto label_0054 ;
                }catch(java.io.IOException e0){
                }
             }
             if (uBuilder == null) {
                return i;
             }
             FontFamily uFontFamily = uBuilder.build();
             Typeface$CustomFallbackBuilder uCustomFallb = new Typeface$CustomFallbackBuilder(uFontFamily);
             return uCustomFallb.setStyle(ua7.O(uFontFamily, p2).getStyle()).build();
          }catch(java.io.IOException e0){
          }catch(java.lang.Exception e0){
             return e0;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final Typeface k(Context p0,InputStream p1){
       throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    public final Typeface m(Context p0,Resources p1,int p2,String p3,int p4){
       try{
          Font uFont = new Font$Builder(p1, p2).build();
          return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(uFont).build()).setStyle(uFont.getStyle()).build();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final dc2 q(int p0,dc2[] p1){
       throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
