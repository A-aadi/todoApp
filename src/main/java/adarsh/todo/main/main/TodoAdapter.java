package adarsh.todo.main.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import adarsh.todo.R;
import adarsh.todo.main.model.Todo;

class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {
    private final Context context;
    private final List<Todo> todoList;

    TodoAdapter(Context applicationContext, List<Todo> todos) {
        this.context = applicationContext;
        this.todoList = todos;
    }

    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.todo_item, parent, false);
        return new TodoViewHolder(context, view);
    }

    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {
        Todo todo = todoList.get(position);
        holder.setTodo(todo);
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }
}