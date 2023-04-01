package com.service;

import java.util.List;

public interface IGenericService<E> {
    List<E> showAll();
    E showByIndex(long id);
    void save(E e);
    void delete(long id);
}
