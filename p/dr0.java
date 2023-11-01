package p.dr0;
import p.lo4;
import p.ub3;
import p.yb3;
import java.lang.Object;
import java.lang.String;
import java.io.InputStream;
import p.l06;
import java.lang.Runtime;
import java.lang.Process;
import p.mm2;
import p.xo5;
import java.lang.Iterable;
import p.aj0;
import p.xe7;
import java.util.LinkedHashMap;
import java.util.Iterator;
import p.pl;
import p.co5;
import java.util.Map;
import java.lang.StringBuilder;
import p.ju1;
import java.lang.Integer;
import p.jg5;
import p.lg5;
import java.util.ArrayList;

public final class dr0 implements lo4, ub3, yb3	// class@00139d from classes.dex
{
    public final int a;

    public void dr0(int p0){
       this.a = p0;
       super();
    }
    public void dr0(int p0,int p1){
       this.a = p0;
       p1 = 1;
       if (p0 != p1) {
          if (p0 != 8) {
             switch (p0){
                 case 11:
                   super(11);
                   return;
                 case 12:
                   super(12);
                   return;
                 case 13:
                   super(13);
                   return;
                 case 14:
                   super(14);
                   return;
                 case 15:
                   super(15);
                   return;
                 case 16:
                   super(16);
                   return;
                 case 17:
                   super(17);
                   return;
                 case 18:
                   super(18);
                   return;
                 case 19:
                   super(19);
                   return;
                 case 20:
                   super(20);
                   return;
                 case 21:
                   super(21);
                   return;
                 case 22:
                   super(22);
                   return;
                 case 23:
                   super(23);
                   return;
                 case 24:
                   super(24);
                   return;
                 case 25:
                   super(25);
                   return;
                 case 26:
                   super(26);
                   return;
                 case 27:
                   super(27);
                   return;
                 case 28:
                   super(28);
                   return;
                 case 29:
                   super(29);
                   return;
                 default:
                   super(0);
                   return;
             }
          }else {
             super(8);
             return;
          }
       }else {
          super(p1);
          return;
       }
    }
    public static final InputStream b(String p0){
       String[] stringArray = new String[]{"getprop",p0};
       return Runtime.getRuntime().exec(stringArray).getInputStream();
    }
    public static xo5 c(mm2 p0){
       int i;
       mm2 c = p0.c;
       if ((i = xe7.F(aj0.b0(c))) < 16) {
          i = 16;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       Iterator iterator = c.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          co5.o(obj1, "property");
          linkedHashMa.put(dr0.d(obj1.b, obj1.a), obj);
       }
       return new xo5(p0, linkedHashMa);
    }
    public static String d(String p0,String p1){
       co5.o(p0, "componentId");
       co5.o(p1, "name");
       return p0+':'+p1;
    }
    public static ju1 e(int p0){
       ju1 w;
       if (p0 == 404) {
          w = ju1.w;
       }else if(p0 != 408 && p0 != 504){
          if (p0 >= 500) {
             w = ju1.v;
          }else if(p0 >= 400){
             w = ju1.t;
          }else {
             w = ju1.b;
          }
       }else {
          w = ju1.c;
       }
       return w;
    }
    public Object a(Object p0){
       switch (this.a){
           case 3:
             if ((p0 = jg5.a(p0.intValue())) == null) {
                p0 = jg5.b;
             }
             break;
           default:
             if ((p0 = lg5.a(p0.intValue())) == null) {
                p0 = lg5.b;
             }
             return p0;
       }
       return p0;
    }
    public Object k(){
       switch (this.a){
           case 0:
           default:
             return new ArrayList();
       }
       return new LinkedHashMap();
    }
}
