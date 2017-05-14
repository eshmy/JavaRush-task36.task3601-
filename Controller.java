package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by Elena on 09.05.2017.
 */
public class Controller {
    Model model=new Model();

    public List<String> onDataListShow() {
        return model.getStringDataList();

    }
}
