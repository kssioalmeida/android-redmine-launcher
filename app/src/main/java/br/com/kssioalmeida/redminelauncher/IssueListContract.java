package br.com.kssioalmeida.redminelauncher;

import java.util.List;

/**
 * Created by calmeida on 10/10/16.
 */

public interface IssueListContract {

    interface View{

        void setupIssueList(List list);

        void showWaitingLayout();

        void showErrorLayout();

        void showSuccessLayout();

        void updateList(List list);

        void showAlertDialog(String title, String message);
    }


    interface Presenter{

        void setView(IssueListContract.View view);

        void loadIssues();

        void updateList();

        void onErrorMoreDetails();
    }

}
