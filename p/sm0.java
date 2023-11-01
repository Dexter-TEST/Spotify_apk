package p.sm0;
import p.qm0;
import java.lang.String;
import android.view.View;
import io.reactivex.rxjava3.core.Observer;
import p.xz5;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.qz5;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import p.qx1;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Arrays;

public final class sm0 extends qm0	// class@002655 from classes.dex
{
    public final boolean f;

    public void sm0(long p0,int p1,String p2,String p3,boolean p4){
       super(p1, p0, p2);
       this.e = p3;
       this.f = p4;
    }
    public final boolean a(View p0,Observer p1){
       SwitchCompat switchCompat = eo5.M(p0, xz5.class).h();
       switchCompat.setOnCheckedChangeListener(null);
       sm0 tf = this.f;
       if (switchCompat.isChecked() != tf) {
          switchCompat.setChecked(tf);
       }
       if (p1 != null) {
          switchCompat.setOnCheckedChangeListener(new qx1(this, 3, p1));
       }
       return true;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof sm0 && (super.equals(p0) && this.f == p0.f)) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(super.hashCode()),Boolean.valueOf(this.f)};
       return Arrays.hashCode(objArray);
    }
}
