package p.fa1;
import p.mu3;
import p.mj7;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ht3;
import p.et3;
import androidx.fragment.app.k;
import android.app.Activity;
import p.ea1;
import p.ae2;
import androidx.fragment.app.o;
import androidx.fragment.app.f;

public final class fa1 extends mu3	// class@00158a from classes.dex
{
    public final String c;
    public static final Parcelable$Creator CREATOR;
    public static final mj7 t;
    public static ScheduledThreadPoolExecutor v;

    static {
       fa1.t = new mj7(25, 0);
       fa1.CREATOR = new g44(29);
    }
    public void fa1(Parcel p0){
       co5.o(p0, "parcel");
       super(p0);
       this.c = "device_auth";
    }
    public void fa1(ht3 p0){
       super(p0);
       this.c = "device_auth";
    }
    public final int C(et3 p0){
       k ok;
       if ((ok = this.d().e()) != null && !ok.isFinishing()) {
          ea1 uoea1 = new ea1();
          uoea1.B(ok.y(), "login_with_facebook");
          uoea1.L(p0);
       }
       return 1;
    }
    public final int describeContents(){
       return 0;
    }
    public final String e(){
       return this.c;
    }
}
