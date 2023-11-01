package p.ba1;
import android.content.DialogInterface$OnClickListener;
import java.lang.Object;
import android.content.DialogInterface;
import p.qn1$a;
import androidx.fragment.app.Fragment;
import p.qn1;
import p.en1;
import p.an5;
import com.spotify.litesettings.settings.StorageLocationSettingsActivity;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.ea1;
import p.co5;
import android.view.View;
import androidx.fragment.app.f;
import android.app.Dialog;
import p.et3;
import p.qn1$b;
import p.fn1;

public final class ba1 implements DialogInterface$OnClickListener	// class@001084 from classes.dex
{
    public final int a;
    public final Object b;

    public void ba1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       f c;
       ea1 r;
       Fragment parentFragme;
       ba1 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, "this$0");
             View view = tb.E(false);
             if ((c = tb.C) != null) {
                c.setContentView(view);
             }
             if ((r = tb.R) != null) {
                tb.L(r);
             }
             return;
             break;
           case 1:
           case 2:
             parentFragme = tb.getParentFragment();
             if (parentFragme instanceof qn1) {
                parentFragme.A.onNext(new en1());
             }
             return;
             break;
           default:
             parentFragme = tb.getParentFragment();
             if (parentFragme instanceof qn1) {
                parentFragme.A.onNext(new fn1());
             }
             return;
       }
       StorageLocationSettingsActivity t = tb.T;
       t.getClass();
       wo3 owo3 = LiteInteraction.l();
       owo3.f("lite/settings/storage-location");
       owo3.h("spotify:settings:storage-location:confirm-dialog");
       owo3.g("spotify:undefined");
       owo3.d("hit");
       owo3.c("cancel");
       owo3.e("storage_location_cancel_button");
       t.a.a(owo3.build());
       return;
    }
}
