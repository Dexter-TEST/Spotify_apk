package p.u54;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.nio.charset.Charset;
import p.io2;
import p.av6;
import p.co5;

public final class u54	// class@002847 from classes.dex
{
    public final String a;
    public final String b;
    public final String[] c;
    public static final Pattern d;
    public static final Pattern e;

    static {
       u54.d = Pattern.compile("\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)/\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)");
       u54.e = Pattern.compile(";\\s*\(?:\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)=\(?:\([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+\)|\"\([^\"]*\)\"\)\)?");
    }
    public void u54(String p0,String p1,String[] p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Charset a(Charset p0){
       int i1;
       object oobject;
       u54 tc = this.c;
       int i = 0;
       if ((i1 = io2.m(i, (tc.length - 1), 2)) >= 0) {
          while (true) {
             int i2 = i + 2;
             if (av6.i0(tc[i], "charset", true)) {
                oobject = tc[(i + true)];
                break ;
             }else if(i == i1){
                i = i2;
             }
          }
          if (oobject == null) {
             return p0;
          }else {
             try{
                p0 = Charset.forName(oobject);
                return p0;
             }catch(java.lang.IllegalArgumentException e0){
             }
          }
       }
       oobject = null;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof u54 && co5.c(p0.a, this.a))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return this.a;
    }
}
