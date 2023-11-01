package p.fu7;
import p.wx5;
import p.o2;
import p.tv7;
import java.lang.String;
import java.util.ArrayList;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import p.is7;
import java.util.List;

public final class fu7 extends o2 implements wx5	// class@001640 from classes.dex
{
    public final List a;
    public final String b;
    public static final Parcelable$Creator CREATOR;

    static {
       fu7.CREATOR = new tv7(5);
    }
    public void fu7(String p0,ArrayList p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final Status a(){
       if (this.b != null) {
          return Status.w;
       }
       return Status.A;
    }
    public final void writeToParcel(Parcel p0,int p1){
       fu7 ta;
       p1 = is7.F(p0, 0x4f45);
       if ((ta = this.a) == null) {
       }else {
          p0.writeStringList(ta);
          is7.J(p0, is7.F(p0, 1));
       }
       is7.C(p0, 2, this.b);
       is7.J(p0, p1);
       return;
    }
}
