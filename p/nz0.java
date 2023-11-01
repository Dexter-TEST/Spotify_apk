package p.nz0;
import p.gf3;
import p.fv1;
import p.g54;
import java.lang.Object;
import android.util.JsonReader;
import p.mz0;
import p.i73;
import java.util.ArrayList;
import java.util.List;
import p.gs;
import p.o11;
import java.lang.String;
import java.lang.Class;
import java.lang.Long;
import java.lang.NullPointerException;
import p.ps;
import java.lang.IllegalStateException;
import p.zq7;
import java.lang.Integer;
import p.i70;
import p.j8;
import p.ks;
import p.qo5;
import p.ls;
import p.gg1;
import p.is;
import java.lang.Boolean;
import p.hs;
import p.i77;
import java.lang.Double;
import p.os;
import p.lz0;
import p.ns;
import p.vr;
import p.jz0;
import p.ej5;
import p.as;
import p.rs;
import p.cs;
import p.oy6;
import p.qs;
import p.es;
import p.fs;
import android.util.Base64;
import java.nio.charset.Charset;
import p.bs;
import p.n91;
import p.az5;
import p.yr;
import java.io.StringReader;
import java.io.Reader;
import java.io.IOException;
import java.lang.Throwable;

public final class nz0	// class@002078 from classes.dex
{
    public static final g54 a;

    static {
       gf3 ogf3 = new gf3();
       fv1.a.r(ogf3);
       ogf3.d = true;
       nz0.a = new g54(ogf3);
    }
    public void nz0(){
       super();
    }
    public static i73 a(JsonReader p0,mz0 p1){
       ArrayList uArrayList = new ArrayList();
       p0.beginArray();
       while (p0.hasNext()) {
          uArrayList.add(p1.k(p0));
       }
       p0.endArray();
       return new i73(uArrayList);
    }
    public static gs b(JsonReader p0){
       String str1;
       j8 oj8;
       String str3;
       qo5 oqo5;
       int i2;
       i77 oi77;
       o11 oo11 = new o11(8);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             int i = 4;
             switch (str.hashCode()){
                 case 0xb06b1e56:
                   if (!str.equals("device")) {
                   label_005c :
                      str = -1;
                   }else {
                      oi77 = 0;
                   }
                   break;
                 case 0x17a21:
                   if (!str.equals("app")) {
                      goto label_005c ;
                   }else {
                      oi77 = 1;
                   }
                   break;
                 case 0x1a344:
                   if (!str.equals("log")) {
                      goto label_005c ;
                   }else {
                      oi77 = 2;
                   }
                   break;
                 case 0x368f3a:
                   if (!str.equals("type")) {
                      goto label_005c ;
                   }else {
                      oi77 = 3;
                   }
                   break;
                 case 0x3492916:
                   if (!str.equals("timestamp")) {
                      goto label_005c ;
                   }else {
                      oi77 = 4;
                   }
                   break;
                 default:
                   goto label_005c ;
             }
             int i1 = 5;
             if (str) {
                if (str != 1) {
                   if (str != 2) {
                      if (str != 3) {
                         if (str != i) {
                            p0.skipValue();
                         }else {
                            oo11.b = Long.valueOf(p0.nextLong());
                         }
                      }else if((str = p0.nextString()) != null){
                         oo11.c = str;
                      }else {
                         break ;
                      }
                   }else {
                      p0.beginObject();
                      str = null;
                      while (true) {
                         if (p0.hasNext()) {
                            str1 = p0.nextName();
                            str1.getClass();
                            if (!str1.equals("content")) {
                               p0.skipValue();
                            }else if((str = p0.nextString()) != null){
                               continue ;
                            }else {
                               throw new NullPointerException("Null content");
                            }
                         }else {
                            p0.endObject();
                            str1 = (str == null)? " content": "";
                            if (str1.isEmpty()) {
                               oo11.w = new ps(str);
                            }else {
                               throw new IllegalStateException("Missing required properties:".concat(str1));
                            }
                         }
                      }
                      throw new NullPointerException("Null type");
                   }
                }else {
                   zq7 ozq7 = new zq7(i1);
                   p0.beginObject();
                   while (true) {
                      if (p0.hasNext()) {
                         String str2 = p0.nextName();
                         str2.getClass();
                         switch (str2.hashCode()){
                             case 0xb098552e:
                               if (!str2.equals("background")) {
                               label_0122 :
                                  str2 = -1;
                               }else {
                                  oj8 = 0;
                               }
                               break;
                             case 0xbef90b18:
                               if (!str2.equals("execution")) {
                                  goto label_0122 ;
                               }else {
                                  oj8 = 1;
                               }
                               break;
                             case 0x211737a8:
                               if (!str2.equals("customAttributes")) {
                                  goto label_0122 ;
                               }else {
                                  oj8 = 2;
                               }
                               break;
                             case 0x375b6a9c:
                               if (!str2.equals("uiOrientation")) {
                                  goto label_0122 ;
                               }else {
                                  oj8 = 3;
                               }
                               break;
                             default:
                               goto label_0122 ;
                         }
                         if (str2) {
                            if (str2 != 1) {
                               if (str2 != 2) {
                                  if (str2 != 3) {
                                     p0.skipValue();
                                  }else {
                                     ozq7.t = Integer.valueOf(p0.nextInt());
                                     continue ;
                                  }
                               }else {
                                  ozq7.b = nz0.a(p0, i70.w);
                                  continue ;
                               }
                            }else {
                               oj8 = new j8(i1);
                               p0.beginObject();
                               while (true) {
                                  if (p0.hasNext()) {
                                     str3 = p0.nextName();
                                     str3.getClass();
                                     switch (str3.hashCode()){
                                         case 0xb040b3a9:
                                           if (!str3.equals("threads")) {
                                           label_018c :
                                              str3 = -1;
                                           }else {
                                              oqo5 = 0;
                                           }
                                           break;
                                         case 0xca356ea8:
                                           if (!str3.equals("signal")) {
                                              goto label_018c ;
                                           }else {
                                              oqo5 = 1;
                                           }
                                           break;
                                         case 0x37e2e05f:
                                           if (!str3.equals("binaries")) {
                                              goto label_018c ;
                                           }else {
                                              oqo5 = 2;
                                           }
                                           break;
                                         case 0x584fd04f:
                                           if (!str3.equals("exception")) {
                                              goto label_018c ;
                                           }else {
                                              oqo5 = 3;
                                           }
                                           break;
                                         default:
                                           goto label_018c ;
                                     }
                                     if (str3) {
                                        if (str3 != 1) {
                                           if (str3 != 2) {
                                              if (str3 != 3) {
                                                 p0.skipValue();
                                              }else {
                                                 oj8.c = nz0.c(p0);
                                                 continue ;
                                              }
                                           }else {
                                              oj8.v = nz0.a(p0, fv1.v);
                                              continue ;
                                           }
                                        }else {
                                           oqo5 = new qo5(0);
                                           p0.beginObject();
                                           while (true) {
                                              if (p0.hasNext()) {
                                                 String str4 = p0.nextName();
                                                 str4.getClass();
                                                 if ((i2 = str4.hashCode()) != -1147692044) {
                                                    if (i2 != 0x2eaded) {
                                                       if (i2 != 0x337a8b || !str4.equals("name")) {
                                                       label_01f0 :
                                                          str4 = -1;
                                                       }else {
                                                          str4 = 2;
                                                       }
                                                    }else if(!str4.equals("code")){
                                                       goto label_01f0 ;
                                                    }else {
                                                       str4 = 1;
                                                    }
                                                 }else if(!str4.equals("address")){
                                                    goto label_01f0 ;
                                                 }else {
                                                    str4 = 0;
                                                 }
                                                 if (str4) {
                                                    if (str4 != 1) {
                                                       if (str4 != 2) {
                                                          p0.skipValue();
                                                       }else if((str4 = p0.nextString()) != null){
                                                          oqo5.a = str4;
                                                          continue ;
                                                       }else {
                                                          throw new NullPointerException("Null name");
                                                       }
                                                    }else if((str4 = p0.nextString()) != null){
                                                       oqo5.b = str4;
                                                       continue ;
                                                    }else {
                                                       throw new NullPointerException("Null code");
                                                    }
                                                 }else {
                                                    oqo5.c = Long.valueOf(p0.nextLong());
                                                    continue ;
                                                 }
                                              }else {
                                                 p0.endObject();
                                                 oj8.t = oqo5.b();
                                                 continue ;
                                              }
                                           }
                                        }
                                     }else {
                                        oj8.b = nz0.a(p0, gg1.c);
                                        continue ;
                                     }
                                  }else {
                                     p0.endObject();
                                     ozq7.a = oj8.e();
                                     continue ;
                                  }
                               }
                            }
                         }else {
                            ozq7.c = Boolean.valueOf(p0.nextBoolean());
                            continue ;
                         }
                      }else {
                         p0.endObject();
                         oo11.t = ozq7.a();
                      }
                   }
                }
             }else {
                oi77 = new i77(7);
                p0.beginObject();
                while (p0.hasNext()) {
                   str3 = p0.nextName();
                   str3.getClass();
                   switch (str3.hashCode()){
                       case 0x9a28bd77:
                         if (!str3.equals("batteryLevel")) {
                         label_02c1 :
                            oqo5 = -1;
                         }else {
                            oqo5 = 0;
                         }
                         break;
                       case 0xa93df20a:
                         if (!str3.equals("batteryVelocity")) {
                            goto label_02c1 ;
                         }else {
                            oqo5 = 1;
                         }
                         break;
                       case 0xaa32f5d0:
                         if (!str3.equals("orientation")) {
                            goto label_02c1 ;
                         }else {
                            oqo5 = 2;
                         }
                         break;
                       case 0x10ad56fa:
                         if (!str3.equals("diskUsed")) {
                            goto label_02c1 ;
                         }else {
                            oqo5 = 3;
                         }
                         break;
                       case 0x3a34d8fb:
                         if (!str3.equals("ramUsed")) {
                            goto label_02c1 ;
                         }else {
                            oqo5 = 4;
                         }
                         break;
                       case 0x5a6876be:
                         if (!str3.equals("proximityOn")) {
                            goto label_02c1 ;
                         }else {
                            oqo5 = 5;
                         }
                         break;
                       default:
                         goto label_02c1 ;
                   }
                   if (oqo5) {
                      if (oqo5 != 1) {
                         if (oqo5 != 2) {
                            if (oqo5 != 3) {
                               if (oqo5 != i) {
                                  if (oqo5 != i1) {
                                     p0.skipValue();
                                  }else {
                                     oi77.c = Boolean.valueOf(p0.nextBoolean());
                                     continue ;
                                  }
                               }else {
                                  oi77.e = Long.valueOf(p0.nextLong());
                                  continue ;
                               }
                            }else {
                               oi77.f = Long.valueOf(p0.nextLong());
                               continue ;
                            }
                         }else {
                            oi77.d = Integer.valueOf(p0.nextInt());
                            continue ;
                         }
                      }else {
                         oi77.b = Integer.valueOf(p0.nextInt());
                         continue ;
                      }
                   }else {
                      oi77.a = Double.valueOf(p0.nextDouble());
                      continue ;
                   }
                }
                p0.endObject();
                oo11.v = oi77.h();
             }
          }else {
             p0.endObject();
             return oo11.f();
          }
       }
    }
    public static ks c(JsonReader p0){
       o11 oo11 = new o11(9);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             int i = -1;
             switch (str.hashCode()){
                 case 0xb48284a6:
                   if (str.equals("frames")) {
                      i = 0;
                   }
                   break;
                 case 0xc8459244:
                   if (str.equals("reason")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x57bc6d2:
                   if (str.equals("causedBy")) {
                      i = 3;
                   }
                   break;
                 case 0x22acde2d:
                   if (str.equals("overflowCount")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   oo11.t = nz0.a(p0, lz0.a);
                   break;
                 case 1:
                   oo11.c = p0.nextString();
                   break;
                 case 2:
                   if ((str = p0.nextString()) == null) {
                      throw new NullPointerException("Null type");
                   }
                   oo11.b = str;
                   break;
                 case 3:
                   oo11.v = nz0.c(p0);
                   break;
                 case 4:
                   oo11.w = Integer.valueOf(p0.nextInt());
                   break;
                 default:
                   p0.skipValue();
             }
          }else {
             p0.endObject();
             return oo11.g();
          }
       }
    }
    public static ns d(JsonReader p0){
       o11 oo11 = new o11(10);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             int i = -1;
             switch (str.hashCode()){
                 case 0xc3376493:
                   if (str.equals("offset")) {
                      i = 0;
                   }
                   break;
                 case 0xcb197598:
                   if (str.equals("symbol")) {
                      i = 1;
                   }
                   break;
                 case 3571:
                   if (str.equals("pc")) {
                      i = 2;
                   }
                   break;
                 case 0x2ff57c:
                   if (str.equals("file")) {
                      i = 3;
                   }
                   break;
                 case 0x7eb2da74:
                   if (str.equals("importance")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   oo11.v = Long.valueOf(p0.nextLong());
                   break;
                 case 1:
                   if ((str = p0.nextString()) == null) {
                      throw new NullPointerException("Null symbol");
                   }
                   oo11.c = str;
                   break;
                 case 2:
                   oo11.b = Long.valueOf(p0.nextLong());
                   break;
                 case 3:
                   oo11.t = p0.nextString();
                   break;
                 case 4:
                   oo11.w = Integer.valueOf(p0.nextInt());
                   break;
                 default:
                   p0.skipValue();
             }
          }else {
             p0.endObject();
             return oo11.h();
          }
       }
    }
    public static vr e(JsonReader p0){
       int i2;
       n91 on91;
       String str2;
       int i4;
       int i5;
       ArrayList uArrayList;
       String str7;
       ej5 uoej5 = new ej5(6);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             int i = 7;
             int i1 = 0;
             switch (str.hashCode()){
                 case 0x81bc3259:
                   if (!str.equals("ndkPayload")) {
                   label_007d :
                      i2 = -1;
                   }else {
                      i2 = 0;
                   }
                   break;
                 case 0x8b04a33e:
                   if (!str.equals("sdkVersion")) {
                      goto label_007d ;
                   }else {
                      i2 = 1;
                   }
                   break;
                 case 0xc9a8768a:
                   if (!str.equals("buildVersion")) {
                      goto label_007d ;
                   }else {
                      i2 = 2;
                   }
                   break;
                 case 0x14879cf2:
                   if (!str.equals("gmpAppId")) {
                      goto label_007d ;
                   }else {
                      i2 = 3;
                   }
                   break;
                 case 0x2ae81915:
                   if (!str.equals("installationUuid")) {
                      goto label_007d ;
                   }else {
                      i2 = 4;
                   }
                   break;
                 case 0x6fbd6873:
                   if (!str.equals("platform")) {
                      goto label_007d ;
                   }else {
                      i2 = 5;
                   }
                   break;
                 case 0x75c19db6:
                   if (!str.equals("displayVersion")) {
                      goto label_007d ;
                   }else {
                      i2 = 6;
                   }
                   break;
                 case 0x76508296:
                   if (!str.equals("session")) {
                      goto label_007d ;
                   }else {
                      i2 = 7;
                   }
                   break;
                 default:
                   goto label_007d ;
             }
             String str1 = "Null buildVersion";
             switch (i2){
                 case 0:
                   on91 = new n91(7, null);
                   p0.beginObject();
                   while (p0.hasNext()) {
                      str = p0.nextName();
                      str.getClass();
                      if (!str.equals("files")) {
                         if (!str.equals("orgId")) {
                            p0.skipValue();
                         }else {
                            on91.c = p0.nextString();
                         }
                      }else {
                         on91.b = nz0.a(p0, az5.t);
                      }
                   }
                   p0.endObject();
                   uoej5.h = on91.a();
                   break;
                 case 1:
                   if ((str2 = p0.nextString()) != null) {
                      uoej5.a = str2;
                   label_049a :
                      int i3 = p0;
                   }else {
                      throw new NullPointerException("Null sdkVersion");
                   }
                   break;
                 case 2:
                   if ((str2 = p0.nextString()) != null) {
                      uoej5.e = str2;
                      goto label_049a ;
                   }else {
                      throw new NullPointerException(str1);
                   }
                   break;
                 case 3:
                   if ((str2 = p0.nextString()) != null) {
                      uoej5.b = str2;
                      goto label_049a ;
                   }else {
                      throw new NullPointerException("Null gmpAppId");
                   }
                   break;
                 case 4:
                   if ((str2 = p0.nextString()) != null) {
                      uoej5.d = str2;
                      goto label_049a ;
                   }else {
                      throw new NullPointerException("Null installationUuid");
                   }
                   break;
                 case 5:
                   uoej5.c = Integer.valueOf(p0.nextInt());
                   goto label_049a ;
                   break;
                 case 6:
                   if ((str2 = p0.nextString()) != null) {
                      uoej5.f = str2;
                      goto label_049a ;
                   }else {
                      throw new NullPointerException("Null displayVersion");
                   }
                   break;
                 case 7:
                   as uoas = new as(i1);
                   uoas.a = Boolean.FALSE;
                   p0.beginObject();
                   while (true) {
                      if (p0.hasNext()) {
                         String str3 = p0.nextName();
                         str3.getClass();
                         String str4 = "identifier";
                         switch (str3.hashCode()){
                             case 0x811d2c94:
                               if (!str3.equals("startedAt")) {
                               label_0131 :
                                  i4 = -1;
                               }else {
                                  i4 = 0;
                               }
                               break;
                             case 0x9f88aca9:
                               if (!str3.equals(str4)) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 1;
                               }
                               break;
                             case 0xa03b0c8d:
                               if (!str3.equals("endedAt")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 2;
                               }
                               break;
                             case 0xb06b1e56:
                               if (!str3.equals("device")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 3;
                               }
                               break;
                             case 0xb307e119:
                               if (!str3.equals("events")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 4;
                               }
                               break;
                             case 3556:
                               if (!str3.equals("os")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 5;
                               }
                               break;
                             case 0x17a21:
                               if (!str3.equals("app")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 6;
                               }
                               break;
                             case 0x36ebcb:
                               if (!str3.equals("user")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 7;
                               }
                               break;
                             case 0x111a9ad3:
                               if (!str3.equals("generator")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 8;
                               }
                               break;
                             case 0x3d1e2286:
                               if (!str3.equals("crashed")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 9;
                               }
                               break;
                             case 0x7a02fcad:
                               if (!str3.equals("generatorType")) {
                                  goto label_0131 ;
                               }else {
                                  i4 = 10;
                               }
                               break;
                             default:
                               goto label_0131 ;
                         }
                         String str5 = "Null version";
                         String str6 = "Null identifier";
                         str2 = "version";
                         switch (i4){
                             case 0:
                               uoas.d = Long.valueOf(p0.nextLong());
                            label_042f :
                               i = 7;
                               break;
                             case 1:
                               uoas.c = new String(Base64.decode(p0.nextString(), 2), jz0.a);
                               goto label_042f ;
                               break;
                             case 2:
                               uoas.e = Long.valueOf(p0.nextLong());
                               goto label_042f ;
                               break;
                             case 3:
                               es uoes = new es();
                               p0.beginObject();
                               while (true) {
                                  if (p0.hasNext()) {
                                     str6 = p0.nextName();
                                     str6.getClass();
                                     switch (str6.hashCode()){
                                         case 0x89e74404:
                                           if (!str6.equals("simulator")) {
                                           label_0374 :
                                              i5 = -1;
                                           }else {
                                              i5 = 0;
                                           }
                                           break;
                                         case 0x8a9e23d1:
                                           if (!str6.equals("manufacturer")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 1;
                                           }
                                           break;
                                         case 0x1b81e:
                                           if (!str6.equals("ram")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 2;
                                           }
                                           break;
                                         case 0x2dd056:
                                           if (!str6.equals("arch")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 3;
                                           }
                                           break;
                                         case 0x4dfed69:
                                           if (!str6.equals("diskSpace")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 4;
                                           }
                                           break;
                                         case 0x5a744b4:
                                           if (!str6.equals("cores")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 5;
                                           }
                                           break;
                                         case 0x633fb29:
                                           if (!str6.equals("model")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 6;
                                           }
                                           break;
                                         case 0x68ac491:
                                           if (!str6.equals("state")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 7;
                                           }
                                           break;
                                         case 0x7bea4fcf:
                                           if (!str6.equals("modelClass")) {
                                              goto label_0374 ;
                                           }else {
                                              i5 = 8;
                                           }
                                           break;
                                         default:
                                           goto label_0374 ;
                                     }
                                     switch (i5){
                                         case 0:
                                           uoes.i = Boolean.valueOf(p0.nextBoolean());
                                           break;
                                         case 1:
                                           if ((str6 = p0.nextString()) != null) {
                                              uoes.e = str6;
                                           }else {
                                              throw new NullPointerException("Null manufacturer");
                                           }
                                           break;
                                         case 2:
                                           uoes.g = Long.valueOf(p0.nextLong());
                                           break;
                                         case 3:
                                           uoes.a = Integer.valueOf(p0.nextInt());
                                           break;
                                         case 4:
                                           uoes.h = Long.valueOf(p0.nextLong());
                                           break;
                                         case 5:
                                           uoes.b = Integer.valueOf(p0.nextInt());
                                           break;
                                         case 6:
                                           if ((str6 = p0.nextString()) != null) {
                                              uoes.d = str6;
                                           }else {
                                              throw new NullPointerException("Null model");
                                           }
                                           break;
                                         case 7:
                                           uoes.c = Integer.valueOf(p0.nextInt());
                                           break;
                                         case 8:
                                           if ((str6 = p0.nextString()) != null) {
                                              uoes.f = str6;
                                           }else {
                                              throw new NullPointerException("Null modelClass");
                                           }
                                           break;
                                         default:
                                           p0.skipValue();
                                     }
                                  }else {
                                     p0.endObject();
                                     uoas.i = uoes.a();
                                     goto label_042f ;
                                  }
                               }
                               break;
                             case 4:
                               uArrayList = new ArrayList();
                               p0.beginArray();
                               while (p0.hasNext()) {
                                  uArrayList.add(nz0.b(p0));
                               }
                               p0.endArray();
                               uoas.j = new i73(uArrayList);
                               goto label_042f ;
                               break;
                             case 5:
                               oy6 ooy6 = new oy6(6);
                               p0.beginObject();
                            label_0245 :
                               if (p0.hasNext()) {
                                  str7 = p0.nextName();
                                  str7.getClass();
                                  switch (str7.hashCode()){
                                      case 0xc9a8768a:
                                        if (!str7.equals("buildVersion")) {
                                        label_0280 :
                                           str7 = -1;
                                        }else {
                                           str7 = 0;
                                        }
                                        break;
                                      case 0xee88c4ef:
                                        if (!str7.equals("jailbroken")) {
                                           goto label_0280 ;
                                        }else {
                                           str7 = 1;
                                        }
                                        break;
                                      case 0x14f51cd8:
                                        if (!str7.equals(str2)) {
                                           goto label_0280 ;
                                        }else {
                                           str7 = 2;
                                        }
                                        break;
                                      case 0x6fbd6873:
                                        if (!str7.equals("platform")) {
                                           goto label_0280 ;
                                        }else {
                                           str7 = 3;
                                        }
                                        break;
                                      default:
                                        goto label_0280 ;
                                  }
                                  if (str7) {
                                     if (str7 != 1) {
                                        if (str7 != 2) {
                                           if (str7 != 3) {
                                              p0.skipValue();
                                              goto label_0245 ;
                                           }else {
                                              ooy6.b = Integer.valueOf(p0.nextInt());
                                              goto label_0245 ;
                                           }
                                        }else if((str7 = p0.nextString()) != null){
                                           ooy6.c = str7;
                                           goto label_0245 ;
                                        }else {
                                           throw new NullPointerException(str5);
                                        }
                                     }else {
                                        ooy6.v = Boolean.valueOf(p0.nextBoolean());
                                        goto label_0245 ;
                                     }
                                  }else if((str7 = p0.nextString()) != null){
                                     ooy6.t = str7;
                                     goto label_0245 ;
                                  }else {
                                     throw new NullPointerException(str1);
                                  }
                               }else {
                                  p0.endObject();
                                  uoas.h = ooy6.j();
                                  goto label_042f ;
                               }
                               break;
                             case 6:
                               o11 oo11 = new o11(i);
                               p0.beginObject();
                            label_01be :
                               if (p0.hasNext()) {
                                  str7 = p0.nextName();
                                  str7.getClass();
                                  switch (str7.hashCode()){
                                      case 0x9f88aca9:
                                        if (!str7.equals(str4)) {
                                        label_01f7 :
                                           str7 = -1;
                                        }else {
                                           str7 = 0;
                                        }
                                        break;
                                      case 0x14f51cd8:
                                        if (!str7.equals(str2)) {
                                           goto label_01f7 ;
                                        }else {
                                           str7 = 1;
                                        }
                                        break;
                                      case 0x2ae81915:
                                        if (!str7.equals("installationUuid")) {
                                           goto label_01f7 ;
                                        }else {
                                           str7 = 2;
                                        }
                                        break;
                                      case 0x75c19db6:
                                        if (!str7.equals("displayVersion")) {
                                           goto label_01f7 ;
                                        }else {
                                           str7 = 3;
                                        }
                                        break;
                                      default:
                                        goto label_01f7 ;
                                  }
                                  if (str7) {
                                     if (str7 != 1) {
                                        if (str7 != 2) {
                                           if (str7 != 3) {
                                              p0.skipValue();
                                           }else {
                                              oo11.t = p0.nextString();
                                           }
                                        }else {
                                           oo11.w = p0.nextString();
                                        }
                                     }else if((str7 = p0.nextString()) != null){
                                        oo11.c = str7;
                                     }else {
                                        throw new NullPointerException(str5);
                                     }
                                  }else if((str7 = p0.nextString()) != null){
                                     oo11.b = str7;
                                  }else {
                                     throw new NullPointerException(str6);
                                  }
                                  str7 = 7;
                                  goto label_01be ;
                               }else {
                                  p0.endObject();
                                  uoas.f = oo11.e();
                                  goto label_042f ;
                               }
                               break;
                             case 7:
                               p0.beginObject();
                               str2 = null;
                               while (true) {
                                  if (p0.hasNext()) {
                                     str3 = p0.nextName();
                                     str3.getClass();
                                     if (!str3.equals(str4)) {
                                        p0.skipValue();
                                     }else if((str2 = p0.nextString()) != null){
                                        continue ;
                                     }else {
                                        throw new NullPointerException(str6);
                                     }
                                  }else {
                                     p0.endObject();
                                     str6 = (str2 == null)? " identifier": "";
                                     if (str6.isEmpty()) {
                                        uoas.g = new rs(str2);
                                     label_015f :
                                        uArrayList = 6;
                                     }else {
                                        throw new IllegalStateException("Missing required properties:".concat(str6));
                                     }
                                  }
                               }
                               break;
                             case 8:
                               if ((str2 = p0.nextString()) == null) {
                                  throw new NullPointerException("Null generator");
                               }
                               uoas.b = str2;
                               goto label_015f ;
                               break;
                             case 9:
                               uoas.a = Boolean.valueOf(p0.nextBoolean());
                               goto label_015f ;
                               break;
                             case 10:
                               uoas.k = Integer.valueOf(p0.nextInt());
                               goto label_015f ;
                               break;
                             default:
                               p0.skipValue();
                               goto label_042f ;
                         }
                         str5 = 0;
                      }else {
                         p0.endObject();
                         uoej5.g = uoas.a();
                         goto label_049a ;
                      }
                   }
                   break;
                 default:
                   p0.skipValue();
             }
             on91 = 6;
          }else {
             p0.endObject();
             return uoej5.b();
          }
       }
    }
    public static vr f(String p0){
       try{
          JsonReader jsonReader = new JsonReader(new StringReader(p0));
          jsonReader.close();
          return nz0.e(jsonReader);
       }catch(java.lang.IllegalStateException e2){
          throw new IOException(e2);
       }
    }
}
