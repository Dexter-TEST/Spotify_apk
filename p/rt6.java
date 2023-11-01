package p.rt6;
import p.ir0;
import com.spotify.litesettings.settings.StorageSettingsActivity;
import java.lang.Object;
import java.lang.Long;
import android.content.Context;
import java.lang.String;
import android.text.format.Formatter;
import java.lang.CharSequence;
import android.widget.TextView;
import p.jc7;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.so0;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.o;
import androidx.fragment.app.f;
import java.util.List;
import p.wt6;
import android.view.View;
import java.util.Iterator;
import p.tv;
import android.widget.ProgressBar;
import android.app.Activity;
import android.content.Intent;
import p.xj0;

public final class rt6 implements ir0	// class@002557 from classes.dex
{
    public final int a;
    public final StorageSettingsActivity b;

    public void rt6(StorageSettingsActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       StorageSettingsActivity y;
       boolean i3;
       StorageSettingsActivity d0;
       StorageSettingsActivity r;
       wo3 owo3;
       rt6 ort6 = this;
       String str = "spotify:undefined";
       String str1 = "spotify:settings:storage";
       int i = 0x7f12035e;
       int i1 = 0x7f12035f;
       String str2 = "lite/settings/storage";
       rt6 b = ort6.b;
       int i2 = 0;
       switch (ort6.a){
           case 0:
             b.finish();
             return;
           case 1:
             List list = p0;
             b.Z.a.setVisibility(8);
             Iterator iterator = list.iterator();
             long l = 0;
             while (iterator.hasNext()) {
                tv otv = iterator.next();
                if (otv.h != null) {
                   y = b.Y;
                   y.b.setText(b.getText(R.string.settings_storage_app_internal));
                }else if(otv.f != null){
                   b.Z.a.setVisibility(i2);
                   tv a = otv.a;
                   b.c0.setText(a);
                   y = b.Z;
                   y.b.setText(a);
                }else {
                   int i4 = this;
                }
                tv c = otv.c;
                long l1 = otv.b + c;
                Context context = y.a.getContext();
                long l2 = l1 - c;
                tv d = otv.d;
                long l3 = l2 - d;
                y.c.setText(Formatter.formatShortFileSize(context, l1));
                l1 = l1 / 1000;
                i3 = (int)l1;
                wt6 t = y.t;
                t.setMax(i3);
                long l4 = l3 / 1000;
                t.setProgress((int)l4);
                l4 = l3 + d;
                l4 = l4 / 1000;
                t.setSecondaryProgress((int)l4);
                Object[] objArray = new Object[]{Formatter.formatShortFileSize(context, l3)};
                y.v.setText(context.getString(R.string.settings_storage_device_others, objArray));
                Object[] objArray1 = new Object[]{Formatter.formatShortFileSize(context, d)};
                y.w.setText(context.getString(R.string.settings_storage_device_app, objArray1));
                objArray1 = new Object[]{Formatter.formatShortFileSize(context, c)};
                y.x.setText(context.getString(R.string.settings_storage_device_free, objArray1));
                l = l + otv.e;
                iterator = iterator;
                list = list;
                i2 = 0;
             }
             List list1 = list;
             d0 = b.d0;
             i3 = ((l) > 0)? true: false;
             d0.setEnabled(i3);
             b.a0.setText(Formatter.formatShortFileSize(b, l));
             d0 = b.g0;
             i2 = (list1.size() > 1)? 0: 8;
             d0.setVisibility(i2);
             return;
             break;
           case 2:
             r = b.R;
             r.getClass();
             owo3 = LiteInteraction.l();
             owo3.f(str2);
             owo3.h(str1);
             owo3.g(str);
             owo3.d("hit");
             owo3.c("clear-cache");
             owo3.e("clear_cache_button");
             r.a.a(owo3.build());
             so0.C(R.id.confirm_delete_cache, i2, R.string.settings_storage_delete_cache_confirmation_message, i1, i).B(b.y(), String.valueOf(R.id.confirm_log_out));
             return;
           case 3:
             r = b.R;
             r.getClass();
             owo3 = LiteInteraction.l();
             owo3.f(str2);
             owo3.h(str1);
             owo3.g(str);
             owo3.d("hit");
             owo3.c("delete-downloads");
             owo3.e("delete_downloads_button");
             r.a.a(owo3.build());
             so0.C(R.id.confirm_delete_downloads, i2, R.string.settings_storage_delete_downloads_confirmation_message, i1, i).B(b.y(), String.valueOf(R.id.confirm_log_out));
             return;
           case 4:
             b.b0.setText(Formatter.formatShortFileSize(b, p0.longValue()));
             return;
           default:
             d0 = b.R;
             d0.getClass();
             wo3 owo31 = LiteInteraction.l();
             owo31.f(str2);
             owo31.h(str1);
             owo31.g("spotify:settings:storage-location");
             owo31.d("hit");
             owo31.c("navigate-forward");
             owo31.e("storage_location_button");
             d0.a.a(owo31.build());
             b.startActivity(xj0.z0(b, "spotify.intent.action.STORAGE_LOCATION_SETTINGS").putExtra("EXTRA_REQUIRED", false));
             return;
       }
    }
}
