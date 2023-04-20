package it.aulab.learningplatform.service;

import java.util.List;
import java.util.Map;

public interface CrudService<Read, ID, Create, Update> {
    List<Read> readAll();
    List<Read> read(Map<String, String> params);
    List<Read> readOne(ID id);
    Read create(Create createDTO);
    Read update(Update updateDTO);
    Read delete(ID id);
}
