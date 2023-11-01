package p.ka3;
import com.android.installreferrer.api.InstallReferrerStateListener;
import io.reactivex.rxjava3.core.SingleEmitter;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.Object;
import p.la3;
import java.lang.String;
import p.hi6;
import java.lang.Throwable;
import p.tp2;

public final class ka3 implements InstallReferrerStateListener	// class@001bd6 from classes.dex
{
    public final SingleEmitter a;
    public final InstallReferrerClient b;

    public void ka3(SingleEmitter p0,InstallReferrerClient p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onInstallReferrerServiceDisconnected(){
       this.a.tryOnError(new la3("Install referrer service disconnected", 0));
    }
    public final void onInstallReferrerSetupFinished(int p0){
       ka3 ta = this.a;
       if (!p0) {
          ta.onSuccess(this.b);
       }else {
          ta.tryOnError(new la3(tp2.k("Install referrer error, ", p0), 0));
       }
       return;
    }
}
