package org.scoula.todo;

import org.scoula.lib.cli.App;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;
import org.scoula.service.TodoService;
import org.scoula.todo.command.*;

public class TodoApp2 extends App {@Override
public void createMenu(Menu menu) {
    TodoService service=new TodoService();

    menu.add(new MenuItem("목록", service::printTodoList));
    menu.add(new MenuItem("상세", service::deleteTodo));
    menu.add(new MenuItem("추가", service::addTodo));
    menu.add(new MenuItem("수정", service::updateTodo));
    menu.add(new MenuItem("삭제", service::detailTodo));
}
    public static void main(String[] args) {
        App app=new TodoApp();
        app.run();
    }
}
