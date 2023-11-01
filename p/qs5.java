package p.qs5;
import java.lang.Class;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import com.spotify.cosmos.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.cosmonaut.annotations.PUT;
import java.lang.Object;
import java.util.Set;
import p.co5;

public abstract class qs5	// class@002407 from classes.dex
{
    public static final Set a;

    static {
       Class[] uClassArray = new Class[]{GET.class,POST.class,SUB.class,DELETE.class,PUT.class};
       qs5.a = co5.I(uClassArray);
    }
}
