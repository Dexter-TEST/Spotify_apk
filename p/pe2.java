package p.pe2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class pe2 extends Enum	// class@002245 from classes.dex
{
    public static final pe2 a;
    public static final pe2 b;
    public static final pe2 c;
    public static final pe2 t;
    public static final pe2 v;
    public static final pe2 w;
    public static final pe2 x;
    public static final pe2 y;
    public static final pe2[] z;

    static {
       pe2 ope2 = new pe2("PENALTY_LOG", 0);
       pe2.a = ope2;
       pe2 ope21 = new pe2("PENALTY_DEATH", 1);
       pe2.b = ope21;
       pe2 ope22 = new pe2("DETECT_FRAGMENT_REUSE", 2);
       pe2.c = ope22;
       pe2 ope23 = new pe2("DETECT_FRAGMENT_TAG_USAGE", 3);
       pe2.t = ope23;
       pe2 ope24 = new pe2("DETECT_RETAIN_INSTANCE_USAGE", 4);
       pe2.v = ope24;
       pe2 ope25 = new pe2("DETECT_SET_USER_VISIBLE_HINT", 5);
       pe2.w = ope25;
       pe2 ope26 = new pe2("DETECT_TARGET_FRAGMENT_USAGE", 6);
       pe2.x = ope26;
       pe2 ope27 = new pe2("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
       pe2.y = ope27;
       pe2[] ope2Array = new pe2[]{ope2,ope21,ope22,ope23,ope24,ope25,ope26,ope27};
       pe2.z = ope2Array;
    }
    public void pe2(String p0,int p1){
       super(p0, p1);
    }
    public static pe2 valueOf(String p0){
       return Enum.valueOf(pe2.class, p0);
    }
    public static pe2[] values(){
       return pe2.z.clone();
    }
}
