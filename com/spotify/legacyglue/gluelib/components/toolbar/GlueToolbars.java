package com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.lang.Object;
import android.content.Context;
import android.view.ViewGroup;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import android.view.LayoutInflater;
import android.view.View;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarImpl;
import p.o67;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class GlueToolbars	// class@0008ed from classes.dex
{

    private void GlueToolbars(){
       super();
    }
    public static GlueToolbar createGlueToolbar(Context p0,ViewGroup p1){
       return GlueToolbars.createGlueToolbar(LayoutInflater.from(p0).inflate(R.layout.glue_toolbar, p1, false));
    }
    public static GlueToolbar createGlueToolbar(GlueToolbarLayout p0){
       return new GlueToolbarImpl(p0);
    }
    public static o67 from(Context p0){
       throw new IllegalArgumentException("Context should implement GlueToolbarContainer");
    }
}
