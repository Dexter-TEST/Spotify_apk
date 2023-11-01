package p.eu1;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Iterator;
import p.ki;

public final class eu1	// class@0014fa from classes.dex
{
    public static final eu1 a;
    public static boolean b;
    public static final ArrayList c;
    public static final HashSet d;

    static {
       eu1.a = new eu1();
       eu1.c = new ArrayList();
       eu1.d = new HashSet();
    }
    public void eu1(){
       super();
    }
    public static final void a(ArrayList p0){
       co5.o(p0, "events");
       if (!eu1.b) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if (eu1.d.contains(iterator.next().t)) {
             iterator.remove();
          }
       }
       return;
    }
}
