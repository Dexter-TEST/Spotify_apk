package p.jl6;
import java.lang.String;
import p.ju2;
import java.lang.Object;
import p.ys5;
import com.google.common.collect.c;
import p.w51;
import p.iu2;
import p.ty0;
import p.bu2;
import p.k23;
import android.content.Context;
import p.su2;

public abstract class jl6	// class@001afe from classes.dex
{
    public static final ys5 a;
    public static final ys5 b;
    public static final ys5 c;
    public static final ju2 d;

    static {
       jl6.a = c.r(jl6.a("0", "skeleton:trackCloud"));
       Object[] objArray = new Object[]{jl6.a("0", "skeleton:trackRow"),jl6.a("1", "skeleton:trackRow"),jl6.a("2", "skeleton:trackRow"),jl6.a("3", "skeleton:trackRow"),jl6.a("4", "skeleton:trackRow")};
       w51.e(5, objArray);
       jl6.b = c.m(5, objArray);
       jl6.c = c.s(jl6.a("0", "skeleton:"), jl6.a("1", "skeleton:"), jl6.a("2", "skeleton:"), jl6.a("3", "skeleton:"));
       jl6.d = ty0.k().o("0").n("primary_buttons").j("skeleton:primaryButton", bu2.t.a).g();
    }
    public static ju2 a(String p0,String p1){
       return ty0.k().o(p0).j(p1, bu2.t.a).g();
    }
    public static ju2 b(Context p0){
       return jl6.d.a().s(ty0.z().d(p0.getString(R.string.entity_accessory_button_shuffle_play))).g();
    }
}
