package p.pu3;
import android.content.DialogInterface$OnClickListener;
import p.qu3;
import java.lang.Object;
import android.content.DialogInterface;
import p.ru3;
import p.su3;
import p.tu3;
import p.jk0;
import p.km3;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.rk0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ha5;
import p.b5;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import p.fn0;
import android.content.Intent;
import java.lang.String;
import android.net.Uri;
import androidx.fragment.app.Fragment;

public final class pu3 implements DialogInterface$OnClickListener	// class@0022d2 from classes.dex
{
    public final int a;
    public final qu3 b;

    public void pu3(qu3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       pu3 tb = this.b;
       switch (this.a){
           case 0:
             if (tb != null) {
                tb.c.c(new rk0(tb.b.v.c(true), id.a(), true).subscribe(new ha5(18, tb)));
             }
             break;
           default:
             if (tb != null) {
                tb.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.spotify.com/article/how-can-i-change-my-country-setting/")));
             }
             return;
       }
       return;
    }
}
