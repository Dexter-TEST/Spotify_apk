package p.ww2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.ow2;
import p.bu2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class ww2 extends Enum implements fu2, ru2	// class@002bbb from classes.dex
{
    public final String a;
    public final String b;
    public static final ww2[] c;

    static {
       ww2[] oww2Array = new ww2[]{new ow2(bu2.v)};
       ww2.c = oww2Array;
    }
    public void ww2(bu2 p0){
       super("SECTION_HEADER", 0);
       this.a = "glue2:sectionHeader";
       p0.getClass();
       this.b = p0.a;
    }
    public static ww2 valueOf(String p0){
       return Enum.valueOf(ww2.class, p0);
    }
    public static ww2[] values(){
       return ww2.c.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return this.b;
    }
}
