package p.cj;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class cj extends Enum	// class@00121f from classes.dex
{
    public static final cj a;
    public static final cj b;
    public static final cj[] c;

    static {
       cj uocj = new cj("MOBILE_INSTALL_EVENT", 0);
       cj.a = uocj;
       cj uocj1 = new cj("CUSTOM_APP_EVENTS", 1);
       cj.b = uocj1;
       cj[] uocjArray = new cj[]{uocj,uocj1};
       cj.c = uocjArray;
    }
    public void cj(String p0,int p1){
       super(p0, p1);
    }
    public static cj valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(cj.class, p0);
    }
    public static cj[] values(){
       return Arrays.copyOf(cj.c, 2);
    }
}
