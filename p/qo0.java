package p.qo0;
import android.content.DialogInterface$OnClickListener;
import p.so0;
import java.lang.Object;
import android.content.DialogInterface;
import p.ro0;

public final class qo0 implements DialogInterface$OnClickListener	// class@0023df from classes.dex
{
    public final so0 a;
    public final int b;

    public void qo0(so0 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       this.a.H.s(this.b);
    }
}
