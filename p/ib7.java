package p.ib7;
import p.pf7;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import p.ll1;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Class;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.hr7;

public final class ib7 implements pf7	// class@001962 from classes.dex
{
    public final String a;
    public final int b;
    public final String c;
    public final Map d;
    public static final ib7 e;

    static {
       ib7.e = new ib7(0, "", "", new HashMap());
    }
    public void ib7(int p0,String p1,String p2,HashMap p3){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
       this.d = p3;
    }
    public final List a(){
       ll1 a;
       ib7 ta = this.a;
       int i = 1;
       int i1 = (ta.length() > 0)? 1: 0;
       ib7 tb = this.b;
       ib7 tc = this.c;
       if (i1) {
          i1 = (tc.length() > 0)? 1: 0;
          if (i1 && tb > null) {
             a = ll1.a;
          label_004f :
             return a;
          }
       }
       ArrayList uArrayList = new ArrayList();
       a = (!ta.length())? 1: 0;
       if (a) {
          uArrayList.add("Empty action id");
       }
       if (tb <= null) {
          uArrayList.add("Non-positive version");
       }
       if (tc.length()) {
          i = 0;
       }
       if (i) {
          uArrayList.add("Empty interaction type");
       }
       a = uArrayList;
       goto label_004f ;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 != null && co5.c(ib7.class, p0.getClass())) {
          if (this.b != p0.b) {
             return b;
          }else if(!co5.c(this.a, p0.a)){
             return b;
          }else if(!co5.c(this.c, p0.c)){
             b = co5.c(this.d, p0.d);
          }
       }
       return b;
    }
    public final int hashCode(){
       return (this.d.hashCode() + tp2.g(this.c, (((this.a.hashCode() * 31) + this.b) * 31), 31));
    }
    public final String toString(){
       String str1;
       char c = '=';
       StringBuilder str = this.c+'/'+this.a+'('+this.b+c;
       ib7 td = this.d;
       if (td.isEmpty()) {
          str1 = "";
       }else {
          String str2 = "\(";
          Iterator iterator = td.entrySet().iterator();
          int i = 1;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             if (!i) {
                str2 = str2.append(",");
             }
             str2 = str2.append("".append(key).append(c).append(value).toString());
             if (i) {
                i = 0;
             }
          }
          str1 = str2+"\)";
          co5.l(str1, "paramsAsString.append\(\"\)\"\).toString\(\)");
       }
       return hr7.a(str, str1, ')');
    }
}
