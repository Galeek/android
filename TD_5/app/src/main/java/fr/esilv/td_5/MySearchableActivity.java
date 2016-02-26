package fr.esilv.td_5;

import android.app.SearchManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

//import android.support.v7.widget.SearchView;

/**
 * Created by ALEX on 26/02/2016.
 */
public class MySearchableActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            MenuItem searchActionBarItem = menu.findItem(R.id.searchActionBarItem);
            //searchView = (SearchView) MenuItemCompat.getActionView(searchActionBarItem);
            //searchView.setSearchableInfo(
                    //searchManager.getSearchableInfo(getComponentName()));
            //searchView.setIconifiedByDefault(true);
            return true;
            //)
    }
}
