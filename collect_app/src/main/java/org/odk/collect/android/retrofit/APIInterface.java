package org.odk.collect.android.retrofit;

import org.odk.collect.android.retrofitmodels.LoginResult;
import org.odk.collect.android.retrofitmodels.AuthModel;
import org.odk.collect.android.retrofitmodels.UserModel;
import org.odk.collect.android.retrofitmodels.appointments.Appointments;
import org.odk.collect.android.retrofitmodels.mappedgirls.MappedGirl;
import org.odk.collect.android.retrofitmodels.systemusers.UserSystemModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    @GET("api/v1/girls")
    Call<MappedGirl> getMappedGirls();

    @GET("api/v1/appointments")
    Call<Appointments> getAppointments();

    @GET("api/v1/users")
    Call<UserSystemModel> getUsers();

    @GET("auth/me/")
    Call<UserModel> getLoggedInUserDetails();

    @FormUrlEncoded
    @POST("v1/sessions")
    Call<LoginResult> login(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("auth/login/")
    Call<AuthModel> loginUser(@Field("username") String username, @Field("password") String password);
}
