package com.example.upcomingitems;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UpcomingItemApi {

    @GET ("upcoming/get")
    Call<UpcomingItem> loadUpcomingItem();
}
