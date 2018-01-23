package edu.pedro.shoppinglist;
/* Might need to change "edu.pedro" to your own domain name*/
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Data {

    private Context context;
    /* Might need to change "edu.pedro." to what every you used as your domain*/
    private static final String StoredStringsKey = "edu.pedro.shoppinglist.storedstringskey";
    private static final String PreferencesLocation = "edu.pedro.shoppinglist";

    public Data(Context c){
        context = c;
    }
    /* getStoredString
        This function simply returns a list of strings (Shopping items) in an array of string
    */
    public ArrayList<String> getStoredStrings(){
        SharedPreferences preferences = context.getSharedPreferences(PreferencesLocation, Context.MODE_PRIVATE);
        Set<String> stringSet = preferences.getStringSet(StoredStringsKey, Collections.<String>emptySet());
        return new ArrayList<String>(stringSet);
    }
    /* setStoredStrings
        This function takes in an array of strings as a parameter and stores them within the editor
    */
    public void setStoredStrings(ArrayList<String> strings){
        SharedPreferences preferences = context.getSharedPreferences(PreferencesLocation, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        Set<String> stringSet = new HashSet<String>(strings);
        editor.putStringSet(StoredStringsKey, stringSet);
        editor.apply();
    }
}
