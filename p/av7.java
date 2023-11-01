package p.av7;
import p.mn;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

public final class av7 extends mn	// class@001000 from classes.dex
{
    public final Semaphore j;
    public final Set k;

    public void av7(SignInHubActivity p0,Set p1){
       super(p0);
       this.j = new Semaphore(0);
       this.k = p1;
    }
}
