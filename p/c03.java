package p.c03;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.gz2;
import p.hz2;
import p.iz2;
import p.jz2;
import p.kz2;
import p.lz2;
import p.mz2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.bu2;

public abstract class c03 extends Enum implements fu2, ru2	// class@00116d from classes.dex
{
    public final String a;
    public static final gz2 b;
    public static final jz2 c;
    public static final kz2 t;
    public static final lz2 v;
    public static final c03[] w;

    static {
       gz2 ogz2 = new gz2();
       c03.b = ogz2;
       jz2 ojz2 = new jz2();
       c03.c = ojz2;
       kz2 okz2 = new kz2();
       c03.t = okz2;
       lz2 olz2 = new lz2();
       c03.v = olz2;
       c03[] uoc03Array = new c03[]{ogz2,new hz2(),new iz2(),ojz2,okz2,olz2,new mz2()};
       c03.w = uoc03Array;
    }
    public void c03(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static c03 valueOf(String p0){
       return Enum.valueOf(c03.class, p0);
    }
    public static c03[] values(){
       return c03.w.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return bu2.t.a;
    }
    public final String toString(){
       return this.a;
    }
}
