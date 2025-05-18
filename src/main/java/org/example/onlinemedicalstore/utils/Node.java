package org.example.onlinemedicalstore.utils;

import org.example.onlinemedicalstore.Classes.Order;

public class Node {
    Order order;
    Node next;
    public Node( Order order){
        this.order =order;
        this.next= null;
    }
}
