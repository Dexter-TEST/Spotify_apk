package p.rx1;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import com.spotify.litesettings.settings.OfflineSettingsActivity;
import p.yq5;
import com.spotify.litesettings.settings.ExplicitContentSettingsActivity;
import com.spotify.litesettings.settings.PrivateSettingsActivity;

public final class rx1 implements Runnable	// class@002575 from classes.dex
{
    public final int a;
    public final RecyclerView b;

    public void rx1(RecyclerView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       yq5 adapter;
       rx1 tb = this.b;
       switch (this.a){
           case 0:
             if ((adapter = tb.getAdapter()) != null) {
                adapter.g();
             }
             break;
           case 1:
             if ((adapter = tb.getAdapter()) != null) {
                adapter.g();
             }
             return;
             break;
           default:
             if ((adapter = tb.getAdapter()) != null) {
                adapter.g();
             }
             return;
       }
       return;
    }
}
