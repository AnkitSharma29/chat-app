package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA5xy3dLI:APA91bFnUgzAW_3f45fbiKceiMIMfmW8DODZgg49LZtWjV9XzWPQ8pPjshke3c8QhjvYbO2lkqKzBAA85c05fTDTNcMM0EcQyTF7hdQ-Afpr2OjoJyydtpxE-Ce8bDlio9RVjeZUJs5N"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
