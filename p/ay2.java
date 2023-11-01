package p.ay2;
import p.fu2;
import p.ru2;
import java.lang.Enum;
import p.rx2;
import p.sx2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.bu2;

public abstract class ay2 extends Enum implements fu2, ru2	// class@001016 from classes.dex
{
    public final String a;
    public static final rx2 b;
    public static final sx2 c;
    public static final ay2[] t;

    static {
       rx2 orx2 = new rx2();
       ay2.b = orx2;
       sx2 osx2 = new sx2();
       ay2.c = osx2;
       ay2[] uoay2Array = new ay2[]{orx2,osx2};
       ay2.t = uoay2Array;
    }
    public void ay2(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static ay2 valueOf(String p0){
       return Enum.valueOf(ay2.class, p0);
    }
    public static ay2[] values(){
       return ay2.t.clone();
    }
    public final String c(){
       return this.a;
    }
    public final String d(){
       return bu2.b.a;
    }
    public final String toString(){
       return this.a;
    }
}
