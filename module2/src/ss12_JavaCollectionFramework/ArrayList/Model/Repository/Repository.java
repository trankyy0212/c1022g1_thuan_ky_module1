package ss12_JavaCollectionFramework.ArrayList.Model.Repository;

import ss12_JavaCollectionFramework.ArrayList.Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Repository implements IRepository {
    static List<Product> myArrayList = new ArrayList<>();

    static {
        myArrayList.add(new Product(1, "ghe", 5.5));
        myArrayList.add(new Product(2, "ban", 4.5));
        myArrayList.add(new Product(3, "quat", 55));

    }

//    Product model = new Product(1,"ghe",5.5);
//    Product model1 = new Product(2,"ban",4.5);
//    Product model2 = new Product(3,"quat",55);
//
//    {
//        myArrayList.add(model);
//        myArrayList.add(model1);
//        myArrayList.add(model2);
//    }


    @Override
    public void add(Product product) {
        myArrayList.add(product);

    }

    @Override
    public Product findById(int id) {
        for (Product x : myArrayList) {
            if (x.getId() == id) {
                return x;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).getId() == product.getId()) {
                myArrayList.set(i, product);
            }
        }
    }

    @Override
    public void remove(Product product) {
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).getId() == product.getId()) {
                myArrayList.remove(product);
            }
        }
    }


    @Override
    public void list() {
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

    }

    @Override
    public void search(String name) {
        boolean a = false;
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).getName().contains(name)) {
                System.out.println(myArrayList.get(i));
                //}if
            }
        }


    }

    @Override
    public void sortAscendingOrder() {
        Collections.sort(myArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
    @Override
    public void sortDescendingOrder() {
        Collections.sort(myArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice()-o1.getPrice());
            }
        });
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

    }

}
