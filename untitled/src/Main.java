//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
//    Câu 1
//    Phần 1
    String testCase = sc.nextLine();
    cau1 s1 = new cau1(testCase);
    System.out.println("Số lượng kí tự nhiều nhất"+s1.countMax());
//    Câu 2
    System.out.println("Nhập số lượng phần tử: ");
    int countArr = sc.nextInt();
    cau2 s2 = new cau2(countArr);
    s2.coupleNumberMax();
    int count = sc.nextInt();
    sapxepmangc2 s3 = new sapxepmangc2(count);
    s3.sapxepmang();
}
