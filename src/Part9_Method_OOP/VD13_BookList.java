package src.Part9_Method_OOP;

import java.util.*;

public class VD13_BookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<VD12_Book> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sách thứ " + (i + 1) + ":");
            VD12_Book b = new VD12_Book();
            b.input();
            list.add(b);
        }

        System.out.println("\n Danh sách sách vừa nhập:");
        list.forEach(System.out::println);

        double maxPrice = list.stream().mapToDouble(VD12_Book::getPrice).max().orElse(0);
        System.out.println("\n Sách có giá cao nhất:");
        list.stream().filter(b -> b.getPrice() == maxPrice).forEach(System.out::println);

        System.out.println("\n Sách có tên là 'Java OOP':");
        list.stream().filter(b -> b.getName().equalsIgnoreCase("Java OOP")).forEach(System.out::println);

        System.out.println("\n Sắp xếp tăng dần theo quantity:");
        list.sort(Comparator.comparingInt(VD12_Book::getQuantity));
        list.forEach(System.out::println);

        System.out.println("\n Sắp xếp giảm dần theo price:");
        list.sort((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
        list.forEach(System.out::println);
    }
}
