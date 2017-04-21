package yaskiv.mvp_example.Model.Impl;

import java.util.ArrayList;
import java.util.List;

import yaskiv.mvp_example.Model.IData;
import yaskiv.mvp_example.Model.Entity.DataClass;

/**
 * Created by yaski on 18.04.2017.
 */

public class Data implements IData {
    @Override
    public List<DataClass> getNeighbords(DataClass object) {
        List<DataClass> Neighbords=new ArrayList<>();
        Neighbords.add(new DataClass(object.getId()+1,"Right","From"));
        if (object.getId()!=0)
        Neighbords.add(new DataClass(object.getId()-1,"Left","To"));

        return Neighbords;
    }
}
