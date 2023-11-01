package p.k3;
import android.text.style.ClickableSpan;
import p.y3;
import android.view.View;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import android.view.accessibility.AccessibilityNodeInfo;

public final class k3 extends ClickableSpan	// class@001b9f from classes.dex
{
    public final int a;
    public final y3 b;
    public final int c;

    public void k3(int p0,y3 p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onClick(View p0){
       Bundle uBundle = new Bundle();
       uBundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
       this.b.a.performAction(this.c, uBundle);
    }
}
