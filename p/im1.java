package p.im1;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

public abstract class im1	// class@0019be from classes.dex
{
    public final TextInputLayout a;
    public final Context b;
    public final CheckableImageButton c;
    public final int d;

    public void im1(TextInputLayout p0,int p1){
       super();
       this.a = p0;
       this.b = p0.getContext();
       this.c = p0.getEndIconView();
       this.d = p1;
    }
    public abstract void a();
    public boolean b(int p0){
       return true;
    }
    public void c(boolean p0){
    }
}
