package p.zq3;
import java.util.Locale;
import java.lang.String;
import java.lang.Object;
import p.l43;

public abstract class zq3	// class@002f47 from classes.dex
{
    public static final Locale[] a;

    static {
       Locale[] localeArray = new Locale[]{new Locale("en", "XA"),new Locale("ar", "XB")};
       zq3.a = localeArray;
    }
    public static Locale a(String p0){
       return Locale.forLanguageTag(p0);
    }
    public static boolean b(Locale p0,Locale p1){
       String str;
       boolean b = true;
       if (p0.equals(p1)) {
          return b;
       }
       if (!p0.getLanguage().equals(p1.getLanguage())) {
          return false;
       }
       Locale[] a = zq3.a;
       int len = a.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (a[i].equals(p0)) {
                len = 1;
             label_002c :
                if (!len) {
                   len = a.length;
                   i = 0;
                   while (true) {
                      if (i < len) {
                         if (a[i].equals(p1)) {
                            a = 1;
                         label_0040 :
                            if (!a) {
                               str = l43.a(p0);
                               if (str.isEmpty()) {
                                  String country = p0.getCountry();
                                  if (!country.isEmpty() && !country.equals(p1.getCountry())) {
                                     b = false;
                                  }
                                  return b;
                               }else {
                                  return str.equals(l43.a(p1));
                               }
                            }
                         }else {
                            i = i + 1;
                         }
                      }else {
                         str = 0;
                         goto label_0040 ;
                      }
                   }
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             len = 0;
             goto label_002c ;
          }
       }
       return false;
    }
}
