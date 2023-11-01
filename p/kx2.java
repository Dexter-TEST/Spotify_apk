package p.kx2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.zw2;
import p.bu2;
import p.ax2;
import p.bx2;
import p.cx2;
import p.dx2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class kx2 extends Enum implements fu2, ru2	// class@001c9d from classes.dex
{
    public final String a;
    public final String b;
    public static final kx2[] c;

    static {
       bu2 v = bu2.v;
       zw2 ozw2 = new zw2(v);
       ax2 uoax2 = new ax2(v);
       bx2 uobx2 = new bx2(v);
       cx2 uocx2 = new cx2(v);
       dx2 uodx2 = new dx2(v);
       kx2[] okx2Array = new kx2[]{ozw2,uoax2,uobx2,uocx2,uodx2};
       kx2.c = okx2Array;
    }
    public void kx2(String p0,int p1,String p2,bu2 p3){
       super(p0, p1);
       this.a = p2;
       p3.getClass();
       this.b = p3.a;
    }
    public static kx2 valueOf(String p0){
       return Enum.valueOf(kx2.class, p0);
    }
    public static kx2[] values(){
       return kx2.c.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return this.b;
    }
}
