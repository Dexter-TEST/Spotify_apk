package p.oj;
import android.content.DialogInterface$OnClickListener;
import p.qj;
import java.lang.Object;
import android.content.DialogInterface;
import p.rj;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import java.util.List;

public final class oj implements DialogInterface$OnClickListener	// class@002135 from classes.dex
{
    public final int a;
    public final qj b;

    public void oj(qj p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       qj h;
       rj b;
       String str = "spotify:undefined";
       String str1 = "spotify:app-rater";
       String str2 = "select";
       String str3 = "hit";
       String str4 = "lite/app-rater";
       oj tb = this.b;
       switch (this.a){
           case 0:
             if ((h = tb.H) != null) {
                b = h.b;
                b.getClass();
                wo3 owo3 = LiteInteraction.l();
                owo3.f(str4);
                owo3.h(str1);
                owo3.g(str);
                owo3.d(str3);
                owo3.c(str2);
                owo3.e("negative_button");
                b.a.a(owo3.build());
             }
             break;
           default:
             if ((h = tb.H) != null) {
                b = h.b;
                b.getClass();
                wo3 owo31 = LiteInteraction.l();
                owo31.f(str4);
                owo31.h(str1);
                owo31.g(str);
                owo31.d(str3);
                owo31.c(str2);
                owo31.e("positive_button");
                b.a.a(owo31.build());
             }
             Context uContext = tb.requireContext();
             Context uContext1 = tb.requireContext();
             String packageName = uContext1.getPackageName();
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id="+packageName));
             if (uContext1.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id="+packageName));
             }
             uContext.startActivity(intent);
             return;
       }
       return;
    }
}
