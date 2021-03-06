package hu.andras.daggersample.di.androidinjection;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import hu.andras.daggersample.di.Feature3DetailModule;
import hu.andras.daggersample.di.Feature3ListSubcomponent;
import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.ui.feature3.detail.Feature3DetailActivity;
import hu.andras.daggersample.ui.feature3.list.Feature3ListActivity;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */
@Module(subcomponents = Feature3ListSubcomponent.class)
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ClassKey(Feature3ListActivity.class)
    abstract AndroidInjector.Factory<?> bindFeature3ListActivity(Feature3ListSubcomponent.Builder builder);

    @ActivityScope
    @ContributesAndroidInjector(modules = Feature3DetailModule.class)
    abstract Feature3DetailActivity bindFeature3Detailctivity();

}
