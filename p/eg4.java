package p.eg4;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p.dg4;
import p.ay6;
import p.wf2;
import android.net.Uri;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import p.co5;
import java.util.Set;
import java.util.Iterator;
import p.cg4;
import java.lang.NullPointerException;
import p.av6;
import java.util.Map;
import p.ts5;
import java.util.List;
import java.util.ListIterator;
import java.lang.Iterable;
import p.dj0;
import p.ll1;
import p.en6;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import p.mf4;
import java.lang.Class;
import p.vg4;
import android.os.BaseBundle;

public final class eg4	// class@001480 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final LinkedHashMap e;
    public final String f;
    public final ay6 g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final ay6 k;
    public final boolean l;
    public static final Pattern m;

    static {
       eg4.m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    }
    public void eg4(String p0,String p1,String p2){
       Iterator iterator;
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new ArrayList();
       this.e = new LinkedHashMap();
       int i = 1;
       this.g = new ay6(new dg4(this, i));
       int i1 = 0;
       this.k = new ay6(new dg4(this, i1));
       if (p0 != null) {
          Uri uri = Uri.parse(p0);
          boolean b = (uri.getQuery() != null)? true: false;
          this.h = b;
          String str = "^";
          if (!eg4.m.matcher(p0).find()) {
             str = str+"http[s]?://";
          }
          Pattern pattern = Pattern.compile("\\{\(.+?\)\\}");
          String str1 = "fillInPattern";
          if (b) {
             Matcher matcher = Pattern.compile("\(\\?\)").matcher(p0);
             if (matcher.find()) {
                p0 = p0.substring(i1, matcher.start());
                co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
                co5.l(pattern, str1);
                this.l = this.a(p0, str, pattern);
             }
             iterator = uri.getQueryParameterNames().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   String str2 = iterator.next();
                   StringBuilder str3 = "";
                   if ((str1 = uri.getQueryParameter(str2)) == null) {
                      this.i = i;
                      str1 = str2;
                   }
                   Matcher matcher1 = pattern.matcher(str1);
                   cg4 uocg4 = new cg4();
                   int i2 = 0;
                   while (true) {
                      if (matcher1.find()) {
                         if ((i = matcher1.group(i)) != null) {
                            uocg4.b.add(i);
                            co5.l(str1, "queryParam");
                            i = str1.substring(i2, matcher1.start());
                            co5.l(i, "this as java.lang.String…ing\(startIndex, endIndex\)");
                            str3 = str3.append(Pattern.quote(i)).append("\(.+?\)?");
                            i2 = matcher1.end();
                            i = 1;
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                         }
                      }else if(i2 < str1.length()){
                         i = str1.substring(i2);
                         co5.l(i, "this as java.lang.String\).substring\(startIndex\)");
                         str3 = str3.append(Pattern.quote(i));
                      }
                      i = str3.toString();
                      co5.l(i, "argRegex.toString\(\)");
                      uocg4.a = av6.x0(i, ".*", "\\E.*\\Q");
                      co5.l(str2, "paramName");
                      this.e.put(str2, uocg4);
                      i = true;
                   }
                }
             }
          }else {
             co5.l(pattern, str1);
             this.l = this.a(p0, str, pattern);
          }
          iterator = str;
          co5.l(iterator, "uriRegex.toString\(\)");
          this.f = av6.x0(iterator, ".*", "\\E.*\\Q");
       }
       if (this.c != null) {
          if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.c).matches()) {
             eg4 tc = this.c;
             co5.o(tc, "mimeType");
             List list = new ts5("/").a(tc);
             if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                   if (listIterator.hasPrevious()) {
                      i = (!listIterator.previous().length())? 1: 0;
                      if (!i) {
                         i = 1;
                         list = dj0.y0(list, (listIterator.nextIndex() + i));
                      label_019a :
                         this.j = av6.x0("^\("+list.get(0)+"|[*]+\)/\("+list.get(i)+"|[*]+\)$", "*|[*]", "[\\s\\S]");
                         break ;
                      }
                   }
                }
             }
             i = 1;
             ll1 a = ll1.a;
             goto label_019a ;
          }else {
             throw new IllegalArgumentException(en6.p("The given mimeType ", this.c, " does not match to required \"type/subtype\" format").toString());
          }
       }
       return;
    }
    public static void b(Bundle p0,String p1,String p2,mf4 p3){
       if (p3 != null) {
          p3 = p3.a;
          p3.getClass();
          co5.o(p1, "key");
          p3.d(p0, p1, p3.c(p2));
       }else {
          p0.putString(p1, p2);
       }
       return;
    }
    public final boolean a(String p0,StringBuilder p1,Pattern p2){
       String str;
       Matcher matcher = p2.matcher(p0);
       int i = av6.f0(p0, ".*") ^ 1;
       int i1 = 0;
       while (true) {
          if (matcher.find()) {
             if ((str = matcher.group(1)) != null) {
                this.d.add(str);
                str = p0.substring(i1, matcher.start());
                co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
                p1 = p1.append(Pattern.quote(str)).append("\([^/]+?\)");
                i1 = matcher.end();
                i = false;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
             }
          }else if(i1 < p0.length()){
             p0 = p0.substring(i1);
             co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
             p1 = p1+Pattern.quote(p0);
             break ;
          }
          break ;
       }
       p1+"\($|\(\\?\(.\)*\)|\(\\#\(.\)*\)\)";
       return i;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 != null && (p0 instanceof eg4 && (co5.c(this.a, p0.a) && (co5.c(this.b, p0.b) && co5.c(this.c, p0.c))))) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       eg4 ta;
       eg4 tb;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = (i1 + i) * 31;
       int i2 = ((tb = this.b) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       if ((tb = this.c) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
}
