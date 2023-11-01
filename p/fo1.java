package p.fo1;
import p.eo1;
import java.lang.Class;
import p.og2;
import java.lang.Object;
import java.lang.Enum;
import java.util.HashMap;
import p.w51;
import java.lang.String;
import java.util.Locale;
import p.r45;
import p.jj5;
import p.c0;

public final class fo1	// class@001605 from classes.dex
{
    public final Class a;
    public final HashMap b;
    public final boolean c;
    public static final eo1 d;

    static {
       fo1.d = new eo1(0);
    }
    public void fo1(Class p0,og2 p1){
       super();
       p0.getClass();
       this.a = p0;
       Enum[] enumConstant = p0.getEnumConstants();
       this.b = new HashMap(w51.c(enumConstant.length));
       int len = enumConstant.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = enumConstant[i];
          this.b.put(p1.apply(oobject).toUpperCase(Locale.US), oobject);
       }
       this.c = false;
       return;
    }
    public final Enum a(String p0){
       if (this.c != null) {
          p0 = p0.replace('-', '_');
       }
       p0.getClass();
       return this.b.get(p0.toUpperCase(Locale.US));
    }
    public final r45 b(String p0){
       Enum uEnum;
       jj5 ojj5 = ((uEnum = this.a(p0)) != null)? new jj5(uEnum): c0.a;
       return ojj5;
    }
}
