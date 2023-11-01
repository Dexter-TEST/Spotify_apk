package p.mn3;
import p.zk2;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p.ze;

public final class mn3 implements zk2	// class@001ecb from classes.dex
{
    public final ViewGroup a;
    public final ImageView b;
    public final TextView c;
    public final TextView t;
    public final ze v;

    public void mn3(ViewGroup p0){
       super();
       this.a = p0;
       this.b = p0.findViewById(R.id.image);
       this.c = p0.findViewById(R.id.title);
       this.t = p0.findViewById(R.id.description);
       this.v = new ze(p0.findViewById(R.id.accessory));
    }
    public final View getView(){
       return this.a;
    }
}
