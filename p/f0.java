package p.f0;
import p.xt2;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import android.widget.FrameLayout;
import com.spotify.litecomponents.widgets.view.LiteButton;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import p.co5;
import p.l03;
import p.au2;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import android.widget.FrameLayout$LayoutParams;
import p.b13;
import p.et0;
import p.bc2;

public abstract class f0 implements xt2	// class@001536 from classes.dex
{

    public void f0(){
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       LiteButton liteButton = p0.findViewById(R.id.button);
       liteButton.setText(p1.y().d());
       co5.e(liteButton, p1, p2);
       liteButton.setAppearsDisabled(p1.b().y("appearDisabled", false));
    }
    public final View c(ViewGroup p0,uu2 p1){
       ViewGroup$LayoutParams layoutParams;
       Context context1;
       LiteButton liteButton;
       Context context = p0.getContext();
       FrameLayout uFrameLayout = new FrameLayout(context);
       if ((layoutParams = PasteViewLayoutParamHelper.generateMatchParentLayoutParams(context, p0)) != null) {
          uFrameLayout.setLayoutParams(layoutParams);
       }
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, -2, 1);
       switch (this.a){
           case 0:
             context1 = p0.getContext();
             liteButton = new LiteButton(context1, 0x7f03059b);
             bc2.a(liteButton, context1);
             break;
           case 1:
             liteButton = et0.n(p0, R.layout.lite_gray_primary_small_button, p0, false);
             bc2.a(liteButton, p0.getContext());
             break;
           default:
             context1 = p0.getContext();
             liteButton = new LiteButton(context1, 0x7f03059c);
             bc2.a(liteButton, context1);
       }
       liteButton.setId(R.id.button);
       liteButton.setLayoutParams(layoutParams1);
       uFrameLayout.addView(liteButton);
       return uFrameLayout;
    }
}
