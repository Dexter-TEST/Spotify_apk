package p.ts5;
import java.io.Serializable;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import p.co5;
import p.ss5;
import java.lang.CharSequence;
import java.util.List;
import p.av6;
import java.util.regex.Matcher;
import p.ye7;
import java.util.ArrayList;

public final class ts5 implements Serializable	// class@0027d3 from classes.dex
{
    public final Pattern a;

    public void ts5(String p0){
       Pattern pattern = Pattern.compile(p0);
       co5.l(pattern, "compile\(pattern\)");
       super();
       this.a = pattern;
    }
    public void ts5(Pattern p0){
       super();
       this.a = p0;
    }
    private final Object writeReplace(){
       ts5 ta = this.a;
       String str = ta.pattern();
       co5.l(str, "nativePattern.pattern\(\)");
       return new ss5(str, ta.flags());
    }
    public final List a(CharSequence p0){
       co5.o(p0, "input");
       int i = 0;
       av6.y0(i);
       Matcher matcher = this.a.matcher(p0);
       if (!matcher.find()) {
          return ye7.J(p0.toString());
       }
       ArrayList uArrayList = new ArrayList(10);
       do {
          uArrayList.add(p0.subSequence(i, matcher.start()).toString());
          i = matcher.end();
       } while (!matcher.find());
       uArrayList.add(p0.subSequence(i, p0.length()).toString());
       return uArrayList;
    }
    public final String toString(){
       String str = this.a.toString();
       co5.l(str, "nativePattern.toString\(\)");
       return str;
    }
}
