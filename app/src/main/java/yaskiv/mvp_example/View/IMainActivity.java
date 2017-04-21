package yaskiv.mvp_example.View;

import android.view.View;

import java.util.List;

import yaskiv.mvp_example.Model.Entity.DataClass;

/**
 * Created by yaski on 18.04.2017.
 */

public interface IMainActivity {
    void onClickForResult(View view);
    void setText(List<DataClass> dc);
}
