package p.qu2;
import p.xy;
import java.lang.Object;
import p.ru2;
import p.ju2;
import java.lang.String;
import p.fu2;
import java.lang.Class;
import p.io3;
import p.pu2;

public final class qu2	// class@002416 from classes.dex
{
    private static final ru2 DUMMY;

    static {
       qu2.DUMMY = new xy();
    }
    private void qu2(){
       super();
    }
    public static int a(ru2 p0,ru2 p1,ju2 p2){
       return qu2.lambda$withFallback$1(p0, p1, p2);
    }
    public static int b(ju2 p0){
       return qu2.lambda$static$0(p0);
    }
    public static int c(String p0,int p1,ju2 p2){
       return qu2.lambda$single$2(p0, p1, p2);
    }
    public static ru2 dummy(){
       return qu2.DUMMY;
    }
    private static int lambda$single$2(String p0,int p1,ju2 p2){
       if (p2.q().c().equals(p0)) {
          return p1;
       }
       return 0;
    }
    private static int lambda$static$0(ju2 p0){
       return 0;
    }
    private static int lambda$withFallback$1(ru2 p0,ru2 p1,ju2 p2){
       int i;
       if (!(i = p0.e(p2))) {
          i = p1.e(p2);
       }
       return i;
    }
    public static ru2 single(String p0,int p1){
       p0.getClass();
       return new io3(p0, p1, 1);
    }
    public static ru2 withFallback(ru2 p0,ru2 p1){
       p0.getClass();
       p1.getClass();
       ru2 dUMMY = qu2.DUMMY;
       if (p0 == dUMMY) {
          return p1;
       }
       if (p1 == dUMMY) {
          return p0;
       }
       return new pu2(p0, p1);
    }
}
