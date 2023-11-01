package p.a96;
import p.k93;
import android.widget.SeekBar;
import com.spotify.litecomponents.widgets.view.LiteSearchView;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.b96;
import androidx.appcompat.widget.SearchView;
import java.lang.CharSequence;
import p.q96;
import android.widget.ProgressBar;
import io.reactivex.rxjava3.core.Observer;
import p.tu6;
import p.z86;
import io.reactivex.rxjava3.disposables.Disposable;
import p.n86;
import p.p96;
import android.widget.SeekBar$OnSeekBarChangeListener;

public final class a96 extends k93	// class@000f3d from classes.dex
{
    public final int a;
    public final View b;

    public void a96(SeekBar p0){
       this.a = 1;
       super();
       this.b = p0;
    }
    public void a96(LiteSearchView p0){
       this.a = 0;
       co5.q(p0, "view");
       super();
       this.b = p0;
    }
    public final Object a(){
       a96 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new q96(tb, tb.getProgress(), false);
       }
       CharSequence query = tb.getQuery();
       co5.h(query, "view.query");
       return new b96(tb, query, false);
    }
    public final void b(Observer p0){
       a96 tb = this.b;
       switch (this.a){
           case 0:
             co5.q(p0, "observer");
             if (tu6.i(p0)) {
                z86 oz86 = new z86(tb, p0);
                p0.onSubscribe(oz86);
                tb.setOnQueryTextListener(oz86);
             }
             break;
           default:
             co5.q(p0, "observer");
             if (tu6.i(p0)) {
                p96 op96 = new p96(tb, p0);
                tb.setOnSeekBarChangeListener(op96);
                p0.onSubscribe(op96);
             }
             return;
       }
       return;
    }
}
