package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductService implements ProductServiceI{

    public void csvToObject(){
        /*try {
            File file = new File("resources/correctedInventory.csv");
            Scanner fileScanner = new Scanner(file);
            //Saltar el encabezado del CSV
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] productInfo = line.split(";",6);

                String name = productInfo[0].isEmpty() ? "Nombre predeterminado" : productInfo[0];
                String description = productInfo[1].isEmpty() ? "Descripción predeterminada" : productInfo[1];
                String category = productInfo[2].isEmpty() ? "Categoría predeterminada" : productInfo[2];
                String label = productInfo[3].isEmpty() ? "Subcategoría predeterminada" : productInfo[3];
                float price = productInfo[4].isEmpty() ? 0.0f : Float.parseFloat(productInfo[4]);
                String imageUrl = productInfo[5].isEmpty() ? "URL_predeterminada" : productInfo[5];

                Product product = new Product(name, description, category, label, price,imageUrl);
                System.out.println(product.toString());

                //TODO implement the logic to transform this code so it can convert the information in each line into a Product objet
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }

}

