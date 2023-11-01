package p.yi;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashSet;
import p.co5;
import java.lang.String;
import p.fs3;
import p.ns3;
import p.sz1;
import p.xi;
import java.util.ArrayList;
import java.util.List;

public abstract class yi	// class@002dc8 from classes.dex
{
    public static final HashSet a;
    public static final HashSet b;
    public static xi c;
    public static List d;
    public static int e;

    static {
       Integer[] integerArray = new Integer[]{Integer.valueOf(200),Integer.valueOf(202)};
       yi.a = co5.A(integerArray);
       integerArray = new Integer[]{Integer.valueOf(503),Integer.valueOf(504),Integer.valueOf(429)};
       yi.b = co5.A(integerArray);
    }
    public static final void a(String p0,String p1,String p2){
       co5.o(p1, "url");
       sz1.i(ns3.t);
       yi.c = new xi(p0, p1, p2);
       yi.d = new ArrayList();
    }
    public static List b(){
       List d;
       if ((d = yi.d) != null) {
          return d;
       }
       co5.N("transformedEvents");
       throw null;
    }
}
