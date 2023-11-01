package p.mu6;
import p.ce3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class mu6 extends Enum implements ce3	// class@001f0b from classes.dex
{
    public final int a;
    public static final mu6 b;
    public static final mu6[] c;

    static {
       mu6 omu6 = new mu6(2, "UNTYPED_SCALARS");
       mu6.b = omu6;
       mu6[] omu6Array = new mu6[]{new mu6(0, "DUPLICATE_PROPERTIES"),new mu6(1, "SCALARS_AS_OBJECTS"),omu6};
       mu6.c = omu6Array;
    }
    public void mu6(int p0,String p1){
       super(p1, p0);
       this.a = 1 << this.ordinal();
    }
    public static mu6 valueOf(String p0){
       return Enum.valueOf(mu6.class, p0);
    }
    public static mu6[] values(){
       return mu6.c.clone();
    }
    public final boolean a(){
       return false;
    }
    public final int b(){
       return this.a;
    }
}
