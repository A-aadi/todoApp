package adarsh.todo.main.rest;

import java.util.List;

import adarsh.todo.main.model.Todo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("todo")
    Call<List<Todo>> getTodo();
}