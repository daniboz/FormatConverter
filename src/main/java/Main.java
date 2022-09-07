import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        try (Reader reader = new FileReader("C:\\Users\\Dani\\Desktop\\New folder\\test.json")) {


            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Fields>>(){}.getType();

            List<Fields> fieldsObject = gson.fromJson(reader,listType);

            System.out.println(fieldsObject.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
