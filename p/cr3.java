package p.cr3;
import p.dr3;
import java.util.Locale;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.StringBuilder;
import java.lang.NullPointerException;
import p.tp2;

public final class cr3 implements dr3	// class@001261 from classes.dex
{
    public final Locale[] a;
    public final String b;
    public static final Locale[] c;

    static {
       Locale locale;
       int i = 0;
       Locale[] localeArray = new Locale[i];
       cr3.c = localeArray;
       Locale localeArray1 = new Locale("en", "XA");
       localeArray1 = new Locale("ar", "XB");
       String[] stringArray = "en-Latn".split("-", -1);
       int i1 = 1;
       if (stringArray.length > 2) {
          locale = new Locale(stringArray[i], stringArray[i1], stringArray[2]);
       }else if(stringArray.length > i1){
          locale = new Locale(stringArray[i], stringArray[i1]);
       }else if(stringArray.length == i1){
          locale = new Locale(stringArray[i]);
       }else {
          throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
       }
    }
    public void cr3(Locale[] p0){
       object oobject;
       String country;
       super();
       if (!p0.length) {
          this.a = cr3.c;
          this.b = "";
       }else {
          ArrayList uArrayList = new ArrayList();
          HashSet hashSet = new HashSet();
          StringBuilder str = "";
          int i = 0;
          while (true) {
             if (i < p0.length) {
                if ((oobject = p0[i]) != null) {
                   if (!hashSet.contains(oobject)) {
                      Locale locale = oobject.clone();
                      uArrayList.add(locale);
                      str = str.append(locale.getLanguage());
                      if ((country = locale.getCountry()) != null && !country.isEmpty()) {
                         str = str.append('-').append(locale.getCountry());
                      }
                      int i1 = p0.length - 1;
                      if (i < i1) {
                         str = str.append(',');
                      }
                      hashSet.add(locale);
                   }
                   i = i + 1;
                }else {
                   throw new NullPointerException(tp2.l("list[", i, "] is null"));
                }
             }else {
                p0 = new Locale[0];
                this.a = uArrayList.toArray(p0);
                this.b = str;
                break ;
             }
          }
       }
       return;
    }
    public final String a(){
       return this.b;
    }
    public final Object b(){
       return null;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof cr3) {
          return false;
       }
       p0 = p0.a;
       cr3 ta = this.a;
       if (ta.length != p0.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= ta.length) {
             return true;
          }
          if (!ta[i].equals(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final Locale get(int p0){
       object oobject;
       if (p0 >= 0) {
          cr3 ta = this.a;
          if (p0 < ta.length) {
             oobject = ta[p0];
          label_000b :
             return oobject;
          }
       }
       oobject = null;
       goto label_000b ;
    }
    public final int hashCode(){
       cr3 ta = this.a;
       int len = ta.length;
       int i = 1;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          i = i * 31;
          i = i + ta[i1].hashCode();
       }
       return i;
    }
    public final boolean isEmpty(){
       boolean b = (!this.a.length)? true: false;
       return b;
    }
    public final int size(){
       return this.a.length;
    }
    public final String toString(){
       String str = "[";
       int i = 0;
       while (true) {
          cr3 ta = this.a;
          if (i < ta.length) {
             str = str.append(ta[i]);
             int i1 = ta.length - 1;
             if (i < i1) {
                str = str.append(',');
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       return str+"]";
    }
}
