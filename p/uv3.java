package p.uv3;
import java.util.HashMap;
import java.util.HashSet;
import p.tg3;
import java.lang.String;
import p.dw3;
import p.sv3;
import p.vv3;
import p.tv3;
import java.lang.Object;
import p.jw3;
import java.io.Closeable;
import p.mf7;
import java.lang.Exception;
import android.content.Context;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import p.kg3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.lang.StringBuilder;
import p.js3;
import java.lang.Class;
import p.bs3;
import android.graphics.Typeface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.util.Map;
import p.cw3;
import p.ib2;
import android.graphics.BitmapFactory$Options;
import android.util.Base64;

public abstract class uv3	// class@00292a from classes.dex
{
    public static final byte[] a;

    static {
       HashMap hashMap = new HashMap();
       HashSet hashMap1 = new HashSet();
       uv3.a = new byte[4]{'P','K',0x03,0x04};
    }
    public static dw3 a(tg3 p0,String p1,boolean p2){
       try{
          sv3 osv3 = vv3.a(p0);
          if (p1 != null) {
             tv3.b.a.c(p1, osv3);
          }
          dw3 uodw31 = new dw3(osv3);
          if (p2) {
             mf7.b(p0);
          }
          return uodw31;
       }catch(java.lang.Exception e3){
          dw3 uodw3 = new dw3(e3);
          if (p2) {
             mf7.b(p0);
          }
          return uodw3;
       }
    }
    public static dw3 b(Context p0,ZipInputStream p1,String p2){
       String[] stringArray;
       int i1;
       Map$Entry uEntry;
       String key;
       cw3 uocw3;
       cw3 value1;
       HashMap hashMap = new HashMap();
       try{
          HashMap hashMap1 = new HashMap();
          ZipEntry nextEntry = p1.getNextEntry();
          sv3 osv3 = null;
          while (true) {
             int b = false;
             int i = 1;
             if (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                   p1.closeEntry();
                }else if(nextEntry.getName().equalsIgnoreCase("manifest.json")){
                   p1.closeEntry();
                }else if(nextEntry.getName().contains(".json")){
                   osv3 = uv3.a(new tg3(xe7.f(xe7.d0(p1))), null, b).a;
                }else {
                   String str = "/";
                   if (!name.contains(".png") && (!name.contains(".webp") && (!name.contains(".jpg") && !name.contains(".jpeg")))) {
                      if (!name.contains(".ttf") && !name.contains(".otf")) {
                         p1.closeEntry();
                      }else {
                         stringArray = name.split(str);
                         object oobject = stringArray[(stringArray.length - i)];
                         object oobject1 = oobject.split("\\.")[b];
                         File uFile = new File(p0.getCacheDir(), oobject);
                         FileOutputStream str1 = new FileOutputStream(uFile);
                         str1 = new FileOutputStream(uFile);
                         byte[] uobyteArray = new byte[4096];
                         while ((i1 = p1.read(uobyteArray)) != -1) {
                            str1.write(uobyteArray, b, i1);
                         }
                         str1.flush();
                         str1.close();
                         Typeface typeface = Typeface.createFromFile(uFile);
                         if (!uFile.delete()) {
                            js3.a("".append("Failed to delete temp font file ").append(uFile.getAbsolutePath()).append(".").toString());
                         }
                         hashMap1.put(oobject1, typeface);
                      }
                   }else {
                      stringArray = name.split(str);
                      b = stringArray.length - i;
                      hashMap.put(stringArray[b], BitmapFactory.decodeStream(p1));
                   }
                }
                nextEntry = p1.getNextEntry();
             }else if(osv3 == null){
                return new dw3(new IllegalArgumentException("Unable to parse composition"));
             }else {
                Iterator iterator = hashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   key = uEntry.getKey();
                   Iterator iterator1 = osv3.d.values().iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         uocw3 = iterator1.next();
                         if (!uocw3.c.equals(key)) {
                            continue ;
                         }
                      }else {
                         uocw3 = null;
                      }
                      if (uocw3 != null) {
                         Bitmap value = uEntry.getValue();
                         cw3 a = uocw3.a;
                         cw3 b1 = uocw3.b;
                         if (value.getWidth() != a || value.getHeight() != b1) {
                            value.recycle();
                            value = Bitmap.createScaledBitmap(value, a, b1, i);
                         }
                         uocw3.d = value;
                      }else {
                         continue ;
                      }
                   }
                }
                iterator = hashMap1.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   Iterator iterator2 = osv3.e.values().iterator();
                   key = 0;
                   while (iterator2.hasNext()) {
                      ib2 oib2 = iterator2.next();
                      if (oib2.a.equals(uEntry.getKey())) {
                         oib2.c = uEntry.getValue();
                         key = 1;
                      }
                   }
                   if (!key) {
                      js3.a("Parsed font for ".append(uEntry.getKey()).append(" however it was not found in the animation.").toString());
                   }
                }
                if (hashMap.isEmpty()) {
                   iterator = osv3.d.entrySet().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if ((value1 = iterator.next().getValue()) == null) {
                            return null;
                         }else {
                            BitmapFactory$Options options = new BitmapFactory$Options();
                            options.inScaled = i;
                            options.inDensity = 160;
                            cw3 c = value1.c;
                            if (c.startsWith("data:") && c.indexOf("base64,") > 0) {
                               int i2 = c.indexOf(44) + i;
                               byte[] uobyteArray1 = Base64.decode(c.substring(i2), b);
                               value1.d = BitmapFactory.decodeByteArray(uobyteArray1, b, uobyteArray1.length, options);
                            }
                         }
                      }
                   }
                }
                if (p2 != null) {
                   tv3.b.a.c(p2, osv3);
                }
                return new dw3(osv3);
             }
          }
       }catch(java.io.IOException e12){
          return new dw3(e12);
       }
    }
}
