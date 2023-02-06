package com.example.mvp_simpson_01.update_simpson;

import com.example.mvp_simpson_01.entities.pojo.Simpson;

import java.util.ArrayList;

public interface UpdateSimpsonContract {
    public interface View {
        void successUpdateSimpson(ArrayList<Simpson> uptSimpson);
        void failureUpdateSimpson(String err);
    }

    public interface Presenter{
        void uptSimpson(Simpson simpson);
    }

    public interface Model{
        interface OnUptSimpsonListener{
            void onSuccess(ArrayList<Simpson> uptSimpson);
            void onFailure(String error);
        }

        void uptSimpsonWS(Simpson simpson, OnUptSimpsonListener onUptSimpsonListener);
    }


}
