package p.ky1;
import p.mm7;
import p.ly1;
import java.lang.Object;
import android.os.Bundle;
import p.ny1;
import java.lang.String;
import p.co5;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;

public final class ky1 implements mm7	// class@001ca5 from classes.dex
{
    public final int a;
    public final ly1 b;

    public void ky1(ly1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(Bundle p0,ny1 p1){
       k activity;
       ky1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(tb, "this$0");
             if ((activity = tb.getActivity()) != null) {
                Intent intent = new Intent();
                if (p0 == null) {
                   p0 = new Bundle();
                }
                intent.putExtras(p0);
                activity.setResult(-1, intent);
                activity.finish();
             }
             return;
       }
       co5.o(tb, "this$0");
       tb.C(p0, p1);
       return;
    }
}
