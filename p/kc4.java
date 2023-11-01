package p.kc4;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import p.ye7;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.jc4;
import p.ic4;
import p.co5;
import java.lang.Math;
import p.v12;
import p.t12;
import android.content.Context;
import p.sz1;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import java.lang.CharSequence;
import p.av6;
import p.bc;
import java.io.File;
import java.lang.StringBuilder;
import p.up0;
import p.d32;
import p.b3;
import org.json.JSONObject;
import android.os.Bundle;
import android.text.TextUtils;
import android.os.BaseBundle;
import p.tm2;
import p.a3;
import p.om2;
import p.az5;
import p.xm2;
import org.json.JSONArray;
import p.qz3;
import java.lang.System;
import p.gc4;
import p.ts5;
import java.util.Collection;
import java.nio.charset.Charset;
import java.lang.NullPointerException;
import p.b17;
import java.util.HashMap;
import java.lang.Enum;
import p.ib3;
import p.eb3;
import java.lang.Iterable;
import p.aj0;
import p.gb3;
import p.hb3;
import p.cd2;

public abstract class kc4	// class@001be9 from classes.dex
{
    public static final ConcurrentHashMap a;
    public static final List b;
    public static final List c;

    static {
       kc4.a = new ConcurrentHashMap();
       String[] stringArray = new String[]{"other","fb_mobile_complete_registration","fb_mobile_add_to_cart","fb_mobile_purchase","fb_mobile_initiated_checkout"};
       kc4.b = ye7.K(stringArray);
       stringArray = new String[]{"none","address","health"};
       kc4.c = ye7.K(stringArray);
    }
    public static void a(){
       String key;
       Configuration locale;
       File[] uFileArray;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = kc4.a.entrySet().iterator();
       String str = null;
       int i = 0;
       while (true) {
          int i1 = 1;
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             key = uEntry.getKey();
             jc4 value = uEntry.getValue();
             if (co5.c(key, ic4.b.b())) {
                str = value.b;
                i = Math.max(i, value.d);
                if (v12.c(t12.A)) {
                   try{
                      locale = sz1.a().getResources().getConfiguration().locale;
                   }catch(java.lang.Exception e0){
                      locale = null;
                   }
                   if (locale != null) {
                      String language = locale.getLanguage();
                      co5.l(language, "locale.language");
                      if (!av6.f0(language, "en")) {
                         i1 = 0;
                      }
                   }
                   if (i1) {
                      value.h = new bc(11);
                      e0.add(value);
                   }
                }
             }
             if (co5.c(key, ic4.a.b())) {
                str = value.b;
                i = Math.max(i, value.d);
                if (v12.c(t12.B)) {
                   value.h = new bc(12);
                   e0.add(value);
                }
             }
          }else if(str != null && (i > 0 && !uArrayList.isEmpty())){
             File uFile = co5.x();
             String str1 = "MTML";
             if (uFile != null && (uFileArray = uFile.listFiles()) != null) {
                key = (!uFileArray.length)? 1: 0;
                if (!key) {
                   key = str1+'_'+i;
                   int len = uFileArray.length;
                   int i2 = 0;
                   while (i2 < len) {
                      object oobject = uFileArray[i2];
                      i2 = i2 + 1;
                      String name = oobject.getName();
                      co5.l(name, "name");
                      if (av6.D0(name, str1, false) && !av6.D0(name, key, false)) {
                         oobject.delete();
                      }
                   }
                }
             }
             b3.j(str, str1+'_'+i, new up0(i1, uArrayList));
          }
          return;
       }
    }
    public static JSONObject b(){
       xm2 b;
       JSONObject uoa31;
       int i;
       int i2;
       JSONObject jSONObject;
       JSONObject jSONObject1;
       String[] stringArray = new String[]{"use_case","version_id","asset_uri","rules_uri","thresholds"};
       Bundle uBundle = new Bundle();
       uBundle.putString("fields", TextUtils.join(",", stringArray));
       a3 uoa3 = null;
       tm2 otm2 = az5.M(uoa3, "app/model_asset", uoa3);
       otm2.d = uBundle;
       if ((b = otm2.c().b) == null) {
          return uoa3;
       }
       try{
          uoa31 = new JSONObject();
          JSONArray jSONArray = b.getJSONArray("data");
          if ((i = jSONArray.length()) > 0) {
             int i1 = 0;
             while (true) {
                i2 = i1 + 1;
                jSONObject = jSONArray.getJSONObject(i1);
                jSONObject1 = new JSONObject();
                jSONObject1.put("version_id", jSONObject.getString("version_id"));
                jSONObject1.put("use_case", jSONObject.getString("use_case"));
                jSONObject1.put("thresholds", jSONObject.getJSONArray("thresholds"));
                jSONObject1.put("asset_uri", jSONObject.getString("asset_uri"));
                if (jSONObject.has("rules_uri")) {
                   jSONObject1.put("rules_uri", jSONObject.getString("rules_uri"));
                   break ;
                }else {
                   break ;
                }
             }
             uoa31.put(jSONObject.getString("use_case"), jSONObject1);
             if (i2 < i) {
                i1 = i2;
             }
          }
       }catch(org.json.JSONException e0){
          uoa31 = new JSONObject();
       }
       return uoa31;
    }
    public static final String[] c(ic4 p0,float[][] p1,String[] p2){
       int i4;
       int i5;
       int i8;
       jc4 ojc41;
       Object[] objArray;
       int i10;
       int i12;
       int i14;
       String[] stringArray2;
       float f;
       int i = p2;
       jc4 ojc4 = kc4.a.get(p0.b());
       String[] stringArray = null;
       gc4 ogc4 = (ojc4 == null)? stringArray: ojc4.g;
       if (ogc4 == null) {
          return stringArray;
       }else {
          ojc4 = ojc4.e;
          int len = i.length;
          int i1 = 0;
          int len1 = p1[i1].length;
          int i2 = 2;
          int[] ointArray = new int[i2];
          ointArray[i1] = len;
          int i3 = 1;
          ointArray[i3] = len1;
          qz3 oqz3 = new qz3(ointArray);
          if (len > 0) {
             i4 = 0;
             while (true) {
                i5 = i4 + 1;
                i4 = i4 * len1;
                System.arraycopy(p1[i4], i1, oqz3.c, i4, len1);
                if (i5 < len) {
                   i4 = i5;
                }
             }
          }
          String str = p0.a();
          gc4 a = ogc4.a;
          co5.o(a, "w");
          len1 = i.length;
          i5 = a.a[i3];
          int[] ointArray1 = new int[3];
          ointArray1[0] = len1;
          int i6 = 128;
          ointArray1[1] = i6;
          ointArray1[2] = i5;
          qz3 oqz31 = new qz3(ointArray1);
          qz3 c = oqz31.c;
          qz3 c1 = a.c;
          String str1 = "null cannot be cast to non-null type kotlin.Array<T>";
          if (len1 > 0) {
             int i7 = 0;
             while (true) {
                i8 = i7 + 1;
                object oobject = i[i7];
                co5.o(oobject, "texts");
                int[] ointArray2 = new int[i6];
                int i9 = oobject.length() - 1;
                i6 = i9;
                i9 = 0;
                break ;
             }
             while (true) {
                if (i1 <= i6) {
                   i = (!i9)? i1: i6;
                   ojc41 = ojc4;
                   i = (co5.r(oobject.charAt(i), 32) <= 0)? 1: 0;
                   if (!i9) {
                      if (!i) {
                         ojc4 = ojc41;
                         i9 = 1;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else if(!i){
                   label_00b0 :
                      i6 = i6 + 1;
                      String[] stringArray1 = new String[0];
                      if ((objArray = new ts5("\\s+").a(oobject.subSequence(i1, i6).toString()).toArray(stringArray1)) != null) {
                         String str2 = TextUtils.join(" ", objArray);
                         co5.l(str2, "join\(\" \", strArray\)");
                         Charset uCharset = Charset.forName("UTF-8");
                         co5.l(uCharset, "forName\(\"UTF-8\"\)");
                         byte[] bytes = str2.getBytes(uCharset);
                         co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                         i10 = 0;
                         while (true) {
                            i1 = i10 + 1;
                            if (i10 < bytes.length) {
                               i3 = bytes[i10] & 0x00ff;
                               ointArray2[i10] = i3;
                            label_00ff :
                               if (i1 >= 128) {
                                  i = 0;
                                  while (true) {
                                     i10 = i + 1;
                                     i1 = ointArray2[i] * i5;
                                     i3 = i5 * 128;
                                     i3 = i3 * i7;
                                     i = i * i5;
                                     i = i + i3;
                                     System.arraycopy(c1, i1, c, i, i5);
                                     if (i10 >= 128) {
                                        break ;
                                     }else {
                                        i = i10;
                                     }
                                  }
                                  if (i8 < len1) {
                                     i = p2;
                                     i7 = i8;
                                     ojc4 = ojc41;
                                     i1 = 0;
                                     i6 = 128;
                                  }
                               }else {
                                  i10 = i1;
                               }
                            }else {
                               ointArray2[i10] = 0;
                               goto label_00ff ;
                            }
                         }
                         return stringArray;
                      }else {
                         throw new NullPointerException(str1);
                      }
                   }else {
                      i6 = i6 - 1;
                   }
                   ojc4 = ojc41;
                }else {
                   ojc41 = ojc4;
                   goto label_00b0 ;
                }
             }
          }else {
             ojc41 = ojc4;
          }
          qz3 oqz32 = b17.h(oqz31, ogc4.b);
          b17.d(oqz32, ogc4.e);
          b17.x(oqz32);
          qz3 oqz33 = b17.h(oqz32, ogc4.c);
          b17.d(oqz33, ogc4.f);
          b17.x(oqz33);
          oqz33 = b17.t(oqz33, 2);
          qz3 oqz34 = b17.h(oqz33, ogc4.d);
          b17.d(oqz34, ogc4.g);
          b17.x(oqz34);
          i2 = 1;
          oqz32 = b17.t(oqz32, oqz32.a[i2]);
          oqz33 = b17.t(oqz33, oqz33.a[i2]);
          oqz34 = b17.t(oqz34, oqz34.a[i2]);
          b17.m(oqz32);
          b17.m(oqz33);
          b17.m(oqz34);
          qz3[] oqz3Array = new qz3[4];
          oqz3Array[0] = oqz32;
          oqz3Array[1] = oqz33;
          oqz3Array[2] = oqz34;
          i10 = 3;
          oqz3Array[3] = oqz3;
          i = oqz32.a[0];
          i1 = 0;
          int i11 = 0;
          while (true) {
             i4 = i1 + 1;
             i11 = i11 + oqz3Array[i1].a[i2];
             if (i4 > i10) {
                break ;
             }else {
                i1 = i4;
             }
          }
          int[] ointArray3 = new int[]{i,i11};
          oqz33 = new qz3(ointArray3);
          oqz34 = oqz33.c;
          if (i > 0) {
             i2 = 0;
             while (true) {
                i4 = i2 + 1;
                i3 = i2 * i11;
                i5 = 0;
                break ;
             }
             while (true) {
                i12 = i5 + 1;
                object oobject1 = oqz3Array[i5];
                i5 = oobject1.a[1];
                int i13 = i2 * i5;
                System.arraycopy(oobject1.c, i13, oqz34, i3, i5);
                i3 = i3 + i5;
                if (i12 > 3) {
                   break ;
                }else {
                   i5 = i12;
                }
             }
             if (i4 < i) {
                i2 = i4;
             }
          }
          oqz32 = b17.k(oqz33, ogc4.h, ogc4.j);
          b17.x(oqz32);
          oqz32 = b17.k(oqz32, ogc4.i, ogc4.k);
          b17.x(oqz32);
          gc4 l = ogc4.l;
          qz3 oqz35 = l.get(co5.K(".weight", str));
          oqz33 = l.get(co5.K(".bias", str));
          if (oqz35 != null && oqz33 != null) {
             oqz32 = b17.k(oqz32, oqz35, oqz33);
             oqz33 = oqz32.a;
             len = oqz33[0];
             i10 = oqz33[1];
             oqz35 = oqz32.c;
             if (len > 0) {
                i1 = 0;
                while (true) {
                   len1 = i1 + 1;
                   i1 = i1 * i10;
                   i11 = i1 + i10;
                   f = Float.MIN_VALUE;
                   if (i1 < i11) {
                      i4 = i1;
                      while (true) {
                         i3 = i4 + 1;
                         i4 = oqz35[i4];
                         if ((f - i4) > 0) {
                            f = i4;
                            break ;
                         }else if(i3 >= i11){
                         }else {
                            i4 = i3;
                         }
                      }
                   }else {
                      break ;
                   }
                }
                float f1 = 0;
                if (i1 < i11) {
                   i3 = i1;
                   while (true) {
                      i5 = i3 + 1;
                      float f2 = oqz35[i3] - f;
                      f2 = (float)Math.exp((double)f2);
                      oqz35[i3] = f2;
                      f1 = f1 + f2;
                      if (i5 < i11) {
                         i3 = i5;
                      }
                   }
                }
                if (i1 < i11) {
                   while (true) {
                      i2 = i1 + 1;
                      float f3 = oqz35[i1] / f1;
                      oqz35[i1] = f3;
                      if (i2 < i11) {
                         i1 = i2;
                      }
                   }
                }
                if (len1 < len) {
                   i1 = len1;
                }
             }
          }else {
             oqz32 = null;
          }
          if (oqz32 != null && ojc41 != null) {
             l = (!oqz32.c.length)? 1: 0;
             if (!l) {
                ojc4 = ojc41;
                oqz35 = (!ojc4.length)? 1: 0;
                if (!oqz35) {
                   if (i14 = p0.ordinal()) {
                      len = 1;
                      if (i14 == len) {
                         oqz35 = oqz32.a;
                         i1 = 0;
                         len1 = oqz35[i1];
                         i14 = oqz35[len];
                         oqz32 = oqz32.c;
                         if (i14 == ojc4.length) {
                            ib3 oib3 = eb3.J(i1, len1);
                            ArrayList uArrayList = new ArrayList(aj0.b0(oib3));
                            Iterator iterator = oib3.iterator();
                            while (iterator.c != null) {
                               len1 = iterator.nextInt();
                               i11 = ojc4.length;
                               String str3 = "other";
                               i4 = 0;
                               i3 = 0;
                               while (i4 < i11) {
                                  i12 = i3 + 1;
                                  i8 = len1 * i14;
                                  i8 = i8 + i3;
                                  if ((ojc4[i4] - oqz32[i8]) >= 0) {
                                     str3 = kc4.b.get(i3);
                                  }
                                  i4 = i4 + 1;
                                  i3 = i12;
                               }
                               uArrayList.add(str3);
                            }
                            stringArray2 = new String[0];
                            if ((objArray = uArrayList.toArray(stringArray2)) != null) {
                            }else {
                               throw new NullPointerException(str1);
                            }
                         }
                      }else {
                         throw new cd2(10);
                      }
                   }else {
                      oqz35 = oqz32.a;
                      len = 0;
                      i1 = oqz35[len];
                      i14 = oqz35[1];
                      oqz32 = oqz32.c;
                      if (i14 == ojc4.length) {
                         ib3 oib31 = eb3.J(len, i1);
                         ArrayList uArrayList1 = new ArrayList(aj0.b0(oib31));
                         Iterator iterator1 = oib31.iterator();
                         while (iterator1.c != null) {
                            len1 = iterator1.nextInt();
                            i11 = ojc4.length;
                            String str4 = "none";
                            i2 = 0;
                            i4 = 0;
                            while (i2 < i11) {
                               i12 = i4 + 1;
                               i8 = len1 * i14;
                               i8 = i8 + i4;
                               if ((ojc4[i2] - oqz32[i8]) >= 0) {
                                  str4 = kc4.c.get(i4);
                               }
                               i2 = i2 + 1;
                               i4 = i12;
                            }
                            uArrayList1.add(str4);
                         }
                         stringArray2 = new String[0];
                         if ((objArray = uArrayList1.toArray(stringArray2)) != null) {
                         }else {
                            throw new NullPointerException(str1);
                         }
                      }
                   }
                   Object[] objArray1 = objArray;
                }
             }
          }
          stringArray = null;
       }
    }
}
