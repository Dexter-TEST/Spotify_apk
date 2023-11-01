package p.nh;
import android.widget.TextView;
import android.view.textclassifier.TextClassifier;
import android.content.Context;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import java.lang.Class;
import java.lang.Object;
import p.eh;
import p.p3;

public abstract class nh	// class@001fdf from classes.dex
{

    public static TextClassifier a(TextView p0){
       TextClassificationManager textClassifi;
       if ((textClassifi = eh.q(p0.getContext(), TextClassificationManager.class)) != null) {
          return p3.m(textClassifi);
       }
       return p3.l();
    }
}
