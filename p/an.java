package p.an;
import p.xl;
import p.v55;
import p.x55;
import p.cm;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.Object;
import p.qq5;
import java.util.HashSet;
import p.zh0;
import p.b90;
import io.reactivex.rxjava3.core.ObservableTransformer;

public class an extends xl	// class@000fbc from classes.dex
{
    public static final int G;

    public void an(){
       super();
    }
    public final v55 h(){
       return x55.C;
    }
    public final Observable u(cm p0,String p1){
       p0.getClass();
       return p0.g(new zh0(p0, 4, p1)).compose(new qq5(this.requireContext().getString(R.string.assisted_curation_card_title_suggested_songs), p0.t)).compose(p0.y);
    }
}
