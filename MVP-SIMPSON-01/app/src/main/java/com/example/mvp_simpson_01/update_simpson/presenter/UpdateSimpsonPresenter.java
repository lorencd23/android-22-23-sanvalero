package com.example.mvp_simpson_01.update_simpson.presenter;

import com.example.mvp_simpson_01.entities.pojo.Simpson;
import com.example.mvp_simpson_01.update_simpson.UpdateSimpsonContract;
import com.example.mvp_simpson_01.update_simpson.model.UpdateSimpsonModel;

import java.util.ArrayList;

public class UpdateSimpsonPresenter implements UpdateSimpsonContract.Presenter {

    private UpdateSimpsonModel uptSimpsonModel;
    private UpdateSimpsonContract.View view;

    public UpdateSimpsonPresenter(UpdateSimpsonContract.View view){
        this.view = view;
        uptSimpsonModel = new UpdateSimpsonModel();
    }

    @Override
    public void uptSimpson(Simpson simpson) {
        uptSimpsonModel.uptSimpsonWS(null, new UpdateSimpsonContract.Model.OnUptSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> uptSimpson) {
                view.successUpdateSimpson(uptSimpson);
            }

            @Override
            public void onFailure(String error) {
                view.failureUpdateSimpson(error);
            }
        });
    }
}
