package p.vi4;
import android.app.usage.NetworkStatsManager$UsageCallback;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.String;
import java.lang.Object;

public final class vi4 extends NetworkStatsManager$UsageCallback	// class@0029ff from classes.dex
{
    public final ObservableEmitter a;

    public void vi4(ObservableEmitter p0){
       this.a = p0;
       super();
    }
    public final void onThresholdReached(int p0,String p1){
       this.a.onNext(this);
    }
}
