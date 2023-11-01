package p.et0;
import p.cu1;
import p.u65;
import java.lang.String;
import com.google.protobuf.c;
import p.i80;
import p.s74;
import java.lang.Object;
import p.ox1;
import java.lang.CharSequence;
import p.av6;
import java.util.List;
import java.util.Collection;
import p.vj;
import androidx.fragment.app.k;
import p.aj1;
import com.spotify.lite.appmain.MainActivity;
import p.m5;
import p.co5;
import java.lang.Runnable;
import java.util.Objects;
import p.if1;
import java.util.LinkedHashMap;
import p.lf1;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.tv1;
import p.wc;
import p.f93;
import p.d93;
import java.lang.Iterable;
import p.aj0;
import p.ff1;
import p.ef1;
import p.pv1;
import java.lang.Integer;
import java.util.AbstractCollection;
import p.cj0;
import p.ku1;
import p.iu1;
import p.za3;
import p.ic;
import java.lang.Class;
import java.lang.System;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.StringBuilder;
import androidx.fragment.app.Fragment;
import p.ax0;
import p.oc;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import java.lang.Throwable;
import java.lang.ClassCastException;
import p.vx;

public abstract class et0	// class@0014f0 from classes.dex
{

    public static u65 a(cu1 p0){
       return new u65(p0.a(), p0.c().toByteString());
    }
    public static boolean b(ox1 p0){
       int i = 1;
       if (!((av6.p0(p0.G()) ^ i)) && !((p0.f().isEmpty() ^ i))) {
          i = false;
       }
       return i;
    }
    public static int c(vj p0){
       int i = 0;
       int i1 = 1;
       int i2 = (p0.g == 2)? 1: 0;
       if (p0.h == 2) {
          i = 1;
       }
       if (i2) {
          i1 = (!i)? 2: 3;
       }
       return i1;
    }
    public static void d(k p0){
       if (p0 instanceof aj1) {
          p0.C();
       }
       return;
    }
    public static m5 e(){
       return et0.f(co5.e);
    }
    public static m5 f(Runnable p0){
       Objects.requireNonNull(p0, "run is null");
       return new m5(1, p0);
    }
    public static LinkedHashMap g(if1 p0){
       d93 obj;
       pv1 opv1;
       ArrayList uArrayList3;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.g(p0.f).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          tv1 a = uEntry.getValue().a;
          co5.o(a, "<this>");
          wc owc = new wc(10, a);
          ArrayList uArrayList1 = new ArrayList();
          f93 uof93 = new f93(owc.invoke());
          while (uof93.hasNext()) {
             obj = uof93.next();
             uArrayList1.add(obj);
          }
          ArrayList uArrayList2 = new ArrayList(aj0.b0(uArrayList1));
          Iterator iterator1 = uArrayList1.iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             long l = obj.b.b();
             d93 b = obj.b;
             long l1 = b.b() - b.a();
             if ((opv1 = pv1.b.get(Integer.valueOf(obj.a))) == null) {
                opv1 = pv1.C;
             }
             ff1 v11 = new ff1(key, l, l1, opv1);
             uArrayList2.add(v11);
          }
          cj0.c0(uArrayList2, uArrayList);
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator2 = uArrayList.iterator();
       while (iterator2.hasNext()) {
          Object obj1 = iterator2.next();
          ff1 a1 = obj1.a;
          if ((uArrayList3 = linkedHashMa.get(a1)) == null) {
             uArrayList3 = new ArrayList();
             linkedHashMa.put(a1, uArrayList3);
          }
          uArrayList3.add(obj1);
       }
       return linkedHashMa;
    }
    public static int h(int p0){
       int i = 1;
       if (p0 == i) {
          return i;
       }
       i = 2;
       if (p0 == i) {
          return i;
       }
       i = 3;
       if (p0 == i) {
          return i;
       }
       if (p0 == 4) {
          return 4;
       }
       throw 0;
    }
    public static String i(int p0){
       if (p0 == 1) {
          return "v1/redeem";
       }
       if (p0 == 2) {
          return "v1/url";
       }
       if (p0 == 3) {
          return "v1/app-link-settings";
       }
       if (p0 == 4) {
          return "v1/install";
       }
       if (p0 == 5) {
          return "v1/close";
       }
       if (p0 == 6) {
          return "v1/open";
       }
       if (p0 == 7) {
          return "v1/credits/";
       }
       if (p0 == 8) {
          return "v1/credithistory";
       }
       if (p0 == 9) {
          return "v1/event";
       }
       if (p0 == 10) {
          return "v1/profile";
       }
       if (p0 == 11) {
          return "v1/logout";
       }
       if (p0 == 12) {
          return "v1/content-events";
       }
       if (p0 == 13) {
          return "v2/event/standard";
       }
       if (p0 == 14) {
          return "v2/event/custom";
       }
       if (p0 == 15) {
          return "v1/cpid";
       }
       if (p0 == 16) {
          return "v1/cpid/latd";
       }
       if (p0 == 17) {
          return "v1/qr-code";
       }
       throw null;
    }
    public static long j(int p0){
       if (p0 == 1) {
          return 0;
       }
       if (p0 == 2) {
          return 1;
       }
       if (p0 == 3) {
          return 2;
       }
       if (p0 == 4) {
          return 3;
       }
       if (p0 == 5) {
          return 4;
       }
       throw 0;
    }
    public static void k(ku1 p0,String p1,long p2,iu1 p3){
       p0.c(p1, p2, p3, -1);
    }
    public static float l(float p0,float p1,float p2,float p3){
       return (((p0 - p1) * p2) + p3);
    }
    public static long m(ic p0,long p1){
       p0.getClass();
       return (p1 - System.currentTimeMillis());
    }
    public static View n(ViewGroup p0,int p1,ViewGroup p2,boolean p3){
       return LayoutInflater.from(p0.getContext()).inflate(p1, p2, p3);
    }
    public static String o(int p0,String p1,String p2){
       String str = new StringBuilder(p0)+p1;
       co5.l(str, p2);
       return str;
    }
    public static String p(String p0,Fragment p1,String p2){
       return p0+p1+p2;
    }
    public static Iterator q(){
       ax0[] uoax0Array = new ax0[]{new oc()};
       return Arrays.asList(uoax0Array).iterator();
    }
    public static void r(View p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
    public static void s(vx p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
    public static String t(int p0){
       if (p0 == 1) {
          return "TWO_LINE_SQUARE_IMAGE";
       }
       if (p0 == 2) {
          return "TWO_LINE_LANDSCAPE_IMAGE";
       }
       if (p0 == 3) {
          return "LARGE_IMAGE";
       }
       if (p0 == 4) {
          return "TITLE";
       }
       return "null";
    }
    public static String u(int p0){
       if (p0 == 1) {
          return "SMARTLOCK_AUTO";
       }
       if (p0 == 2) {
          return "SMARTLOCK_ASSISTED";
       }
       return "null";
    }
    public static String v(int p0){
       if (p0 == 1) {
          return "UNKNOWN";
       }
       if (p0 == 2) {
          return "HORIZONTAL_DIMENSION";
       }
       if (p0 == 3) {
          return "VERTICAL_DIMENSION";
       }
       if (p0 == 4) {
          return "LEFT";
       }
       if (p0 == 5) {
          return "RIGHT";
       }
       if (p0 == 6) {
          return "TOP";
       }
       if (p0 == 7) {
          return "BOTTOM";
       }
       if (p0 == 8) {
          return "BASELINE";
       }
       return "null";
    }
    public static String w(int p0){
       if (p0 == 1) {
          return "INIT";
       }
       if (p0 == 2) {
          return "HIDDEN";
       }
       if (p0 == 3) {
          return "DOWNLOADABLE";
       }
       if (p0 == 4) {
          return "DOWNLOADING";
       }
       if (p0 == 5) {
          return "DOWNLOADED";
       }
       if (p0 == 6) {
          return "WAITING";
       }
       if (p0 == 7) {
          return "NO_INTERNET";
       }
       if (p0 == 8) {
          return "OFFLINE_MODE";
       }
       if (p0 == 9) {
          return "SYNC_NOT_ALLOWED";
       }
       if (p0 == 10) {
          return "RESOLVING";
       }
       return "null";
    }
    public static String x(int p0){
       if (p0 == 1) {
          return "SHORT_MINUTE_AND_SECOND";
       }
       if (p0 == 2) {
          return "SHORT_MINUTE_AND_SECOND_UNIT";
       }
       if (p0 == 3) {
          return "LONG_MINUTE_AND_SECOND";
       }
       if (p0 == 4) {
          return "LONG_HOUR_AND_MINUTE";
       }
       return "null";
    }
    public static String y(int p0){
       if (p0 == 1) {
          return "UPPER_CASE";
       }
       if (p0 == 2) {
          return "LOWER_CASE";
       }
       return "null";
    }
}
