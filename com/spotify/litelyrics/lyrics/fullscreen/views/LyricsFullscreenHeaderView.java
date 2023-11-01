package com.spotify.litelyrics.lyrics.fullscreen.views.LyricsFullscreenHeaderView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;
import p.sf0;
import p.sp6;
import android.content.res.Resources;
import p.xj0;
import p.n6;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;
import android.view.View$OnClickListener;

public class LyricsFullscreenHeaderView extends FrameLayout	// class@000939 from classes.dex
{
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final ImageButton t;
    public final ImageButton v;
    public final View w;

    public void LyricsFullscreenHeaderView(Context p0,AttributeSet p1){
       sf0 this.findViewById(R.id.report_lyrics);
       super(p0, p1, 0);
       this.w = LayoutInflater.from(p0).inflate(R.layout.lyrics_full_screen_header_view, this);
       this.a = this.findViewById(R.id.coverArt);
       this.b = this.findViewById(R.id.artistName);
       this.c = this.findViewById(R.id.title);
       ImageButton imageButton = this.findViewById(R.id.close);
       this.t = imageButton;
       this.v = this.findViewById(R.id.report_lyrics);
       this.findViewById(R.id.report_lyrics) = new sf0(this.getContext(), (float)xj0.e0(16.00f, this.getContext().getResources()), (float)xj0.e0(32.00f, this.getContext().getResources()), n6.b(this.getContext(), R.color.opacity_black_30), n6.b(this.getContext(), R.color.white));
       dh7.q(imageButton, this.findViewById(R.id.report_lyrics));
    }
    public TextView getArtistTextView(){
       return this.b;
    }
    public ImageButton getCloseButton(){
       return this.t;
    }
    public View getContainer(){
       return this.w;
    }
    public ImageView getCoverArtImageView(){
       return this.a;
    }
    public TextView getSongTextView(){
       return this.c;
    }
    public void setCloseClickListener(View$OnClickListener p0){
       this.w.setOnClickListener(p0);
       this.t.setOnClickListener(p0);
    }
    public void setReportLyricsClickListener(View$OnClickListener p0){
       LyricsFullscreenHeaderView tv = this.v;
       tv.setVisibility(0);
       tv.setOnClickListener(p0);
    }
}
