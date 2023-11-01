package p.t37;
import p.ge6;
import java.util.ArrayList;
import java.lang.ThreadLocal;
import java.lang.Object;

public abstract class t37	// class@00033e from classes2.dex
{
    public static ge6[] a;
    public static final ge6 b;

    static {
       ge6[] oge6Array = new ge6[0];
       ArrayList uArrayList = new ArrayList();
       t37.a = oge6Array;
       t37.b = new ge6(4);
    }
    public static ge6 a(){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].a.set("RCS");
       }
       return t37.b;
    }
}
