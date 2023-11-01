package p.aq6;
import java.lang.Comparable;
import java.lang.String;
import java.lang.Object;
import p.bq6;
import p.yp6;
import p.cq6;
import java.lang.Long;
import java.lang.StringBuilder;
import p.en6;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import p.ox;
import java.lang.Character;
import java.util.Set;
import java.lang.RuntimeException;
import java.net.URLEncoder;
import java.lang.CharSequence;
import java.lang.Throwable;
import java.lang.Enum;
import java.lang.Class;
import java.util.Iterator;
import java.lang.Iterable;

public final class aq6 implements Comparable	// class@000fd5 from classes.dex
{
    public final String A;
    public final String a;
    public final yp6 b;
    public final String c;
    public final String t;
    public final String v;
    public final String w;
    public final long x;
    public final yp6 y;
    public final List z;

    public void aq6(String p0){
       String str4;
       ArrayList uArrayList;
       long l1;
       long l2;
       ArrayList uArrayList1;
       boolean i3;
       yp6 a;
       char c;
       int i = this;
       String str = p0;
       super();
       i.a = str;
       bq6 uobq6 = new bq6(str);
       if (uobq6.c != null) {
          throw new RuntimeException("skipSpotifyPrefix must be the first call to SpotifyUriParser");
       }
       String[] e = bq6.e;
       int b = false;
       int i1 = 0;
       while (true) {
          int i2 = 47;
          boolean b1 = true;
          bq6 d = uobq6.d;
          if (i1 < 4) {
             object oobject = e[i1];
             if (d.startsWith(oobject)) {
                uobq6.c = oobject.length();
             label_005b :
                long l = -1;
                String str1 = null;
                if (uobq6.a()) {
                   i.b = yp6.D;
                   i.t = str1;
                   i.c = str1;
                   i.w = str1;
                   i.v = str1;
                   i.x = l;
                   i.y = yp6.j0;
                   i.z = str1;
                   i.A = str1;
                   return;
                }else {
                   String str2 = uobq6.b(b1);
                   yp6 j0 = yp6.j0;
                   String str3 = "album";
                   if (str2.equals(str3)) {
                      i.b = yp6.t;
                      i.t = uobq6.b(b1);
                      i.c = str1;
                   label_0095 :
                      str4 = str1;
                   }else if(str2.equals("artist")){
                      i.t = uobq6.b(b1);
                      i.c = str1;
                      if (uobq6.a()) {
                         i.b = yp6.b;
                         goto label_0095 ;
                      }else {
                         String str5 = uobq6.b(b1);
                         if ("concerts".equals(str5)) {
                            i.b = yp6.c;
                            goto label_0095 ;
                         }else if("popular-tracks".equals(str5)){
                            i.b = yp6.b;
                            goto label_0095 ;
                         }else {
                            throw new cq6("Malformed Spotify uri: ".concat(str));
                         }
                      }
                   }else {
                      String str6 = "playlist";
                      if (str2.equals(str6)) {
                         i.b = yp6.B;
                         i.t = uobq6.b(b);
                         i.c = str1;
                         goto label_0095 ;
                      }else if(str2.equals("playlists")){
                         i.b = yp6.C;
                         i.t = str1;
                         i.c = str1;
                         goto label_0095 ;
                      }else if(str2.equals("search")){
                         i.b = yp6.v;
                         i.t = uobq6.b(b);
                         i.c = str1;
                         goto label_0095 ;
                      }else {
                         String str7 = "track";
                         if (str2.equals(str7)) {
                            i.b = yp6.w;
                            i.t = uobq6.b(b);
                            i.c = str1;
                            goto label_0095 ;
                         }else if(str2.equals("work")){
                            i.b = yp6.y;
                            i.t = uobq6.b(b);
                            i.c = str1;
                            goto label_0095 ;
                         }else if(str2.equals("audio")){
                            i.b = yp6.x;
                            i.t = uobq6.b(b);
                            i.c = str1;
                            goto label_0095 ;
                         }else if(str2.equals("trackset")){
                            i.b = yp6.P;
                            i.t = uobq6.b(b);
                            i.c = str1;
                            goto label_0095 ;
                         }else if(str2.equals("genre")){
                            i.b = yp6.z;
                            i.t = uobq6.b(b);
                            i.c = str1;
                            goto label_0095 ;
                         }else if(str2.equals("dailymix")){
                            i.b = yp6.s0;
                            i.t = uobq6.b(b);
                            i.c = str1;
                            goto label_0095 ;
                         }else {
                            String str8 = "collection";
                            if (str2.equals(str8)) {
                               i.b = yp6.y0;
                               str = (uobq6.a())? str1: uobq6.b(b);
                               i.t = str;
                               i.c = str1;
                               goto label_0095 ;
                            }else if(str2.equals("song")){
                               i.b = yp6.K0;
                               i.t = uobq6.b(b);
                               i.c = str1;
                               goto label_0095 ;
                            }else if(str2.equals("content")){
                               i.b = yp6.M0;
                               i.t = uobq6.b(b);
                               i.c = str1;
                               goto label_0095 ;
                            }else if(str2.equals("datastories")){
                               i.b = yp6.N0;
                               i.t = uobq6.b(b1);
                               i.c = str1;
                               goto label_0095 ;
                            }else {
                               str4 = "user";
                               str1 = "cluster";
                               if (str2.equals(str4)) {
                                  str2 = uobq6.b(b1);
                                  if (str2.equals("facebook")) {
                                     try{
                                        l2 = Long.parseLong(uobq6.c());
                                     label_0221 :
                                        if ((l2) > 0) {
                                           e0.b = yp6.R;
                                           e0.t = uobq6.c();
                                           str4 = null;
                                           e0.c = str4;
                                        }else {
                                           str4 = null;
                                           e0.c = str2;
                                           if (uobq6.a()) {
                                              e0.b = yp6.G;
                                              e0.t = str4;
                                           }else {
                                              str2 = uobq6.b(b1);
                                              if (str2.equals(str6)) {
                                                 e0.b = yp6.A;
                                                 e0.t = uobq6.b(b1);
                                              }else if(str2.equals("collectiontracklist")){
                                                 e0.b = yp6.T;
                                                 e0.t = uobq6.b(b1);
                                              }else if(str2.equals("starred")){
                                                 e0.b = yp6.H;
                                                 str4 = null;
                                                 e0.t = str4;
                                              }else {
                                                 str4 = null;
                                                 if (str2.equals("publishedstarred")) {
                                                    e0.b = yp6.Z;
                                                    e0.t = str4;
                                                 }else if(str2.equals("maskedstarred")){
                                                    e0.b = yp6.a0;
                                                    e0.t = str4;
                                                 }else if(str2.equals("toplist")){
                                                    e0.b = yp6.K;
                                                    e0.t = str4;
                                                 }else if(str2.equals("top")){
                                                    if (uobq6.b(b1).equals("tracks")) {
                                                       e0.b = yp6.k0;
                                                       e0.t = str4;
                                                    }else {
                                                       e0.b = yp6.j0;
                                                       e0.t = str4;
                                                    }
                                                 }else if(str2.equals("maskedtoplist")){
                                                    e0.b = yp6.c0;
                                                    e0.t = str4;
                                                 }else if(str2.equals("recent")){
                                                    e0.b = yp6.L;
                                                    e0.t = str4;
                                                 }else if(str2.equals("collectionrootlist")){
                                                    e0.b = yp6.S;
                                                    e0.t = str4;
                                                 }else if(str2.equals("publishedrootlist")){
                                                    e0.b = yp6.U;
                                                    e0.t = str4;
                                                 }else if(str2.equals("profilecontainer")){
                                                    e0.b = yp6.V;
                                                    e0.t = str4;
                                                 }else if(str2.equals("inbox")){
                                                    e0.b = yp6.W;
                                                    e0.t = str4;
                                                 }else if(str2.equals("outbox")){
                                                    e0.b = yp6.d0;
                                                    e0.t = str4;
                                                 }else if(str2.equals("rootlist")){
                                                    e0.b = yp6.X;
                                                    e0.t = str4;
                                                 }else if(str2.equals("topfriends")){
                                                    e0.b = yp6.b0;
                                                    e0.t = str4;
                                                 }else if(str2.equals("purchaselist")){
                                                    e0.b = yp6.Y;
                                                    e0.t = str4;
                                                 }else if(str2.equals(str1)){
                                                    e0.b = yp6.r0;
                                                    e0.t = uobq6.b(b1);
                                                 }else if(str2.equals("folder")){
                                                    e0.b = yp6.L0;
                                                    e0.t = uobq6.b(b1);
                                                 }else if(str2.equals(str8)){
                                                    if (uobq6.a()) {
                                                       e0.b = yp6.y0;
                                                       str = null;
                                                       e0.t = str;
                                                       str4 = str;
                                                    }else {
                                                       str2 = uobq6.b(b1);
                                                       if (!str2.equals("artist")) {
                                                          if (str2.equals(str3)) {
                                                             e0.b = yp6.z0;
                                                             e0.t = uobq6.b(b1);
                                                          }else {
                                                             throw new cq6("Malformed Spotify uri: ".concat(str));
                                                          }
                                                       }else {
                                                          e0.b = yp6.A0;
                                                          e0.t = uobq6.b(b1);
                                                       }
                                                    }
                                                 }else {
                                                    throw new cq6("Malformed Spotify uri: ".concat(str));
                                                 }
                                              }
                                           }
                                        }
                                     }catch(java.lang.NumberFormatException e0){
                                     }
                                     l2 = 0;
                                     goto label_0221 ;
                                  }else {
                                  }
                               }else if(str2.equals("local")){
                                  i.b = yp6.F;
                                  i.c = null;
                                  boolean b2 = uobq6.c().endsWith(":");
                                  str4 = uobq6.b(b1);
                                  str3 = uobq6.b(b1);
                                  i.t = uobq6.b(b1);
                                  if (!uobq6.a()) {
                                     try{
                                        l1 = Long.parseLong(uobq6.c());
                                     }catch(java.lang.NumberFormatException e0){
                                        str3 = en6.s(str3, ":")+uobq6.b(false);
                                     }
                                     l1 = -2;
                                  }else if(b2){
                                  }else {
                                     l1 = -1;
                                  }
                                  str1 = str4;
                                  str4 = str3;
                                  uArrayList = null;
                               }else if(str2.equals("start-group")){
                                  i.b = yp6.e0;
                                  i.c = null;
                                  i.t = uobq6.b(b1);
                                  if (!uobq6.a()) {
                                     str1 = uobq6.b(false);
                                     l1 = -1;
                                     uArrayList = null;
                                     str4 = null;
                                  }
                               }else {
                                  b1 = false;
                                  if (str2.equals("end-group")) {
                                     i.b = yp6.f0;
                                     i.c = null;
                                     i.t = uobq6.b(b1);
                                     str4 = null;
                                  }else {
                                     str8 = null;
                                     if (str2.equals("radio")) {
                                        i.b = yp6.M;
                                        i.c = str8;
                                        i.t = str8;
                                        uArrayList1 = new ArrayList();
                                        while (!uobq6.a()) {
                                           uArrayList1.add(uobq6.b(true));
                                        }
                                     }else if(str2.equals("image")){
                                        i.b = yp6.O;
                                        i.c = null;
                                        i.t = uobq6.b(false);
                                        str4 = null;
                                     }else {
                                        String str9 = null;
                                        if (str2.equals("mosaic")) {
                                           i.b = yp6.x0;
                                           i.c = str9;
                                           i.t = str9;
                                           String[] stringArray = new String[]{uobq6.b(true),uobq6.b(true),uobq6.b(true),uobq6.b(i3)};
                                           i3 = 0;
                                           uArrayList1 = Arrays.asList(stringArray);
                                        }else if(str2.equals("station")){
                                           str2 = uobq6.b(true);
                                           if (uobq6.a()) {
                                              yp6 h0 = yp6.H0;
                                              i.b = h0;
                                              i.c = null;
                                              if ((j0 = 22) == str2.length()) {
                                                 b = 0;
                                                 while (true) {
                                                    if (b < j0) {
                                                       if (ox.b.contains(Character.valueOf(str2.charAt(b)))) {
                                                          b = b + 1;
                                                       }
                                                    }else {
                                                       str4 = 1;
                                                    label_0535 :
                                                       if (str4) {
                                                          i.t = str2;
                                                          j0 = h0;
                                                       }else {
                                                          throw new cq6("Malformed Spotify uri: ".concat(str));
                                                       }
                                                    }
                                                 }
                                                 i.v = str1;
                                                 i.w = str4;
                                                 i.x = l1;
                                                 i.y = j0;
                                                 i.z = uArrayList;
                                                 i.A = str3;
                                                 return;
                                              }
                                              str4 = 0;
                                              goto label_0535 ;
                                           }else {
                                              i.b = yp6.N;
                                              if (str2.equals(str4)) {
                                                 i.c = uobq6.b(true);
                                                 str9 = uobq6.b(true);
                                                 if (str9.equals(str6)) {
                                                    a = yp6.A;
                                                 }else if(str9.equals(str1)){
                                                    a = yp6.r0;
                                                 }else {
                                                    throw new cq6("Malformed Spotify uri: ".concat(str));
                                                 }
                                              }else {
                                                 i.c = null;
                                                 if (str2.equals("artist")) {
                                                    a = yp6.b;
                                                 }else if(str2.equals(str3)){
                                                    a = yp6.t;
                                                 }else if(str2.equals(str7)){
                                                    a = yp6.w;
                                                 }else if(str2.equals("genre")){
                                                    a = yp6.z;
                                                 }else if(str2.equals(str6)){
                                                    a = yp6.B;
                                                 }else {
                                                    throw new cq6("Malformed Spotify uri: ".concat(str));
                                                 }
                                              }
                                              i.t = uobq6.b(false);
                                              j0 = a;
                                           }
                                        }else if(str2.equals("internal")){
                                           if (uobq6.c().startsWith("running:")) {
                                              uobq6.b(true);
                                              i.b = yp6.q0;
                                           }else {
                                              i.b = yp6.E;
                                           }
                                           str4 = null;
                                           i.c = str4;
                                           i.t = uobq6.b(false);
                                        }else {
                                           str4 = null;
                                           i3 = false;
                                           if (str2.equals("video")) {
                                              i.b = yp6.g0;
                                              i.c = str4;
                                              i.t = uobq6.b(i3);
                                           }else if(str2.equals("recording")){
                                              i.b = yp6.h0;
                                              i.c = str4;
                                              i.t = uobq6.b(i3);
                                           }else if(str2.equals("canvas")){
                                              i.b = yp6.i0;
                                              i.c = str4;
                                              i.t = uobq6.b(i3);
                                           }else if(str2.equals("app")){
                                              i.b = yp6.Q;
                                              i.c = str4;
                                              str = uobq6.b(i3);
                                              i.t = str;
                                              int i4 = 0;
                                              while (true) {
                                                 if (i4 < str.length()) {
                                                    if ((c = str.charAt(i4)) >= 'a' && (c <= 'z' || (c >= 'A' && (c <= 'Z' || (c >= '0' && (c <= '9' || (c == '-' || (c == '/' || (c == '.' || c == ':'))))))))) {
                                                       i4 = i4 + 1;
                                                    }else {
                                                       throw new cq6("Invalid Spotify application id: ".concat(str));
                                                    }
                                                 }
                                              }
                                           }else if(str2.equals("show")){
                                              i.b = yp6.l0;
                                              i.t = uobq6.b(false);
                                              str4 = null;
                                              i.c = str4;
                                           }else {
                                              str4 = null;
                                              i3 = false;
                                              if (str2.equals("episode")) {
                                                 i.b = yp6.m0;
                                                 i.t = uobq6.b(i3);
                                                 i.c = str4;
                                              }else if(str2.equals("ad")){
                                                 i.b = yp6.I;
                                                 i.t = uobq6.b(i3);
                                                 i.c = str4;
                                              }else if(str2.equals("adspace")){
                                                 i.b = yp6.n0;
                                                 i.t = uobq6.b(i3);
                                                 i.c = str4;
                                              }else if(str2.equals("interruption")){
                                                 i.b = yp6.J;
                                                 i.t = uobq6.b(i3);
                                                 i.c = str4;
                                              }else if(str2.equals("chart")){
                                                 i.b = yp6.o0;
                                                 i.t = uobq6.b(true);
                                                 i.c = str4;
                                              }else {
                                                 i3 = true;
                                                 if (str2.equals("party")) {
                                                    i.b = yp6.p0;
                                                    i.t = uobq6.b(i3);
                                                    i.c = str4;
                                                 }else if(str2.equals("running")){
                                                    i.b = yp6.q0;
                                                    i.t = uobq6.b(false);
                                                    i.c = str4;
                                                 }else {
                                                    i3 = false;
                                                    if (str2.equals("link")) {
                                                       i.b = yp6.t0;
                                                       i.t = uobq6.b(i3);
                                                       i.c = str4;
                                                    }else if(str2.equals("imageset")){
                                                       i.b = yp6.u0;
                                                       i.t = uobq6.b(i3);
                                                       i.c = str4;
                                                    }else if(str2.equals("space")){
                                                       i.b = yp6.v0;
                                                       i.t = uobq6.b(i3);
                                                       i.c = str4;
                                                    }else if(str2.equals("concert")){
                                                       i.b = yp6.w0;
                                                       i.t = uobq6.b(i3);
                                                       i.c = str4;
                                                    }else if(str2.equals("premium-destination")){
                                                       i.b = yp6.B0;
                                                       i.t = str4;
                                                       i.c = str4;
                                                    }else if(str2.equals("upsell")){
                                                       i.b = yp6.C0;
                                                       i.t = uobq6.b(false);
                                                       i.c = str4;
                                                    }else if(str2.equals("devicepreset")){
                                                       i.b = yp6.D0;
                                                       str2 = uobq6.b(true);
                                                       i.t = uobq6.b(true);
                                                       i.c = str4;
                                                       uArrayList1 = str4;
                                                    label_0840 :
                                                       uArrayList = str;
                                                       l1 = -1;
                                                       str3 = str2;
                                                       str1 = str4;
                                                    }else {
                                                       i3 = true;
                                                       if (str2.equals("together")) {
                                                          i.b = yp6.E0;
                                                          i.t = str4;
                                                          i.c = uobq6.b(i3);
                                                       }else if(str2.equals("socialsession")){
                                                          i.b = yp6.F0;
                                                          i.t = uobq6.b(i3);
                                                          i.c = str4;
                                                       }else if(str2.equals("licensor")){
                                                          i.b = yp6.G0;
                                                          i.t = uobq6.b(false);
                                                          i.c = str4;
                                                       }else {
                                                          i3 = false;
                                                          if (str2.equals("zerotap")) {
                                                             i.b = yp6.I0;
                                                             i.c = str4;
                                                             i.t = uobq6.b(i3);
                                                          }else if(str2.equals("home")){
                                                             i.b = yp6.J0;
                                                             i.c = str4;
                                                             i.t = str4;
                                                          }else {
                                                             throw new cq6("Malformed Spotify uri: ".concat(str));
                                                          }
                                                       }
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                     str4 = null;
                                  label_083f :
                                     str2 = str4;
                                     goto label_0840 ;
                                  }
                               }
                               str3 = null;
                               str4 = null;
                            }
                         }
                      }
                   }
                   str = str4;
                   goto label_083f ;
                }
             }else {
                i1 = i1 + 1;
             }
          }else if(d.startsWith("spotify:")){
             uobq6.c = 8;
             if (9 < d.length() && (d.charAt(uobq6.c) == i2 && d.charAt((uobq6.c + b1)) == i2)) {
                uobq6.c = uobq6.c + 2;
                goto label_005b ;
             }else {
                goto label_005b ;
             }
          }else {
             throw new cq6("Spotify uri doesn\'t start with a proper prefix: ".concat(d));
          }
       }
    }
    public void aq6(yp6 p0,String p1,String p2){
       super();
       this.b = p0;
       this.t = p1;
       this.c = p2;
       this.v = null;
       this.w = null;
       this.x = -1;
       this.a = null;
       this.y = yp6.j0;
       this.z = new ArrayList();
       this.A = null;
    }
    public static String b(String p0){
       try{
          p0 = URLEncoder.encode(p0, "utf-8");
          if (p0.indexOf(42) != -1) {
             p0 = p0.replace("*", "%2A");
          }
          return p0;
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException(e2);
       }
    }
    public static String c(String p0){
       String str = "%7E";
       try{
          p0 = URLEncoder.encode(p0, "utf-8");
          if (p0.indexOf(42) != -1) {
             p0 = p0.replace("*", "%2A");
          }
          if (p0.indexOf(str) != -1) {
             p0 = p0.replace(str, "~");
          }
          return p0;
       }catch(java.io.UnsupportedEncodingException e4){
          throw new RuntimeException(e4);
       }
    }
    public static int d(String p0,String p1){
       if (p0 == null && p1 == null) {
          return 0;
       }
       if (p0 == null) {
          return -1;
       }
       if (p1 == null) {
          return 1;
       }
       return p0.compareTo(p1);
    }
    public final int a(aq6 p0){
       aq6 tb;
       int i;
       aq6 b = p0.b;
       if ((tb = this.b) != b) {
          return tb.compareTo(b);
       }
       b = this.y;
       tb = p0.y;
       if (b != tb) {
          return b.compareTo(tb);
       }
       if (i = aq6.d(this.c, p0.c)) {
          return i;
       }
       if (i = aq6.d(this.t, p0.t)) {
          return i;
       }
       if (i = aq6.d(this.v, p0.v)) {
          return i;
       }
       if (i = aq6.d(this.w, p0.w)) {
          return i;
       }
       return Long.compare(this.x, p0.x);
    }
    public final int compareTo(Object p0){
       return this.a(p0);
    }
    public final boolean equals(Object p0){
       aq6 tt;
       if (this == p0) {
          return true;
       }
       if (p0 == null || aq6.class != p0.getClass()) {
          return false;
       }
       if (this.x - p0.x) {
          return false;
       }
       aq6 t = p0.t;
       if ((tt = this.t) != null) {
          if (!tt.equals(t)) {
          label_002a :
             return false;
          }
       }else if(t != null){
          goto label_002a ;
       }
       if (this.b != p0.b) {
          return false;
       }else if(this.y != p0.y){
          return false;
       }else {
          t = p0.w;
          if ((tt = this.w) != null) {
             if (!tt.equals(t)) {
             label_0048 :
                return false;
             }
          }else if(t != null){
             goto label_0048 ;
          }
          t = p0.v;
          if ((tt = this.v) != null) {
             if (!tt.equals(t)) {
             label_0058 :
                return false;
             }
          }else if(t != null){
             goto label_0058 ;
          }
          p0 = p0.c;
          if ((t = this.c) != null) {
             if (!t.equals(p0)) {
             label_0068 :
                return false;
             }
          }else if(p0 != null){
             goto label_0068 ;
          }
          return true;
       }
    }
    public final int hashCode(){
       aq6 tc;
       int i = (this.y.hashCode() + (this.b.hashCode() * 31)) * 31;
       int i1 = 0;
       int i2 = ((tc = this.c) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.t) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.v) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       if ((tc = this.w) != null) {
          i1 = tc.hashCode();
       }
       tc = this.x;
       return (((i + i1) * 31) + (int)(tc ^ (tc >> 32)));
    }
    public final String toString(){
       int i;
       StringBuilder str = "spotify:";
       aq6 tb = this.b;
       String str1 = "station:";
       aq6 tz = this.z;
       String str2 = ":cluster:";
       aq6 tv = this.v;
       aq6 tc = this.c;
       aq6 tt = this.t;
       switch (tb.ordinal()){
           case 1:
             str = str+"artist:"+tt;
             break;
           case 2:
             str = str+"artist:"+tt+":concerts";
             break;
           case 3:
             str = str+"album:"+tt;
             break;
           case 4:
             str = str+"search:"+aq6.c(tt);
             break;
           case 5:
             str = str+"track:"+tt;
             break;
           case 6:
             str = str+"audio:"+tt;
             break;
           case 7:
             str = str+"work:"+tt;
             break;
           case 8:
             str = str+"genre:"+tt;
             break;
           case 9:
             str = str+"user:"+aq6.c(tc)+":playlist:"+tt;
             break;
           case 10:
             str = str+"playlist:"+tt;
             break;
           case 11:
             str = str+"playlists";
             break;
           case 12:
             str = str+"activate";
             break;
           case 14:
             str = str+"internal:"+tt;
             break;
           case 15:
             str = str+"local:"+aq6.b(tv)+":"+aq6.b(this.w)+":"+aq6.b(tt);
             aq6 tx = this.x;
             if ((tx) >= 0) {
                str = str+":"+tx;
             }else if(tx - -1){
                str = str+":";
             }
             break;
           case 16:
             str = str+"user:"+aq6.c(tc);
             break;
           case 17:
             str = str+"user:"+aq6.c(tc)+":starred";
             break;
           case 18:
             str = str+"ad:"+tt;
             break;
           case 19:
             str = str+"interruption:"+tt;
             break;
           case 20:
             str = str+"user:"+aq6.c(tc)+":toplist";
             break;
           case 21:
             str = str+"user:"+aq6.c(tc)+":recent";
             break;
           case 22:
             str = str+"radio";
             Iterator iterator = tz.iterator();
             while (iterator.hasNext()) {
                str = str.append(":").append(aq6.c(iterator.next()));
             }
             break;
           case 23:
             str = str+str1;
             tb = this.y;
             if ((i = tb.ordinal()) != 1 && (i != 3 && i != 5)) {
                if (i != 57) {
                   switch (i){
                       case 8:
                      label_0359 :
                         str = str+tb.a+':';
                         break;
                       case 9:
                         str = str+"user:"+aq6.c(tc)+":playlist:";
                         break;
                       case 10:
                         str = str+"playlist:";
                         break;
                       default:
                         throw new RuntimeException("unexpected station kind "+tb);
                   }
                }else {
                   str = str+"user:"+aq6.c(tc)+str2;
                }
             }else {
                goto label_0359 ;
             }
             str = str+tt;
             break;
           case 24:
             str = str+"image:"+tt;
             break;
           case 26:
             str = str+"trackset:"+aq6.c(tt);
             break;
           case 29:
             str = str+"app:"+tt;
             break;
           case 30:
             str = str+"user:facebook:"+tt;
             break;
           case 31:
             str = str+"user:"+aq6.c(tc)+":collectionrootlist";
             break;
           case 32:
             str = str+"user:"+aq6.c(tc)+":collectiontracklist:"+tt;
             break;
           case '!':
             str = str+"user:"+aq6.c(tc)+":publishedrootlist";
             break;
           case '"':
             str = str+"user:"+aq6.c(tc)+":profilecontainer";
             break;
           case '#':
             str = str+"user:"+aq6.c(tc)+":inbox";
             break;
           case '$':
             str = str+"user:"+aq6.c(tc)+":rootlist";
             break;
           case '%':
             str = str+"user:"+aq6.c(tc)+":purchaselist";
             break;
           case '&':
             str = str+"user:"+aq6.c(tc)+":publishedstarred";
             break;
           case 39:
             str = str+"user:"+aq6.c(tc)+":maskedstarred";
             break;
           case '(':
             str = str+"user:"+aq6.c(tc)+":topfriends";
             break;
           case ')':
             str = str+"user:"+aq6.c(tc)+":maskedtoplist";
             break;
           case '*':
             str = str+"user:"+aq6.c(tc)+":outbox";
             break;
           case ',':
             str = str+"start-group:"+tt;
             if (tv != null) {
                str = str+":"+aq6.c(tv);
             }
             break;
           case '-':
             str = str+"end-group:"+tt;
             break;
           case '.':
             str = str+"video:"+tt;
             break;
           case '/':
             str = str+"recording:"+tt;
             break;
           case '0':
             str = str+"canvas:"+tt;
             break;
           case '2':
             str = str+"user:"+aq6.c(tc)+":top:tracks";
             break;
           case '3':
             str = str+"show:"+tt;
             break;
           case '4':
             str = str+"episode:"+tt;
             break;
           case '5':
             str = str+"adspace:"+tt;
             break;
           case '6':
             str = str+"chart:"+tt;
             break;
           case '7':
             str = str+"party:"+tt;
             break;
           case '8':
             str = str+"running:"+tt;
             break;
           case '9':
             str = str+"user:"+aq6.c(tc)+str2+tt;
             break;
           case ':':
             str = str+"dailymix:"+tt;
             break;
           case ';':
             str = str+"link:"+tt;
             break;
           case '<':
             str = str+"imageset:"+tt;
             break;
           case '=':
             str = str+"space:"+tt;
             break;
           case '>':
             str = str+"concert:"+tt;
             break;
           case '?':
             str = str+"mosaic:";
             StringBuilder str3 = "";
             Iterator iterator1 = tz.iterator();
             if (iterator1.hasNext()) {
                while (true) {
                   str3 = str3.append(iterator1.next());
                   if (iterator1.hasNext()) {
                      str3 = str3.append(":");
                   }
                }
             }
             str = str+str3;
             break;
           case '@':
             if (tc != null) {
                str = str+"user:"+aq6.c(tc)+':';
             }
             str = str+"collection";
             if (tt != null) {
                str = str+':'+tt;
             }
             break;
           case 'A':
             str = str+"user:"+aq6.c(tc)+":collection:album:"+tt;
             break;
           case 'B':
             str = str+"user:"+aq6.c(tc)+":collection:artist:"+tt;
             break;
           case 'C':
             str = str+"premium-destination";
             break;
           case 'D':
             str = str+"upsell:"+tt;
             break;
           case 'E':
             str = str+"devicepreset:"+this.A+":"+tt;
             break;
           case 'F':
             str = str+"together:"+aq6.c(tc);
             break;
           case 'G':
             str = str+"socialsession:"+tt;
             break;
           case 'H':
             str = str+"licensor:"+tt;
             break;
           case 'I':
             str = str+str1+tt;
             break;
           case 'J':
             str = str+"zerotap:"+tt;
             break;
           case 'K':
             str = str+"home";
             break;
           case 'L':
             str = str+"song:"+tt;
             break;
           case 'M':
             str = str+"user:"+aq6.c(tc)+":folder:"+tt;
             break;
           case 'N':
             str = str+"content:"+tt;
             break;
           case 'O':
             str = str+"datastories:"+tt;
             break;
           default:
             throw new RuntimeException("Unknown Spotify uri kind: "+tb);
       }
       return str;
    }
}
