package yaskiv.mvp_example.Presenter.Impl;

import yaskiv.mvp_example.Model.Entity.DataClass;
import yaskiv.mvp_example.Model.Impl.Data;
import yaskiv.mvp_example.Presenter.IPresenterMain;
import yaskiv.mvp_example.View.IMainActivity;

/**
 * Created by yaski on 18.04.2017.
 */

public class PresenterMain implements IPresenterMain {

    final IMainActivity mainActivityInterface;
    final DataClass data;


    public PresenterMain(IMainActivity mainActivityInterface, DataClass data) {
        this.mainActivityInterface = mainActivityInterface;
        this.data = data;
    }


    @Override
    public void onClickButton() {
        Data dt=new Data();

        mainActivityInterface.setText(dt.getNeighbords(data));
    }
}
