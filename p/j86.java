package p.j86;
import android.view.View$OnLayoutChangeListener;
import java.lang.Object;
import p.mw;
import android.view.View;
import java.lang.String;
import p.co5;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.kk7;
import p.hy3;
import p.an5;
import p.zj6;
import androidx.recyclerview.widget.RecyclerView;
import p.es0;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import java.lang.Class;
import androidx.appcompat.widget.SearchView;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import p.bl7;
import android.graphics.drawable.Drawable;
import android.widget.AutoCompleteTextView;

public final class j86 implements View$OnLayoutChangeListener	// class@001a89 from classes.dex
{
    public final int a;
    public final Object b;

    public void j86(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void j86(mw p0){
       this.a = 5;
       super(5, p0);
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       LyricsRecyclerView b1;
       String str = "view";
       j86 tb = this.b;
       switch (this.a){
           case 0:
             SearchView o = tb.O;
             if (o.getWidth() > 1) {
                Resources resources = tb.getContext().getResources();
                str = tb.I.getPaddingLeft();
                Rect rect = new Rect();
                boolean b = bl7.a(tb);
                resources = (tb.h0 != null)? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width): 0;
                SearchView g = tb.G;
                g.getDropDownBackground().getPadding(rect);
                b = (b)? - rect.left: str - (rect.left + resources);
                g.setDropDownHorizontalOffset(b);
                g.setDropDownWidth(((((o.getWidth() + rect.left) + rect.right) + resources) - str));
             }
             return;
             break;
           case 1:
             tb.getClass();
             throw null;
           case 2:
             co5.o(p0, str);
             p0.removeOnLayoutChangeListener(this);
             GridRecyclerView gridRecycler = tb.g();
             gridRecycler.setPadding(gridRecycler.getPaddingLeft(), gridRecycler.getPaddingTop(), gridRecycler.getPaddingRight(), p0.getHeight());
             return;
           case 3:
             co5.o(p0, str);
             p0.removeOnLayoutChangeListener(this);
             RecyclerView recyclerView = tb.e();
             recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), p0.getHeight());
             return;
           case 4:
             co5.o(p0, str);
             p0.removeOnLayoutChangeListener(this);
             int i = tb.getWidth() - (tb.getPaddingRight() + tb.getPaddingLeft());
             if ((b1 = tb.b1) != null) {
                b1.d.onNext(new kk7(i, tb.getHeight()));
                return;
             }else {
                co5.N("presenter");
                throw null;
             }
             break;
           default:
             tb.a();
             return;
       }
    }
}
