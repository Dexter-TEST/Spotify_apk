package p.zh;
import java.lang.CharSequence;
import android.text.Layout$Alignment;
import android.widget.TextView;
import android.text.TextPaint;
import android.text.StaticLayout;

public abstract class zh	// class@002efd from classes.dex
{

    public static StaticLayout a(CharSequence p0,Layout$Alignment p1,int p2,TextView p3,TextPaint p4){
       StaticLayout p3 = new StaticLayout(p0, p4, p2, p1, p3.getLineSpacingMultiplier(), p3.getLineSpacingExtra(), p3.getIncludeFontPadding());
       return p3;
    }
    public static int b(TextView p0){
       return p0.getMaxLines();
    }
}
