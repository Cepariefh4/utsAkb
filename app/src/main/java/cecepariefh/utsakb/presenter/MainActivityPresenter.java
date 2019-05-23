package cecepariefh.utsakb.presenter;

import cecepariefh.utsakb.model.UserModel;
import cecepariefh.utsakb.view.MainView;

public abstract class MainActivityPresenter implements MainPresenter{

    private MainView mainView;
    private UserModel user = new UserModel();
}
