package com.macedon.almagest.service.dao.impl;

import com.macedon.almagest.service.dao.TodoDao;
import com.macedon.almagest.service.model.Todo;

/**
 * Created by philip on 12/21/15.
 */
public class TodoDaoImpl implements TodoDao {
    @Override
    public Todo getOne() {
        Todo todo = new Todo();
        todo.setSummary("This is my first todo");
        todo.setDescription("This is my first todo");
        return todo;
    }
}
