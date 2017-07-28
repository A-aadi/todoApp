package adarsh.todo.main.presenter;

import java.util.List;

import adarsh.todo.main.main.TodoView;
import adarsh.todo.main.model.Todo;
import adarsh.todo.main.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private TodoView view;
    private ApiInterface apiService;

    public MainPresenter(TodoView view, ApiInterface apiService) {
        this.view = view;
        this.apiService = apiService;
    }

    public void setView() {
        Call<List<Todo>> call = apiService.getTodo();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>>call, Response<List<Todo>> response) {
                view.setListView(response.body());
            }

            @Override
            public void onFailure(Call<List<Todo>>call, Throwable t) {
                System.out.println("========================failed");
            }
        });

    }
}
