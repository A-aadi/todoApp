package adarsh.todo.main.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.List;

import adarsh.todo.R;
import adarsh.todo.main.model.Todo;
import adarsh.todo.main.rest.ApiClient;
import adarsh.todo.main.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView todoListView = (RecyclerView) findViewById(R.id.todo_list);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<List<Todo>> call = apiService.getTodo();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>>call, Response<List<Todo>> response) {
                TodoAdapter todoAdt = new TodoAdapter(getApplicationContext(), response.body());
                todoListView.setAdapter(todoAdt);
                todoListView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), VERTICAL, false));
            }

            @Override
            public void onFailure(Call<List<Todo>>call, Throwable t) {
                System.out.println("========================failed");
            }
        });
    }
}
