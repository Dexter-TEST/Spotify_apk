package p.ic4;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;
import p.cd2;

public final class ic4 extends Enum	// class@001968 from classes.dex
{
    public static final ic4 a;
    public static final ic4 b;
    public static final ic4[] c;

    static {
       ic4 oic4 = new ic4("MTML_INTEGRITY_DETECT", 0);
       ic4.a = oic4;
       ic4 oic41 = new ic4("MTML_APP_EVENT_PREDICTION", 1);
       ic4.b = oic41;
       ic4[] oic4Array = new ic4[]{oic4,oic41};
       ic4.c = oic4Array;
    }
    public void ic4(String p0,int p1){
       super(p0, p1);
    }
    public static ic4 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(ic4.class, p0);
    }
    public static ic4[] values(){
       return Arrays.copyOf(ic4.c, 2);
    }
    public final String a(){
       int i;
       String str;
       if (i = this.ordinal()) {
          if (i == 1) {
             str = "app_event_pred";
          }else {
             throw new cd2(10);
          }
       }else {
          str = "integrity_detect";
       }
       return str;
    }
    public final String b(){
       int i;
       String str;
       if (i = this.ordinal()) {
          if (i == 1) {
             str = "MTML_APP_EVENT_PRED";
          }else {
             throw new cd2(10);
          }
       }else {
          str = "MTML_INTEGRITY_DETECT";
       }
       return str;
    }
}
