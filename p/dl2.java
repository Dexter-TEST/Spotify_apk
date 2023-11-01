package p.dl2;
import p.m01;
import java.lang.Object;
import com.google.android.gms.auth.api.credentials.Credential;
import p.a28;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.vo;
import p.fl2;
import p.w51;
import p.fv7;
import p.pt7;
import p.o2;
import p.jv7;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.oi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import android.app.PendingIntent;

public final class dl2	// class@00136a from classes.dex
{
    public final m01 a;

    public void dl2(m01 p0){
       this.a = p0;
    }
    public final a28 a(Credential p0){
       co5.o(p0, "credential");
       dl2 ta = this.a;
       ta.getClass();
       vo.c.getClass();
       fl2 h = ta.h;
       w51.l(h, "client must not be null");
       fv7 uofv7 = new fv7(h, p0, 1);
       h.b.d(1, uofv7);
       a28 uoa28 = oi.m(uofv7);
       co5.l(uoa28, "client.delete\(credential\)");
       return uoa28;
    }
    public final PendingIntent b(HintRequest p0){
       PendingIntent pendingInten = this.a.e(p0);
       co5.l(pendingInten, "client.getHintPickerIntent\(request\)");
       return pendingInten;
    }
}
