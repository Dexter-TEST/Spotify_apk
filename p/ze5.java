package p.ze5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ze5 extends Enum	// class@002edf from classes.dex
{
    public static final ze5 a;
    public static final ze5 b;
    public static final ze5 c;
    public static final ze5[] t;

    static {
       ze5 oze5 = new ze5("PLAY", 0);
       ze5.a = oze5;
       ze5 oze51 = new ze5("PAUSE", 1);
       ze5.b = oze51;
       ze5 oze52 = new ze5("RESUME", 2);
       ze5.c = oze52;
       ze5[] oze5Array = new ze5[]{oze5,oze51,oze52};
       ze5.t = oze5Array;
    }
    public void ze5(String p0,int p1){
       super(p0, p1);
    }
    public static ze5 valueOf(String p0){
       return Enum.valueOf(ze5.class, p0);
    }
    public static ze5[] values(){
       return ze5.t.clone();
    }
}
