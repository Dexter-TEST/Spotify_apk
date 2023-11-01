package p.vf1;
import p.uf1;
import p.dy1;
import java.util.Locale;
import java.lang.String;
import p.ox7;
import android.content.Context;
import java.lang.Object;
import p.co5;
import p.tf1;
import java.lang.Math;
import p.en6;
import android.content.res.Resources;
import p.cd2;
import java.lang.Long;
import java.util.Arrays;

public final class vf1 implements uf1	// class@0029e1 from classes.dex
{
    public final Context a;
    public static final Locale b;

    static {
       dy1 uody1 = new dy1(2, 0);
       vf1.b = new Locale(ox7.j());
    }
    public void vf1(Context p0){
       co5.o(p0, "context");
       super();
       this.a = p0;
    }
    public final String a(int p0,tf1 p1){
       Resources resources;
       String str;
       co5.o(p1, "formatOptions");
       long l = Math.abs((long)p0);
       p0 = en6.A(p1.a);
       boolean b = true;
       boolean b1 = false;
       long l1 = 60;
       if (p0) {
          vf1 ta = this.a;
          if (p0 != b) {
             p1 = p1.b;
             if (p0 != 2) {
                if (p0 == 3) {
                   resources = ta.getResources();
                   co5.l(resources, "context.resources");
                   if (p1 != b) {
                      b = false;
                   }
                   str = dy1.a(resources, l, b1, b);
                }else {
                   throw new cd2(10);
                }
             }else {
                resources = ta.getResources();
                co5.l(resources, "context.resources");
                if (p1 == b) {
                   b1 = true;
                }
                str = dy1.a(resources, l, b, b1);
             }
          }else {
             long l2 = l / l1;
             l = l % l1;
             if (!(l2)) {
                Object[] objArray = new Object[b];
                objArray[b1] = Long.valueOf(l);
                str = ta.getResources().getString(R.string.track_list_duration_seconds_format, objArray);
             }else {
                Object[] objArray1 = new Object[]{Long.valueOf(l2),Long.valueOf(l)};
                str = ta.getResources().getString(R.string.track_list_duration_minutes_format, objArray1);
             }
             co5.l(str, "{\n                val mi…          }\n            }");
          }
       }else {
          Object[] objArray2 = new Object[]{Long.valueOf((l / l1)),Long.valueOf((l % l1))};
          str = String.format(vf1.b, "%02d:%02d", Arrays.copyOf(objArray2, 2));
          co5.l(str, "format\(locale, format, *args\)");
       }
       return str;
    }
}
