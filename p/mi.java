package p.mi;
import p.ci5;
import p.i33;
import p.w54;
import java.lang.reflect.Type;
import p.dv0;
import p.ry1;
import p.bm;
import p.jb4;
import p.ps3;
import java.lang.Object;
import p.kd7;
import p.xo0;
import p.lb4;
import p.ir2;
import p.j93;
import p.qb4;
import p.xk5;
import com.spotify.allboarding.model.v1.proto.SquircleArtist;
import p.vk;
import java.lang.String;
import p.co5;
import p.bc3;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.util.List;
import com.spotify.allboarding.model.v1.proto.Item;
import p.nr0;
import p.xr0;
import p.en6;
import p.nc3;
import com.spotify.allboarding.model.v1.proto.SquircleShowMore;
import com.spotify.allboarding.model.v1.proto.SquircleShow;
import p.iq6;
import p.xc4;
import com.spotify.allboarding.model.v1.proto.Pill;
import p.cf0;
import com.spotify.allboarding.model.v1.proto.Banner;
import p.jx;
import com.spotify.allboarding.model.v1.proto.SquircleArtistMore;
import p.wc4;
import p.ka5;
import android.content.Context;
import p.sz1;
import java.io.FileInputStream;
import p.li;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Closeable;
import p.ej4;
import java.io.File;
import java.lang.NullPointerException;
import java.lang.Class;
import java.util.HashMap;
import java.lang.reflect.TypeVariable;
import java.lang.Void;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.util.NoSuchElementException;
import p.k;
import java.lang.reflect.GenericArrayType;
import p.l;
import java.lang.reflect.WildcardType;
import p.m;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import p.ju2;
import p.au2;
import p.e46;
import java.util.Calendar;
import p.zg0;
import p.ic;
import java.util.TimeZone;
import java.lang.System;
import java.lang.StringBuilder;
import p.do5;
import p.eb1;
import p.gb1;
import java.lang.Math;
import p.hb1;
import p.db1;
import java.util.Comparator;
import java.util.Collections;
import p.sb4;
import p.u63;
import p.er7;
import p.wu;
import android.support.v4.media.MediaMetadataCompat;
import p.mo;
import p.u44;
import p.m73;
import p.r45;
import p.nt0;
import p.te5;
import p.aq6;
import p.td7;
import p.yp6;
import java.util.Locale;
import java.lang.Integer;
import p.dv;
import com.google.common.collect.b;
import p.sr;
import p.ur;
import java.lang.Long;
import p.qu;
import android.os.Bundle;
import p.sp6;
import p.lp6;
import android.content.res.ColorStateList;
import p.uw5;
import android.content.res.Resources;
import p.xj0;
import p.or6;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import p.sg;
import com.spotify.legacyglue.icons.SpotifyIconView;
import android.view.KeyEvent;
import p.wh7;
import android.os.Build$VERSION;
import p.vh7;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import p.gh7;
import p.kh3;
import android.view.Window$Callback;
import android.app.Activity;
import android.view.Window;
import android.app.ActionBar;
import java.lang.reflect.Method;
import java.lang.Boolean;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent$Callback;
import android.app.Dialog;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface;
import java.util.Arrays;
import p.je5;
import java.util.Collection;
import p.he5;
import p.de5;
import java.lang.ArithmeticException;
import java.lang.CharSequence;
import p.av6;
import java.lang.reflect.Array;
import java.lang.IllegalArgumentException;
import p.hu2;
import p.j13;
import p.ap5;

public abstract class mi implements ci5, i33, w54	// class@001ea4 from classes.dex
{
    public static final int[] A;
    public static final ps3 B;
    public static final Type[] a;
    public static final dv0 b;
    public static final ry1 c;
    public static boolean t;
    public static Method v;
    public static boolean w;
    public static Field x;
    public static final bm y;
    public static final jb4 z;

    static {
       Type[] typeArray = new Type[0];
       mi.a = typeArray;
       mi.b = new dv0(2);
       mi.c = new ry1(0);
       mi.y = new bm(0);
       mi.z = new jb4();
       mi.A = new int[13]{0x101013f,0x1010140,0x7f0300e4,0x7f0300e5,0x7f0300e6,0x7f0300e8,0x7f0300e9,0x7f0300ea,0x7f030181,0x7f030182,0x7f030184,0x7f030185,0x7f030187};
       mi.B = new ps3(22);
    }
    public void mi(){
       super();
    }
    public static lb4 A(kd7 p0,xo0 p1){
       lb4 v8 = new lb4(p0, p1, null, mi.y, mi.z, new ir2(0), new ir2(1));
       return v8;
    }
    public static final vk B(SquircleArtist p0){
       String str = p0.o();
       co5.l(str, "uri");
       String str1 = p0.n();
       co5.l(str1, "text");
       bc3 uobc3 = p0.j();
       co5.l(uobc3, "relatedItemsList");
       ArrayList uArrayList = new ArrayList(aj0.b0(uobc3));
       Iterator iterator = uobc3.iterator();
       while (iterator.hasNext()) {
          SquircleArtist squircleArti = iterator.next();
          co5.l(squircleArti, "it");
          uArrayList.add(mi.B(squircleArti));
       }
       bc3 uobc31 = p0.m();
       co5.l(uobc31, "tagUrisList");
       int i = p0.g();
       NullableString nullableStri = p0.i();
       int i1 = 0;
       String value = (nullableStri != null)? nullableStri.getValue(): i1;
       String str2 = "";
       String str3 = (value == null)? str2: value;
       boolean b = p0.k();
       if ((nullableStri = p0.h()) != null) {
          i1 = nullableStri.getValue();
       }
       String str4 = (i1 == null)? str2: i1;
       vk v11 = new vk(str, str1, uArrayList, uobc31, i, str3, b, str4, p0.l());
       return v11;
    }
    public static final nr0 C(Item p0){
       vk ovk;
       String str4;
       String str5;
       bc3 uobc3;
       ArrayList uArrayList;
       Iterator iterator;
       bc3 uobc31;
       int i2;
       NullableString nullableStri;
       String str6;
       String str7;
       String str12;
       int i = (!(i = p0.h()))? -1: xr0.a[en6.A(i)];
       String str = "";
       int i1 = 0;
       String str1 = "it";
       String str2 = "relatedItemsList";
       String str3 = "text";
       switch (i){
           case 1:
             SquircleArtist squircleArti = p0.j();
             co5.l(squircleArti, "squircleArtist");
             ovk = mi.B(squircleArti);
             break;
           case 2:
             SquircleArtistMore squircleArti1 = p0.k();
             co5.l(squircleArti1, "squircleArtistMore");
             str4 = squircleArti1.m();
             co5.l(str4, "uri");
             str5 = squircleArti1.l();
             co5.l(str5, str3);
             uobc3 = squircleArti1.j();
             co5.l(uobc3, str2);
             uArrayList = new ArrayList(aj0.b0(uobc3));
             iterator = uobc3.iterator();
             while (iterator.hasNext()) {
                SquircleArtist squircleArti2 = iterator.next();
                co5.l(squircleArti2, str1);
                uArrayList.add(mi.B(squircleArti2));
             }
             uobc31 = squircleArti1.k();
             co5.l(uobc31, "tagUrisList");
             i2 = squircleArti1.h();
             if ((nullableStri = squircleArti1.i()) != null) {
                i1 = nullableStri.getValue();
             }
             str6 = (i1 == null)? str: i1;
             str7 = squircleArti1.f();
             co5.l(str7, "color");
             wc4 str8 = new wc4(str4, str5, uArrayList, uobc31, i2, str6, str7);
             break;
           case 3:
             Banner uBanner = p0.f();
             co5.l(uBanner, "banner");
             String str9 = uBanner.k();
             co5.l(str9, "uri");
             str4 = uBanner.j();
             co5.l(str4, str3);
             bc3 uobc32 = uBanner.i();
             co5.l(uobc32, "tagUrisList");
             boolean b = uBanner.h();
             String str10 = uBanner.g();
             co5.l(str10, "imageUrl");
             jx str11 = new jx(str9, str4, uobc32, b, str10);
             break;
           case 4:
             Pill pill = p0.i();
             co5.l(pill, "pill");
             str12 = pill.j();
             co5.l(str12, "uri");
             str1 = pill.i();
             co5.l(str1, str3);
             boolean b1 = pill.h();
             str7 = pill.f();
             co5.l(str7, "color");
             ovk = new cf0(str12, str1, b1, str7);
             break;
           case 5:
             SquircleShow squircleShow = p0.l();
             co5.l(squircleShow, "squircleShow");
             ovk = mi.D(squircleShow);
             break;
           case 6:
             SquircleShowMore squircleShow1 = p0.m();
             co5.l(squircleShow1, "squircleShowMore");
             str4 = squircleShow1.m();
             co5.l(str4, "uri");
             str5 = squircleShow1.l();
             co5.l(str5, str3);
             uobc3 = squircleShow1.j();
             co5.l(uobc3, str2);
             uArrayList = new ArrayList(aj0.b0(uobc3));
             iterator = uobc3.iterator();
             while (iterator.hasNext()) {
                SquircleShow squircleShow2 = iterator.next();
                co5.l(squircleShow2, str1);
                uArrayList.add(mi.D(squircleShow2));
             }
             uobc31 = squircleShow1.k();
             co5.l(uobc31, "tagUrisList");
             i2 = squircleShow1.h();
             if ((nullableStri = squircleShow1.i()) != null) {
                str12 = nullableStri.getValue();
             }
             str6 = (str12 == null)? str: str12;
             str7 = squircleShow1.f();
             co5.l(str7, "color");
             xc4 str13 = new xc4(str4, str5, uArrayList, uobc31, i2, str6, str7);
             break;
           default:
             ovk = nc3.a;
       }
       return ovk;
    }
    public static final iq6 D(SquircleShow p0){
       String str = p0.p();
       co5.l(str, "uri");
       String str1 = p0.o();
       co5.l(str1, "text");
       bc3 uobc3 = p0.j();
       co5.l(uobc3, "relatedItemsList");
       ArrayList uArrayList = new ArrayList(aj0.b0(uobc3));
       Iterator iterator = uobc3.iterator();
       while (iterator.hasNext()) {
          SquircleShow squircleShow = iterator.next();
          co5.l(squircleShow, "it");
          uArrayList.add(mi.D(squircleShow));
       }
       bc3 uobc31 = p0.n();
       co5.l(uobc31, "tagUrisList");
       int i = p0.g();
       NullableString nullableStri = p0.i();
       int i1 = 0;
       String value = (nullableStri != null)? nullableStri.getValue(): i1;
       String str2 = "";
       String str3 = (value == null)? str2: value;
       boolean b = p0.k();
       value = ((nullableStri = p0.h()) != null)? nullableStri.getValue(): i1;
       String str4 = (value == null)? str2: value;
       if ((nullableStri = p0.m()) != null) {
          i1 = nullableStri.getValue();
       }
       String str5 = (i1 == null)? str2: i1;
       iq6 v12 = new iq6(str, str1, uArrayList, uobc31, i, str3, b, str4, str5, p0.l());
       return v12;
    }
    public static synchronized final ka5 F(){
       int i;
       Closeable uCloseable;
       String str;
       ka5 oka5;
       Object obj;
       _monitor_enter(mi.class);
       Context uContext = sz1.a();
       try{
          i = 0;
          FileInputStream uFileInputSt = uContext.openFileInput("AppEventsLogger.persistedevents");
          co5.l(uFileInputSt, "context.openFileInput\(PERSISTED_EVENTS_FILENAME\)");
          BufferedInputStream uBufferedInp = new BufferedInputStream(uFileInputSt);
          try{
             li oli = new li(uBufferedInp);
             if ((obj = oli.readObject()) != null) {
                try{
                   ej4.l(oli);
                   uContext.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                }catch(java.lang.Exception e0){
                }
                oka5 = obj;
             }else {
                try{
                   throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                }catch( e0){
                }
             }
          }catch(java.io.FileNotFoundException e0){
             ej4.l(uCloseable);
             str = "AppEventsLogger.persistedevents";
          }catch(java.lang.Exception e0){
             ej4.l(uCloseable);
             str = "AppEventsLogger.persistedevents";
          }
          File fileStreamPa = uContext.getFileStreamPath(str);
          fileStreamPa.delete();
       }catch(java.io.FileNotFoundException e0){
          uCloseable = i;
       }catch(java.lang.Exception e0){
          try{
             uCloseable = i;
          }catch(java.lang.Exception e0){
          }
          if (i == null) {
             oka5 = new ka5();
          }
          _monitor_exit(e0);
          return oka5;
       }
    }
    public static Type H(Type p0,Class p1,Type p2,HashMap p3){
       Type type;
       object oobject;
       k ok;
       Type genericCompo;
       Type[] lowerBounds1;
       Type[] typeArray;
       int i = 0;
       Object obj = i;
       while (true) {
          int i1 = 0;
          if (p2 instanceof TypeVariable) {
             Object obj1 = p2;
             if ((type = p3.get(obj1)) != null) {
                if (type != Void.TYPE) {
                   p2 = type;
                   break ;
                }
                break ;
             }else {
                p3.put(obj1, Void.TYPE);
                if (obj == null) {
                   obj = obj1;
                }
                GenericDeclaration genericDecla = obj1.getGenericDeclaration();
                if (genericDecla instanceof Class) {
                }else {
                   genericDecla = i;
                }
                if (genericDecla != null) {
                   type = mi.q(p0, p1, genericDecla);
                   if (type instanceof ParameterizedType) {
                      TypeVariable[] typeParamete = genericDecla.getTypeParameters();
                      int len = typeParamete.length;
                      while (true) {
                         if (i1 >= len) {
                            throw new NoSuchElementException();
                         }
                         if (obj1.equals(typeParamete[i1])) {
                            oobject = type.getActualTypeArguments()[i1];
                         label_005a :
                            if (oobject != obj1) {
                               continue ;
                            }
                         }else {
                            i1 = i1 + 1;
                         }
                      }
                      return p2;
                   }
                }
                oobject = obj1;
                goto label_005a ;
             }
          }else if(p2 instanceof Class){
             object oobject1 = p2;
             if (oobject1.isArray()) {
                Class componentTyp = oobject1.getComponentType();
                p0 = mi.H(p0, p1, componentTyp, p3);
                if (mi.n(componentTyp, p0)) {
                   oobject = oobject1;
                }else {
                   ok = new k(p0);
                }
             }else if(p2 instanceof GenericArrayType){
                genericCompo = p2.getGenericComponentType();
                p0 = mi.H(p0, p1, genericCompo, p3);
                if (!mi.n(genericCompo, p0)) {
                   ok = new k(p0);
                }
             }else if(p2 instanceof ParameterizedType){
                genericCompo = p2.getOwnerType();
                type = mi.H(p0, p1, genericCompo, p3);
                i = mi.n(type, genericCompo) ^ 1;
                Type[] actualTypeAr = p2.getActualTypeArguments();
                int len1 = actualTypeAr.length;
                while (i1 < len1) {
                   Type type1 = mi.H(p0, p1, actualTypeAr[i1], p3);
                   if (!mi.n(type1, actualTypeAr[i1])) {
                      if (!i) {
                         actualTypeAr = actualTypeAr.clone();
                         i = 1;
                      }
                      actualTypeAr[i1] = type1;
                   }
                   i1 = i1 + 1;
                }
                if (i) {
                   ok = new l(type, p2.getRawType(), actualTypeAr);
                }
             }else if(p2 instanceof WildcardType){
                Type[] lowerBounds = p2.getLowerBounds();
                Type[] upperBounds = p2.getUpperBounds();
                if (lowerBounds.length == 1) {
                   if ((p0 = mi.H(p0, p1, lowerBounds[i1], p3)) != lowerBounds[i1]) {
                      if (p0 instanceof WildcardType) {
                         lowerBounds1 = p0.getLowerBounds();
                      }else {
                         typeArray = new Type[]{p0};
                         lowerBounds1 = typeArray;
                      }
                      typeArray = new Type[]{Object.class};
                      oobject = new m(typeArray, lowerBounds1);
                   }
                }else if(upperBounds.length == 1 && (p0 = mi.H(p0, p1, upperBounds[i1], p3)) != upperBounds[i1]){
                   if (p0 instanceof WildcardType) {
                      lowerBounds1 = p0.getUpperBounds();
                   }else {
                      typeArray = new Type[]{p0};
                      lowerBounds1 = typeArray;
                   }
                   oobject = new m(lowerBounds1, mi.a);
                }
             }
          }else {
          }
          oobject = ok;
          if (obj != null) {
             p3.put(obj, oobject);
          }
          return oobject;
       }
    }
    public static final void I(ka5 p0){
       ObjectOutputStream objectOutput = new ObjectOutputStream(new BufferedOutputStream(sz1.a().openFileOutput("AppEventsLogger.persistedevents", 0)));
       objectOutput.writeObject(p0);
       ej4.l(objectOutput);
       return;
    }
    public static boolean J(ju2 p0){
       return "1".equals(p0.b().u("hubs:glue:highlight"));
    }
    public static final boolean K(e46 p0){
       co5.o(p0, "<this>");
       boolean b = (mi.s(p0) >= p0.x)? true: false;
       return b;
    }
    public static void L(Calendar p0){
       p0.set(5, p0.getActualMinimum(5));
       p0.set(11, p0.getActualMinimum(11));
       p0.set(12, p0.getActualMinimum(12));
       p0.set(13, p0.getActualMinimum(13));
    }
    public static Calendar M(zg0 p0){
       p0.getClass();
       Calendar instance = Calendar.getInstance(TimeZone.getDefault());
       instance.setTimeInMillis(System.currentTimeMillis());
       instance.add(2, 1);
       mi.L(instance);
       return instance;
    }
    public static byte[] N(long p0){
       byte[] uobyteArray = new byte[8];
       for (int i = 7; i >= 0; i = i - 1) {
          long l = 255 & p0;
          uobyteArray[i] = (byte)(int)l;
          p0 = p0 >> 8;
       }
       return uobyteArray;
    }
    public static String P(Type p0){
       String name = (p0 instanceof Class)? p0.getName(): p0.toString();
       return name;
    }
    public static String b(char p0){
       char[] uocharArray = new char[6]{92,'u',0,0,0,0};
       for (int i = 0; i < 4; i = i + 1) {
          int i1 = i - 5;
          int i2 = p0 & 0x0f;
          uocharArray[i1] = "0123456789ABCDEF".charAt(i2);
          int i3 = p0 >> 4;
       }
       return String.copyValueOf(uocharArray);
    }
    public static final void c(int p0,StringBuilder p1){
       int i = 0;
       while (i < p0) {
          p1 = p1.append("?");
          int i1 = p0 - 1;
          if (i < i1) {
             p1 = p1.append(",");
          }
          i = i + 1;
       }
       return;
    }
    public static eb1 d(do5 p0){
       int i4;
       int i5;
       ArrayList uArrayList3;
       ArrayList uArrayList4;
       gb1 ogb11;
       hb1 ohb1;
       hb1 b1;
       int i6;
       db1 uodb1;
       gb1 ogb12;
       ArrayList uArrayList5;
       int i7;
       int i8;
       int i13;
       int i14;
       hb1 ohb11;
       hb1 ohb12;
       do5 uodo5 = p0;
       int i = p0.A();
       int i1 = p0.z();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       uArrayList1.add(new gb1(i, i1));
       i = i + i1;
       i1 = 1;
       i = (((i + i1) / 2) * 2) + i1;
       int[] ointArray = new int[i];
       int i2 = i / 2;
       int[] ointArray1 = new int[i];
       ArrayList uArrayList2 = new ArrayList();
       while (!uArrayList1.isEmpty()) {
          int i3 = uArrayList1.size() - i1;
          gb1 ogb1 = uArrayList1.remove(i3);
          gb1 b = ogb1.b;
          gb1 a = ogb1.a;
          if ((i4 = b - a) >= i1 && (i5 = ogb1.d - ogb1.c) >= i1) {
             i5 = ((i5 + i4) + i1) / 2;
             i4 = i1 + i2;
             ointArray[i4] = a;
             ointArray1[i4] = b;
             int i9 = 0;
             while (true) {
                if (i9 < i5) {
                   int i10 = ogb1.b - ogb1.a;
                   i4 = ogb1.d - ogb1.c;
                   i10 = i10 - i4;
                   i10 = ((i10 = Math.abs(i10) % 2) == i1)? 1: 0;
                   i4 = ogb1.b - ogb1.a;
                   int i11 = ogb1.d - ogb1.c;
                   i4 = i4 - i11;
                   int i12 = - i9;
                   i11 = i12;
                   while (true) {
                      if (i11 <= i9) {
                         if (i11 != i12) {
                            if (i11 != i9) {
                               i13 = i11 + 1;
                               i13 = i13 + i2;
                               i13 = i11 - 1;
                               i13 = i13 + i2;
                               if (ointArray[i13] <= ointArray[i13]) {
                               }
                            }else {
                            }
                         }
                         i7 = i11 + 1;
                         i1 = i7 + i2;
                         i1 = ointArray[i1];
                         i7 = i1;
                         i13 = i5;
                         uArrayList3 = uArrayList1;
                         i8 = i7 - ogb1.a;
                         i8 = i8 + ogb1.c;
                         i8 = i8 - i11;
                         i5 = (i9 && i7 == i1)? i8 - 1: i8;
                         uArrayList4 = uArrayList2;
                         while (i7 < ogb1.b && (i8 < ogb1.d && uodo5.c(i7, i8))) {
                            i7 = i7 + 1;
                            i8 = i8 + 1;
                         }
                         i6 = i11 + i2;
                         ointArray[i6] = i7;
                         if (i10) {
                            i6 = i4 - i11;
                            i14 = i10;
                            i10 = i12 + 1;
                            if (i6 >= i10) {
                               i10 = i9 - 1;
                               if (i6 <= i10 && (i6 = i6 + i2) <= i7) {
                                  ohb11 = new hb1();
                                  ohb11.a = i1;
                                  ohb11.b = i5;
                                  ohb11.c = i7;
                                  ohb11.d = i8;
                                  ohb11.e = false;
                               label_010e :
                                  if (ohb11) {
                                     ohb1 = ohb11;
                                     ogb11 = ogb1;
                                  }else {
                                     i8 = ogb1.b - ogb1.a;
                                     i6 = ogb1.d - ogb1.c;
                                     i8 = i8 - i6;
                                     ohb11 = (!(i6 = i8 % 2))? 1: 0;
                                     i10 = i12;
                                     while (true) {
                                        if (i10 <= i9) {
                                           if (i10 != i12) {
                                              if (i10 != i9) {
                                                 i4 = i10 + 1;
                                                 i4 = i4 + i2;
                                                 i7 = i10 - 1;
                                                 i7 = i7 + i2;
                                                 if (ointArray1[i4] >= ointArray1[i7]) {
                                                 }
                                              }else {
                                              }
                                           }
                                           i4 = i10 + 1;
                                           i4 = i4 + i2;
                                           i4 = ointArray1[i4];
                                           i7 = i4;
                                           i11 = ogb1.b - i7;
                                           i11 = i11 - i10;
                                           i5 = ogb1.d - i11;
                                           i11 = (i9 && i7 == i4)? i5 + 1: i5;
                                           while (true) {
                                              if (i7 > ogb1.a && i5 > ogb1.c) {
                                                 i1 = i7 - 1;
                                                 ogb11 = ogb1;
                                                 i3 = i5 - 1;
                                                 if (uodo5.c(i1, i3)) {
                                                    i7 = i1;
                                                    i5 = i3;
                                                    ogb1 = ogb11;
                                                 }else {
                                                 label_0174 :
                                                    i1 = i10 + i2;
                                                    ointArray1[i1] = i7;
                                                    if (ohb11 && ((i1 = i8 - i10) >= i12 && (i1 <= i9 && (i1 = i1 + i2) >= i7))) {
                                                       ohb12 = new hb1();
                                                       ohb12.a = i7;
                                                       ohb12.b = i5;
                                                       ohb12.c = i4;
                                                       ohb12.d = i11;
                                                       ohb12.e = true;
                                                    label_019f :
                                                       if (ohb12) {
                                                          ohb1 = ohb12;
                                                       }else {
                                                          i9 = i9 + 1;
                                                          i5 = i13;
                                                          uArrayList1 = uArrayList3;
                                                          uArrayList2 = uArrayList4;
                                                          ogb1 = ogb11;
                                                          i1 = 1;
                                                       }
                                                    }else {
                                                       i10 = i10 + 2;
                                                       ogb1 = ogb11;
                                                       ohb12 = 0;
                                                    }
                                                 }
                                              }else {
                                                 ogb11 = ogb1;
                                                 goto label_0174 ;
                                              }
                                           }
                                        }else {
                                           ogb11 = ogb1;
                                           ohb12 = false;
                                           goto label_019f ;
                                        }
                                     }
                                  }
                               }
                            }
                         }else {
                            i14 = i10;
                         }
                         i11 = i11 + 2;
                         i5 = i13;
                         uArrayList1 = uArrayList3;
                         uArrayList2 = uArrayList4;
                         i10 = i14;
                         ohb12 = 1;
                      }else {
                         uArrayList3 = uArrayList1;
                         uArrayList4 = uArrayList2;
                         i13 = i5;
                         ohb11 = false;
                         goto label_010e ;
                      }
                   }
                }else {
                label_01b0 :
                   uArrayList3 = uArrayList1;
                   uArrayList4 = uArrayList2;
                   ogb11 = ogb1;
                   ohb1 = null;
                }
             }
          }else {
             goto label_01b0 ;
          }
          if (ohb1 != null) {
             if (ohb1.a() > 0) {
                b1 = ohb1.b;
                i1 = ohb1.d - b1;
                hb1 a1 = ohb1.a;
                i6 = ohb1.c - a1;
                b = (i1 != i6)? 1: 0;
                if (b) {
                   if (ohb1.e != null) {
                      uodb1 = new db1(a1, b1, ohb1.a());
                   }else if(i1 > i6){
                      i7 = 1;
                   }else {
                      i7 = 0;
                   }
                   if (i7) {
                      i8 = b1 + 1;
                      uodb1 = new db1(a1, i8, ohb1.a());
                   }else {
                      i3 = a1 + 1;
                      uodb1 = new db1(i3, b1, ohb1.a());
                   }
                }else {
                   uodb1 = new db1(a1, b1, i6);
                }
                uArrayList.add(uodb1);
             }
             if (uArrayList4.isEmpty()) {
                ogb12 = new gb1();
                uArrayList2 = uArrayList4;
                ogb1 = ogb11;
                b1 = 1;
             }else {
                i1 = uArrayList4.size() - 1;
                uArrayList2 = uArrayList4;
                ogb12 = uArrayList2.remove(i1);
                ogb1 = ogb11;
             }
             ogb12.a = ogb1.a;
             ogb12.c = ogb1.c;
             ogb12.b = ohb1.a;
             ogb12.d = ohb1.b;
             uArrayList5 = uArrayList3;
             uArrayList5.add(ogb12);
             ogb1.b = ogb1.b;
             ogb1.d = ogb1.d;
             ogb1.a = ohb1.c;
             ogb1.c = ohb1.d;
             uArrayList5.add(ogb1);
          }else {
             uArrayList5 = uArrayList3;
             uArrayList2 = uArrayList4;
             uArrayList2.add(ogb11);
          }
          uArrayList1 = uArrayList5;
          i1 = 1;
       }
       Collections.sort(uArrayList, mi.b);
       return new eb1(uodo5, uArrayList, ointArray, ointArray1);
    }
    public static Type e(Type p0){
       k ok;
       if (p0 instanceof Class) {
          if (p0.isArray()) {
             ok = new k(mi.e(p0.getComponentType()));
          }
          return ok;
       }else if(p0 instanceof ParameterizedType){
          return new l(p0.getOwnerType(), p0.getRawType(), p0.getActualTypeArguments());
       }else if(p0 instanceof GenericArrayType){
          return new k(p0.getGenericComponentType());
       }else if(p0 instanceof WildcardType){
          return new m(p0.getUpperBounds(), p0.getLowerBounds());
       }else {
          return p0;
       }
    }
    public static void f(Type p0){
       boolean b = (p0 instanceof Class && p0.isPrimitive())? false: true;
       co5.g(b);
       return;
    }
    public static sb4 g(lb4 p0,Object p1){
       return new sb4(p0, p1, null, new u63());
    }
    public static MediaMetadataCompat h(Context p0,wu p1,MediaMetadataCompat p2,mo p3){
       aq6 uoaq6;
       ur c;
       wu owu = p1;
       MediaMetadataCompat mediaMetadat = p2;
       mo omo = p3;
       p1.getClass();
       int i = 0;
       u44 ou44 = (!mediaMetadat)? new u44(i): new u44(mediaMetadat);
       wu v = owu.v;
       String str = "context_description";
       String str1 = v.get(str);
       wu g = owu.g;
       String str2 = null;
       nt0 ont0 = (g.f() != null)? g.f(): str2;
       wu b = owu.b;
       if (!te5.a(b) && te5.a(str1)) {
          if ((uoaq6 = td7.d(b)) != null && uoaq6.b == yp6.y0) {
             str1 = p0.getString(R.string.collection_context_name);
          }
          if (uoaq6 != null && (uoaq6.b == yp6.b && ont0 != null)) {
             str1 = mi.w(ont0, "artist_uri");
             String str3 = mi.w(ont0, "artist_name");
             int i1 = 1;
             int i2 = 1;
             while (true) {
                if (!te5.a(str1)) {
                   if (b.equals(str1)) {
                      if (!te5.a(str3)) {
                         str1 = str3;
                         break ;
                      }else {
                      label_00ad :
                         str1 = "";
                         break ;
                      }
                   }else {
                      Locale uS = Locale.US;
                      Object[] objArray = new Object[i1];
                      objArray[i] = Integer.valueOf(i2);
                      Object[] objArray1 = new Object[i1];
                      objArray1[i] = Integer.valueOf(i2);
                      i2 = i2 + i1;
                      str1 = mi.w(ont0, String.format(uS, "artist_uri:%d", objArray));
                      str3 = mi.w(ont0, String.format(uS, "artist_name:%d", objArray1));
                      c = 0;
                   }
                }else {
                   goto label_00ad ;
                }
             }
          }
       }
       ou44.G("spotify.media.metadata.CONTEXT_NAME", str1);
       if (!te5.a(b)) {
          str2 = b;
       }
       ou44.G("spotify.media.metadata.CONTEXT_URI", str2);
       ou44.G("spotify.media.metadata.PLAYBACK_ID", owu.h.f());
       long l = 0;
       long l1 = (owu.r.h.contains("mft_disallow"))? 1: l;
       ou44.F("spotify.media.metadata.SKIP_LIMIT_REACHED", l1);
       wu f = owu.f;
       if (f.f() != null) {
          sr osr = f.f();
          if (!(osr.a - l)) {
             ou44.F("android.media.metadata.TRACK_NUMBER", osr.b);
          }
       }
       if (ont0 != null) {
          c = ont0.c;
          str1 = c.get("duration");
          ou44.G("android.media.metadata.MEDIA_ID", ont0.a);
          ou44.G("spotify.media.metadata.TRACK_UID", ont0.b);
          ou44.G("spotify.media.metadata.TRACK_PROVIDER", ont0.d);
          ou44.G("android.media.metadata.ALBUM", c.get("album_title"));
          ou44.G("spotify.media.metadata.ALBUM_URI", c.get("album_uri"));
          ou44.G("android.media.metadata.ARTIST", c.get("artist_name"));
          ou44.G("spotify.media.metadata.ARTIST_URI", c.get("artist_uri"));
          if (str1 != null) {
             l = Long.parseLong(str1);
          }
          ou44.F("android.media.metadata.DURATION", l);
          ou44.G("android.media.metadata.ALBUM_ART_URI", c.get("image_large_url"));
          ou44.G("android.media.metadata.TITLE", c.get("title"));
          ou44.G("android.media.metadata.DISPLAY_TITLE", c.get("title"));
          ou44.G("android.media.metadata.DISPLAY_SUBTITLE", c.get("artist_name"));
          ou44.G("android.media.metadata.DISPLAY_DESCRIPTION", v.get(str));
          ou44.G("spotify.media.metadata.CLICK_URI", c.get("click_url"));
       }
       if (omo) {
          ou44.F("spotify.media.metadata.AUDIO_QUALITY", (long)omo.c);
       }
       if ((owu = owu.e) != null) {
          ou44.G("spotify.media.metadata.PLAY_ORIGIN_FEATURE_ID", owu.a);
       }
       return new MediaMetadataCompat(ou44.b);
    }
    public static lp6 i(Context p0,sp6 p1){
       lp6 olp6 = new lp6(p0, p1, (float)xj0.e0(24.00f, p0.getResources()));
       olp6.c(uw5.l(p0, R.attr.pasteColorAccessory));
       olp6.d((float)xj0.e0(24.00f, p0.getResources()));
       return olp6;
    }
    public static or6 j(Context p0,lp6 p1){
       or6 oor6 = new or6(p0, null, 0x7f030490);
       oor6.setFocusable(false);
       oor6.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       oor6.setPadding(p0.getResources().getDimensionPixelSize(R.dimen.quick_action_padding_left), false, false, false);
       oor6.setMinimumWidth(false);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1);
       layoutParams.setMargins(false, false, false, false);
       oor6.setLayoutParams(layoutParams);
       oor6.setImageDrawable(p1);
       return oor6;
    }
    public static SpotifyIconView k(Context p0,sp6 p1){
       SpotifyIconView spotifyIconV = new SpotifyIconView(p0, null);
       spotifyIconV.setIcon(p1);
       spotifyIconV.setColorStateList(uw5.l(p0, R.attr.pasteColorAccessory));
       spotifyIconV.getDrawable().d((float)xj0.e0(24.00f, p0.getResources()));
       return spotifyIconV;
    }
    public static boolean l(View p0,KeyEvent p1){
       boolean b;
       vh7 tag;
       vh7 c;
       WeakReference weakReferenc;
       if (Build$VERSION.SDK_INT >= 28) {
       }else {
          int i = 0x7f0a0608;
          if ((tag = p0.getTag(i)) == null) {
             tag = new vh7();
             p0.setTag(i, tag);
          }
          if ((c = tag.c) == null || c.get() != p1) {
             tag.c = new WeakReference(p1);
             if (tag.b == null) {
                tag.b = new SparseArray();
             }
             c = tag.b;
             b = true;
             if (p1.getAction() == b && (i = c.indexOfKey(p1.getKeyCode())) >= 0) {
                weakReferenc = c.valueAt(i);
                c.removeAt(i);
             }else {
                weakReferenc = null;
             }
             if (weakReferenc == null) {
                weakReferenc = c.get(p1.getKeyCode());
             }
             if (weakReferenc != null) {
                if ((c = weakReferenc.get()) != null && gh7.b(c)) {
                   vh7.b(c);
                label_007c :
                   return b;
                }else {
                   goto label_007c ;
                }
             }
          }
       }
       b = false;
       goto label_007c ;
    }
    public static boolean m(kh3 p0,View p1,Window$Callback p2,KeyEvent p3){
       Window window;
       Method v;
       View decorView;
       Field declaredFiel;
       DialogInterface$OnKeyListener onKeyListene;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.e(p3);
       }
       KeyEvent$DispatcherState uDispatcherS = null;
       int i = 1;
       if (p2 instanceof Activity) {
          p2.onUserInteraction();
          window = p2.getWindow();
          if (window.hasFeature(8)) {
             ActionBar actionBar = p2.getActionBar();
             if (p3.getKeyCode() == 82 && actionBar != null) {
                if (!mi.t) {
                   try{
                      Class[] uClassArray = new Class[i];
                      uClassArray[b] = KeyEvent.class;
                      mi.v = actionBar.getClass().getMethod("onMenuKeyEvent", uClassArray);
                      mi.t = i;
                   }catch(java.lang.NoSuchMethodException e0){
                   }
                }
                if ((v = mi.v) != null) {
                   try{
                      Object[] objArray = new Object[i];
                      objArray[e0] = p3;
                      if ((actionBar = v.invoke(actionBar, objArray)) != null) {
                         b = actionBar.booleanValue();
                      }
                   }catch(java.lang.IllegalAccessException e0){
                   }catch(java.lang.reflect.InvocationTargetException e0){
                   }
                }
                if (!e0) {
                label_0066 :
                   if (!window.superDispatchKeyEvent(p3)) {
                      decorView = window.getDecorView();
                      if (!wh7.b(decorView, p3)) {
                         if (decorView != null) {
                            uDispatcherS = decorView.getKeyDispatcherState();
                         }
                         i = p3.dispatch(p2, uDispatcherS, p2);
                      }
                   }
                }
             }else {
                goto label_0066 ;
             }
          }else {
             goto label_0066 ;
          }
          return i;
       }else if(p2 instanceof Dialog){
          if (!mi.w) {
             try{
                declaredFiel = Dialog.class.getDeclaredField("mOnKeyListener");
                mi.x = declaredFiel;
                declaredFiel.setAccessible(i);
                mi.w = i;
             }catch(java.lang.NoSuchFieldException e0){
             }
          }
          if ((declaredFiel = mi.x) != null) {
             try{
                onKeyListene = declaredFiel.get(p2);
             label_00a9 :
                if (onKeyListene == null || !onKeyListene.onKey(p2, p3.getKeyCode(), p3)) {
                   window = p2.getWindow();
                   if (!window.superDispatchKeyEvent(p3)) {
                      decorView = window.getDecorView();
                      if (!wh7.b(decorView, p3)) {
                         if (decorView != null) {
                            uDispatcherS = decorView.getKeyDispatcherState();
                         }
                         i = p3.dispatch(p2, uDispatcherS, p2);
                      }
                   }
                }
                return i;
             }catch(java.lang.IllegalAccessException e0){
             }
             onKeyListene = uDispatcherS;
             goto label_00a9 ;
          }else {
          }
       }else if(p1 != null && (wh7.b(p1, p3) || p0.e(p3))){
          b = true;
       }
       return b;
    }
    public static boolean n(Type p0,Type p1){
       boolean b = (p0 != p1 && (p0 == null && p0.equals(p1)))? false: true;
       return b;
    }
    public static boolean o(Type p0,Type p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (p0 instanceof Class) {
          return p0.equals(p1);
       }
       if (p0 instanceof ParameterizedType) {
          if (!p1 instanceof ParameterizedType) {
             return false;
          }else if(mi.n(p0.getOwnerType(), p1.getOwnerType()) && (p0.getRawType().equals(p1.getRawType()) && Arrays.equals(p0.getActualTypeArguments(), p1.getActualTypeArguments()))){
             b = false;
          }
          return b;
       }else if(p0 instanceof GenericArrayType){
          if (!p1 instanceof GenericArrayType) {
             return false;
          }else {
             return mi.o(p0.getGenericComponentType(), p1.getGenericComponentType());
          }
       }else if(p0 instanceof WildcardType){
          if (!p1 instanceof WildcardType) {
             return false;
          }else if(Arrays.equals(p0.getUpperBounds(), p1.getUpperBounds()) && Arrays.equals(p0.getLowerBounds(), p1.getLowerBounds())){
             b = false;
          }
          return b;
       }else if(p0 instanceof TypeVariable){
          if (!p1 instanceof TypeVariable) {
             return false;
          }
          if (p0.getGenericDeclaration() != p1.getGenericDeclaration() || !p0.getName().equals(p1.getName())) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public static final je5 p(e46 p0){
       je5 oje5;
       co5.o(p0, "<this>");
       Iterator iterator = p0.y.iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             oje5 = null;
             break ;
          }
          oje5 = iterator.next();
       } while (oje5.c != null);
       return oje5;
    }
    public static Type q(Type p0,Class p1,Class p2){
       object oobject;
       Class superclass;
       if (p2 == p1) {
          return p0;
       }
       if (p2.isInterface()) {
          Class[] interfaces = p1.getInterfaces();
          int len = interfaces.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((oobject = interfaces[i]) == p2) {
                   return p1.getGenericInterfaces()[i];
                }else if(p2.isAssignableFrom(oobject)){
                   return mi.q(p1.getGenericInterfaces()[i], interfaces[i], p2);
                }else {
                   i = i + 1;
                }
             }
          }
       }
       if (!p1.isInterface()) {
          while (p1 != Object.class) {
             if ((superclass = p1.getSuperclass()) == p2) {
                return p1.getGenericSuperclass();
             }else if(p2.isAssignableFrom(superclass)){
                return mi.q(p1.getGenericSuperclass(), superclass, p2);
             }
             p1 = superclass;
          }
       }
       return p2;
    }
    public static int r(Calendar p0){
       int i = p0.get(1);
       int i1 = p0.get(2) + 1;
       int i2 = (i1 - 14) / 12;
       return ((((((((i1 - 2) - (i2 * 12)) * 367) / 12) + ((((i + 4800) + i2) * 1461) / 4)) - (((((i + 4900) + i2) / 100) * 3) / 4)) + p0.get(5)) - 32075);
    }
    public static final int s(e46 p0){
       co5.o(p0, "<this>");
       p0 = p0.c;
       int i = 0;
       if (!p0 instanceof Collection || !p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          int i1 = 0;
          while (true) {
             if (iterator.hasNext()) {
                he5 ohe5 = iterator.next();
                ohe5 = (ohe5 instanceof de5 && ohe5.t != null)? 1: 0;
                if (ohe5 && (i1 = i1 + 1) < 0) {
                   throw new ArithmeticException("Count overflow has happened.");
                }
                continue ;
             }else {
                i = i1;
                break ;
             }
          }
       }
       return i;
    }
    public static final String t(String p0,String p1){
       Object obj;
       String[] stringArray = new String[]{"&"};
       Iterator iterator = av6.B0(p0, stringArray, 0, 6).iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!av6.f0(obj, p1)) {
                continue ;
             }
          }else {
             obj = null;
          }
          iterator = "";
          if (obj == null) {
             obj = iterator;
          }
          String[] stringArray1 = new String[]{"="};
          List list = av6.B0(obj, stringArray1, 2, 2);
          if (list.size() >= 2) {
             iterator = list.get(1);
             break ;
          }
          break ;
       }
       return iterator;
    }
    public static Class u(Type p0){
       if (p0 instanceof Class) {
          return p0;
       }
       if (p0 instanceof ParameterizedType) {
          p0 = p0.getRawType();
          co5.g(p0 instanceof Class);
          return p0;
       }else {
          int i = 0;
          if (p0 instanceof GenericArrayType) {
             return Array.newInstance(mi.u(p0.getGenericComponentType()), i).getClass();
          }
          if (p0 instanceof TypeVariable) {
             return Object.class;
          }
          if (p0 instanceof WildcardType) {
             return mi.u(p0.getUpperBounds()[i]);
          }
          String str = (p0 == null)? "null": p0.getClass().getName();
          throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <"+p0+"> is of type "+str);
       }
    }
    public static Type v(Type p0,Class p1,Class p2){
       object oobject;
       if (p0 instanceof WildcardType) {
          oobject = p0.getUpperBounds()[0];
       }
       co5.g(p2.isAssignableFrom(p1));
       return mi.H(oobject, p1, mi.q(oobject, p1, p2), new HashMap());
    }
    public static String w(nt0 p0,String p1){
       String str;
       if ((str = p0.c.get(p1)) != null) {
       }else {
          str = "";
       }
       return str;
    }
    public static boolean x(ju2 p0){
       boolean b = true;
       if (p0.u().e() == null && p0.u().d() == null) {
          int i = (p0.b().m("calendar") != null)? 1: 0;
          if (!i) {
             b = false;
          }
       }
       return b;
    }
    public abstract boolean E(char p0);
    public String G(){
       int i;
       String str = "1.9.0.49155";
       if ((i = this.z(str)) == -1) {
          return str;
       }
       char[] uocharArray = str.toCharArray();
       int i1 = 1;
       int i2 = 1;
       for (i = i + i1; i != uocharArray.length; i = i + 1) {
          if (this.E(uocharArray[i])) {
             i2 = i2 + 1;
          }else {
             int i3 = i - i2;
             uocharArray[i3] = uocharArray[i];
          }
       }
       return new String(uocharArray, 0, (i - i2));
    }
    public String O(CharSequence p0){
       int i = p0.length();
       int i1 = 0;
       while (i1 < i && this.E(p0.charAt(i1))) {
          i1 = i1 + 1;
       }
       do {
       } while ((i = i - 1) > i1 && this.E(p0.charAt(i)));
       return p0.subSequence(i1, (i + 1)).toString();
    }
    public int y(int p0,CharSequence p1){
       int i = p1.length();
       ap5.h(p0, i);
       while (true) {
          if (p0 >= i) {
             return -1;
          }
          if (this.E(p1.charAt(p0))) {
             break ;
          }else {
             p0++;
          }
       }
       return p0;
    }
    public int z(String p0){
       return this.y(0, p0);
    }
}
