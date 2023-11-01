package p.mk2;
import android.content.Context;
import java.lang.Object;
import android.util.SparseIntArray;
import java.lang.Class;
import android.content.res.Resources;
import p.dn2;
import p.ox7;

public final class mk2	// class@001eb0 from classes.dex
{
    public final dn2 a;
    public final SparseIntArray b;
    public final SparseIntArray c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    public void mk2(Context p0){
       super();
       this.b = new SparseIntArray();
       this.c = new SparseIntArray();
       this.j = false;
       p0.getClass();
       Resources resources = p0.getResources();
       int dimensionPix = resources.getDimensionPixelSize(R.dimen.hugs_card_row_gap);
       this.d = dimensionPix;
       this.e = resources.getDimensionPixelSize(R.dimen.hub_big_card_top_padding);
       this.f = resources.getDimensionPixelSize(R.dimen.hub_big_card_bottom_padding);
       this.h = resources.getDimensionPixelSize(R.dimen.hugs_spinner_padding_top_bottom);
       this.g = dimensionPix / 4;
       this.i = 0;
       this.a = new dn2(dimensionPix, ox7.x(p0), false);
    }
}
