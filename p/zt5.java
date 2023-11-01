package p.zt5;
import p.tb0;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import java.lang.Object;

public final class zt5 implements tb0	// class@002f62 from classes.dex
{
    public final Lifetime a;

    public void zt5(Lifetime p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       this.a.release();
    }
}
