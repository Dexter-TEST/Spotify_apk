package p.ev0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ev0 extends Enum	// class@001502 from classes.dex
{
    public final String a;
    public static final ev0 b;
    public static final ev0[] c;

    static {
       ev0 uoev0 = new ev0("LIMITED_JNI_SPOTIFY", 0, "limited-jni-spotify");
       ev0.b = uoev0;
       ev0[] uoev0Array = new ev0[]{uoev0,new ev0("ORBIT_JNI_SPOTIFY", 1, "orbit-jni-spotify")};
       ev0.c = uoev0Array;
    }
    public void ev0(String p0,int p1,String p2){
       this.a = p2;
    }
    public static ev0 valueOf(String p0){
       return Enum.valueOf(ev0.class, p0);
    }
    public static ev0[] values(){
       return ev0.c.clone();
    }
}
