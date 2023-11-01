package p.js2;
import p.lv5;
import p.r90;
import p.su0;
import java.lang.Object;
import p.cy5;
import java.lang.reflect.Method;
import p.kv5;
import p.y11;
import java.lang.String;
import p.vh2;
import p.pn2;
import p.g55;
import p.j55;
import p.k55;
import p.jo4;
import p.rn2;
import p.lp2;
import p.sm2;
import p.u54;
import p.gg1;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import p.do5;
import p.mp2;
import p.ge4;
import p.rc2;
import p.lv1;
import p.ud7;
import java.lang.reflect.Type;
import p.ps2;
import java.net.URI;
import java.lang.Class;
import p.h75;
import p.n95;
import p.i70;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.lang.annotation.Annotation;
import p.j75;
import p.gn5;
import java.lang.Iterable;
import java.lang.reflect.ParameterizedType;
import p.e75;
import p.c75;
import java.lang.StringBuilder;
import p.ln5;
import p.k75;
import p.kn5;
import java.util.Map;
import p.f75;
import p.qo2;
import p.g75;
import p.hp2;
import p.d75;
import p.o22;
import p.p22;
import p.s75;
import p.ie4;
import p.l75;
import p.tp2;
import p.i75;
import p.u75;
import p.z20;
import p.uz6;
import p.m75;
import p.au0;
import java.lang.Void;
import java.lang.reflect.AccessibleObject;
import p.bx5;
import java.lang.reflect.WildcardType;
import p.ef7;
import p.s90;
import p.ll6;
import p.ml6;
import java.lang.System;
import p.v90;
import p.cx5;
import p.hs2;
import p.is2;
import p.e15;

public abstract class js2	// class@000269 from classes2.dex
{
    public final lv5 a;
    public final r90 b;
    public final su0 c;

    public void js2(lv5 p0,r90 p1,su0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static js2 b(cy5 p0,Method p1){
       String[] stringArray;
       object oobject1;
       int i2;
       String str2;
       Object[] objArray;
       Object[] objArray1;
       object oobject4;
       kv5 okv53;
       int i5;
       object oobject5;
       int i6;
       h75 oh75;
       String str6;
       kv5 okv54;
       int i8;
       int i9;
       kv5 okv55;
       h75 oh751;
       kv5 okv56;
       int i11;
       i70 a;
       String str7;
       int b3;
       Class uClass1;
       Class uClass2;
       Type type;
       c75 uoc75;
       Type type2;
       int i12;
       String str10;
       Type type4;
       c75 uoc751;
       Type type5;
       kv5 okv57;
       Annotation[] annotations;
       Type type7;
       ef7 uoef7;
       cy5 b4;
       hs2 type5;
       kv5 okv5 = new kv5(p0, p1);
       kv5 c = okv5.c;
       int len = c.length;
       int b = false;
       int i = 0;
       while (true) {
          boolean b1 = true;
          String str = "HEAD";
          kv5 b2 = okv5.b;
          if (i < len) {
             object oobject = c[i];
             if (oobject instanceof y11) {
                okv5.b("DELETE", oobject.value(), b);
             }else if(oobject instanceof vh2){
                okv5.b("GET", oobject.value(), b);
             }else if(oobject instanceof pn2){
                okv5.b(str, oobject.value(), b);
             }else if(oobject instanceof g55){
                okv5.b("PATCH", oobject.value(), b1);
             }else if(oobject instanceof j55){
                okv5.b("POST", oobject.value(), b1);
             }else if(oobject instanceof k55){
                okv5.b("PUT", oobject.value(), b1);
             }else if(oobject instanceof jo4){
                okv5.b("OPTIONS", oobject.value(), b);
             }else if(oobject instanceof rn2){
                okv5.b(oobject.method(), oobject.path(), oobject.hasBody());
             }else if(oobject instanceof lp2){
                stringArray = oobject.value();
                if (stringArray.length) {
                   sm2 osm2 = new sm2();
                   int len1 = stringArray.length;
                   int i1 = 0;
                   while (true) {
                      if (i1 < len1) {
                         oobject1 = stringArray[i1];
                         if ((i2 = oobject1.indexOf(58)) != -1 && i2) {
                            int i3 = oobject1.length() - b1;
                            if (i2 != i3) {
                               String str1 = oobject1.substring(b, i2);
                               i2 = i2 + 1;
                               str2 = oobject1.substring(i2).trim();
                               if ("Content-Type".equalsIgnoreCase(str1)) {
                                  try{
                                     okv5.t = gg1.C(str2);
                                  }catch(java.lang.IllegalArgumentException e0){
                                     objArray = new Object[b1];
                                     objArray[b] = str2;
                                     throw do5.M(b2, e0, "Malformed content type: %s", objArray);
                                  }
                               }else {
                                  osm2.b(str1, str2);
                               }
                               i1 = i1 + 1;
                            }
                         }
                         break ;
                      }else {
                         okv5.s = osm2.e();
                      }
                   }
                   objArray1 = new Object[b1];
                   objArray1[b] = oobject1;
                   throw do5.M(b2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", objArray1);
                }else {
                   objArray = new Object[b];
                   throw do5.M(b2, null, "@Headers annotation is empty.", objArray);
                }
             }else {
                Exception uException = null;
                String str3 = "Only one encoding annotation is allowed.";
                if (oobject instanceof ge4) {
                   if (okv5.p == null) {
                      okv5.q = b1;
                   }else {
                      objArray1 = new Object[b];
                      throw do5.M(b2, uException, str3, objArray1);
                   }
                }else if(oobject instanceof rc2){
                   if (okv5.q == null) {
                      okv5.p = b1;
                   }else {
                      objArray1 = new Object[b];
                      throw do5.M(b2, uException, str3, objArray1);
                   }
                }
             }
             i = i + 1;
          }else if(okv5.n != null){
             if (okv5.o == null) {
                if (okv5.q == null) {
                   if (okv5.p != null) {
                      objArray1 = new Object[b];
                      throw do5.M(b2, null, "FormUrlEncoded can only be specified on HTTP methods with request body \(e.g., @POST\).", objArray1);
                   }
                }else {
                   objArray = new Object[b];
                   throw do5.M(b2, null, "Multipart can only be specified on HTTP methods with request body \(e.g., @POST\).", objArray);
                }
             }
             c = okv5.d;
             len = c.length;
             lv1[] olv1Array = new lv1[len];
             okv5.v = olv1Array;
             b = len - 1;
             i = 0;
             kv5 okv51 = okv5;
             while (true) {
                if (i < len) {
                   kv5 v = okv51.v;
                   object oobject2 = okv51.e[i];
                   object oobject3 = c[i];
                   str2 = (i == b)? 1: 0;
                   if (oobject3 != null) {
                      i2 = oobject3.length;
                      kv5 okv52 = okv51;
                      oobject4 = null;
                      okv53 = c;
                      boolean i4 = 0;
                      while (true) {
                         if (i4 < i2) {
                            i5 = len;
                            oobject5 = oobject3[i4];
                            i6 = b;
                            int i7 = i2;
                            String str4 = "@Path parameters may not be used with @Url.";
                            String str5 = String.class;
                            if (oobject5 instanceof ud7) {
                               okv51.c(i, oobject2);
                               if (okv52.m == null) {
                                  if (okv52.i == null) {
                                     if (okv52.j == null) {
                                        if (okv52.k == null) {
                                           if (okv52.l == null) {
                                              if (okv52.r == null) {
                                                 okv52.m = true;
                                                 if (oobject2 != ps2.class && (oobject2 != str5 && (oobject2 != URI.class && (!oobject2 instanceof Class && "android.net.Uri".equals(oobject2.getName()))))) {
                                                    objArray = new Object[0];
                                                    throw do5.W(b2, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", objArray);
                                                 }else {
                                                    oh75 = new h75(b2, i, 1);
                                                    str6 = str;
                                                    okv54 = v;
                                                 label_0283 :
                                                    i8 = i4;
                                                    i9 = str2;
                                                 label_03f1 :
                                                    okv55 = okv5;
                                                 }
                                              }else {
                                                 objArray = new Object[]{okv52.n};
                                                 throw do5.W(b2, i, "@Url cannot be used with @%s URL", objArray);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, "A @Url parameter must not come after a @QueryMap.", objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw do5.W(b2, i, "A @Url parameter must not come after a @QueryName.", objArray1);
                                        }
                                     }else {
                                        objArray1 = new Object[0];
                                        throw do5.W(b2, i, "A @Url parameter must not come after a @Query.", objArray1);
                                     }
                                  }else {
                                     objArray1 = new Object[0];
                                     throw do5.W(b2, i, str4, objArray1);
                                  }
                               }else {
                                  objArray1 = new Object[0];
                                  throw do5.W(b2, i, "Multiple @Url method annotations found.", objArray1);
                               }
                            }else {
                               str6 = str;
                               a = i70.a;
                               okv56 = okv52.b;
                               okv54 = v;
                               v = okv52.a;
                               if (oobject5 instanceof n95) {
                                  okv51.c(i, oobject2);
                                  if (okv52.j == null) {
                                     if (okv52.k == null) {
                                        if (okv52.l == null) {
                                           if (okv52.m == null) {
                                              if (okv52.r != null) {
                                                 okv52.i = true;
                                                 str5 = oobject5.value();
                                                 if (kv5.y.matcher(str5).matches()) {
                                                    if (okv52.u.contains(str5)) {
                                                       v.f(oobject2, oobject3);
                                                       oh75 = new j75(okv56, i, str5, oobject5.encoded());
                                                       goto label_0283 ;
                                                    }else {
                                                       objArray1 = new Object[]{okv52.r,str5};
                                                       throw do5.W(b2, i, "URL \"%s\" does not contain \"{%s}\".", objArray1);
                                                    }
                                                 }else {
                                                    objArray1 = new Object[]{kv5.x.pattern(),str5};
                                                    throw do5.W(b2, i, "@Path parameter name must match %s. Found: %s", objArray1);
                                                 }
                                              }else {
                                                 objArray1 = new Object[]{okv52.n};
                                                 throw do5.W(b2, i, "@Path can only be used with relative url on @%s", objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, str4, objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw do5.W(b2, i, "A @Path parameter must not come after a @QueryMap.", objArray1);
                                        }
                                     }else {
                                        objArray1 = new Object[0];
                                        throw do5.W(b2, i, "A @Path parameter must not come after a @QueryName.", objArray1);
                                     }
                                  }else {
                                     objArray1 = new Object[0];
                                     throw do5.W(b2, i, "A @Path parameter must not come after a @Query.", objArray1);
                                  }
                               }else {
                                  str4 = "<String>\)";
                                  i9 = str2;
                                  str2 = " must include generic type \(e.g., ";
                                  i8 = i4;
                                  Iterable iterable = Iterable.class;
                                  if (oobject5 instanceof gn5) {
                                     okv51.c(i, oobject2);
                                     str7 = oobject5.value();
                                     b3 = oobject5.encoded();
                                     Class uClass = do5.C(oobject2);
                                     b = true;
                                     okv52.j = b;
                                     if (iterable.isAssignableFrom(uClass)) {
                                        if (oobject2 instanceof ParameterizedType) {
                                           v.f(do5.B(0, oobject2), oobject3);
                                           oh75 = new e75(str7, b3, b).z();
                                           goto label_03f1 ;
                                        }else {
                                           objArray = new Object[0];
                                           throw do5.W(b2, i, uClass.getSimpleName()+str2+uClass.getSimpleName()+str4, objArray);
                                        }
                                     }else if(uClass.isArray()){
                                        v.f(kv5.a(uClass.getComponentType()), oobject3);
                                        oh75 = new e75(str7, b3, 1).b();
                                        goto label_03f1 ;
                                     }else {
                                        v.f(oobject2, oobject3);
                                        oh75 = new e75(str7, b3, 1);
                                        goto label_03f1 ;
                                     }
                                  }else if(oobject5 instanceof ln5){
                                     okv51.c(i, oobject2);
                                     i11 = oobject5.encoded();
                                     uClass1 = do5.C(oobject2);
                                     okv52.k = true;
                                     if (iterable.isAssignableFrom(uClass1)) {
                                        if (oobject2 instanceof ParameterizedType) {
                                           v.f(do5.B(0, oobject2), oobject3);
                                           oh75 = new k75(i11).z();
                                           goto label_03f1 ;
                                        }else {
                                           objArray = new Object[0];
                                           throw do5.W(b2, i, uClass1.getSimpleName()+str2+uClass1.getSimpleName()+str4, objArray);
                                        }
                                     }else if(uClass1.isArray()){
                                        v.f(kv5.a(uClass1.getComponentType()), oobject3);
                                        oh75 = new k75(i11).b();
                                        goto label_03f1 ;
                                     }else {
                                        v.f(oobject2, oobject3);
                                        oh75 = new k75(i11);
                                        goto label_03f1 ;
                                     }
                                  }else {
                                     okv55 = okv5;
                                     String str8 = "Map must include generic types \(e.g., Map<String, String>\)";
                                     i70 oi70 = a;
                                     Map map = Map.class;
                                     if (oobject5 instanceof kn5) {
                                        okv51.c(i, oobject2);
                                        uClass2 = do5.C(oobject2);
                                        b = true;
                                        okv52.l = b;
                                        if (map.isAssignableFrom(uClass2)) {
                                           type = do5.E(oobject2, uClass2);
                                           if (type instanceof ParameterizedType) {
                                              Type type1 = do5.B(0, type);
                                              if (str5 == type1) {
                                                 v.f(do5.B(b, type), oobject3);
                                                 oh75 = new f75(okv56, i, oobject5.encoded(), b);
                                              }else {
                                                 objArray = new Object[0];
                                                 throw do5.W(b2, i, "@QueryMap keys must be of type String: "+type1, objArray);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, str8, objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw do5.W(b2, i, "@QueryMap parameter type must be Map.", objArray1);
                                        }
                                     }else if(oobject5 instanceof qo2){
                                        okv51.c(i, oobject2);
                                        str7 = oobject5.value();
                                        uClass1 = do5.C(oobject2);
                                        if (iterable.isAssignableFrom(uClass1)) {
                                           if (oobject2 instanceof ParameterizedType) {
                                              v.f(do5.B(0, oobject2), oobject3);
                                              uoc75 = new g75(str7).z();
                                           }else {
                                              objArray = new Object[0];
                                              throw do5.W(b2, i, uClass1.getSimpleName()+str2+uClass1.getSimpleName()+str4, objArray);
                                           }
                                        }else if(uClass1.isArray()){
                                           v.f(kv5.a(uClass1.getComponentType()), oobject3);
                                           uoc75 = new g75(str7).b();
                                        }else {
                                           v.f(oobject2, oobject3);
                                           oh75 = new g75(str7);
                                        }
                                     }else if(oobject5 instanceof hp2){
                                        if (oobject2 == mp2.class) {
                                           uoc75 = new h75(b2, i, 0);
                                        }else {
                                           i11 = 0;
                                           okv51.c(i, oobject2);
                                           uClass2 = do5.C(oobject2);
                                           if (map.isAssignableFrom(uClass2)) {
                                              type = do5.E(oobject2, uClass2);
                                              if (type instanceof ParameterizedType) {
                                                 type2 = do5.B(i11, type);
                                                 if (str5 == type2) {
                                                    i11 = 1;
                                                    v.f(do5.B(i11, type), oobject3);
                                                    oh75 = new d75(b2, i, oi70, i11);
                                                 }else {
                                                    objArray = new Object[0];
                                                    throw do5.W(b2, i, "@HeaderMap keys must be of type String: "+type2, objArray);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw do5.W(b2, i, str8, objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, "@HeaderMap parameter type must be Map.", objArray1);
                                           }
                                        }
                                     }else if(oobject5 instanceof o22){
                                        okv51.c(i, oobject2);
                                        if (okv52.p != null) {
                                           str7 = oobject5.value();
                                           b3 = oobject5.encoded();
                                           okv52.f = true;
                                           Class uClass3 = do5.C(oobject2);
                                           if (iterable.isAssignableFrom(uClass3)) {
                                              if (oobject2 instanceof ParameterizedType) {
                                                 i4 = 0;
                                                 v.f(do5.B(i4, oobject2), oobject3);
                                                 uoc75 = new e75(str7, b3, i4).z();
                                              }else {
                                                 objArray = new Object[0];
                                                 throw do5.W(b2, i, uClass3.getSimpleName()+str2+uClass3.getSimpleName()+str4, objArray);
                                              }
                                           }else {
                                              i4 = 0;
                                              if (uClass3.isArray()) {
                                                 v.f(kv5.a(uClass3.getComponentType()), oobject3);
                                                 uoc75 = new e75(str7, b3, i4).b();
                                              }else {
                                                 v.f(oobject2, oobject3);
                                                 oh75 = new e75(str7, b3, i4);
                                              }
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw do5.W(b2, i, "@Field parameters can only be used with form encoding.", objArray1);
                                        }
                                     }else if(oobject5 instanceof p22){
                                        okv51.c(i, oobject2);
                                        if (okv52.p != null) {
                                           uClass2 = do5.C(oobject2);
                                           if (map.isAssignableFrom(uClass2)) {
                                              type = do5.E(oobject2, uClass2);
                                              if (type instanceof ParameterizedType) {
                                                 i12 = 0;
                                                 Type type3 = do5.B(i12, type);
                                                 if (str5 == type3) {
                                                    v.f(do5.B(1, type), oobject3);
                                                    okv52.f = true;
                                                    oh75 = new f75(okv56, i, oobject5.encoded(), i12);
                                                 }else {
                                                    objArray = new Object[i12];
                                                    throw do5.W(b2, i, "@FieldMap keys must be of type String: "+type3, objArray);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw do5.W(b2, i, str8, objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, "@FieldMap parameter type must be Map.", objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw do5.W(b2, i, "@FieldMap parameters can only be used with form encoding.", objArray1);
                                        }
                                     }else {
                                        kv5 c1 = okv52.c;
                                        String str9 = str8;
                                        ie4 oie4 = ie4.class;
                                        if (oobject5 instanceof s75) {
                                           okv51.c(i, oobject2);
                                           if (okv52.q != null) {
                                              okv52.g = true;
                                              str7 = oobject5.value();
                                              uClass1 = do5.C(oobject2);
                                              if (str7.isEmpty()) {
                                                 oh751 = l75.P;
                                                 str10 = "@Part annotation must supply a name or use MultipartBody.Part parameter type.";
                                                 if (iterable.isAssignableFrom(uClass1)) {
                                                    if (oobject2 instanceof ParameterizedType) {
                                                       b3 = 0;
                                                       if (oie4.isAssignableFrom(do5.C(do5.B(b3, oobject2)))) {
                                                          oh75 = oh751.z();
                                                       }else {
                                                          objArray1 = new Object[b3];
                                                          throw do5.W(b2, i, str10, objArray1);
                                                       }
                                                    }else {
                                                       objArray = new Object[0];
                                                       throw do5.W(b2, i, uClass1.getSimpleName()+str2+uClass1.getSimpleName()+str4, objArray);
                                                    }
                                                 }else {
                                                    i11 = 0;
                                                    if (uClass1.isArray()) {
                                                       if (oie4.isAssignableFrom(uClass1.getComponentType())) {
                                                          oh751 = oh751.b();
                                                       label_06db :
                                                          okv56 = okv55;
                                                       label_08d7 :
                                                          if (oh751 != null) {
                                                             if (oobject4 == null) {
                                                                oobject4 = oh751;
                                                             }else {
                                                                objArray = new Object[0];
                                                                throw do5.W(b2, i, "Multiple Retrofit annotations found, only one allowed.", objArray);
                                                             }
                                                          }
                                                          i4 = i8 + 1;
                                                          okv5 = okv56;
                                                          len = i5;
                                                          b = i6;
                                                          i2 = i7;
                                                          str = str6;
                                                          v = okv54;
                                                          int i10 = i9;
                                                          i11 = p0;
                                                       }else {
                                                          objArray1 = new Object[i11];
                                                          throw do5.W(b2, i, str10, objArray1);
                                                       }
                                                    }else if(oie4.isAssignableFrom(uClass1)){
                                                       goto label_06db ;
                                                    }else {
                                                       objArray1 = new Object[i11];
                                                       throw do5.W(b2, i, str10, objArray1);
                                                    }
                                                 }
                                              }else {
                                                 stringArray = new String[]{"Content-Disposition",tp2.m("form-data; name=\"", str7, "\""),"Content-Transfer-Encoding",oobject5.encoding()};
                                                 mp2 omp2 = gg1.O(stringArray);
                                                 str10 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.";
                                                 if (iterable.isAssignableFrom(uClass1)) {
                                                    if (oobject2 instanceof ParameterizedType) {
                                                       i4 = 0;
                                                       type4 = do5.B(i4, oobject2);
                                                       if (!oie4.isAssignableFrom(do5.C(type4))) {
                                                          uoc75 = new i75(b2, i, omp2, v.d(type4, oobject3, c1)).z();
                                                       }else {
                                                          objArray1 = new Object[i4];
                                                          throw do5.W(b2, i, str10, objArray1);
                                                       }
                                                    }else {
                                                       objArray = new Object[0];
                                                       throw do5.W(b2, i, uClass1.getSimpleName()+str2+uClass1.getSimpleName()+str4, objArray);
                                                    }
                                                 }else if(uClass1.isArray()){
                                                    uClass1 = kv5.a(uClass1.getComponentType());
                                                    if (!oie4.isAssignableFrom(uClass1)) {
                                                       uoc75 = new i75(b2, i, omp2, v.d(uClass1, oobject3, c1)).b();
                                                    }else {
                                                       objArray1 = new Object[0];
                                                       throw do5.W(b2, i, str10, objArray1);
                                                    }
                                                 }else {
                                                    i4 = 0;
                                                    if (!oie4.isAssignableFrom(uClass1)) {
                                                       uoc751 = new i75(b2, i, omp2, v.d(oobject2, oobject3, c1));
                                                    label_0783 :
                                                       okv56 = okv55;
                                                    }else {
                                                       objArray1 = new Object[i4];
                                                       throw do5.W(b2, i, str10, objArray1);
                                                    }
                                                 }
                                                 uoc751 = uoc75;
                                                 goto label_0783 ;
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, "@Part parameters can only be used with multipart encoding.", objArray1);
                                           }
                                        }else if(oobject5 instanceof u75){
                                           okv56 = okv55;
                                           okv56.c(i, oobject2);
                                           if (okv56.q != null) {
                                              i4 = true;
                                              okv56.g = i4;
                                              Class uClass4 = do5.C(oobject2);
                                              if (map.isAssignableFrom(uClass4)) {
                                                 type5 = do5.E(oobject2, uClass4);
                                                 if (type5 instanceof ParameterizedType) {
                                                    Type type6 = do5.B(0, type5);
                                                    if (str5 == type6) {
                                                       type4 = do5.B(i4, type5);
                                                       if (!oie4.isAssignableFrom(do5.C(type4))) {
                                                          uoc751 = new i75(b2, i, v.d(type4, oobject3, c1), oobject5.encoding());
                                                       }else {
                                                          objArray = new Object[0];
                                                          throw do5.W(b2, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", objArray);
                                                       }
                                                    }else {
                                                       objArray1 = new Object[0];
                                                       throw do5.W(b2, i, "@PartMap keys must be of type String: "+type6, objArray1);
                                                    }
                                                 }else {
                                                    objArray1 = new Object[0];
                                                    throw do5.W(b2, i, str9, objArray1);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw do5.W(b2, i, "@PartMap parameter type must be Map.", objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw do5.W(b2, i, "@PartMap parameters can only be used with multipart encoding.", objArray1);
                                           }
                                        }else {
                                           okv56 = okv55;
                                           if (oobject5 instanceof z20) {
                                              okv56.c(i, oobject2);
                                              if (okv56.p == null && okv56.q == null) {
                                                 if (okv56.h == null) {
                                                    try{
                                                       okv56.h = true;
                                                       uoc751 = new d75(b2, i, v.d(oobject2, oobject3, c1), 0);
                                                    }catch(java.lang.RuntimeException e0){
                                                       objArray1 = new Object[]{oobject2};
                                                       throw do5.X(b2, e0, i, "Unable to create @Body converter for %s", objArray1);
                                                    }
                                                 }else {
                                                    objArray1 = new Object[0];
                                                    throw do5.W(b2, i, "Multiple @Body method annotations found.", objArray1);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw do5.W(b2, i, "@Body parameters cannot be used with form or multi-part encoding.", objArray1);
                                              }
                                           }else if(oobject5 instanceof uz6){
                                              okv56.c(i, oobject2);
                                              uClass1 = do5.C(oobject2);
                                              i12 = i - 1;
                                              while (true) {
                                                 if (i12 >= 0) {
                                                    object oobject6 = okv56.v[i12];
                                                    if (oobject6 instanceof m75 && oobject6.P.equals(uClass1)) {
                                                       objArray = new Object[0];
                                                       throw do5.W(b2, i, "@Tag type "+uClass1.getName()+" is duplicate of parameter #"+(i12 + 1)+" and would always overwrite its value.", objArray);
                                                    }else {
                                                       i12 = i12 - 1;
                                                    }
                                                 }else {
                                                    oh751 = new m75(uClass1);
                                                 label_08d5 :
                                                    okv51 = okv56;
                                                    okv52 = okv51;
                                                    goto label_08d7 ;
                                                 }
                                              }
                                           }else {
                                              oh751 = null;
                                              goto label_08d5 ;
                                           }
                                        }
                                        oh751 = uoc751;
                                        goto label_08d5 ;
                                     }
                                     oh75 = uoc75;
                                  }
                               }
                            }
                            oh751 = oh75;
                            goto label_06db ;
                         }else {
                            okv56 = okv5;
                            i5 = len;
                            i6 = b;
                            str6 = str;
                            okv54 = v;
                            i9 = str2;
                            okv57 = okv51;
                            okv51 = okv52;
                         }
                      }
                   }else {
                      okv56 = okv5;
                      okv53 = c;
                      i5 = len;
                      i6 = b;
                      str6 = str;
                      okv54 = v;
                      i9 = str2;
                      oobject4 = null;
                      okv57 = okv51;
                   }
                   if (oobject4 == null) {
                      try{
                         if (i9 && do5.C(oobject2) == au0.class) {
                            okv51.w = true;
                            oobject4 = null;
                         }else {
                            objArray = new Object[0];
                            throw do5.W(b2, i, "No Retrofit annotation found.", objArray);
                         }
                      }catch(java.lang.NoClassDefFoundError e0){
                      }
                   }
                   okv54[i] = oobject4;
                   i = i + 1;
                   okv5 = okv56;
                   okv51 = okv57;
                   c = okv53;
                   len = i5;
                   b = i6;
                   str = str6;
                   b3 = p1;
                }else {
                   str6 = str;
                   if (okv51.r == null && okv51.m == null) {
                      objArray1 = new Object[]{okv51.n};
                      throw do5.M(b2, null, "Missing either @%s URL or @Url parameter.", objArray1);
                   }else if((okv56 = okv51.p) == null && (okv51.q == null && (okv51.o == null && okv51.h != null))){
                      objArray1 = new Object[0];
                      throw do5.M(b2, null, "Non-body HTTP method cannot contain @Body.", objArray1);
                   }else {
                      b3 = 0;
                      Exception uException1 = null;
                      if (okv56 != null && okv51.f == null) {
                         objArray1 = new Object[b3];
                         throw do5.M(b2, uException1, "Form-encoded method must contain at least one @Field.", objArray1);
                      }else if(okv51.q != null && okv51.g == null){
                         objArray1 = new Object[b3];
                         throw do5.M(b2, uException1, "Multipart method must contain at least one @Part.", objArray1);
                      }else {
                         lv5 olv5 = new lv5(okv51);
                         type2 = p1.getGenericReturnType();
                         if (!do5.G(type2)) {
                            if (type2 != Void.TYPE) {
                               annotations = p1.getAnnotations();
                               lv5 k = olv5.k;
                               bx5 uobx5 = bx5.class;
                               if (k != null) {
                                  Type[] genericParam = p1.getGenericParameterTypes();
                                  b = 0;
                                  oobject5 = genericParam[(genericParam.length - 1)].getActualTypeArguments()[b];
                                  if (oobject5 instanceof WildcardType) {
                                     oobject5 = oobject5.getLowerBounds()[b];
                                  }
                                  if (do5.C(oobject5) == uobx5 && oobject5 instanceof ParameterizedType) {
                                     type7 = do5.B(b, oobject5);
                                     i = 1;
                                  }else {
                                     i = 0;
                                  }
                                  Type[] typeArray = new Type[]{type7};
                                  uoef7 = new ef7(null, s90.class, typeArray);
                                  if (!do5.J(annotations, ll6.class)) {
                                     Annotation[] uAnnotationA = new Annotation[(annotations.length + 1)];
                                     uAnnotationA[b] = ml6.a;
                                     System.arraycopy(annotations, b, uAnnotationA, 1, annotations.length);
                                     annotations = uAnnotationA;
                                  }
                               }else {
                                  uoef7 = p1.getGenericReturnType();
                                  i = 0;
                               }
                               cy5 uocy5 = p0;
                               try{
                                  v90 ov90 = uocy5.a(uoef7, annotations);
                                  if ((type5 = ov90.g()) != cx5.class) {
                                     if (type5 != uobx5) {
                                        if (olv5.c.equals(str6) && !Void.class.equals(type5)) {
                                           objArray1 = new Object[0];
                                           throw do5.M(p1, null, "HEAD method must use Void as response type.", objArray1);
                                        }else {
                                           annotations = p1.getAnnotations();
                                           try{
                                              su0 osu0 = uocy5.e(type5, annotations);
                                              b4 = uocy5.b;
                                              if (k == null) {
                                                 type5 = new hs2(olv5, b4, osu0, ov90, 0);
                                              }else if(i){
                                                 type5 = new hs2(olv5, b4, osu0, ov90, 1);
                                              }else {
                                                 is2 ois2 = new is2(olv5, b4, osu0, ov90);
                                              }
                                           }catch(java.lang.RuntimeException e0){
                                              objArray1 = new Object[]{type5};
                                              throw do5.M(b4, e0, "Unable to create converter for %s", objArray1);
                                           }
                                        }
                                     }else {
                                        objArray1 = new Object[0];
                                        throw do5.M(p1, null, "Response must include generic type \(e.g., Response<String>\)", objArray1);
                                     }
                                  }else {
                                     objArray = new Object[0];
                                     throw do5.M(p1, null, "\'"+do5.C(type5).getName()+"\' is not a valid response body type. Did you mean ResponseBody?", objArray);
                                  }
                               }catch(java.lang.RuntimeException e0){
                                  Object[] objArray2 = new Object[]{type5};
                                  throw do5.M(p1, e0, "Unable to create call adapter for %s", objArray2);
                               }
                            }else {
                               objArray1 = new Object[0];
                               throw do5.M(p1, null, "Service methods cannot return void.", objArray1);
                            }
                         }else {
                            Object[] objArray3 = new Object[]{type2};
                            throw do5.M(p1, null, "Method return type must not include a type variable or wildcard: %s", objArray3);
                         }
                      }
                   }
                }
             }
             return type5;
          }else {
             objArray1 = new Object[0];
             throw do5.M(b2, null, "HTTP method annotation is required \(e.g., @GET, @POST, etc.\).", objArray1);
          }
       }
    }
    public abstract Object a(e15 p0,Object[] p1);
}
