package p.w05;
import p.aw6;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.qd1;
import p.y05;

public final class w05 implements aw6	// class@002a9f from classes.dex
{
    public final int a;
    public final Context b;

    public void w05(Context p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       w05 tb = this.b;
       switch (this.a){
           case 0:
             return new qd1(tb);
           case 1:
             return tb.getString(R.string.entity_accessory_button_pause);
           case 2:
             return tb.getString(R.string.entity_accessory_button_play);
           default:
             return new qd1(tb);
       }
    }
}
