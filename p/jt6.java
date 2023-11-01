package p.jt6;
import p.ir0;
import com.spotify.litesettings.settings.StorageLocationSettingsActivity;
import java.lang.Object;
import p.wt;
import android.view.View;
import p.tv;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ProgressBar;
import java.util.List;
import p.lm0;
import p.yq5;
import p.kt6;
import java.lang.Class;
import p.mm0;
import p.kg4;
import p.ab3;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import android.app.Activity;
import p.vl2;
import p.tj2;
import p.xe7;
import p.ba1;
import p.kn3;
import p.kf6;

public final class jt6 implements ir0	// class@001b42 from classes.dex
{
    public final int a;
    public final StorageLocationSettingsActivity b;

    public void jt6(StorageLocationSettingsActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       StorageLocationSettingsActivity b0;
       int i2;
       wt d;
       tj2 otj2;
       int i = 1;
       int i1 = 0;
       jt6 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             b0 = tb.b0;
             i2 = (p0.a != null)? 8: 0;
             b0.setVisibility(i2);
             b0 = tb.c0;
             Object[] objArray = new Object[i];
             String str = ((d = p0.d) == null)? "": d.a;
             objArray[i1] = str;
             b0.setText(tb.getString(R.string.settings_storage_location_progress_title, objArray));
             d = p0.b;
             if ((d - 1) < 0) {
                tb.d0.setProgress(i1);
             }else {
                tb.d0.setProgress((int)((p0.c * 100) / d));
             }
             return;
             break;
           default:
             tb.getClass();
             b0 = tb.T;
             ab3 uoab3 = kg4.k("storage_location_item_", p0.a);
             b0.getClass();
             wo3 owo3 = LiteInteraction.l();
             owo3.f("lite/settings/storage-location");
             owo3.h("spotify:settings:storage-location");
             owo3.g("spotify:undefined");
             owo3.d("hit");
             owo3.c("select-storage-location");
             if (uoab3 != null) {
                owo3.e(uoab3);
             }
             b0.a.a(owo3.build());
             if (!tb.isFinishing()) {
                if (tb.a0 != null) {
                   otj2 = xe7.k0(tb.Z.a, tb.getString(R.string.settings_storage_location_confirm_missing_title), tb.getString(R.string.settings_storage_location_confirm_missing_body));
                   i1 = 0x7f12036b;
                   i2 = 0x7f12036a;
                }else {
                   Object[] objArray1 = new Object[i];
                   objArray1[i1] = p0.d;
                   otj2 = xe7.k0(tb.Z.a, tb.getString(R.string.settings_storage_location_confirm_title, objArray1), tb.getString(R.string.settings_storage_location_confirm_body));
                   i1 = 0x7f12036e;
                   i2 = 0x7f12036d;
                }
                otj2.b = tb.getText(i2);
                otj2.d = new ba1(i, tb);
                otj2.a = tb.getText(i1);
                otj2.c = new kn3(tb, i, p0);
                otj2.a().l();
             }
             return;
       }
       tb.Y.z(p0);
       tb.Y.g();
       return;
    }
}
