package p.d95;
import p.k95;
import android.widget.ImageView;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public final class d95 extends k95	// class@001304 from classes.dex
{

    public void d95(){
       super("IMAGEVIEW", 2, ImageView.class);
    }
    public final View a(Context p0,AttributeSet p1,int p2){
       return new AppCompatImageView(p0, p1, p2);
    }
}
