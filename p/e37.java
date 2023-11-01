package p.e37;
import android.widget.TextView$OnEditorActionListener;
import p.wz3;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Observer;
import p.zf2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.KeyEvent;
import p.d37;
import java.lang.Boolean;
import java.lang.Throwable;

public final class e37 extends wz3 implements TextView$OnEditorActionListener	// class@001412 from classes.dex
{
    public final TextView b;
    public final Observer c;
    public final zf2 t;

    public void e37(TextView p0,Observer p1,zf2 p2){
       co5.q(p0, "view");
       co5.q(p1, "observer");
       co5.q(p2, "handled");
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public final void f(){
       this.b.setOnEditorActionListener(null);
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       e37 tc = this.c;
       co5.q(p0, "textView");
       e37 tb = this.b;
       try{
          d37 uod37 = new d37(tb, p1, p2);
          if (!this.isDisposed() && this.t.invoke(uod37).booleanValue()) {
             tc.onNext(uod37);
             return true;
          }
       }catch(java.lang.Exception e3){
          tc.onError(e3);
          this.dispose();
       }
       return false;
    }
}
