package hu.andras.daggersample.ui.feature2.list;

import hu.andras.daggersample.interactor.Feature2Interactor;
import hu.andras.daggersample.ui.common.Navigator;

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */

public class Feature2ListPresenter {

    private Feature2Interactor interactor;
    private Navigator navigator;

    public Feature2ListPresenter(Feature2Interactor interactor, Navigator navigator) {
        this.interactor = interactor;
        this.navigator = navigator;
    }

    void setView(Feature2ListActivity view) {
        view.display(interactor.getFeature2Stuff());
    }

    void goToDetail() {
        navigator.goToFeature2DetailScreen();
    }
}
