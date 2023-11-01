package p.os2;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import p.co5;
import p.gg1;
import java.util.List;
import p.ps2;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import java.lang.IllegalStateException;
import p.vv7;
import java.lang.IllegalArgumentException;
import p.we7;
import p.av6;
import java.lang.StringBuilder;
import java.util.Collection;
import java.lang.Integer;
import java.lang.CharSequence;
import p.bv6;

public final class os2	// class@00217d from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final ArrayList f;
    public List g;
    public String h;

    public void os2(){
       super();
       this.b = "";
       this.c = "";
       this.e = -1;
       ArrayList uArrayList = new ArrayList();
       this.f = uArrayList;
       uArrayList.add("");
    }
    public final void a(String p0,String p1){
       co5.o(p0, "encodedName");
       if (this.g == null) {
          this.g = new ArrayList();
       }
       os2 tg = this.g;
       co5.i(tg);
       tg.add(gg1.i(p0, 0, 0, " \"\'<>#&=", true, false, true, false, 211));
       os2 tg1 = this.g;
       co5.i(tg1);
       p1 = (p1 == null)? null: gg1.i(p1, 0, 0, " \"\'<>#&=", true, false, true, false, 211);
       tg1.add(p1);
       return;
    }
    public final ps2 b(){
       os2 ta;
       os2 td;
       int i4;
       if ((ta = this.a) == null) {
          throw new IllegalStateException("scheme == null");
       }
       int i = 0;
       int i1 = 7;
       String str = gg1.S(this.b, i, i, i, i1);
       String str1 = gg1.S(this.c, i, i, i, i1);
       if ((td = this.d) == null) {
          throw new IllegalStateException("host == null");
       }
       int i2 = this.c();
       os2 tf = this.f;
       ArrayList uArrayList = new ArrayList(aj0.b0(tf));
       Iterator iterator = tf.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(gg1.S(iterator.next(), i, i, i, i1));
       }
       tf = this.g;
       int i3 = 0;
       if (tf == null) {
          i4 = i3;
       }else {
          i4 = new ArrayList(aj0.b0(tf));
          iterator = tf.iterator();
          while (iterator.hasNext()) {
             String str2 = ((str2 = iterator.next()) == null)? i3: gg1.S(str2, i, i, true, 3);
             i4.add(str2);
          }
       }
       if ((tf = this.h) != null) {
          i3 = gg1.S(tf, i, i, i, i1);
       }
       ps2 v12 = new ps2(ta, str, str1, td, i2, uArrayList, i4, i3, this.toString());
       return v12;
    }
    public final int c(){
       os2 te;
       if ((te = this.e) != -1) {
       }else {
          te = this.a;
          co5.i(te);
          if (co5.c(te, "http")) {
             te = 80;
          }else if(co5.c(te, "https")){
             te = 443;
          }else {
             te = -1;
          }
       }
       return te;
    }
    public final void d(String p0){
       List list = (p0 == null)? null: gg1.W(gg1.i(p0, 0, 0, " \"\'<>#", true, false, true, false, 211));
       this.g = list;
       return;
    }
    public final void e(String p0){
       String str;
       co5.o(p0, "host");
       if ((str = vv7.S(gg1.S(p0, 0, 0, 0, 7))) == null) {
          throw new IllegalArgumentException(co5.K(p0, "unexpected host: "));
       }
       this.d = str;
       return;
    }
    public final void f(ps2 p0,String p1){
       int i6;
       int i9;
       int i10;
       int i11;
       char c2;
       String str1;
       String str2;
       String str3;
       os2 oos21;
       String str4;
       int i14;
       int b1;
       int i16;
       String str5;
       char c3;
       os2 oos22;
       os2 oos24;
       os2 oos2 = this;
       ps2 ops2 = p0;
       Object obj = p1;
       co5.o(obj, "input");
       int i = 0;
       int i1 = we7.n(obj, i, p1.length());
       int i2 = we7.o(obj, i1, p1.length());
       int i3 = 91;
       int i4 = 2;
       char c = ':';
       boolean i5 = -1;
       int b = true;
       if (((i2 - i1)) < i4) {
       }else {
          char c1 = obj.charAt(i1);
          int i7 = 97;
          int i8 = 65;
          if (co5.r(c1, i7) >= 0 && (co5.r(c1, 122) <= 0 || (co5.r(c1, i8) >= 0 && co5.r(c1, 90) <= 0))) {
             i6 = i1 + 1;
             while (true) {
                if (i6 < i2) {
                   i9 = i6 + 1;
                   char c4 = obj.charAt(i6);
                   i7 = (i7 <= c4 && c4 < '{')? 1: 0;
                   i7 = (i7 || (i8 <= c4 && c4 < i3))? 1: 0;
                   i7 = (i7 || (48 <= c4 && c4 < c))? 1: 0;
                   i7 = (i7 || c4 == '+')? 1: 0;
                   i7 = (i7 || c4 == '-')? 1: 0;
                   i7 = (i7 || c4 == '.')? 1: 0;
                   if (i7) {
                      i6 = i9;
                      i7 = 97;
                   }else if(c4 == c){
                      break ;
                   }
                }
             }
             String str = "this as java.lang.String…ing\(startIndex, endIndex\)";
             if (i6 != i5) {
                if (av6.C0(i1, obj, "https:", b)) {
                   oos2.a = "https";
                   i1 = i1 + 6;
                }else if(av6.C0(i1, obj, "http:", b)){
                   oos2.a = "http";
                   i1 = i1 + 5;
                }else {
                   str5 = obj.substring(i, i6);
                   co5.l(str5, str);
                   StringBuilder str6 = "Expected URL scheme \'http\' or \'https\' but was \'"+str5;
                   throw new IllegalArgumentException(str6+''');
                }
             }else if(ops2 != null){
                oos2.a = ops2.a;
             }else {
                i1 = 6;
                str4 = (p1.length() > i1)? co5.K("...", bv6.L0(i1, obj)): obj;
                throw new IllegalArgumentException(co5.K(str4, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "));
             }
             i6 = i1;
             i7 = 0;
             while (true) {
                i8 = 92;
                i9 = 47;
                if (i6 < i2) {
                   i10 = i6 + 1;
                   if ((c1 = obj.charAt(i6)) != i8 && c1 != i9) {
                      break ;
                   }else {
                      i7 = i7 + 1;
                      i6 = i10;
                   }
                }else {
                   break ;
                }
             }
             os2 f = oos2.f;
             i = 63;
             i3 = 35;
             if (i7 < i4 && (ops2 && co5.c(ops2.a, oos2.a))) {
                oos2.b = p0.e();
                oos2.c = p0.a();
                oos2.d = ops2.d;
                oos2.e = ops2.e;
                f.clear();
                f.addAll(p0.c());
                if (i1 == i2 || obj.charAt(i1) == i3) {
                   oos2.d(p0.d());
                }
                oos21 = f;
                i5 = true;
             }else {
                b = i1 + i7;
                i11 = 0;
                int i12 = 0;
                while (true) {
                   if ((i7 = we7.f(b, obj, i2, "@/\\?#")) != i2) {
                      c2 = obj.charAt(i7);
                   label_015d :
                      if (c2 != i5 && (c2 != i3 && (c2 != i9 && (c2 != i8 && c2 != i)))) {
                         if (c2 != '@') {
                            continue ;
                         }else {
                            str1 = "%40";
                            if (!i11) {
                               int i13 = we7.g(obj, c, b, i7);
                               str2 = str1;
                               i = i7;
                               str3 = str;
                               oos21 = f;
                               str4 = gg1.i(p1, b, i13, " \"\':;<=>@[]^`{}|/\\?#", 1, 0, 0, 0, 240);
                               if (i12) {
                                  str4 = "".append(oos2.b).append(str2).append(str4).toString();
                               }
                               oos2.b = str4;
                               if ((i14 = i13) != i) {
                                  i1 = i14 + 1;
                                  oos2.c = gg1.i(p1, i1, i, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                  b = 1;
                               }else {
                                  b = i11;
                               }
                               i11 = b;
                               i12 = 1;
                            }else {
                               oos21 = f;
                               i = i7;
                               str3 = str;
                               oos2.c = "".append(oos2.c).append(str1).append(gg1.i(p1, b, i, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, 0, 240)).toString();
                            }
                            b = i + 1;
                            f = oos21;
                            str = str3;
                            i9 = 47;
                            i8 = 92;
                            i = 63;
                            str2 = 35;
                            i5 = -1;
                         }
                      }else {
                         oos21 = f;
                         i = i7;
                         str3 = str;
                         i5 = 1;
                         i7 = b;
                         while (true) {
                            if (i7 < i) {
                               if ((c2 = obj.charAt(i7)) == '[') {
                                  do {
                                  } while ((i7 = i7 + i5) < i && obj.charAt(i7) != ']');
                               }else if(c2 == c){
                                  i3 = i7;
                               label_023e :
                                  int i15 = i3 + 1;
                                  i14 = 4;
                                  if (i15 < i) {
                                     str4 = vv7.S(gg1.S(obj, b, i3, false, i14));
                                     try{
                                        oos2.d = str4;
                                        str1 = "";
                                        i7 = false;
                                        i9 = false;
                                        i8 = false;
                                        str4 = p1;
                                        i1 = i15;
                                        i6 = i;
                                        b1 = false;
                                        i16 = b;
                                        b = 248;
                                        try{
                                           i14 = Integer.parseInt(gg1.i(str4, i1, i6, str1, i7, i9, i8, b1, b));
                                           oos22 = (i5 <= i14 && i14 < 0x10000)? 1: 0;
                                           if (oos22) {
                                           label_027d :
                                              e0.e = i14;
                                              b = (i14 != -1)? 1: 0;
                                              if (b) {
                                                 str5 = str3;
                                                 b = i16;
                                                 c3 = '"';
                                                 i15 = 0;
                                              }else {
                                                 str4 = obj.substring(i15, i);
                                                 co5.l(str4, str3);
                                                 str4 = "Invalid URL port: \""+str4;
                                                 throw new IllegalArgumentException(str4+'"'.toString());
                                              }
                                           }
                                        }catch(java.lang.NumberFormatException e0){
                                        }
                                     }catch(java.lang.NumberFormatException e0){
                                        i16 = b;
                                     }
                                     i14 = -1;
                                     goto label_027d ;
                                  }else {
                                     str5 = str3;
                                     c3 = '"';
                                     oos2.d = vv7.S(gg1.S(obj, b, i3, false, i14));
                                     os2 a = oos2.a;
                                     co5.i(a);
                                     oos2.e = gg1.y(a);
                                  }
                                  i14 = (e0.d != null)? 1: 0;
                                  if (i14) {
                                     i1 = i;
                                  }else {
                                     str4 = obj.substring(b, i3);
                                     co5.l(str4, str5);
                                     throw new IllegalArgumentException("Invalid URL host: \""+str4+c3.toString());
                                  }
                               }
                               i7 = i7 + i5;
                            }else {
                               i3 = i;
                               goto label_023e ;
                            }
                         }
                      }
                   }else {
                      c2 = -1;
                      goto label_015d ;
                   }
                }
             }
             i = we7.f(i1, obj, i2, "?#");
             if (i1 != i) {
                c2 = obj.charAt(i1);
                str2 = "";
                if (c2 != '/' && c2 != '\') {
                   i14 = oos21.size() - i5;
                   oos22 = oos21;
                   oos22.set(i14, str2);
                }else {
                   oos22 = oos21;
                   oos22.clear();
                   oos22.add(str2);
                   i1 = i1 + 1;
                }
                while (i1 < i) {
                   i10 = ((b1 = we7.f(i1, obj, i, "/\\")) < i)? 1: 0;
                   i11 = b1;
                   os2 oos23 = oos22;
                   str4 = gg1.i(p1, i1, b1, " \"<>^`{}|/\\?#", true, false, false, 0, 240);
                   oos22 = (!co5.c(str4, ".") && !av6.i0(str4, "%2e", i5))? 0: 1;
                   if (oos22) {
                      oos24 = oos23;
                   }else if(!co5.c(str4, "..") && (!av6.i0(str4, "%2e.", i5) && (!av6.i0(str4, ".%2e", i5) && !av6.i0(str4, "%2e%2e", i5)))){
                      oos22 = 0;
                   }else {
                      oos22 = 1;
                   }
                   if (oos22) {
                      i14 = oos23.size() - i5;
                      oos24 = oos23;
                      oos22 = (!oos24.remove(i14).length())? 1: 0;
                      if (oos22 && (i14 = oos24.isEmpty() ^ i5)) {
                         i14 = oos24.size() - i5;
                         oos24.set(i14, str2);
                      }else {
                         oos24.add(str2);
                      }
                   }else {
                      oos24 = oos23;
                      oos22 = (!(i6 = oos24.size() - i5))? 1: 0;
                      if (oos22) {
                         i6 = oos24.size() - i5;
                         oos24.set(i6, str4);
                      }else {
                         oos24.add(str4);
                      }
                      if (i10) {
                         oos24.add(str2);
                      }
                   }
                   if (i10) {
                      i14 = i11 + 1;
                      oos22 = oos24;
                      i1 = i14;
                   }else {
                      oos22 = oos24;
                      i1 = i11;
                      continue ;
                   }
                }
             }
             if (i < i2 && obj.charAt(i) == '?') {
                i3 = we7.g(obj, '#', i, i2);
                e0.g = gg1.W(gg1.i(p1, (i + 1), i3, " \"\'<>#", true, false, true, false, 208));
                i = i3;
             }
             if (i < i2 && obj.charAt(i) == '#') {
                e0.h = gg1.i(p1, (i + 1), i2, "", true, false, false, true, 176);
             }
             return;
          }
       }
       i6 = -1;
    }
    public final void g(String p0){
       String str = "http";
       boolean b = true;
       if (av6.i0(p0, str, b)) {
          this.a = str;
       }else {
          str = "https";
          if (av6.i0(p0, str, b)) {
             this.a = str;
          }else {
             throw new IllegalArgumentException(co5.K(p0, "unexpected scheme: "));
          }
       }
       return;
    }
    public final String toString(){
       os2 ta;
       os2 ta1;
       StringBuilder str = "";
       str = ((ta = this.a) != null)? str+ta+"://": str+"//";
       int i = 0;
       int i1 = 1;
       ta = (this.b.length() > 0)? 1: 0;
       char c = ':';
       if (!ta) {
          ta = (this.c.length() > 0)? 1: 0;
          if (!ta) {
          label_0053 :
             if ((ta = this.d) != null) {
                str = (av6.e0(ta, c))? str+'['+this.d+']': str+this.d;
             }
             i1 = -1;
             if (this.e != i1 || this.a != null) {
                int i2 = this.c();
                if ((ta1 = this.a) != null) {
                   if (co5.c(ta1, "http")) {
                      i1 = 80;
                   }else if(co5.c(ta1, "https")){
                      i1 = 443;
                   }
                   if (i2 == i1) {
                   label_00a0 :
                      ta = this.f;
                      co5.o(ta, "<this>");
                      i1 = ta.size();
                      for (; i < i1; i = i3) {
                         int i3 = i + 1;
                         str = str.append('/').append(ta.get(i));
                      }
                      if (this.g != null) {
                         str = str+'?';
                         ta = this.g;
                         co5.i(ta);
                         gg1.X(ta, str);
                      }
                      if (this.h != null) {
                         str = str+'#'+this.h;
                      }
                      str = str;
                      co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
                      return str;
                   }
                }
                str = str+c+i2;
                goto label_00a0 ;
             }
          }
       }
       str = str+this.b;
       if (this.c.length() <= 0) {
          i1 = 0;
       }
       if (i1) {
          str = str+c+this.c;
       }
       str = str+'@';
       goto label_0053 ;
    }
}
