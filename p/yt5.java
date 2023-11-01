package p.yt5;
import android.os.Binder;
import p.az5;
import p.ix0;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;

public abstract class yt5 extends Binder	// class@002e24 from classes.dex
{
    public final Router a;
    public boolean b;
    public static final fv1 c;

    static {
       az5 uoaz5 = new az5();
       yt5.c = ix0.a;
    }
    public void yt5(NativeRouter p0){
       super();
       this.a = p0;
    }
    public abstract Lifetime a(Request p0,ResolveCallback p1);
}
