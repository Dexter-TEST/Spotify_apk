package p.n51;
import p.nz0;
import java.lang.String;
import p.gg1;
import p.o11;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public final class n51	// class@001f6b from classes.dex
{
    public final o11 a;
    public static final nz0 b;
    public static final String c;
    public static final String d;
    public static final gg1 e;

    static {
       n51.b = new nz0();
       n51.c = n51.a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
       n51.d = n51.a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
       n51.e = gg1.t;
    }
    public void n51(o11 p0){
       super();
       this.a = p0;
    }
    public static String a(String p0,String p1){
       int i;
       if ((i = p0.length() - p1.length()) < 0 || i > 1) {
          throw new IllegalArgumentException("Invalid input received");
       }
       StringBuilder str = new StringBuilder((p1.length() + p0.length()));
       int i1 = 0;
       while (i1 < p0.length()) {
          str = str.append(p0.charAt(i1));
          if (p1.length() > i1) {
             str = str.append(p1.charAt(i1));
          }
          i1 = i1 + 1;
       }
       return str;
    }
}
