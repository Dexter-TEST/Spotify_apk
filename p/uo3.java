package p.uo3;
import p.vd5;
import p.qc0;
import java.lang.Object;
import p.c0;
import p.cv5;
import java.lang.String;
import p.co5;
import android.net.Uri;
import p.k07;
import p.am2;
import p.so6;
import java.lang.CharSequence;
import java.util.List;
import java.lang.StringBuilder;
import p.vf;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.IllegalStateException;
import android.graphics.Bitmap$Config;
import p.pd7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.r45;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.net.Uri$Builder;

public final class uo3 implements vd5	// class@0028ec from classes.dex
{
    public r45 a;
    public final qc0 b;

    public void uo3(qc0 p0){
       super();
       this.a = c0.a;
       this.b = p0;
    }
    public final cv5 l(cv5 p0){
       Uri uri;
       cv5 g;
       cv5 h;
       cv5 i1;
       cv5 k;
       cv5 j;
       cv5 m;
       cv5 l;
       cv5 uocv54;
       int i2;
       Uri matcher1;
       cv5 h1;
       cv5 i3;
       cv5 uocv56;
       cv5 uocv57;
       ArrayList uArrayList1;
       int i5;
       uo3 ouo3;
       Uri uri1;
       cv5 uocv59;
       List list1;
       cv5 uocv5 = p0;
       if (uocv5.d != null) {
          return uocv5;
       }
       cv5 c = uocv5.c;
       co5.o(c, "requestUri");
       int i = 2;
       if (co5.c("mosaic.scdn.co", c.getHost()) && c.getLastPathSegment() != null) {
          String lastPathSegm = c.getLastPathSegment();
          co5.i(lastPathSegm);
          List list = new k07(new am2(40, i)).b(lastPathSegm);
          if (list.size() == 4) {
             uri = Uri.parse("spotify:mosaic:"+new vf(String.valueOf(':')).r(list));
          label_0065 :
             String str = "Center inside requires calling resize with positive width and height.";
             lastPathSegm = "Center crop requires calling resize with positive width and height.";
             String str1 = "Center crop and center inside can not be used together.";
             cv5 s = uocv5.s;
             cv5 f = uocv5.f;
             if (uri != null) {
                c = uocv5.e;
                g = uocv5.g;
                h = uocv5.h;
                i1 = uocv5.i;
                k = uocv5.k;
                j = uocv5.j;
                m = uocv5.m;
                cv5 uocv51 = uocv5.o;
                cv5 uocv52 = uocv5.p;
                cv5 uocv53 = uocv5.q;
                l = uocv5.l;
                uocv54 = uocv5.n;
                ArrayList uArrayList = (f != null)? new ArrayList(f): null;
                uocv5 = uocv5.r;
                if (k != null && i1 != null) {
                   throw new IllegalStateException(str1);
                }else if(i1 != null && (g == null && h == null)){
                   throw new IllegalStateException(lastPathSegm);
                }else if(k != null && (g == null && h == null)){
                   throw new IllegalStateException(str);
                }else if(s == null){
                   i2 = 2;
                }else {
                   i2 = s;
                }
                cv5 str2 = new cv5(uri, 0, c, uArrayList, g, h, i1, k, j, l, m, uocv54, uocv51, uocv52, uocv53, uocv5, i2);
                return str;
             }else {
                Matcher matcher = pd7.a.matcher(c.toString());
                if (matcher.lookingAt()) {
                   matcher1 = Uri.parse(matcher.replaceFirst(Matcher.quoteReplacement("https://i.scdn.co/image/")));
                   co5.l(matcher1, "{\n            Uri.parse\(…nt\(IMAGE_CDN\)\)\)\n        }");
                }else {
                   matcher1 = c;
                }
                if (!"https".equals(matcher1.getScheme()) && !"http".equals(matcher1.getScheme())) {
                   return uocv5;
                }else if(matcher1.getAuthority() == null){
                   return uocv5;
                }else if(matcher1 != c){
                   c = uocv5.e;
                   m = uocv5.g;
                   h1 = uocv5.h;
                   i3 = uocv5.i;
                   g = uocv5.k;
                   h = uocv5.j;
                   i1 = uocv5.m;
                   cv5 uocv55 = uocv5.o;
                   uocv56 = uocv5.p;
                   uocv57 = uocv5.q;
                   j = uocv5.l;
                   cv5 uocv58 = uocv5.n;
                   uArrayList1 = (f != null)? new ArrayList(f): null;
                   uocv5 = uocv5.r;
                   int i4 = 0;
                   if (g != null && i3 != null) {
                      throw new IllegalStateException(str1);
                   }else if(i3 != null && (m == null && h1 == null)){
                      throw new IllegalStateException(lastPathSegm);
                   }else if(g != null && (m == null && h1 == null)){
                      throw new IllegalStateException(str);
                   }else if(s == null){
                      i5 = 2;
                   }else {
                      uocv59 = s;
                   }
                   uocv54 = new cv5(matcher1, i4, c, uArrayList1, m, h1, i3, g, h, j, i1, uocv58, uocv55, uocv56, uocv57, uocv5, i5);
                   ouo3 = this;
                   uocv5 = s;
                }else {
                   ouo3 = this;
                }
                if (ouo3.a.c()) {
                   Map map = ouo3.a.b();
                   co5.o(map, "cdnMappings");
                   Iterator iterator = map.entrySet().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Map$Entry uEntry = iterator.next();
                         String key = uEntry.getKey();
                         String value = uEntry.getValue();
                         if (co5.c(key, matcher1.getAuthority())) {
                            uri1 = matcher1.buildUpon().authority(value).appendQueryParameter("format", "webp").build();
                         }
                      }else {
                         uri1 = null;
                      }
                      if (uri1 != null) {
                         l = uocv5.e;
                         m = uocv5.g;
                         h1 = uocv5.h;
                         i3 = uocv5.i;
                         s = uocv5.k;
                         f = uocv5.j;
                         g = uocv5.m;
                         h = uocv5.n;
                         i1 = uocv5.o;
                         c = uocv5.l;
                         uocv57 = uocv5.q;
                         j = uocv5.f;
                         uocv56 = uocv5.p;
                         uArrayList1 = (j != null)? new ArrayList(j): null;
                         k = uocv5.r;
                         if (s != null && i3 != null) {
                            throw new IllegalStateException(str1);
                         }else if(i3 != null && (m == null && h1 == null)){
                            throw new IllegalStateException(lastPathSegm);
                         }else if(s != null && (m == null && h1 == null)){
                            throw new IllegalStateException(str);
                         }else if((uocv5 = uocv5.s) == null){
                            i5 = 2;
                         }else {
                            uocv59 = uocv5;
                         }
                         uocv54 = new cv5(uri1, 0, l, uArrayList1, m, h1, i3, s, f, c, g, h, i1, uocv56, uocv57, k, i5);
                         break ;
                      }
                   }
                }
                return uocv5;
             }
          }
       }
       uri = null;
       goto label_0065 ;
    }
}
