package p.vl6;
import p.k73;
import p.m73;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import java.lang.Object;
import androidx.fragment.app.k;
import p.wl6;
import p.or7;
import android.content.res.Resources;
import android.content.Context;
import java.lang.String;
import p.dt5;
import p.ft0;
import android.graphics.drawable.Drawable;
import p.h25;
import p.dt0;

public final class vl6	// class@002a1c from classes.dex
{
    public final or7 a;
    public final m73 b;
    public static final m73 c;

    static {
       k73 ok73 = m73.a();
       TimeUnit mINUTES = TimeUnit.MINUTES;
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_5_mins), Long.valueOf(mINUTES.toMillis(5)));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_10_mins), Long.valueOf(mINUTES.toMillis(10)));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_15_mins), Long.valueOf(mINUTES.toMillis(15)));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_30_mins), Long.valueOf(mINUTES.toMillis(30)));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_45_mins), Long.valueOf(mINUTES.toMillis(45)));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_1_hour), Long.valueOf(TimeUnit.HOURS.toMillis(1)));
       vl6.c = ok73.a();
    }
    public void vl6(k p0,wl6 p1,or7 p2){
       super();
       this.a = p2;
       Resources resources = p0.getResources();
       k73 ok73 = m73.a();
       Object[] objArray = new Object[]{Integer.valueOf(5)};
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_5_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 5, objArray));
       objArray = new Object[]{Integer.valueOf(10)};
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_10_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 10, objArray));
       objArray = new Object[]{Integer.valueOf(15)};
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_15_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 15, objArray));
       objArray = new Object[]{Integer.valueOf(30)};
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_30_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 30, objArray));
       objArray = new Object[]{Integer.valueOf(45)};
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_45_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 45, objArray));
       objArray = new Object[]{Integer.valueOf(1)};
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_1_hour), resources.getQuantityString(R.plurals.context_menu_sleep_timer_hours, 1, objArray));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_end_of_episode), p0.getString(R.string.context_menu_sleep_timer_end_of_episode));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_end_of_track), p0.getString(R.string.context_menu_sleep_timer_end_of_track));
       ok73.d(Integer.valueOf(R.id.menu_item_sleep_timer_turn_off), p0.getString(R.string.context_menu_sleep_timer_turn_off));
       this.b = ok73.b(1);
    }
    public final void a(ft0 p0,int p1){
       p0.a(p1, this.b.get(Integer.valueOf(p1)), null, false, false, true, true, this.a, null);
    }
}
