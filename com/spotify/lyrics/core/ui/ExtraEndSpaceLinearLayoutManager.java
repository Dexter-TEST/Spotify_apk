package com.spotify.lyrics.core.ui.ExtraEndSpaceLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import p.vr5;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class ExtraEndSpaceLinearLayoutManager extends LinearLayoutManager	// class@0009e5 from classes.dex
{
    public final int W;

    public void ExtraEndSpaceLinearLayoutManager(Context p0,int p1){
       super(1);
       this.W = p1;
    }
    public final void Q0(vr5 p0,int[] p1){
       co5.o(p0, "state");
       co5.o(p1, "extraLayoutSpace");
       p1[1] = this.W;
    }
}
