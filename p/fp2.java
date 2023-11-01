package p.fp2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class fp2 extends Enum	// class@00160f from classes.dex
{
    public final boolean a;
    public final boolean b;
    public static final fp2 c;
    public static final fp2 t;
    public static final fp2 v;
    public static final fp2[] w;

    static {
       fp2 uofp2 = new fp2("COLOR_ONLY", 0, 0, true);
       fp2.c = uofp2;
       fp2 uofp21 = new fp2("IMAGE_ONLY", true, true, 0);
       fp2.t = uofp21;
       fp2 uofp22 = new fp2("IMAGE_AND_COLOR", 2, true, true);
       fp2.v = uofp22;
       fp2[] uofp2Array = new fp2[]{uofp2,uofp21,uofp22};
       fp2.w = uofp2Array;
    }
    public void fp2(String p0,int p1,boolean p2,boolean p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static fp2 valueOf(String p0){
       return Enum.valueOf(fp2.class, p0);
    }
    public static fp2[] values(){
       return fp2.w.clone();
    }
}
