package yaskiv.mvp_example.View.Impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import yaskiv.mvp_example.Model.Entity.DataClass;
import yaskiv.mvp_example.Presenter.Impl.PresenterMain;
import yaskiv.mvp_example.R;
import yaskiv.mvp_example.View.IMainActivity;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    PresenterMain pm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClickForResult(View view) {
        pm=new PresenterMain(this,new DataClass(2,"2","4"));
        pm.onClickButton();
        Toast.makeText(this, "Jeach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setText(List<DataClass> dc) {
        TextView tx=(TextView)findViewById(R.id.uio);
        tx.setText(dc.get(0).getName()+"-"+dc.get(0).getSurname()+" || "+dc.get(1).getName()+"-"+dc.get(1).getSurname());
    }
}
