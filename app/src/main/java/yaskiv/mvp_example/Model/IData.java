package yaskiv.mvp_example.Model;

import java.util.List;

import yaskiv.mvp_example.Model.Entity.DataClass;

/**
 * Created by yaski on 18.04.2017.
 */

public interface IData {
    List<DataClass> getNeighbords(DataClass object);
}
