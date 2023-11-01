package p.g7;
import p.c7;
import androidx.activity.a;
import java.lang.Object;
import android.content.Intent;
import p.lb3;
import java.lang.String;
import p.co5;
import android.os.Parcelable;
import p.y6;

public final class g7 extends c7	// class@0016b7 from classes.dex
{

    public void g7(){
       super();
    }
    public final Intent a(a p0,Object p1){
       co5.o(p0, "context");
       co5.o(p1, "input");
       Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", p1);
       co5.l(intent, "Intent\(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input\)");
       return intent;
    }
    public final Object c(Intent p0,int p1){
       return new y6(p0, p1);
    }
}
