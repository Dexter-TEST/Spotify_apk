package p.tp6;
import p.dq6;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.Object;
import p.co5;
import android.net.Uri;
import p.yk3;
import p.av6;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.List;
import java.lang.StringBuilder;
import p.zp6;
import android.content.UriMatcher;
import java.lang.Class;
import java.util.EnumMap;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.ArrayList;
import p.gw1;
import p.px;
import p.wp2;
import p.r27;
import p.ne7;
import p.gj2;
import p.nn5;
import p.wd7;
import p.sd7;
import java.lang.Comparable;
import p.ye7;

public final class tp6	// class@0027b9 from classes.dex
{
    public final Uri a;
    public final String b;
    public final yk3 c;
    public final String d;
    public static final UriMatcher e;
    public static final Map f;

    static {
       tp6.e = dq6.b;
       Pattern.compile("user:\([^:]+\)");
       Map map = Collections.synchronizedMap(new WeakHashMap(16));
       co5.l(map, "create\(\)");
       tp6.f = map;
    }
    public void tp6(String p0){
       String str2;
       tp6 td;
       Uri uri;
       int i;
       zp6 ozp6;
       yk3 d3;
       int i5;
       Pattern pattern;
       super();
       String str = null;
       if (p0 == null) {
          this.a = Uri.EMPTY;
          this.c = yk3.d3;
          this.d = str;
          this.b = str;
       }else {
          String str1 = "spotify://";
          boolean b = false;
          if (av6.D0(p0, str1, b)) {
             this.d = str1;
          }else if(av6.D0(p0, "spotify:", b)){
             this.d = "spotify:";
          }else {
             str1 = "http://open.spotify.com/";
             if (av6.D0(p0, str1, b)) {
                this.d = str1;
             }else {
                str1 = "https://open.spotify.com/";
                if (av6.D0(p0, str1, b)) {
                   this.d = str1;
                }else {
                   str1 = "https://r.spotify.com/";
                   if (av6.D0(p0, str1, b)) {
                      if ((i5 = av6.n0(p0, "/app_android/", b, b, 6)) > 0) {
                         str2 = p0.substring((i5 + 13));
                         co5.l(str2, "this as java.lang.String\).substring\(startIndex\)");
                         pattern = Pattern.compile("\([^/?]+\).*");
                         co5.l(pattern, "compile\(pattern\)");
                         Matcher matcher = pattern.matcher(str2);
                         str2 = matcher.replaceFirst("$1");
                         co5.l(str2, "nativePattern.matcher\(in…replaceFirst\(replacement\)");
                         p0 = p0.substring(b, i5);
                         co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
                      }else {
                         str2 = str;
                      }
                      this.d = str1;
                   label_0088 :
                      this.b = str2;
                      if ((td = this.d) == null) {
                         this.a = Uri.EMPTY;
                         this.c = yk3.d3;
                      }else {
                         p0 = p0.substring(td.length());
                         co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
                         str2 = "/";
                         if (av6.D0(p0, "intl-", b)) {
                            String[] stringArray2 = new String[]{str2};
                            List list2 = av6.B0(p0, stringArray2, b, 6);
                            i = (list2.size() == 1 && !av6.g0(p0, str2, b))? list2.get(b).length(): (list2.get(b)+'/').length();
                            if (p0.length() >= i) {
                               p0 = p0.substring(i);
                               co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
                            }
                         }
                         if (co5.c(p0, "?")) {
                            this.a = Uri.EMPTY;
                            this.c = yk3.d3;
                         }else {
                            p0 = zp6.k.matcher(p0).replaceAll(str2);
                            if ((uri = Uri.parse(p0)) == null) {
                               uri = Uri.EMPTY;
                            }
                            this.a = uri;
                            co5.l(p0, "escapedUrlWithoutPrefix");
                            object oobject = zp6.l.split(p0, b)[b];
                            uri = Uri.parse(oobject);
                            Uri eMPTY = Uri.EMPTY;
                            if (uri == null) {
                               uri = eMPTY;
                            }
                            if ((i = tp6.e.match(uri)) != -1) {
                               co5.l(oobject, "strippedUriWithoutPrefix");
                               oobject = zp6.m.split(oobject, b)[b];
                               co5.l(oobject, "cleanedUri");
                               String[] stringArray = new String[]{str2};
                               List list = av6.B0(oobject, stringArray, b, 6);
                               yk3.a.getClass();
                               object oobject1 = yk3.b[i];
                               co5.o(oobject1, "linkType");
                               if ((ozp6 = dq6.a.get(oobject1)) != null) {
                                  str = ozp6.c;
                               }
                               if (str != null && !str.isEmpty()) {
                                  Iterator iterator = str.iterator();
                                  while (iterator.hasNext()) {
                                     str2 = iterator.next();
                                     co5.o(str2, "pattern");
                                     if (av6.D0(str2, "spotify:", b)) {
                                        str2 = str2.substring(8);
                                        co5.l(str2, "this as java.lang.String\).substring\(startIndex\)");
                                     }
                                     String[] stringArray1 = new String[]{":"};
                                     List list1 = av6.B0(str2, stringArray1, b, 6);
                                     if (list1.size() == list.size()) {
                                        ArrayList uArrayList = new ArrayList();
                                        Iterator iterator1 = list1.iterator();
                                        while (iterator1.hasNext()) {
                                           String str3 = iterator1.next();
                                           int i1 = (!str3.length())? 1: 0;
                                           if (i1) {
                                              uArrayList.add(new gw1(""));
                                           }else {
                                              int i2 = 123;
                                              if (str3.charAt(b) == i2 && av6.g0(str3, "as Base62}", b)) {
                                                 uArrayList.add(px.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "as Hex64}", b)){
                                                 uArrayList.add(wp2.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "as text}", b)){
                                                 uArrayList.add(r27.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "as Username}", b)){
                                                 uArrayList.add(ne7.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "as GidID}", b)){
                                                 uArrayList.add(gj2.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "as Query}", b)){
                                                 uArrayList.add(nn5.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "as URL}", b)){
                                                 uArrayList.add(wd7.b);
                                              }else if(str3.charAt(b) == i2 && av6.g0(str3, "}", b)){
                                                 uArrayList.add(sd7.a);
                                              }else {
                                                 uArrayList.add(new gw1(str3));
                                              }
                                           }
                                        }
                                        int i3 = list.size();
                                        int i4 = 0;
                                        while (true) {
                                           if (i4 < i3) {
                                              if (!uArrayList.get(i4).a(list.get(i4))) {
                                                 i3 = 0;
                                              label_02ae :
                                                 if (i3) {
                                                    i3 = list.size();
                                                    i4 = 0;
                                                    while (true) {
                                                       if (i4 < i3) {
                                                          if (!uArrayList.get(i4).b(list.get(i4))) {
                                                             i3 = 0;
                                                          label_02cf :
                                                             if (i3) {
                                                                i3 = 1;
                                                             label_02d4 :
                                                                if (list1) {
                                                                   b = true;
                                                                }else {
                                                                   continue ;
                                                                }
                                                             }
                                                          }else {
                                                             i4 = i4 + 1;
                                                          }
                                                       }else {
                                                          i3 = 1;
                                                          goto label_02cf ;
                                                       }
                                                    }
                                                 }
                                              }else {
                                                 i4 = i4 + 1;
                                              }
                                           }else {
                                              i3 = 1;
                                              goto label_02ae ;
                                           }
                                        }
                                     }
                                     list1 = 0;
                                     goto label_02d4 ;
                                  }
                               }
                               if (b) {
                                  yk3.a.getClass();
                                  d3 = yk3.b[i];
                               label_02e6 :
                                  this.c = d3;
                               }
                            }
                            d3 = yk3.d3;
                            goto label_02e6 ;
                         }
                      }
                   }else {
                      this.d = str;
                   }
                }
             }
          }
          str2 = str;
          goto label_0088 ;
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof tp6) {
          return false;
       }
       if (!co5.c(this.a, p0.a) || !co5.c(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Comparable[] uComparableA = new Comparable[]{this.a,this.b};
       return ye7.K(uComparableA).hashCode();
    }
    public final String toString(){
       return String.valueOf(this.a);
    }
}
