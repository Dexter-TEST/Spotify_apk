package p.p94;
import p.k07;
import p.am2;
import p.so6;
import p.po2;
import p.oo2;
import p.i80;
import java.lang.String;
import p.b17;
import p.yp6;
import p.aq6;
import p.ox;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import com.spotify.metadata.proto.Metadata$Track;
import p.bc3;
import java.lang.Iterable;
import p.ab2;
import java.util.Iterator;
import java.lang.Class;
import java.lang.Object;
import p.jj5;
import p.r45;
import p.c0;
import p.te5;
import java.util.Collection;
import java.util.Locale;
import com.spotify.metadata.proto.Metadata$Restriction;
import java.util.List;
import java.util.Collections;
import java.lang.CharSequence;
import com.spotify.metadata.proto.Metadata$AudioFile;
import p.zg0;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import p.ic;

public abstract class p94	// class@002219 from classes.dex
{
    public static final k07 a;
    public static final m74 b;

    static {
       p94.a = new k07(new am2(2, 2));
       p94.b = oo2.a;
    }
    public static String a(i80 p0){
       return "https://i.scdn.co/image/".concat(b17.A(p0.p()));
    }
    public static aq6 b(yp6 p0,i80 p1){
       byte[] a;
       long l;
       int i5;
       byte[] uobyteArray2;
       long l1;
       long l3;
       long l4;
       int i7;
       long l5;
       aq6 uoaq6 = null;
       if (p1 == null) {
          return uoaq6;
       }
       int i = 16;
       if (p1.p().length != i) {
          return uoaq6;
       }
       byte[] uobyteArray = p1.p();
       if (uobyteArray.length != i) {
          throw new IllegalArgumentException("Not a 16 byte value");
       }
       i = 0;
       int i1 = ox.a(uobyteArray, i);
       int i2 = ox.a(uobyteArray, 4);
       int i3 = ox.a(uobyteArray, 8);
       int i4 = ox.a(uobyteArray, 12);
       byte[] uobyteArray1 = new byte[22];
       while (true) {
          a = ox.a;
          l = 0xffffffff;
          i5 = 6;
          if (i < i5) {
             uobyteArray2 = uobyteArray1;
             l1 = (long)i1 & l;
             long l2 = l1 / 62;
             l1 = l1 % 62;
             l1 = l1 << 32;
             l3 = (long)i2 & l;
             l3 = l3 | l1;
             l1 = l3 / 62;
             int i6 = (int)l1;
             l3 = l3 % 62;
             l3 = l3 << 32;
             l4 = (long)i3 & l;
             l3 = l3 | l4;
             l4 = l3 / 62;
             i3 = (int)l4;
             l3 = l3 % 62;
             l3 = l3 << 32;
             l = l & (long)i4;
             l3 = l3 | l;
             l = l3 / 62;
             i7 = (int)l;
             int i8 = i - 21;
             l3 = l3 % 62;
             uobyteArray2[i8] = a[(int)l3];
             i = i + 1;
             i4 = i7;
             i2 = i6;
             uobyteArray1 = uobyteArray2;
             i7 = 22;
          }else {
             break ;
          }
       }
       uobyteArray2 = uobyteArray1;
       while (true) {
          i = 11;
          if (i5 < i) {
             l5 = (long)i2 & l;
             l1 = l5 / 62;
             l5 = l5 % 62;
             l5 = l5 << 32;
             l4 = (long)i3 & l;
             l5 = l5 | l4;
             l4 = l5 / 62;
             i3 = (int)l4;
             l5 = l5 % 62;
             l5 = l5 << 32;
             l1 = (long)i4 & l;
             long l6 = l5 | l1;
             l1 = l6 / 62;
             i1 = (int)l1;
             i7 = i5 - 21;
             l6 = l6 % 62;
             uobyteArray2[i7] = a[(int)l6];
             i5 = i5 + 1;
             i4 = i1;
          }else {
             break ;
          }
       }
       while (true) {
          i1 = 17;
          if (i < i1) {
             l3 = (long)i3 & l;
             l4 = l3 / 62;
             l3 = l3 % 62;
             l3 = l3 << 32;
             l1 = (long)i4 & l;
             l3 = l3 | l1;
             l1 = l3 / 62;
             i4 = (int)l1;
             i7 = i - 21;
             l3 = l3 % 62;
             uobyteArray2[i7] = a[(int)l3];
             i = i + 1;
          }else {
             break ;
          }
       }
       l5 = 22;
       for (; i1 < l5; i1 = i1 + 1) {
          i2 = i1 - 21;
          i3 = i4 % 62;
          uobyteArray2[i2] = a[i3];
          i7 = i4 / 62;
       }
       String str = new String(uobyteArray2);
       if ((i = p0.ordinal()) == 1) {
          return new aq6(yp6.b, str, null);
       }
       if (i == 3) {
          return new aq6(yp6.t, str, null);
       }
       if (i == 5) {
          return new aq6(yp6.w, str, null);
       }
       if (i == 51) {
          return new aq6(yp6.l0, str, null);
       }
       if (i != 52) {
          return null;
       }
       return new aq6(yp6.m0, str, null);
    }
    public static boolean c(Metadata$Track p0,String p1){
       jj5 ojj5;
       boolean b = true;
       if (!p94.d(p0.l(), p1)) {
          Iterator iterator = ab2.b(p0.g()).c().iterator();
          iterator.getClass();
          while (true) {
             if (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = ((obj1 = obj) != null && p94.c(obj1, p1))? 1: 0;
                if (obj1) {
                   ojj5 = r45.d(obj);
                }
             }else {
                ojj5 = c0.a;
             }
             if (!ojj5.c()) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public static boolean d(bc3 p0,String p1){
       String str;
       List list;
       if (te5.a(p1) || (p0 == null || p0.isEmpty())) {
          return true;
       }
       p1 = p1.toUpperCase(Locale.US);
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          Metadata$Restriction restriction = iterator.next();
          k07 a = p94.a;
          if (restriction.g()) {
             str = restriction.f();
             list = (str.isEmpty())? Collections.emptyList(): a.b(str);
             if (list.contains(p1)) {
                break ;
             }
          }else if(restriction.h()){
             str = restriction.f();
             list = (str.isEmpty())? Collections.emptyList(): a.b(str);
             if (!list.contains(p1)) {
                return true;
             }
          }
       }
       return true;
    }
    public static String e(bc3 p0){
       Metadata$AudioFile uAudioFile;
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uAudioFile = iterator.next();
          if (uAudioFile.g()) {
             break ;
          }
       }
       return b17.A(uAudioFile.f().p());
    }
    public static Calendar f(zg0 p0,String p1){
       Date uDate;
       if (te5.a(p1)) {
          return null;
       }
       Locale uS = Locale.US;
       try{
          SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd", uS);
          if ((uDate = simpleDateFo.parse(p1)) == null) {
             return null;
          }
          p0.getClass();
          Calendar instance = Calendar.getInstance();
          instance.setTime(uDate);
          return instance;
       }catch(java.text.ParseException e0){
          return null;
       }
    }
}
