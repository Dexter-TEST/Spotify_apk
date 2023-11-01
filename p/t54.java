package p.t54;
import p.is0;
import java.lang.String;
import android.content.Context;
import p.cv5;
import android.net.Uri;
import java.lang.Object;
import p.dm5;
import android.content.ContentResolver;
import android.database.Cursor;
import p.ud5;
import java.io.InputStream;
import p.on;
import p.xe7;
import android.graphics.Bitmap;
import p.nn6;
import android.content.ContentUris;
import android.graphics.BitmapFactory$Options;
import p.mv5;
import p.tp2;
import android.provider.MediaStore$Video$Thumbnails;
import android.provider.MediaStore$Images$Thumbnails;

public final class t54 extends is0	// class@002703 from classes.dex
{
    public static final String[] c;

    static {
       String[] stringArray = new String[]{"orientation"};
       t54.c = stringArray;
    }
    public void t54(Context p0){
       super(p0, 0);
    }
    public final boolean b(cv5 p0){
       p0 = p0.c;
       boolean b = ("content".equals(p0.getScheme()) && "media".equals(p0.getAuthority()))? true: false;
       return b;
    }
    public final dm5 e(cv5 p0,int p1){
       int i1;
       Cursor uCursor;
       int i2;
       int i5;
       Bitmap thumbnail;
       cv5 uocv5 = p0;
       ContentResolver contentResol = this.b.getContentResolver();
       cv5 c = uocv5.c;
       int i = 0;
       try{
          i1 = 0;
          if ((uCursor = contentResol.query(c, t54.c, null, null, null)) != null && uCursor.moveToFirst()) {
             uCursor.close();
             i2 = uCursor.getInt(i);
          label_0041 :
             cv5 c1 = e0.c;
             String type = contentResol.getType(c1);
             boolean b = true;
             int i3 = (type != null && type.startsWith("video/"))? 1: 0;
             ud5 c2 = ud5.c;
             if (p0.a()) {
                cv5 g = e0.g;
                cv5 h = e0.h;
                int i4 = 96;
                if (g <= i4 && h <= i4) {
                   g = 1;
                }else if(g <= 512 && h <= 384){
                   thumbnail = 2;
                }else {
                   i5 = 3;
                label_0076 :
                   if (!i3 && i5 == 3) {
                      return new dm5(i1, xe7.d0(this.g(p0)), c2, i2);
                   }else {
                      BitmapFactory$Options options = mv5.c(p0);
                      options.inJustDecodeBounds = b;
                      BitmapFactory$Options options1 = options;
                      long l = ContentUris.parseId(c1);
                      mv5.a(e0.g, e0.h, tp2.f(i5), tp2.b(i5), options1, p0);
                      i = tp2.a(i5);
                      if (i3) {
                         options = options1;
                         if (i5 != 3) {
                            b = i;
                         }
                         thumbnail = MediaStore$Video$Thumbnails.getThumbnail(contentResol, l, b, options);
                      }else {
                         thumbnail = MediaStore$Images$Thumbnails.getThumbnail(contentResol, l, i, options1);
                      }
                      if (thumbnail != null) {
                         return new dm5(thumbnail, i1, c2, i2);
                      }
                   }
                }
                i5 = g;
                goto label_0076 ;
             }
             return new dm5(i1, xe7.d0(this.g(p0)), c2, i2);
          }else if(uCursor != null){
          label_003d :
             uCursor.close();
          }
          i2 = 0;
          goto label_0041 ;
       }catch(java.lang.RuntimeException e0){
          uCursor = i1;
       }catch(java.lang.RuntimeException e0){
       }
       if (uCursor) {
          goto label_003d ;
       }else {
       }
    }
}
