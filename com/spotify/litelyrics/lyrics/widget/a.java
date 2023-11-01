package com.spotify.litelyrics.lyrics.widget.a;
import android.view.View;
import com.spotify.litelyrics.lyrics.widget.BackgroundTinter;
import java.lang.Object;

public abstract class a	// class@000940 from classes.dex
{

    public static final BackgroundTinter a(View p0){
       Object tag = p0.getTag(R.id.tag_background_tinter);
       if (tag instanceof BackgroundTinter) {
       }else {
          tag = null;
       }
       if (tag == null) {
          tag = new BackgroundTinter(p0);
          p0.setTag(R.id.tag_background_tinter, tag);
       }
       return tag;
    }
}
