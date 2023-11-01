package p.eb0;
import p.n86;
import p.gb0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import p.co5;
import p.o11;
import p.ib0;
import java.util.Locale;
import p.ox7;
import p.db0;

public final class eb0 implements n86	// class@001451 from classes.dex
{
    public final gb0 a;

    public void eb0(gb0 p0){
       this.a = p0;
       super();
    }
    public final boolean c(String p0){
       o11 v;
       gb0 i = this.a.I;
       i.getClass();
       co5.o(p0, "searchText");
       if ((v = i.v) != null) {
          i = v.J;
          i.getClass();
          p0 = p0.toLowerCase(new Locale(ox7.j()));
          co5.l(p0, "this as java.lang.String\).toLowerCase\(locale\)");
          i.z = p0;
          i.w();
       }
       return true;
    }
    public final boolean d(String p0){
       return false;
    }
}
