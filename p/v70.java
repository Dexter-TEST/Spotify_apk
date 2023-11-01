package p.v70;
import com.spotify.cosmos.cosmonaut.Converter$Factory;
import p.u70;
import java.lang.Object;
import com.spotify.cosmos.cosmonaut.Converter;

public final class v70 implements Converter$Factory	// class@002994 from classes.dex
{
    public static final u70 a;

    static {
       v70.a = new u70(0);
    }
    public void v70(){
       super();
    }
    public final Converter createRequestConverter(){
       return v70.a;
    }
    public final Converter createResponseConverter(){
       return v70.a;
    }
}
