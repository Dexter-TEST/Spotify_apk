package p.hl7;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import p.il7;
import java.lang.Object;
import io.reactivex.rxjava3.core.FlowableEmitter;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.ss2;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnScrollChangedListener;

public final class hl7 implements FlowableOnSubscribe	// class@001878 from classes.dex
{
    public final il7 a;

    public void hl7(il7 p0){
       this.a = p0;
       super();
    }
    public final void subscribe(FlowableEmitter p0){
       co5.l(p0, "visibilityEmitter");
       hl7 ta = this.a;
       ta.getClass();
       ta.c = new ss2(ta, p0);
       ta.a.getViewTreeObserver().addOnScrollChangedListener(ta.c);
    }
}
