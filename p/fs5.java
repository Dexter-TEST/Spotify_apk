package p.fs5;
import androidx.appcompat.app.a;
import p.fn0;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.k;
import android.app.Activity;
import android.view.View;
import p.n6;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.lang.CharSequence;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import p.kz6;
import p.ry7;
import p.mg1;
import java.lang.Object;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;

public abstract class fs5 extends a	// class@00162c from classes.dex
{
    public final fn0 Q;
    public static final int R;

    public void fs5(){
       super();
       this.Q = new fn0();
    }
    public int C(){
       return 0x7f0d0025;
    }
    public abstract void D(Bundle p0,RecyclerView p1);
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.setContentView(this.C());
       GlueToolbarLayout glueToolbarL = n6.f(this, R.id.toolbar);
       GlueToolbar glueToolbar = GlueToolbars.createGlueToolbar(glueToolbarL);
       glueToolbar.setTitle(this.getTitle());
       ImageView imageView = this.getLayoutInflater().inflate(R.layout.up_button, glueToolbarL, false);
       glueToolbar.addView(ToolbarSide.START, imageView, R.id.action_close);
       this.Q.c(ry7.e(imageView).subscribe(new mg1(8, this)));
       this.D(p0, n6.f(this, R.id.recycler_view));
    }
    public void onDestroy(){
       this.Q.dispose();
       super.onDestroy();
    }
}
