package Cruds;

import java.util.List;

/**
 *
 * @author David Duarte Garcia
 */
public interface Crud<Class> {
    public boolean     create(Class obj);
    public Class       read(String id);
    public List<Class> readAll();
    public boolean     update(Class obj);
    public boolean     delete(Class obj);
}
