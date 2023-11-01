package p.vg4;
import p.pg4;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;

public abstract class vg4	// class@0029ed from classes.dex
{
    public final boolean a;
    public static final pg4 b;
    public static final pg4 c;
    public static final pg4 d;
    public static final pg4 e;
    public static final pg4 f;
    public static final pg4 g;
    public static final pg4 h;
    public static final pg4 i;
    public static final pg4 j;
    public static final pg4 k;
    public static final pg4 l;

    static {
       vg4.b = new pg4(5, 0);
       vg4.c = new pg4(8, 0);
       vg4.d = new pg4(4);
       vg4.e = new pg4(7, 0);
       vg4.f = new pg4(6);
       vg4.g = new pg4(3, 0);
       vg4.h = new pg4(2);
       vg4.i = new pg4(1, 0);
       vg4.j = new pg4(0);
       vg4.k = new pg4(10);
       vg4.l = new pg4(9);
    }
    public void vg4(boolean p0){
       super();
       this.a = p0;
    }
    public abstract Object a(Bundle p0,String p1);
    public abstract String b();
    public abstract Object c(String p0);
    public abstract void d(Bundle p0,String p1,Object p2);
    public final String toString(){
       return this.b();
    }
}
