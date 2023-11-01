package p.z64;
import p.ue1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.y64;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.HeaderViewListAdapter;
import p.b64;
import android.widget.AbsListView;
import p.l64;
import p.e64;
import android.view.MenuItem;
import p.k64;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ListMenuItemView;
import android.graphics.drawable.Drawable;

public final class z64 extends ue1	// class@002e98 from classes.dex
{
    public final int D;
    public final int E;
    public k64 F;
    public l64 G;

    public void z64(Context p0,boolean p1){
       super(p0, p1);
       if (1 == y64.a(p0.getResources().getConfiguration())) {
          this.D = 21;
          this.E = 22;
       }else {
          this.D = 22;
          this.E = 21;
       }
       return;
    }
    public final boolean onHoverEvent(MotionEvent p0){
       int headersCount;
       int i;
       z64 tG;
       if (this.F != null) {
          ListAdapter adapter = this.getAdapter();
          if (adapter instanceof HeaderViewListAdapter) {
             headersCount = adapter.getHeadersCount();
             adapter = adapter.getWrappedAdapter();
          }else {
             headersCount = 0;
          }
          l64 ol64 = (p0.getAction() != 10 && ((i = this.pointToPosition((int)p0.getX(), (int)p0.getY())) != -1 && ((i = i - headersCount) >= 0 && i < adapter.getCount())))? adapter.b(i): null;
          if ((tG = this.G) != ol64) {
             b64 a = adapter.a;
             if (tG != null) {
                this.F.n(a, tG);
             }
             this.G = ol64;
             if (ol64 != null) {
                this.F.o(a, ol64);
             }
          }
       }
       return super.onHoverEvent(p0);
    }
    public final boolean onKeyDown(int p0,KeyEvent p1){
       ListMenuItemView selectedView;
       if ((selectedView = this.getSelectedView()) != null && p0 == this.D) {
          if (selectedView.isEnabled() && selectedView.getItemData().hasSubMenu()) {
             this.performItemClick(selectedView, this.getSelectedItemPosition(), this.getSelectedItemId());
          }
          return true;
       }else if(selectedView != null && p0 == this.E){
          this.setSelection(-1);
          ListAdapter adapter = this.getAdapter();
          if (adapter instanceof HeaderViewListAdapter) {
             adapter = adapter.getWrappedAdapter();
          }else {
          }
          adapter.a.c(false);
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public void setHoverListener(k64 p0){
       this.F = p0;
    }
    public void setSelector(Drawable p0){
       super.setSelector(p0);
    }
}
