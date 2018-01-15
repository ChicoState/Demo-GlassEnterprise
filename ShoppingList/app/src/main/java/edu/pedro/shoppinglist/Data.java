package edu.pedro.shoppinglist;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//1
public class Data {

    private Context context;
    private static final String StoredStringsKey = "edu.pedro.shoppinglist.storedstringskey";
    private static final String PreferencesLocation = "edu.pedro.shoppinglist";

    public Data(Context c){
        context = c;
    }
    //2
    public ArrayList<String> getStoredStrings(){
        SharedPreferences preferences = context.getSharedPreferences(PreferencesLocation, Context.MODE_PRIVATE);
        Set<String> stringSet = preferences.getStringSet(StoredStringsKey, Collections.<String>emptySet());
        return new ArrayList<String>(stringSet);
    }
    //3
    public void setStoredStrings(ArrayList<String> strings){
        SharedPreferences preferences = context.getSharedPreferences(PreferencesLocation, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        Set<String> stringSet = new HashSet<String>(strings);
        editor.putStringSet(StoredStringsKey, stringSet);
        editor.apply();
    }
}