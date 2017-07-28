package adarsh.todo.main.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import adarsh.todo.R;
import adarsh.todo.main.model.Todo;

public class TodoViewHolder extends RecyclerView.ViewHolder {
    private final Context context;
    private final View view;
    private Todo todo;

    public TodoViewHolder(Context context, View view) {
        super(view);
        this.context = context;
        this.view = view;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
        TextView todoDescription = (TextView) view.findViewById(R.id.todo_description);
        TextView todoPriority = (TextView) view.findViewById(R.id.todo_priority);
        TextView todoFinished = (TextView) view.findViewById(R.id.todo_finished);
        todoDescription.setText(todo.getDescription());
        todoPriority.setText(todo.getPriority());
        todoFinished.setText(todo.getFinished());
    }
}