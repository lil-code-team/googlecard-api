package dev.lilcode.googlecard.interfaces.clients;

import dev.lilcode.googlecard.types.TextMessage;
import dev.lilcode.googlecard.v1.types.Card;
import dev.lilcode.googlecard.v2.types.RequestCards;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.*;

public interface GoogleChatWebhook {
    @POST("/v1/spaces/{spaceId}/messages")
    Call<ResponseBody> send(@Body TextMessage text, @Path("spaceId") String spaceId,  @Query("key") String key, @Query("token") String token);

    /**
     * @deprecated Use {@link #send(RequestCards, String, String, String)}
     */
    @Deprecated
    @POST("/v1/spaces/{spaceId}/messages")
    Call<ResponseBody> send(@Body Card card, @Path("spaceId") String spaceId, @Query("key") String key, @Query("token") String token);

    @POST("/v1/spaces/{spaceId}/messages")
    Call<ResponseBody> send(@Body RequestCards card, @Path("spaceId") String spaceId, @Query("key") String key, @Query("token") String token);

    static GoogleChatWebhook create(String baseUrl) {
        OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(chain -> {
                Request original = chain.request();
                Request request = original.newBuilder()
                    .header("Content-Type", "application/json")
                    .method(original.method(), original.body())
                    .build();
                return chain.proceed(request);
            })
            .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GoogleChatWebhook.class);
    }
}