package p.gm6;
import p.z6;
import p.eh2;
import p.hm6;
import java.lang.Object;
import p.gh2;
import java.lang.Class;
import java.lang.String;
import p.y6;
import p.co5;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import p.eq2;
import p.an5;
import p.fq2;
import p.p01;
import p.im6;
import p.ab3;
import java.lang.Boolean;

public final class gm6 implements z6, eh2	// class@00173a from classes.dex
{
    public final int a;
    public final hm6 b;

    public void gm6(hm6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final gh2 a(){
       gh2 v0;
       gh2 v01;
       switch (this.a){
           case 0:
             v0 = new gh2(1, this.b, hm6.class, "onRequestCredentialsResolutionResult", "onRequestCredentialsResolutionResult\(Landroidx/activity/result/ActivityResult;\)V");
             return v0;
           case 1:
             v01 = new gh2(1, this.b, hm6.class, "onRequestHintsResolutionResult", "onRequestHintsResolutionResult\(Landroidx/activity/result/ActivityResult;\)V");
             return v0;
           default:
             v01 = new gh2(1, this.b, hm6.class, "onSaveCredentialsResolutionResult", "onSaveCredentialsResolutionResult\(Landroidx/activity/result/ActivityResult;\)V");
             return v0;
       }
    }
    public final void b(Object p0){
       switch (this.a){
           case 0:
             this.c(p0);
             return;
           case 1:
             this.c(p0);
             return;
           default:
             this.c(p0);
             return;
       }
    }
    public final void c(y6 p0){
       y6 a;
       hm6 e;
       hm6 c;
       Credential parcelableEx;
       String str = "com.google.android.gms.credentials.Credential";
       Credential uCredential = null;
       gm6 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(p0, "p0");
             tb.getClass();
             if ((a = p0.a) != -1) {
                p01 a1 = p01.a;
                e = tb.e;
                if (a != null) {
                   if ((c = tb.c) != null) {
                      c.a();
                   }
                   e.onNext(a1);
                }else {
                   e.onNext(a1);
                }
             }else if((p0 = p0.b) != null){
                uCredential = p0.getParcelableExtra(str);
             }
             tb.b(uCredential, 2);
             break;
           case 1:
             co5.o(p0, "p0");
             tb.getClass();
             if (p0.a == -1 && ((p0 = p0.b) != null && (parcelableEx = p0.getParcelableExtra(str)) != null)) {
                uCredential = parcelableEx.a;
             }
             hm6 f = tb.f;
             if (uCredential == null) {
                f.onNext(eq2.a);
             }else {
                f.onNext(new fq2(uCredential));
             }
             return;
             break;
           default:
             co5.o(p0, "p0");
             tb.getClass();
             p0 = p0.a;
             e = tb.d;
             hm6 c1 = tb.c;
             if (p0 != -1) {
                if (p0 != null) {
                   if (c1 != null) {
                      c1.a.d("save", "failed");
                   }
                   e.onNext(Boolean.FALSE);
                }else if(c1 != null){
                   c1.a.d("save", "dismissed");
                }
                e.onNext(Boolean.FALSE);
             }else if(c1 != null){
                c1.a.d("save", "accepted");
             }
             e.onNext(Boolean.TRUE);
             return;
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       switch (this.a){
           case 0:
             if (p0 instanceof z6 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             break;
           case 1:
             if (p0 instanceof z6 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           default:
             if (p0 instanceof z6 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
       }
       return b;
    }
    public final int hashCode(){
       switch (this.a){
           case 0:
             return this.a().e();
           case 1:
             return this.a().e();
           default:
             return this.a().e();
       }
    }
}
