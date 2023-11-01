package p.k84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class k84 extends Enum implements tb3	// class@001bc5 from classes.dex
{
    public final int a;
    public static final k84 b;
    public static final k84 c;
    public static final k84[] t;

    static {
       k84 ok84 = new k84("P", 0, 0);
       k84.b = ok84;
       k84 ok841 = new k84("C", 1, 1);
       k84.c = ok841;
       k84[] ok84Array = new k84[]{ok84,ok841};
       k84.t = ok84Array;
    }
    public void k84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static k84 valueOf(String p0){
       return Enum.valueOf(k84.class, p0);
    }
    public static k84[] values(){
       return k84.t.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
