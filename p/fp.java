package p.fp;
import java.lang.String;
import p.rn6;

public interface abstract fp	// class@001615 from classes.dex
{
    public static final rn6 a;
    public static final rn6 b;
    public static final rn6 c;

    static {
       fp.a = rn6.a("api_access_token");
       fp.b = rn6.a("api_user_name");
       fp.c = rn6.a("api_refresh_token");
    }
}
