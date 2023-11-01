package p.o95;
import java.lang.String;
import java.util.regex.Pattern;
import p.n50;
import p.mr0;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.Collections;
import java.lang.RuntimeException;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.LinkedList;
import java.util.Collection;

public abstract class o95	// class@0020d7 from classes.dex
{
    public static final Pattern a;

    static {
       o95.a = Pattern.compile("\(....|\\.\\.\)\(\\[\(.*\)\\]\)?");
    }
    public static String a(n50 p0,String p1){
       mr0 parent = p0.getParent();
       Iterator iterator = parent.getBoxes().iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          n50 on50 = iterator.next();
          if (on50.getType().equals(p0.getType())) {
             if (on50 == p0) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
       }
       Object[] objArray = new Object[]{p0.getType(),Integer.valueOf(i1)};
       String str = String.valueOf(String.format("/%s[%d]", objArray))+p1;
       if (parent instanceof n50) {
          str = o95.a(parent, str);
       }
       return str;
    }
    public static List b(Object p0,String p1){
       String str2;
       String str = "/";
       int i = 1;
       if (p1.startsWith(str)) {
          String str1 = p1.substring(i);
          while (p0 instanceof n50) {
             p0 = p0.getParent();
          }
          p1 = str1;
       }
       if (!p1.length()) {
          if (p0 instanceof n50) {
             return Collections.singletonList(p0);
          }else {
             throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
          }
       }else {
          int i1 = 0;
          if (p1.contains(str)) {
             str2 = p1.substring((p1.indexOf(47) + i));
             p1 = p1.substring(i1, p1.indexOf(47));
          }else {
             str2 = "";
          }
          Matcher matcher = o95.a.matcher(p1);
          if (matcher.matches()) {
             p1 = matcher.group(i);
             if ("..".equals(p1)) {
                if (p0 instanceof n50) {
                   return o95.b(p0.getParent(), str2);
                }else {
                   return Collections.emptyList();
                }
             }else if(p0 instanceof mr0){
                int i2 = (matcher.group(2) != null)? Integer.parseInt(matcher.group(3)): -1;
                LinkedList linkedList = new LinkedList();
                p0 = p0.getBoxes().iterator();
                while (true) {
                   if (!p0.hasNext()) {
                      return linkedList;
                   }
                   n50 on50 = p0.next();
                   if (on50.getType().matches(p1)) {
                      if (i2 == -1 || i2 == i1) {
                         linkedList.addAll(o95.b(on50, str2));
                      }
                      i1 = i1 + 1;
                   }
                   if (!linkedList.isEmpty()) {
                      break ;
                   }
                }
                return linkedList;
             }else {
                return Collections.emptyList();
             }
          }else {
             throw new RuntimeException(String.valueOf(p1).concat(" is invalid path."));
          }
       }
    }
}
