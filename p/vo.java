package p.vo;
import p.dt3;
import p.sv7;
import p.ko1;
import java.lang.String;

public abstract class vo	// class@002a39 from classes.dex
{
    public static final ko1 a;
    public static final ko1 b;
    public static final dt3 c;

    static {
       vo.a = new ko1("Auth.CREDENTIALS_API", new sv7(1), new dt3());
       vo.b = new ko1("Auth.GOOGLE_SIGN_IN_API", new sv7(2), new dt3());
       vo.c = new dt3(27);
    }
}
