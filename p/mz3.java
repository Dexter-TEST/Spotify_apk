package p.mz3;
import p.yf2;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import java.lang.Object;
import java.lang.Long;
import p.b7;
import androidx.fragment.app.o;
import p.lx3;
import java.lang.String;
import java.lang.Class;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import p.p82;
import io.reactivex.rxjava3.core.Flowable;
import p.co5;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import p.l72;

public final class mz3 implements yf2	// class@001f35 from classes.dex
{
    public final int a;
    public final LyricsWidgetPresenter b;

    public void mz3(LyricsWidgetPresenter p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       mz3 tb = this.b;
       switch (this.a){
           case 0:
             b = (tb.b.b.D(lx3.class.getSimpleName()) != null)? true: false;
             break;
           default:
             co5.l(p0, "loggabilityConditionsMet");
             p0 = (p0.booleanValue())? tb.I.toFlowable(BackpressureStrategy.a): l72.b;
             return p0;
       }
       return Flowable.o(Boolean.valueOf(b));
    }
}
