package adarsh.todo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import adarsh.todo.main.main.TodoView;
import adarsh.todo.main.model.Todo;
import adarsh.todo.main.presenter.MainPresenter;
import adarsh.todo.main.rest.ApiInterface;
import retrofit2.Call;

import static org.mockito.AdditionalMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class MainPresenterTest {

    @Mock
    TodoView view;
    @Mock
    ApiInterface apiInterface;
    private MainPresenter presenter;

    @Before
    public void setUp(){
        initMocks(this);
        presenter = new MainPresenter(view, apiInterface);
    }

    @Test
    public void shouldSetTodoListView() throws Exception {
        presenter.setView();

//        when(apiInterface.getTodo()).thenReturn((Call<List<Todo>>) anyList();
//        verify(apiInterface).getTodo(eq(request), callbackCaptor.capture());

//        verify(view).setListView(Mockito.<Todo>anyList());

    }
}