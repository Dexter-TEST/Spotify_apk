package p.dy1;
import p.p75;
import p.a56;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.String;
import p.vf1;
import java.lang.StringBuilder;
import p.co5;
import java.util.Locale;
import java.lang.Long;
import com.spotify.messages.EventSenderStats2NonAuth;
import p.hv1;
import java.util.ArrayList;
import p.bc3;
import java.util.Iterator;
import java.lang.Iterable;
import p.i80;
import p.xb3;
import p.db3;
import java.lang.Integer;
import java.util.List;
import p.ac3;
import p.jv3;
import p.n26;
import p.zf2;
import p.dj0;
import p.vv1;
import p.ye7;
import java.util.LinkedHashMap;
import java.lang.Number;
import java.util.Map;
import p.t65;
import p.pv1;
import p.iv1;
import p.tm6;
import p.q14;
import java.util.Set;
import java.util.Map$Entry;
import p.wf2;
import p.ff1;
import android.widget.TextView;
import p.ie1;
import android.graphics.drawable.Drawable;
import p.v27;

public final class dy1 implements p75, a56	// class@0013dc from classes.dex
{
    public final int a;

    public void dy1(){
       this.a = 20;
       super();
    }
    public void dy1(int p0){
       this.a = p0;
       super();
    }
    public void dy1(int p0,int p1){
       this.a = p0;
       switch (p0){
           case 1:
             super(1);
             return;
           case 2:
             super(2);
             return;
           case 3:
             super(3);
             return;
           case 4:
             super(4);
             return;
           case 5:
             super(5);
             return;
           case 6:
             super(6);
             return;
           case 7:
             super(7);
             return;
           case 8:
             super(8);
             return;
           case 9:
             super(9);
             return;
           case 11:
             super(11);
             return;
           case 13:
             super(13);
             return;
           case 14:
             super(14);
             return;
           case 16:
             super(16);
             return;
           case 18:
             super(18);
             return;
           case 19:
             super(19);
             return;
           case 21:
             super(21);
             return;
           case 22:
             super(22);
             return;
           case 23:
             super(23);
             return;
           case 24:
             super(24);
             return;
           case 25:
             super(25);
             return;
           default:
             super(0);
             return;
       }
    }
    public void dy1(Object p0){
       this.a = 28;
       super(28);
    }
    public static final String a(Resources p0,long p1,boolean p2,boolean p3){
       long l = 60;
       long l1 = p1 % l;
       long l2 = (p2)? l1: 0;
       p1 = p1 / l;
       if (!p2 && (l1) > 0) {
          p1 = p1 + 1;
       }
       l1 = p1 % l;
       p1 = p1 / l;
       StringBuilder str = new StringBuilder(0);
       if ((v0 = p1) > 0) {
          dy1.b(str, p0, R.plurals.time_format_hours, p1);
       }
       char c = ' ';
       if (l > 0 && (l1) > 0) {
          str = str+c;
       }
       if ((v10 = l1) > 0) {
          dy1.b(str, p0, R.plurals.time_format_min, l1);
       }
       if (l > 0 || (v10 > 0 && (l2) > 0)) {
          str = str+c;
       }
       if ((l2) > 0) {
          dy1.b(str, p0, R.plurals.time_format_sec, l2);
       }
       String str1 = str;
       co5.l(str1, "timeStringBuffer.toString\(\)");
       if (p3) {
          str1 = str1.toUpperCase(vf1.b);
          co5.l(str1, "this as java.lang.String\).toUpperCase\(locale\)");
       }
       return str1;
    }
    public static void b(StringBuilder p0,Resources p1,int p2,long p3){
       Object[] objArray = new Object[]{Long.valueOf(p3)};
       p0+p1.getQuantityString(p2, (int)p3, objArray);
    }
    public static hv1 c(EventSenderStats2NonAuth p0){
       int i1;
       t65[] obj1;
       int i2;
       int i3;
       int i4;
       ArrayList uArrayList1;
       ff1 obj = p0;
       ArrayList uArrayList = new ArrayList();
       String str = "nameIndex";
       if (p0.G() != p0.y()) {
       }else {
          bc3 uobc3 = p0.H();
          co5.l(uobc3, "ess2.sequenceIdsList");
          Iterator iterator3 = uobc3.iterator();
          int i9 = 0;
          i1 = 0;
          while (true) {
             if (iterator3.hasNext()) {
                Object obj4 = iterator3.next();
                i3 = i9 + 1;
                if (i9 >= 0) {
                   Integer integer = p0.z().get(i9);
                   co5.l(integer, "eventCountPerSequenceId");
                   i9 = integer.intValue() + i1;
                   for (; i1 < i9; i9 = i9) {
                      Integer integer1 = p0.x().get(i1);
                      co5.l(integer1, str);
                      co5.l(obj4, "sequenceId");
                      Object obj5 = p0.C().get(i1);
                      Object obj6 = p0.B().get(i1);
                      String str1 = dj0.q0(obj4, "", 0, 0, n26.J, 30).toUpperCase();
                      co5.l(str1, "this as java.lang.String\).toUpperCase\(\)");
                      Object obj7 = p0.w().get(integer1.intValue());
                      co5.l(obj7, "name");
                      byte[] uobyteArray = obj4.p();
                      co5.l(uobyteArray, "sequenceId.toByteArray\(\)");
                      co5.l(obj6, "sequenceNumberNext");
                      long l = obj6.longValue();
                      co5.l(obj5, "storageSize");
                      byte[] uobyteArray1 = uobyteArray;
                      vv1 ovv1 = v15;
                      obj6 = obj7;
                      vv1 ovv11 = v15;
                      ovv1 = new vv1("".append(obj7).append('_').append(str1).toString(), obj6, uobyteArray1, str1, p0.A().get(i1), l, obj5.longValue());
                      uArrayList.add(ovv11);
                      i1 = i1 + 1;
                      iterator3 = iterator3;
                   }
                   i9 = i3;
                   i1 = i9;
                }else {
                   ye7.W();
                   throw null;
                }
             }
          }
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       xb3 oxb3 = p0.F();
       co5.l(oxb3, "ess2.ratelimiterStatsEventNameIndexList");
       Iterator iterator = oxb3.iterator();
       int i = 0;
       while (true) {
          i1 = 1;
          if (iterator.hasNext()) {
             obj1 = iterator.next();
             i2 = i + 1;
             if (i >= 0) {
                i3 = p0.w().size();
                co5.l(obj1, str);
                if ((i4 = obj1.intValue()) < 0 || i4 >= i3) {
                   i1 = 0;
                }
                if (i1 && p0.D() > i) {
                   obj1 = p0.w().get(obj1.intValue());
                   co5.l(obj1, "ess2.eventNamesList[nameIndex]");
                   linkedHashMa.put(obj1, Integer.valueOf((int)p0.E().get(i).longValue()));
                }
                i = i2;
             }else {
                ye7.W();
                throw null;
             }
          }else {
             uArrayList1 = new ArrayList();
             if (p0.M()) {
                uArrayList1 = new ArrayList();
                obj1 = new t65[7];
                int i5 = 0;
                obj1[0] = new t65(pv1.v, new iv1(new tm6(2, obj)));
                obj1[1] = new t65(pv1.w, new iv1(new tm6(3, obj)));
                int i6 = 4;
                obj1[2] = new t65(pv1.x, new iv1(new tm6(i6, obj)));
                i4 = 5;
                obj1[3] = new t65(pv1.y, new iv1(new tm6(i4, obj)));
                int i7 = 6;
                obj1[4] = new t65(pv1.z, new iv1(new tm6(i7, obj)));
                obj1[5] = new t65(pv1.A, new iv1(new tm6(7, obj)));
                obj1[6] = new t65(pv1.B, new iv1(new tm6(8, obj)));
                Map map = q14.o0(obj1);
                xb3 oxb31 = p0.N();
                co5.l(oxb31, "ess2.statesListEventNameIndexList");
                Iterator iterator1 = oxb31.iterator();
                while (iterator1.hasNext()) {
                   String obj2 = iterator1.next();
                   i2 = i5 + 1;
                   if (i5 >= 0) {
                      co5.l(obj2, "eventNameIndex");
                      obj2 = p0.w().get(obj2.intValue());
                      Iterator iterator2 = map.entrySet().iterator();
                      while (iterator2.hasNext()) {
                         Map$Entry uEntry = iterator2.next();
                         Object obj3 = uEntry.getKey();
                         List list = uEntry.getValue().a.invoke();
                         if (list.size() > i5 && (list.get(i5).longValue()) > 0) {
                            co5.l(obj2, "name");
                            ff1 uoff1 = v15;
                            obj = v15;
                            uoff1 = new ff1(obj2, list.get(i5).longValue(), 0, obj3);
                            uArrayList1.add(obj);
                         }
                         int i8 = p0;
                      }
                      i5 = i2;
                   }else {
                      ye7.W();
                      throw null;
                   }
                }
             }
             break ;
          }
       }
       return new hv1(uArrayList, linkedHashMa, uArrayList1);
    }
    public static void d(TextView p0,ie1 p1){
       Drawable[] uDrawableArr = v27.a(p0);
       co5.l(uDrawableArr, "getCompoundDrawablesRelative\(textView\)");
       uDrawableArr[0] = p1;
       v27.g(p0, p1, uDrawableArr[1], uDrawableArr[2], uDrawableArr[3]);
    }
    public final boolean e(){
       return false;
    }
    public final void m(int p0){
    }
}
