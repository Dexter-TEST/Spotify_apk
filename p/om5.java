package p.om5;
import com.spotify.cosmos.cosmonaut.Converter$Factory;
import p.az5;
import java.lang.Object;
import com.spotify.cosmos.cosmonaut.Converter;
import p.u70;

public final class om5 implements Converter$Factory	// class@00214d from classes.dex
{

    static {
       az5 uoaz5 = new az5();
    }
    public void om5(){
       super();
    }
    public final Converter createRequestConverter(){
       return new u70(1);
    }
    public final Converter createResponseConverter(){
       return new u70(2);
    }
}
