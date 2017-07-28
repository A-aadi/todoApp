package adarsh.todo.main.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import adarsh.todo.R;
import adarsh.todo.main.model.Todo;
import adarsh.todo.main.presenter.MainPresenter;
import adarsh.todo.main.rest.ApiClient;
import adarsh.todo.main.rest.ApiInterface;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

public class MainActivity extends AppCompatActivity implements TodoView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        MainPresenter presenter = new MainPresenter(this, apiService);
        presenter.setView();
    }

    @Override
    public void setListView(List<Todo> todoList) {
        final RecyclerView todoListView = (RecyclerView) findViewById(R.id.todo_list);
        TodoAdapter todoAdt = new TodoAdapter(getApplicationContext(), todoList);
        todoListView.setAdapter(todoAdt);
        todoListView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), VERTICAL, false));
    }
}
