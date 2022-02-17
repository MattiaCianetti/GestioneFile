package com.example.gestionefile;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gestore {

    public String leggiFile(String nomefile, Context c)
    {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader fileDaLeggere = new BufferedReader(
            new InputStreamReader(c.openFileInput(nomefile)));
            String testoDaRestituire = "";
            while ((testoDaRestituire = fileDaLeggere.readLine())!=null){
                sb.append(testoDaRestituire + "\n");
            }
        } catch (FileNotFoundException e) {
            Log.e("gestore","file inesistente");
        } catch (IOException e) {
            Log.e("gestore", "errore nella lettura");
        }
        return sb.toString();
    }

    public void scriviFile(String nomeFile, Context c) {
        FileOutputStream fileO;
        String frase = "questo è ciò che scriviamo dentro il file";
        try {
            //apro il file
            fileO = c.openFileOutput(nomeFile,
                    Context.MODE_PRIVATE);
            //scrivo il file
            fileO.write(frase.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

