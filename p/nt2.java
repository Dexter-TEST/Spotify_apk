package p.nt2;
import android.content.res.Resources;
import java.lang.Object;

public final class nt2	// class@002044 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public void nt2(Resources p0){
       super();
       this.a = p0.getDimensionPixelSize(R.dimen.hub_card_default_text_area);
       this.b = p0.getDimensionPixelSize(R.dimen.hub_card_normal_image_height);
       this.c = p0.getDimensionPixelSize(R.dimen.hub_card_small_image_height);
       this.d = p0.getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
       this.e = p0.getDimensionPixelSize(R.dimen.category_card_max_height);
       this.f = p0.getFraction(R.fraction.category_card_width_to_height_ratio, 1, 1);
    }
}
