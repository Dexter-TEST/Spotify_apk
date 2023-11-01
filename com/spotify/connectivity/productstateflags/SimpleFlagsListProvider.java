package com.spotify.connectivity.productstateflags.SimpleFlagsListProvider;
import com.spotify.connectivity.productstateflags.FlagsListProvider;
import com.spotify.connectivity.productstateflags.SimpleFlagsListProvider$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import p.co5;
import p.ye7;

public abstract class SimpleFlagsListProvider implements FlagsListProvider	// class@000809 from classes.dex
{
    private List mAllFlags;
    private List mProductStateFlags;
    public static final SimpleFlagsListProvider$Companion Companion;

    static {
       SimpleFlagsListProvider.Companion = new SimpleFlagsListProvider$Companion(null);
    }
    public void SimpleFlagsListProvider(){
       super();
    }
    private synchronized final void initializeListsIfNecessary(){
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       SimpleFlagsListProvider$Companion.access$populateSourceLists(SimpleFlagsListProvider.Companion, this.getFlagsListProviders(), uArrayList, uArrayList1);
       this.mProductStateFlags = Collections.unmodifiableList(uArrayList);
       this.mAllFlags = Collections.unmodifiableList(uArrayList1);
    }
    public Collection getAllFlags(){
       this.initializeListsIfNecessary();
       SimpleFlagsListProvider tmAllFlags = this.mAllFlags;
       co5.i(tmAllFlags);
       return tmAllFlags;
    }
    public List getFlagsListProviders(){
       return ye7.J(this);
    }
    public List getProductStateFlags(){
       this.initializeListsIfNecessary();
       SimpleFlagsListProvider tmProductSta = this.mProductStateFlags;
       co5.i(tmProductSta);
       return tmProductSta;
    }
}
