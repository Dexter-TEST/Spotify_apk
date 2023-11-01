package p.r70;
import p.iu2;
import p.ty0;
import java.lang.String;
import p.k23;
import p.tt2;
import p.ju2;
import p.ry2;
import p.fu2;
import p.su2;
import android.content.Context;
import p.vt;
import p.vv7;

public abstract class r70	// class@00248b from classes.dex
{
    public static final ju2 a;

    static {
       r70.a = ty0.k().o("download").j("lite:downloadToggle", "row").g();
    }
    public static ju2 a(String p0,tt2 p1){
       return ty0.k().o("play").n("primary_buttons").k(ry2.w).s(ty0.z().d(p0)).e("click", p1).g();
    }
    public static ju2 b(Context p0,vt p1){
       return r70.a(p0.getString(R.string.entity_accessory_button_shuffle_play), vv7.R(p1));
    }
    public static ju2 c(int p0,Context p1,String p2){
       return ty0.k().o(String.valueOf(p0)).n("primary_buttons").j("lite:grayPrimarySmallButton", "row").s(ty0.z().d(p1.getString(p0))).e("click", vv7.C(p2)).g();
    }
    public static ju2 d(int p0,Context p1,String p2){
       return ty0.k().o(String.valueOf(p0)).n("primary_buttons").j("lite:whitePrimaryButton", "row").s(ty0.z().d(p1.getString(p0))).e("click", vv7.C(p2)).g();
    }
}
