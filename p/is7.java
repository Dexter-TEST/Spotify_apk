package p.is7;
import p.w54;
import p.bx6;
import java.lang.String;
import p.c65;
import p.ps3;
import java.lang.Object;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import org.json.JSONObject;
import p.kg4;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import java.lang.ref.Reference;
import android.net.Uri;
import android.net.Uri$Builder;
import android.content.Intent;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.Context;
import p.i07;
import p.r07;
import p.u07;
import java.util.Arrays;
import p.co5;
import java.util.logging.Logger;
import java.lang.StringBuffer;
import java.lang.Byte;
import p.ox7;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Collections;
import java.lang.NullPointerException;
import p.vr5;
import p.x45;
import android.view.View;
import p.hr5;
import java.lang.Math;
import p.lb4;
import p.sb4;
import p.xz3;
import p.j93;
import p.er7;
import p.vw0;
import p.ww0;
import android.content.res.Configuration;
import p.br3;
import android.os.Build$VERSION;
import android.os.LocaleList;
import p.ho0;
import p.er3;
import p.dr3;
import java.util.Locale;
import android.view.Window;
import p.xw0;
import p.i70;
import p.ax0;
import p.bx0;
import java.lang.RuntimeException;
import p.io2;
import java.lang.Exception;
import java.lang.reflect.InvocationTargetException;
import p.jy6;
import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Long;
import java.lang.reflect.Method;
import java.lang.Boolean;
import p.il1;
import java.nio.ByteBuffer;
import p.do5;
import p.tp2;
import java.io.BufferedReader;
import java.io.StringWriter;
import java.io.Reader;
import java.io.Writer;
import p.kc4;
import p.ic4;

public abstract class is7 implements w54	// class@0019f9 from classes.dex
{
    public static boolean A;
    public static final int[][] B;
    public static final int[] C;
    public static final c65 D;
    public static final c65 E;
    public static final ps3 F;
    public static Integer a;
    public static long b;
    public static Method c;
    public static Method t;
    public static Method v;
    public static final bx6 w;
    public static WeakReference x;
    public static boolean y;
    public static boolean z;

    static {
       is7.w = new bx6("RESUME_TOKEN");
       int[][] ointArray = new int[][9];
       ointArray[0] = new int[2]{27,917};
       ointArray[1] = new int[4]{522,568,723,809};
       ointArray[2] = new int[8]{237,308,436,284,646,653,428,379};
       ointArray[3] = new int[16]{274,562,232,755,599,524,801,132,295,'t',442,428,295,'*',176,'A'};
       ointArray[4] = new int[32]{361,575,922,525,176,586,640,321,536,742,677,742,687,284,193,517,273,494,263,147,593,800,571,320,803,133,231,390,685,330,'?',410};
       ointArray[5] = new int[64]{539,422,6,']',862,771,453,'j',610,287,'k',505,733,877,381,612,723,476,462,172,430,609,858,822,543,376,511,400,672,762,283,184,440,'#',519,31,460,594,225,535,517,352,605,158,651,201,488,502,648,733,717,'S',404,'a',280,771,840,629,4,381,843,623,264,543};
       ointArray[6] = new int[128]{521,310,864,547,858,580,296,379,'5',779,897,444,400,925,749,415,822,']',217,208,928,244,583,620,246,148,447,631,292,908,490,704,516,258,457,907,594,723,674,292,272,'`',684,432,686,606,860,569,193,219,129,186,236,287,192,775,278,173,'(',379,712,463,646,776,171,491,297,763,156,732,'_',270,447,'Z',507,'0',228,821,808,898,784,663,627,378,382,262,380,602,754,336,'Y',614,'W',432,670,616,157,374,242,726,600,269,375,898,845,454,354,130,814,587,804,'"',211,330,539,297,827,865,'%',517,834,315,550,'V',801,4,'l',539};
       ointArray[7] = new int[256]{524,894,'K',766,882,857,'J',204,'R',586,708,250,905,786,138,720,858,194,311,913,275,190,375,850,438,733,194,280,201,280,828,757,710,814,919,'Y','D',569,11,204,796,605,540,913,801,700,799,137,439,418,592,668,353,859,370,694,325,240,216,257,284,549,209,884,315,'F',329,793,490,274,877,162,749,812,684,461,334,376,849,521,307,291,803,712,19,358,399,908,'g',511,'3',8,517,225,289,470,637,731,'B',255,917,269,463,830,730,433,848,585,136,538,906,'Z',2,290,743,199,655,903,329,'1',802,580,355,588,188,462,10,134,628,320,479,130,739,'G',263,318,374,601,192,605,142,673,687,234,722,384,177,752,607,640,455,193,689,707,805,641,'0','<',732,621,895,544,261,852,655,309,697,755,756,'<',231,773,434,421,726,528,503,'v','1',795,32,144,500,238,836,394,280,566,319,9,647,550,'I',914,342,'~',32,681,331,792,620,'<',609,441,180,791,893,754,605,383,228,749,760,213,'6',297,134,'6',834,299,922,191,910,532,609,829,189,20,167,29,872,449,'S',402,')',656,505,579,481,173,404,251,688,'_',497,555,642,543,307,159,924,558,648,'7',497,10};
       ointArray[8] = new int[512]{352,'M',373,504,'#',599,428,207,409,574,'v',498,285,380,350,492,197,265,920,155,914,299,229,643,294,871,306,'X','W',193,352,781,846,'K',327,520,435,543,203,666,249,346,781,621,640,268,794,534,539,781,408,390,644,'f',476,499,290,632,545,'%',858,916,552,')',542,289,'z',272,383,800,485,'b',752,472,761,'k',784,860,658,741,290,204,681,407,855,'U','c','>',482,180,20,297,451,593,913,142,808,684,287,536,561,'L',653,899,729,567,744,390,513,192,516,258,240,518,794,395,768,848,'3',610,384,168,190,826,328,596,786,303,570,381,415,641,156,237,151,429,531,207,676,710,'Y',168,304,402,'(',708,575,162,864,229,'A',861,841,512,164,477,221,92,358,785,288,357,850,836,827,736,707,'^',8,494,'r',521,2,499,851,543,152,729,771,'_',248,361,578,323,856,797,289,'3',684,466,533,820,669,'-',902,452,167,342,244,173,'#',463,651,'3',699,591,452,578,'%','|',298,332,552,'+',427,'w',662,777,475,850,764,364,578,911,283,711,472,420,245,288,594,394,511,327,589,777,699,688,'+',408,842,383,721,521,560,644,714,559,'>',145,873,663,713,159,672,729,624,';',193,417,158,209,563,564,343,693,'m',608,563,365,181,772,677,310,248,353,708,410,579,870,617,841,632,860,289,536,'#',777,618,586,424,833,'M',597,346,269,757,632,695,751,331,247,184,'-',787,680,18,'B',407,369,'6',492,228,613,830,922,437,519,644,905,789,420,305,441,207,300,892,827,141,537,381,662,513,'8',252,341,242,797,838,837,720,224,307,631,'=','W',560,310,756,665,397,808,851,309,473,795,378,31,647,915,459,806,590,731,425,216,548,249,321,881,699,535,673,782,210,815,905,303,843,922,281,'I',469,791,660,162,498,308,155,422,907,817,187,'>',16,425,535,336,286,437,375,273,610,296,183,923,'t',667,751,353,'>',366,691,379,687,842,'%',357,720,742,330,5,39,923,311,424,242,749,321,'6',669,316,342,299,534,'i',667,488,640,672,576,540,316,486,721,610,'.',656,447,171,616,464,190,531,297,321,762,752,533,175,134,14,381,433,717,'-','o',20,596,284,736,138,646,411,877,669,141,919,'-',780,407,164,332,899,165,726,600,325,498,655,357,752,768,223,849,647
    ,'?',310,863,251,366,304,282,738,675,410,389,244,31,'y',303,263};
       is7.B = ointArray;
       is7.C = new int[6]{0x7f030057,0x7f030058,0x7f030059,0x7f03005a,0x7f03005b,0x7f03005c};
       is7.D = new c65(10);
       is7.E = new c65(7);
       is7.F = new ps3(18);
    }
    public void is7(){
       super();
    }
    public static void A(Parcel p0,int p1,Bundle p2){
       if (p2 == null) {
          return;
       }
       p0.writeBundle(p2);
       is7.J(p0, is7.F(p0, p1));
       return;
    }
    public static void B(Parcel p0,int p1,Parcelable p2,int p3){
       if (p2 == null) {
          return;
       }
       p2.writeToParcel(p0, p3);
       is7.J(p0, is7.F(p0, p1));
       return;
    }
    public static void C(Parcel p0,int p1,String p2){
       if (p2 == null) {
          return;
       }
       p0.writeString(p2);
       is7.J(p0, is7.F(p0, p1));
       return;
    }
    public static void D(Parcel p0,int p1,Parcelable[] p2,int p3){
       object oobject;
       if (p2 == null) {
          return;
       }
       p1 = is7.F(p0, p1);
       int len = p2.length;
       p0.writeInt(len);
       int i = 0;
       while (i < len) {
          if ((oobject = p2[i]) == null) {
             p0.writeInt(0);
          }else {
             is7.H(p3, p0, oobject);
          }
          i = i + 1;
       }
       is7.J(p0, p1);
       return;
    }
    public static void E(Parcel p0,int p1,List p2){
       Parcelable parcelable;
       if (p2 == null) {
          return;
       }
       p1 = is7.F(p0, p1);
       int i = p2.size();
       p0.writeInt(i);
       int i1 = 0;
       while (i1 < i) {
          if ((parcelable = p2.get(i1)) == null) {
             p0.writeInt(0);
          }else {
             is7.H(0, p0, parcelable);
          }
          i1 = i1 + 1;
       }
       is7.J(p0, p1);
       return;
    }
    public static int F(Parcel p0,int p1){
       p0.writeInt((p1 | 0xffff0000));
       p0.writeInt(0);
       return p0.dataPosition();
    }
    public static String G(String p0,String p1){
       int i;
       if ((i = p0.length() - p1.length()) < 0 || i > 1) {
          throw new IllegalArgumentException("Invalid input received");
       }
       StringBuilder str = new StringBuilder((p1.length() + p0.length()));
       int i1 = 0;
       while (i1 < p0.length()) {
          str = str.append(p0.charAt(i1));
          if (p1.length() > i1) {
             str = str.append(p1.charAt(i1));
          }
          i1 = i1 + 1;
       }
       return str;
    }
    public static void H(int p0,Parcel p1,Parcelable p2){
       p1.writeInt(1);
       p2.writeToParcel(p1, p0);
       p0 = p1.dataPosition();
       p1.setDataPosition(p1.dataPosition());
       p1.writeInt((p0 - p1.dataPosition()));
       p1.setDataPosition(p0);
    }
    public static void I(Parcel p0,int p1,int p2){
       if (p2 >= 0xffff) {
          p0.writeInt((p1 | 0xffff0000));
          p0.writeInt(p2);
          return;
       }else {
          p0.writeInt((p1 | (p2 << 16)));
          return;
       }
    }
    public static void J(Parcel p0,int p1){
       int i = p0.dataPosition();
       p0.setDataPosition((p1 - 4));
       p0.writeInt((i - p1));
       p0.setDataPosition(i);
    }
    public static String a(String p0,JSONObject p1){
       String str5;
       String str = "t4";
       String str1 = "t3";
       String str2 = "t2";
       String str3 = "t1";
       String str4 = "ct";
       try{
          str5 = p1.getString("~referring_link");
          try{
             object oobject = str5.split("\\?")[0];
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
          str5 = "";
          str5 = kg4.l(str5, "?validate=true");
          if (!TextUtils.isEmpty(p0)) {
             try{
                StringBuilder str6 = str5;
                str3 = (p1.getString(str4).equals(str3))? "&t1=".concat(p0): "&t1="+p1.getString(str3);
                str3 = str6+str3;
                try{
                   str5 = str3;
                   str2 = (p1.getString(str4).equals(str2))? "&t2=".concat(p0): "&t2="+p1.getString(str2);
                   str2 = str5+str2;
                   try{
                      str3 = str2;
                      str1 = (p1.getString(str4).equals(str1))? "&t3=".concat(p0): "&t3="+p1.getString(str1);
                      str1 = str3+str1;
                      try{
                         str2 = str1;
                         str5 = "&t4=";
                         str = (p1.getString(str4).equals(str))? str5.concat(p0): str5+p1.getString(str);
                         str = str2+str;
                         try{
                            str1 = str;
                            p0 = (p1.getString(str4).equals(e0))? "&t5=".concat(p0): "&t5="+p1.getString(e0);
                            str5 = str1+p0;
                         }catch(java.lang.Exception e10){
                            str5 = str;
                         }
                      }catch(java.lang.Exception e10){
                         str5 = str1;
                      label_012a :
                         e10.printStackTrace();
                      }
                   }catch(java.lang.Exception e10){
                      str5 = str2;
                      goto label_012a ;
                   }
                }catch(java.lang.Exception e10){
                   str5 = str3;
                   goto label_012a ;
                }
             }catch(java.lang.Exception e10){
                goto label_012a ;
             }
          }
          return kg4.l(str5, "&os=android");
       }
    }
    public static void b(String p0){
       if (is7.x.get() != null) {
          Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
          intent.addFlags(0x10000000);
          intent.setPackage("com.android.chrome");
          PackageManager packageManag = is7.x.get().getPackageManager();
          try{
             packageManag.queryIntentActivities(intent, 0);
             is7.x.get().startActivity(intent);
          }catch(android.content.ActivityNotFoundException e0){
             e0.setPackage(null);
             is7.x.get().startActivity(e0);
          }
       }
       return;
    }
    public static final void c(i07 p0,r07 p1,String p2){
       Object[] objArray = new Object[]{p2};
       String str = String.format("%-22s", Arrays.copyOf(objArray, 1));
       co5.l(str, "format\(format, *args\)");
       StringBuilder str1 = p1.b+' '+str;
       u07.i.fine(str1+": "+p0.a);
    }
    public static final String d(byte[] p0){
       StringBuffer str = "";
       int len = p0.length;
       int i = 0;
       while (i < len) {
          i = i + 1;
          Object[] objArray = new Object[]{Byte.valueOf(p0[i])};
          String str1 = String.format("%02x", Arrays.copyOf(objArray, 1));
          co5.l(str1, "java.lang.String.format\(format, *args\)");
          str = str.append(str1);
       }
       String str2 = str;
       co5.l(str2, "sb.toString\(\)");
       return str2;
    }
    public static int e(Context p0){
       int i2;
       int i3;
       int i6;
       long l = ox7.r(p0);
       int i = -1;
       if (!(l - i)) {
          ArrayList uArrayList = new ArrayList();
          int i1 = ox7.m();
          i2 = -1;
          if (i1 < 1) {
             i1 = -1;
          }else if(i1 == 1){
             i1 = 2008;
          }else if(i1 <= 3){
             i1 = 2011;
          }else {
             i1 = 2012;
          }
          if (i1 != i2) {
             uArrayList.add(Integer.valueOf(i1));
          }
          long l1 = (long)ox7.g();
          if (!(l1 - i)) {
             i1 = -1;
          }else if((l1 - 0x80e80) <= 0){
             i1 = 2008;
          }else if((l1 - 0x975e0) <= 0){
             i1 = 2009;
          }else if((l1 - 0xf9060) <= 0){
             i1 = 2010;
          }else if((l1 - 0x129da0) <= 0){
             i1 = 2011;
          }else if((l1 - 0x173180) <= 0){
             i1 = 2012;
          }else if((l1 - 0x1ed2a0) <= 0){
             i1 = 2013;
          }else {
             i1 = 2014;
          }
          if (i1 != i2) {
             uArrayList.add(Integer.valueOf(i1));
          }
          l1 = ox7.r(p0);
          if ((l1) <= 0) {
             i3 = -1;
          }else if((l1 - 0xc000000) <= 0){
             i3 = 2008;
          }else if((l1 - 0x12200000) <= 0){
             i3 = 2009;
          }else if((l1 - 0x20000000) <= 0){
             i3 = 2010;
          }else if((l1 - 0x40000000) <= 0){
             i3 = 2011;
          }else if((l1 - 0x60000000) <= 0){
             i3 = 2012;
          }else if((l1 - 0x80000000) <= 0){
             i3 = 2013;
          }else {
             i3 = 2014;
          }
          if (i3 != i2) {
             uArrayList.add(Integer.valueOf(i3));
          }
          if (!uArrayList.isEmpty()) {
             Collections.sort(uArrayList);
             if (((uArrayList.size() & 1)) == 1) {
                i2 = uArrayList.get((uArrayList.size() / 2)).intValue();
             }else {
                i1 = (uArrayList.size() / 2) - 1;
                i2 = uArrayList.get(i1).intValue() + ((uArrayList.get((i1 + 1)).intValue() - uArrayList.get(i1).intValue()) / 2);
             }
          }
          return i2;
       }else if((l - 0x30000000) <= 0){
          i2 = (ox7.m() <= 1)? 2009: 2010;
          return i2;
       }else if((l - 0x40000000) <= 0){
          int i4 = (ox7.g() < 0x13d620)? 2011: 2012;
          return i4;
       }else if((l - 0x60000000) <= 0){
          int i5 = (ox7.g() < 0x1b7740)? 2012: 2013;
          return i5;
       }else if((l - 0x80000000) <= 0){
          return 2013;
       }else if((l - 0xc0000000) <= 0){
          return 2014;
       }else if((l - 0x140000000) <= 0){
          i6 = 2015;
       }else {
          i6 = 2016;
       }
       return i6;
    }
    public static void f(String p0,boolean p1){
       if (p1) {
          return;
       }
       throw new IllegalArgumentException(p0);
    }
    public static void g(int p0){
       if (p0 >= 0) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static void h(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException(p1);
    }
    public static int i(vr5 p0,x45 p1,View p2,View p3,hr5 p4,boolean p5){
       if (!p4.I() || (!p0.b() || (p2 == null || p3 == null))) {
          return 0;
       }
       if (!p5) {
          return (Math.abs((hr5.R(p2) - hr5.R(p3))) + 1);
       }
       return Math.min(p1.o(), (p1.e(p3) - p1.g(p2)));
    }
    public static int j(vr5 p0,x45 p1,View p2,View p3,hr5 p4,boolean p5,boolean p6){
       if (!p4.I() || (!p0.b() || (p2 == null || p3 == null))) {
          return 0;
       }
       int i = Math.min(hr5.R(p2), hr5.R(p3));
       int i1 = Math.max(hr5.R(p2), hr5.R(p3));
       int i2 = (p6)? Math.max(0, ((p0.b() - i1) - 1)): Math.max(0, i);
       if (!p5) {
          return i2;
       }else {
          return Math.round((((float)i2 * ((float)Math.abs((p1.e(p3) - p1.g(p2))) / (float)(Math.abs((hr5.R(p2) - hr5.R(p3))) + 1))) + (float)(p1.n() - p1.g(p2))));
       }
    }
    public static int k(vr5 p0,x45 p1,View p2,View p3,hr5 p4,boolean p5){
       if (!p4.I() || (!p0.b() || (p2 == null || p3 == null))) {
          return 0;
       }
       if (!p5) {
          return p0.b();
       }
       return (int)(((float)(p1.e(p3) - p1.g(p2)) / (float)(Math.abs((hr5.R(p2) - hr5.R(p3))) + 1)) * (float)p0.b());
    }
    public static sb4 l(lb4 p0,Object p1){
       return new sb4(p0, p1, null, new xz3());
    }
    public static final String m(long p0){
       String str;
       int i = 0x3b9aca00;
       int i1 = 0x1dcd6500;
       if ((p0 - -999500000) <= 0) {
          str = ((p0 - (long)i1) / (long)i)+" s ";
       }else if((p0 - -999500) <= 0){
          str = ((p0 - (long)0x7a120) / (long)0xf4240)+" ms";
       }else {
          String str1 = " µs";
          if ((p0) <= 0) {
             str = ((p0 - (long)500) / (long)1000)+str1;
          }else if((p0 - 0xf404c) < 0){
             str = ((p0 + (long)500) / (long)1000)+str1;
          }else if((p0 - 0x3b9328e0) < 0){
             str = ((p0 + (long)0x7a120) / (long)0xf4240)+" ms";
          }else {
             str = ((p0 + (long)i1) / (long)i)+" s ";
          }
       }
       Object[] objArray = new Object[]{str};
       return kg4.q(objArray, 1, "%6s", "format\(format, *args\)");
    }
    public static int n(Context p0){
       if (is7.a == null) {
          _monitor_enter(is7.class);
          if (is7.a == null) {
             is7.a = Integer.valueOf(is7.e(p0));
          }
          _monitor_exit(is7.class);
       }
       return is7.a.intValue();
    }
    public static vw0 o(vw0 p0,ww0 p1){
       co5.o(p1, "key");
       if (co5.c(p0.getKey(), p1)) {
       }else {
          p0 = null;
       }
       return p0;
    }
    public static br3 p(Configuration p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return new br3(new er3(ho0.a(p0)));
       }
       Locale[] localeArray = new Locale[]{p0.locale};
       return br3.a(localeArray);
    }
    public static final View q(Activity p0){
       Window window;
       View view = null;
       if (p0 == null) {
          return view;
       }
       try{
          if ((window = p0.getWindow()) == null) {
             return view;
          }
          view = window.getDecorView().getRootView();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static final void r(xw0 p0,Throwable p1){
       ax0 uoax0;
       if ((uoax0 = p0.f(i70.v)) != null) {
          uoax0.x(p0, p1);
          return;
       }else {
          bx0.a(p0, p1);
          return;
       }
    }
    public static void s(Exception p0){
       if (!p0 instanceof InvocationTargetException) {
          return;
       }
       Throwable cause = p0.getCause();
       if (cause instanceof RuntimeException) {
          throw cause;
       }
       throw new RuntimeException(cause);
    }
    public static boolean t(){
       try{
          if (is7.c == null) {
             return jy6.r();
          }
          Trace trace = Trace.class;
          String str = "isTagEnabled";
          boolean i = 0;
          try{
             if (is7.c == null) {
                is7.b = trace.getField("TRACE_TAG_APP").getLong(null);
                Class[] uClassArray = new Class[]{Long.TYPE};
                is7.c = trace.getMethod(str, uClassArray);
             }
             Object[] objArray = new Object[]{Long.valueOf(is7.b)};
             i = is7.c.invoke(null, objArray).booleanValue();
          }catch(java.lang.Exception e0){
             is7.s(e0);
          }
          return i;
       }catch(java.lang.NoSuchMethodError e0){
       }catch(java.lang.NoClassDefFoundError e0){
       }
    }
    public static xw0 u(vw0 p0,ww0 p1){
       il1 a;
       co5.o(p1, "key");
       if (co5.c(p0.getKey(), p1)) {
          a = il1.a;
       }
       return a;
    }
    public static final boolean v(String p0){
       co5.o(p0, "method");
       boolean b = (!co5.c(p0, "GET") && !co5.c(p0, "HEAD"))? true: false;
       return b;
    }
    public static long w(ByteBuffer p0,int p1){
       int i;
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 != 4) {
                   if (p1 == 8) {
                      return do5.l0(p0);
                   }else {
                      throw new RuntimeException(tp2.l("I don\'t know how to read ", p1, " bytes"));
                   }
                }else {
                   return do5.k0(p0);
                }
             }else {
                i = do5.j0(p0);
             }
          }else {
             i = do5.i0(p0);
          }
          return (long)i;
       }else if((i = p0.get()) < 0){
          i = i + 256;
       }
       return (long)i;
    }
    public static final String x(BufferedReader p0){
       StringWriter stringWriter = new StringWriter();
       char[] uocharArray = new char[8192];
       for (int i = p0.read(uocharArray); i >= 0; i = p0.read(uocharArray)) {
          stringWriter.write(uocharArray, 0, i);
       }
       String str = stringWriter.toString();
       co5.l(str, "buffer.toString\(\)");
       return str;
    }
    public static final boolean y(String p0){
       co5.o(p0, "method");
       boolean b = (!co5.c(p0, "POST") && (!co5.c(p0, "PUT") && (!co5.c(p0, "PATCH") && (!co5.c(p0, "PROPPATCH") && !co5.c(p0, "REPORT")))))? false: true;
       return b;
    }
    public static boolean z(String p0){
       String[] stringArray1;
       object oobject;
       int i = 30;
       float[] uofloatArray = new float[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uofloatArray[i1] = 0;
       }
       float[][] uofloatArray1 = new float[][1]{uofloatArray};
       String[] stringArray = new String[]{p0};
       if ((stringArray1 = kc4.c(ic4.a, uofloatArray1, stringArray)) == null || (oobject = stringArray1[0]) == null) {
          stringArray1 = "none";
       }
       return (co5.c("none", stringArray1) ^ 1);
    }
}
