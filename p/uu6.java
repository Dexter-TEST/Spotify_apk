package p.uu6;
import com.spotify.cosmos.cosmonaut.Converter$Factory;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import com.spotify.cosmos.cosmonaut.Converter;
import p.u70;

public final class uu6 implements Converter$Factory	// class@002924 from classes.dex
{
    public static final Charset a;

    static {
       uu6.a = Charset.forName("UTF-8");
    }
    public void uu6(){
       super();
    }
    public final Converter createRequestConverter(){
       return new u70(3);
    }
    public final Converter createResponseConverter(){
       return new u70(4);
    }
}
