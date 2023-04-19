package example01;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
//        Bài toán kiểm tra số A có phải là số nguyên tố hay không?
//        Số nguyên tố là số chỉ chia hết cho 1 và chính no
        int soThu1 = 20;
        int soA = soThu1; // A = 20
        boolean bienKiemTraNguyenTo = true; // Khởi tạo biến mặc định A là số nguyên tố
        for(int i = 2;i<=Math.sqrt(soA);i++){
            if(soA% i == 0){
                bienKiemTraNguyenTo = false; // Vì A chia hết cho i nên gán biến giá trị false - tức A không phải là số nguyên tố
                break; // khi A không phải là số nguyên tố thì không cần phải xét các số còn lại - break để thoát khỏi vòng lặp
            }
        }
        if(bienKiemTraNguyenTo){
            System.out.println(soA + " là số nguyên tố");
        }
        else {
            System.out.println(soA + " không phải là số nguyên tố");
        }
    }
}
