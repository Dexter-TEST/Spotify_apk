package com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.qw3;
import android.animation.ObjectAnimator;
import p.dy3;
import p.en6;
import android.view.View;
import p.tu6;

public final class LyricsNotTimesyncedIndicatorView extends AppCompatTextView	// class@00093c from classes.dex
{

    public void LyricsNotTimesyncedIndicatorView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
    }
    public final ObjectAnimator o(qw3 p0){
       co5.o(p0, "lyrics");
       ObjectAnimator objectAnimat = (dy3.a[en6.A(p0.b)] == 1)? tu6.e(this): tu6.n(this, 8, 2);
       return objectAnimat;
    }
}
