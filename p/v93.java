package p.v93;
import p.w93;
import android.net.Uri;
import android.content.ClipDescription;
import java.lang.Object;
import android.view.inputmethod.InputContentInfo;
import p.sg1;

public final class v93 implements w93	// class@0029a9 from classes.dex
{
    public final InputContentInfo a;

    public void v93(Uri p0,ClipDescription p1,Uri p2){
       super();
       this.a = new InputContentInfo(p0, p1, p2);
    }
    public void v93(Object p0){
       super();
       this.a = p0;
    }
    public final ClipDescription a(){
       return sg1.a(this.a);
    }
    public final Object d(){
       return this.a;
    }
    public final Uri e(){
       return sg1.f(this.a);
    }
    public final void f(){
       sg1.d(this.a);
    }
    public final Uri h(){
       return sg1.b(this.a);
    }
}
