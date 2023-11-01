package p.qd5;
import android.view.View$OnClickListener;
import p.hr0;
import java.lang.Object;
import android.view.View;
import com.spotify.signup.signup.view.BirthdayView;
import p.n10;
import p.ik5;
import p.xj5;
import p.ck5;
import p.vb5;
import p.rg6;

public final class qd5 implements View$OnClickListener	// class@00237e from classes.dex
{
    public final int a;
    public final hr0 b;

    public void qd5(hr0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       qd5 tb = this.b;
       switch (this.a){
           case 0:
             tb.accept(new vb5());
             return;
           case 1:
             tb.accept(new ck5());
             return;
           case 2:
             tb.accept(new xj5());
             return;
           case 3:
             tb.accept(new n10());
             return;
           default:
             tb.accept(new rg6());
             return;
       }
    }
}
