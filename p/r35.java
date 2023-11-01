package p.r35;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import android.content.ClipboardManager;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Object;
import android.content.ClipData;
import p.r45;

public final class r35 implements ClipboardManager$OnPrimaryClipChangedListener	// class@00246c from classes.dex
{
    public final ClipboardManager a;
    public final ObservableEmitter b;

    public void r35(ClipboardManager p0,ObservableEmitter p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onPrimaryClipChanged(){
       r35 ta = this.a;
       ClipData primaryClip = (ta.hasPrimaryClip())? ta.getPrimaryClip(): null;
       this.b.onNext(r45.a(primaryClip));
       return;
    }
}
