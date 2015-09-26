package br.com.ceduphh.bruno.teampokemon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class TeamPokemonActivity extends Activity {

    private static final int CONTACT_PICK_ACTION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_pokemon);
    }
    protected void onActivityForResult(int requestCode, int resultCode, Intent data){
        if (requestCode == CONTACT_PICK_ACTION && resultCode == Activity.RESULT_OK){

        }
    }
}
