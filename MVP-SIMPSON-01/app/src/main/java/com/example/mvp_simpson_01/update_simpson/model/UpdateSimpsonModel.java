package com.example.mvp_simpson_01.update_simpson.model;

import com.example.mvp_simpson_01.entities.pojo.Simpson;
import com.example.mvp_simpson_01.update_simpson.UpdateSimpsonContract;

public class UpdateSimpsonModel implements UpdateSimpsonContract.Model {

    @Override
    public void uptSimpsonWS(Simpson simpson, OnUptSimpsonListener onUptSimpsonListener) {
        // Si ha ido bien
        onUptSimpsonListener.onSuccess(null);
        // Si ha ido mal
        onUptSimpsonListener.onFailure("Error");
    }
}
