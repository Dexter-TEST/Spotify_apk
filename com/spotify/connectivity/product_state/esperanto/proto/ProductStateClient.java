package com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import io.reactivex.rxjava3.core.Observable;

public interface abstract ProductStateClient	// class@0007b5 from classes.dex
{

    Single DelOverridesValues(DelOverridesValuesRequest p0);
    Single GetValues(GetValuesRequest p0);
    Single PutOverridesValues(PutOverridesValuesRequest p0);
    Single PutValues(PutValuesRequest p0);
    Observable SubValues(SubValuesRequest p0);
}
