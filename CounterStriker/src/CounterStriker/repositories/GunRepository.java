package CounterStriker.repositories;

import java.util.ArrayList;
import java.util.Collection;

import static CounterStriker.common.ExceptionMessages.INVALID_GUN_REPOSITORY;

public class GunRepository <T> implements  Repository<T> {
    private Collection <T> models;

    public GunRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public  Collection<T> getModels() {
        return null;
    }

    @Override
    public void add(T model) {
        if (model == null) {
            throw new NullPointerException(INVALID_GUN_REPOSITORY);
        }
        this.models.add(model);
    }

    @Override
    public boolean remove(T model) {
        if (models.contains(model)) {
            models.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public T findByName(String name) {
        for (T model : models) {
            if (model.getClass().isInstance(name)) {
                return model;
            }
        }
        return null;
    }
}
