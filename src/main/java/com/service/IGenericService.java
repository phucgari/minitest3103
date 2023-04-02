package com.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<E> {
    List<E> showAll();
    Optional<E> showByIndex(long id);
    void save(E e);
    void delete(long id);
}
