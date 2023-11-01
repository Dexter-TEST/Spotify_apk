package p.ow5;
import p.j22;
import android.net.Uri;
import p.u45;
import java.lang.Object;
import p.au0;
import java.lang.String;
import java.lang.CharSequence;
import p.av6;
import java.util.List;
import p.dj0;
import java.lang.Integer;
import p.yu6;
import android.content.Context;
import p.co5;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import p.r;
import android.graphics.drawable.Drawable;
import p.ry7;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Xml;
import android.content.res.Resources$Theme;
import p.og7;
import p.ie;
import p.xw5;
import p.pw5;
import android.graphics.drawable.VectorDrawable;
import p.je1;
import android.graphics.Bitmap$Config;
import p.fl6;
import android.graphics.Bitmap;
import p.lv1;
import android.graphics.drawable.BitmapDrawable;
import p.tp2;
import java.lang.IllegalStateException;
import org.xmlpull.v1.XmlPullParserException;
import java.io.InputStream;
import p.qn6;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import p.nw5;
import p.pn6;
import java.io.File;
import p.g70;
import p.q63;
import java.lang.StringBuilder;

public final class ow5 implements j22	// class@0021a4 from classes.dex
{
    public final Uri a;
    public final u45 b;

    public void ow5(Uri p0,u45 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(au0 p0){
       String str1;
       Integer integer;
       Drawable uDrawable;
       je1 oje1;
       XmlResourceParser xml;
       og7 oog7;
       Drawable uDrawable1;
       ow5 ta = this.a;
       String authority = ta.getAuthority();
       String str = "Invalid android.resource URI: ";
       if (authority != null) {
          int i = 1;
          if (!((av6.p0(authority) ^ i))) {
             authority = null;
          }
          if (authority != null) {
             if ((str1 = dj0.s0(ta.getPathSegments())) != null && (integer = yu6.c0(str1)) != null) {
                int i1 = integer.intValue();
                ow5 tb = this.b;
                u45 a = tb.a;
                Resources resources = (co5.c(authority, a.getPackageName()))? a.getResources(): a.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(i1, typedValue, i);
                typedValue = typedValue.string;
                String str2 = r.b(MimeTypeMap.getSingleton(), typedValue.subSequence(av6.q0(typedValue, '/', 0, 6), typedValue.length()).toString());
                if (co5.c(str2, "text/xml")) {
                   if (co5.c(authority, a.getPackageName())) {
                      uDrawable = ry7.A(a, i1);
                   }else {
                      xml = resources.getXml(i1);
                      int i2 = xml.next();
                      while (true) {
                         int i3 = 2;
                         if (i2 != i3 && i2 != i) {
                            i2 = xml.next();
                         }else if(i2 == i3){
                            if (Build$VERSION.SDK_INT < 24) {
                               str2 = xml.getName();
                               if (co5.c(str2, "vector")) {
                                  oog7 = new og7();
                                  oog7.inflate(resources, xml, Xml.asAttributeSet(xml), a.getTheme());
                               }else if(co5.c(str2, "animated-vector")){
                                  oog7 = new ie(a);
                                  oog7.inflate(resources, xml, Xml.asAttributeSet(xml), a.getTheme());
                               }
                               uDrawable = oog7;
                            }
                            if ((uDrawable1 = pw5.a(resources, i1, a.getTheme())) != null) {
                               uDrawable = uDrawable1;
                            }else {
                               throw new IllegalStateException(tp2.k("Invalid resource ID: ", i1).toString());
                            }
                         }else {
                            throw new XmlPullParserException("No start tag found.");
                         }
                      }
                   }
                   if (!uDrawable instanceof VectorDrawable && !uDrawable instanceof og7) {
                      i = 0;
                   }
                   if (i) {
                      uDrawable = new BitmapDrawable(a.getResources(), lv1.i(uDrawable, tb.b, tb.d, tb.e, tb.f));
                   }
                   oje1 = new je1(uDrawable, i, 3);
                }else {
                   TypedValue authority1 = new TypedValue();
                   File cacheDir = a.getCacheDir();
                   cacheDir.mkdirs();
                   oje1 = new qn6(new pn6(xe7.f(xe7.d0(resources.openRawResource(i1, authority1))), cacheDir, new nw5(authority1.density)), str2, 3);
                }
                return oje1;
             }else {
                throw new IllegalStateException(str+ta);
             }
          }
       }
       throw new IllegalStateException(str+ta);
    }
}
