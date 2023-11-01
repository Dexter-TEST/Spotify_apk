package p.is0;
import p.mv5;
import android.content.Context;
import p.cv5;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import p.dm5;
import p.ud5;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.nn6;
import p.lf7;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Integer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.ContentResolver;

public class is0 extends mv5	// class@0019f3 from classes.dex
{
    public final int a;
    public final Context b;

    public void is0(Context p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public boolean b(cv5 p0){
       switch (this.a){
           case 0:
           default:
             boolean b = (p0.d != null)? true: "android.resource".equals(p0.c.getScheme());
             return b;
       }
       return "content".equals(p0.c.getScheme());
    }
    public dm5 e(cv5 p0,int p1){
       Resources resources;
       cv5 d;
       BitmapFactory$Options options;
       String authority;
       List pathSegments;
       int i1;
       String authority1;
       ud5 c = ud5.c;
       switch (this.a){
           case 0:
           default:
             cv5 c1 = p0.c;
             String str = "No package provided: ";
             is0 tb = this.b;
             if (p0.d == null && c1 != null) {
                if ((authority1 = c1.getAuthority()) != null) {
                   try{
                      resources = tb.getPackageManager().getResourcesForApplication(authority1);
                   }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                      throw new FileNotFoundException("Unable to obtain resources for package: "+c1);
                   }
                }else {
                   throw new FileNotFoundException(str+c1);
                }
             }else {
                resources = tb.getResources();
             }
             int i = 1;
             if ((d = p0.d) == null && c1 != null) {
                if ((authority = c1.getAuthority()) != null) {
                   if ((pathSegments = c1.getPathSegments()) != null && !pathSegments.isEmpty()) {
                      if (pathSegments.size() == i) {
                         try{
                            i1 = Integer.parseInt(pathSegments.get(0));
                         }catch(java.lang.NumberFormatException e0){
                            throw new FileNotFoundException("Last path segment is not a resource ID: "+i1);
                         }
                      }else if(pathSegments.size() == 2){
                         i1 = resources.getIdentifier(pathSegments.get(i), pathSegments.get(0), authority);
                      }else {
                         throw new FileNotFoundException("More than two path segments: "+c1);
                      }
                      d = i1;
                   }else {
                      throw new FileNotFoundException("No path segments: "+c1);
                   }
                }else {
                   throw new FileNotFoundException(str+c1);
                }
             }
             if ((options = mv5.c(p0)) == null || options.inJustDecodeBounds == null) {
                i = 0;
             }
             if (i) {
                BitmapFactory.decodeResource(resources, d, options);
                mv5.a(p0.g, p0.h, options.outWidth, options.outHeight, options, p0);
             }
             return new dm5(BitmapFactory.decodeResource(resources, d, options), c);
       }
       return new dm5(xe7.d0(this.g(p0)), c);
    }
    public final InputStream g(cv5 p0){
       return this.b.getContentResolver().openInputStream(p0.c);
    }
}
