package p.ud5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ud5 extends Enum	// class@00288e from classes.dex
{
    public final int a;
    public static final ud5 b;
    public static final ud5 c;
    public static final ud5 t;
    public static final ud5[] v;

    static {
       ud5 oud5 = new ud5("MEMORY", 0, -16711936);
       ud5.b = oud5;
       ud5 oud51 = new ud5("DISK", 1, -16776961);
       ud5.c = oud51;
       ud5 oud52 = new ud5("NETWORK", 2, 0xffff0000);
       ud5.t = oud52;
       ud5[] oud5Array = new ud5[]{oud5,oud51,oud52};
       ud5.v = oud5Array;
    }
    public void ud5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static ud5 valueOf(String p0){
       return Enum.valueOf(ud5.class, p0);
    }
    public static ud5[] values(){
       return ud5.v.clone();
    }
}
