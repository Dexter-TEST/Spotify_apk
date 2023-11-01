package p.e13;
import android.database.Observable;
import java.util.ArrayList;
import java.lang.Object;
import p.s33;
import com.spotify.hubs.liteintegration.HubsView;

public final class e13 extends Observable	// class@0013fa from classes.dex
{

    public void e13(){
       super();
    }
    public final void a(){
       for (int i = this.mObservers.size() - 1; i >= 0; i = i - 1) {
          HubsView.a(this.mObservers.get(i).a);
       }
       return;
    }
}
