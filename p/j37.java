package p.j37;
import android.text.TextWatcher;
import p.wz3;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.text.Editable;
import java.lang.CharSequence;
import p.i37;

public final class j37 extends wz3 implements TextWatcher	// class@001a5e from classes.dex
{
    public final int b;
    public final TextView c;
    public final Observer t;

    public void j37(TextView p0,Observer p1,int p2){
       this.b = p2;
       if (p2 != 1) {
          co5.q(p0, "view");
          co5.q(p1, "observer");
          super();
          this.c = p0;
          this.t = p1;
          return;
       }else {
          co5.q(p0, "view");
          co5.q(p1, "observer");
          super();
          this.c = p0;
          this.t = p1;
          return;
       }
    }
    public final void afterTextChanged(Editable p0){
       switch (this.b){
           case 0:
           default:
             co5.q(p0, "s");
             return;
       }
       co5.q(p0, "editable");
       return;
    }
    public final void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       switch (this.b){
           case 0:
           default:
             co5.q(p0, "s");
             return;
       }
       co5.q(p0, "s");
       return;
    }
    public final void f(){
       j37 tc = this.c;
       switch (this.b){
           case 0:
           default:
             tc.removeTextChangedListener(this);
             return;
       }
       tc.removeTextChangedListener(this);
       return;
    }
    public final void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       j37 tt = this.t;
       String str = "s";
       switch (this.b){
           case 0:
             co5.q(p0, str);
             if (!this.isDisposed()) {
                i37 v0 = new i37(this.c, p0, p1, p2, p3);
                tt.onNext(v0);
             }
             break;
           default:
             co5.q(p0, str);
             if (!this.isDisposed()) {
                tt.onNext(p0);
             }
             return;
       }
       return;
    }
}
