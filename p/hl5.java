package p.hl5;
import p.yf2;
import java.lang.Object;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.productstate.ProductStateUtil;
import java.lang.Boolean;
import java.util.Map;
import com.spotify.connectivity.sessionstate.SessionState;
import p.r45;
import java.lang.String;

public final class hl5 implements yf2	// class@001876 from classes.dex
{
    public final int a;

    public void hl5(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             return Boolean.valueOf(p0.loggedIn());
           case 1:
             return Boolean.valueOf(ProductStateUtil.onDemandEnabled(p0));
           case 2:
             return Boolean.valueOf(ProductStateUtil.onDemandEnabled(p0));
           default:
             return p0.b();
       }
    }
}
