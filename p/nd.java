package p.nd;
import p.k73;
import p.m73;
import java.lang.Object;
import p.dt5;
import java.lang.String;
import java.util.Locale;
import p.co5;
import java.lang.StringBuilder;
import p.en6;

public abstract class nd	// class@001fbb from classes.dex
{
    public static final m73 a;
    public static final m73 b;
    public static final m73 c;

    static {
       k73 ok73 = m73.a();
       ok73.d("es_ES", "es-es");
       ok73.d("es_AR", "es-ar");
       ok73.d("fr_CA", "fr-ca");
       ok73.d("pt_PT", "pt-pt");
       ok73.d("zh_HK", "zh-tw");
       ok73.d("zh_TW", "zh-tw");
       ok73.d("es_MX", "es-mx");
       nd.a = ok73.b(true);
       ok73 = m73.a();
       ok73.d("ca", "ca-es");
       ok73.d("es", "es-419");
       ok73.d("pt", "pt-br");
       nd.b = ok73.b(true);
       ok73 = m73.a();
       ok73.d("in", "id");
       ok73.d("ji", "yi");
       ok73.d("iw", "he");
       nd.c = ok73.b(true);
    }
    public static final String a(String p0,Locale p1){
       StringBuilder str = "en";
       String language = (p1 != null)? p1.getLanguage(): str;
       String str1 = "langCode";
       co5.l(language, str1);
       int i = 0;
       m73 b = nd.b;
       m73 a = nd.a;
       if (nd.b(language)) {
          language = 1;
       }else if(p1 == null){
          language = p1.toString();
          co5.l(language, "androidLocale.toString\(\)");
          if (language.length() >= 2) {
             if ((language = a.get(language)) == null) {
                language = p1.getLanguage();
                co5.l(language, str1);
                if (!nd.b(language) && ((str = b.get(language)) == null && (str = nd.c.get(language)) == null)) {
                }
             }
          }
       }
       language = 0;
       if (!a.containsValue(str) && (!b.containsValue(str) && (p1 != null && !language))) {
          language = p1.getCountry();
          co5.l(language, "androidLocale.country");
          language = (!language.length())? 1: 0;
          if (!language) {
             str = en6.r(str);
             if (!p0.length()) {
                i = 1;
             }
             if (i) {
                p0 = "_";
             }
             return str+p0+p1.getCountry();
          }
       }
       return str;
    }
    public static boolean b(String p0){
       int i = 1;
       if (p0.length() >= 2 && (co5.r(p0.charAt(0), 97) >= 0 && (co5.r(p0.charAt(0), 122) <= 0 && (co5.r(p0.charAt(i), 97) >= 0 && co5.r(p0.charAt(i), 122) <= 0)))) {
          i = false;
       }
       return i;
    }
}
