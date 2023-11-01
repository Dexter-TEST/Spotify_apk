package p.bu2;
import java.lang.Enum;
import java.lang.String;
import java.util.Locale;
import java.lang.Class;
import java.lang.Object;

public final class bu2 extends Enum	// class@001137 from classes.dex
{
    public final String a;
    public static final bu2 b;
    public static final bu2 c;
    public static final bu2 t;
    public static final bu2 v;
    public static final bu2 w;
    public static final bu2[] x;

    static {
       bu2 uobu2 = new bu2("CARD", 0);
       bu2.b = uobu2;
       bu2 uobu21 = new bu2("HEADER", 1);
       bu2.c = uobu21;
       bu2 uobu22 = new bu2("ROW", 2);
       bu2.t = uobu22;
       bu2 uobu23 = new bu2("SECTION_HEADER", 3);
       bu2.v = uobu23;
       bu2 uobu24 = new bu2("SPINNER", 4);
       bu2.w = uobu24;
       bu2[] uobu2Array = new bu2[]{uobu2,uobu21,uobu22,uobu23,uobu24};
       bu2.x = uobu2Array;
    }
    public void bu2(String p0,int p1){
       super(p0, p1);
       this.a = this.name().toLowerCase(Locale.US);
    }
    public static bu2 valueOf(String p0){
       return Enum.valueOf(bu2.class, p0);
    }
    public static bu2[] values(){
       return bu2.x.clone();
    }
}
