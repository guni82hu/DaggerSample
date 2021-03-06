package hu.andras.daggersample.di;

import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.di.scopes.IteractorScope;
import hu.andras.daggersample.interactor.Feature1Interactor;
import hu.andras.daggersample.interactor.Feature2Interactor;
import hu.andras.daggersample.network.NetworkApi1;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@Module()
public class InteractorModule {

    @IteractorScope
    @Provides
    Feature1Interactor provideFeature1Interactor(NetworkApi1 networkApi1) {
        return new Feature1Interactor(networkApi1);
    }

    @IteractorScope
    @Provides
    Feature2Interactor provideFeature2Interactor(NetworkApi1 networkApi1) {
        return new Feature2Interactor(networkApi1);
    }

    /**
     * You can use any scope, but you can reference it only from a matching component.
     */
    @ActivityScope
    @Provides
    Date randomObject() {
        return new Date();
    }
}
