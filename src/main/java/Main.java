import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import model.Product;
import model.ProductService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //ProductService productService = new ProductService();
        //productService.csvToObject();

        try (FileReader reader = new FileReader("resources/correctedInventory.csv")) {
            CsvToBean<Product> csvToBean = new CsvToBeanBuilder<Product>(reader)
                    .withType(Product.class)
                    .withSeparator(';')
                    .withSkipLines(1)
                    .build();

            List<Product> products = csvToBean.parse();

            for (Product product : products) {
                System.out.println(product.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
