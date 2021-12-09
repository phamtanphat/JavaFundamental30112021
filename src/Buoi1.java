import java.util.Scanner;

public class Buoi1 {
    // tổ hợp phím
    // gợi ý code : ctrl + space
    // không muốn chạy đoạn lệnh (comment code) :  trỏ tới dòng không muốn chạy ctrl + /
    // Gợi ý sửa lỗi : alt + enter
    public static void main(String[] args) {

//         1 : Khai báo biến (variable) và kiểu dữ liệu (type)
//
//         Kiểu dữ liệu nguyên thủy : String, int , long , float , double , boolean , char...
//         Kiễu dự liệu vùng nhớ (Object) : Object , Array;
//
//        String name = "Nguyễn Văn Tý";
//        char text = 'a';
//        int age = 12;
//        float height = 1.2f;
//        double weight = 35.5;
//        boolean isMale = true;
//
//         build in function (phương thức được xây dựng sẵn)
//         Xử lý chuỗi : "abc " + saewqe ( + chỉ dùng nhưu phép nối khi xuất hiện giá trị chuỗi)
//        System.out.println("Name : " + name);
//        System.out.println("Char : " + text);
//        System.out.println("Age : " + age);
//        System.out.println("Height : " + height);
//        System.out.println("Weight : " + weight);
//        System.out.println("isMale : " + isMale);

//        2 : Toán tử

        // Th1 a++:
        // Gán giá trị
        // Tăng thêm 1 giá trị

        // Th2 ++a:
        // Tăng thêm 1 giá trị
        // Gán giá trị


        // Độ ưu tiên
        // ++ , --
        // * /
        // + -
//        int a = 5;
//        int b = 5;
//
//        int ketQua = a++ - --b + a-- - --a + b-- - --b;
//         5 - --b + a-- - --a + b-- - --b; a = 6 , b = 5
//         5 - 4 + a-- - --a + b-- - --b; a = 6 , b = 4
//         5 - 4 + 6 - --a + b-- - --b; a = 5 , b = 4
//         5 - 4 + 6 - 4 + b-- - --b; a = 4 , b = 4
//         5 - 4 + 6 - 4 + 4 - --b; a = 4 , b = 3
//         5 - 4 + 6 - 4 + 4 - 2; a = 4 , b = 2
//         Ket qua 5 , a = 4 , b = 2
//
//        System.out.println("Kết quả " + ketQua);
//        System.out.println("A " + a);
//        System.out.println("B " + b);
//
//         Thái Ket qua: 4 , a: 4 ,b: 2
//         Hoai Kết quả 5; a = 4 b = 1
//         Nhan ketQua =3 ,a = 5,b= 4
//         Truong ket qua = 3 , a = 5 , b = 4


//        int a = 1;
//        int b = 2;
//
//        int ketQua = a++ - --b + b-- - b++ + a-- - a++;
//        1 - --b + b-- - b++ + a-- - a++; a = 2 , b = 2
//        1 - 1 + b-- - b++ + a-- - a++; a = 2 , b = 1
//        1 - 1 + 1 - b++ + a-- - a++; a = 2 , b = 0
//        1 - 1 + 1 - 0 + a-- - a++; a = 2 , b = 1
//        1 - 1 + 1 - 0 + 2 - a++; a = 1 , b = 1
//        1 - 1 + 1 - 0 + 2 - 1; a = 2 , b = 1
//         kq 2 , a = 2 , b1
//
//        System.out.println("Kết quả " + ketQua);
//        System.out.println("A " + a);
//        System.out.println("B " + b);
//
//         Bổn : kết quả 1, a=2,b=1
//         Phuong : a =3 ,b=1 ket qua = 1
//         Quang : ketQua =2; a=2; b=1
//         Thái : ketQua =2; a=2; b=1

        // 3 : Câu điều kiện if else
//        int a = 5;
//        int b = 10;

        // Nếu a > b : a lớn hơn b
        // Nếu a < b : a bé hơn b
        // Nếu a == b : a bằng b

        // {} : scope (phạm vi)

//        if (a > b){
//            System.out.println("A lớn hơn B");
//        }else if (a < b){
//            System.out.println("A bé hơn B");
//        }else{
//            System.out.println("A bằng hơn B");
//        }


        // Input
        // Nhập tổng tiền
        // Nhập mã khách hàng

        // Điều kiện
        // Khách mới : N
        // Khách cũ : O
        // Khách vip : V

        // TH Không đúng mã
        // Không phải các ký tự trên thì báo ra không tồn tại mã khách hàng
        // TH đúng mã
        // N : 2 %
        // O : 5 %
        // V : 10%
        // SV : 15%


        // Out put
        // Loại khách hàng : Khách mới
        // Được giảm 2% trên tổng giá trị sản phẩm
        // Tổng tiền phải trả : 98000


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập tổng tiền : ");
//        int total = scanner.nextInt();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("Nhập mã khách hàng: ");
//        String code = scanner2.next();
//
//        int percent = 0;
//        String category = "Chưa đăng ký";
//
//        if (code.equals("N")) {
//            percent = 2;
//            category = "Khách mới";
//        } else if (code.equals("O")) {
//            percent = 5;
//            category = " Khách cũ";
//        } else if (code.equals("V")) {
//            percent = 10;
//            category = "Khách Vip";
//        }else if(code.equals("SV")){
//            percent = 15;
//            category = "Khách Supper Vip";
//        }
//        System.out.println("Loại khách hàng : " + category);
//        System.out.println("Được giảm " + percent + "% trên tổng giá trị sản phẩm");
//        total = ((100 - percent) * total) / 100;
//        System.out.println("Tổng tiền phải trả : " + total);


        // switch case

//        int month = 5;
//
//        switch (month){
//            case 1 :
//                System.out.println("Quý 1");
//                break;
//            case 2 :
//                System.out.println("Quý 1");
//                break;
//            case 3 :
//                System.out.println("Quý 1");
//                break;
//            case 4 :
//                System.out.println("Quý 2");
//                break;
//            case 5 :
//                System.out.println("Quý 2");
//                break;
//        }

        // mảng : array , collection

        // Cách 1 : Tạo ra 1 mảng rỗng nhưng biết trước kích thước mảng
//        int[] arrNumbers = new int[10];

        // cập nhật value cho phần tử
//        arrNumbers[0] = 5;
//
//        System.out.println("Size " + arrNumbers.length);
//        System.out.println("Vị trí phần tử thứ 0 " + arrNumbers[0]);


        // Cách 2 : Tạo ra mảng và biết trước giá trị các phần tử
//        int[] arrNumbers2 = {10,20,30,40,50};


        // Vòng lặp : for

        // 0 -> 100
//        for (int i = 0 ; i < 100 ; i++){
//            System.out.println(i);
//        }

        // Duyệt từ 1 -> == 100
        // in ra số chẳn

//        for (int i = 1 ; i <= 100 ; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }



        // 1 - In ngược 2 mảng
            // arr1 : 40 , 30 , 20 ,10
            // arr2 : 3 , 2 , 1
        // 2 - Tính giá trị
        // 10
        // 20
        // 30
        // 20
        // 40
        // 60
        // ..
        // 40
        // 80
        // 120

//        int[] arrNumbers1 = {10 , 20 , 30 , 40};
//        int[] arrNumbers2 = {1,2,3};

//        for(int i = arrNumbers1.length - 1; i >= 0 ; i--){
//            System.out.println(arrNumbers1[i]);
//        }

//        for (int i = 0 ; i < arrNumbers1.length ; i++){
//            for (int y = 0 ; y < arrNumbers2.length ; y++){
//                System.out.println(arrNumbers1[i] * arrNumbers2[y] + "");
//            }
//        }

        // vòng lặp while

        int a = 10;

        while (a < 20){
            System.out.println(a);
            a++;
        }

    }
}