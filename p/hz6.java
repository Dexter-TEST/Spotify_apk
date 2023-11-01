package p.hz6;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;
import p.up0;
import java.lang.Object;
import p.yq5;
import p.cz6;
import p.o12;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.IllegalStateException;
import p.tp2;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import p.ez6;
import java.lang.Math;

public final class hz6	// class@0018f3 from classes.dex
{
    public final TabLayout a;
    public final ViewPager2 b;
    public final up0 c;
    public yq5 d;
    public boolean e;

    public void hz6(TabLayout p0,ViewPager2 p1,up0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(){
       hz6 td;
       String str;
       cz6 g;
       hz6 ta = this.a;
       ta.h();
       if ((td = this.d) != null) {
          int i = td.d();
          boolean b = false;
          int i1 = 0;
          while (true) {
             int i2 = 1;
             if (i1 < i) {
                cz6 uocz6 = ta.g();
                up0 b1 = this.c.b;
                if (i1) {
                   if (i1 != i2) {
                      if (i1 != 2) {
                         if (i1 == 3) {
                            str = b1.getString(R.string.favorite_shows_title);
                         }else {
                            b1.getClass();
                            throw new IllegalStateException(tp2.k("Unknown position: ", i1));
                         }
                      }else {
                         str = b1.getString(R.string.favorite_albums_title);
                      }
                   }else {
                      str = b1.getString(R.string.favorite_artists_title);
                   }
                }else {
                   str = b1.getString(R.string.favorite_playlists_title);
                }
                if (TextUtils.isEmpty(uocz6.c) && !TextUtils.isEmpty(str)) {
                   uocz6.g.setContentDescription(str);
                }
                uocz6.b = str;
                if ((g = uocz6.g) != null) {
                   g.e();
                }
                ta.a(uocz6, b);
                i1 = i1 + 1;
             }else if(i > 0 && (i = Math.min(this.b.getCurrentItem(), (ta.getTabCount() - i2))) != ta.getSelectedTabPosition()){
                ta.j(ta.f(i), i2);
                break ;
             }
          }
       }
       return;
    }
}
