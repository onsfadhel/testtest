package tha9afans.flat_earthers.test.services;
import java.util.List;

public interface IService <T> {
    public void ajouter(T p);
    public void supprimer(int id);
    public void modifier(T p);
    public List<T> getAll();
    public T getOneById(int id);
}
