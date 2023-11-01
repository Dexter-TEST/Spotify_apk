package p.g95;
import p.k95;
import android.widget.CheckBox;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;

public final class g95 extends k95	// class@0016c6 from classes.dex
{

    public void g95(){
       super("CHECKBOX", 5, CheckBox.class);
    }
    public final View a(Context p0,AttributeSet p1,int p2){
       return new AppCompatCheckBox(p0, p1, p2);
    }
    public final int b(){
       return 0x7f0304a9;
    }
}
