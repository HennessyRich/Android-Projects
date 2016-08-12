package ru.startandroid.develop.p0541customadapter;

/**
 * Created by Денис on 11.08.2016.
 */
public class Product {

    String name;
    int price;
    int image;
    boolean box;

    Product(String _describe, int _price, int _image, boolean _box) {
        name = _describe;
        price = _price;
        image = _image;
        box = _box;
    }

}
