import java.util.Scanner;

public class VirtualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Polimorphisme
        Member member1 = new MemberReguler();
        Member member2 = new MemberSilver();
        Member member3 = new MemberGold();
        Member member4 = new MemberPlatinum();

        MemberSilver memberSilver = new MemberSilver();
        MemberGold memberGold = new MemberGold();
        MemberPlatinum memberPlatinum = new MemberPlatinum();

        //Reguler
        System.out.println("----------------- Member Reguler ----------------- ");
        System.out.print("Inputkan jumlah belanja: ");
        int belanja1 = scanner.nextInt();
        int totalBayar1 = member1.hitungTotalBayar(belanja1);
        System.out.println("Total bayar member: " + totalBayar1);

        //Silver
        System.out.println("----------------- Member Silver ----------------- ");
        System.out.print("Inputkan jumlah belanja: ");
        int belanja2 = scanner.nextInt();
        int totalBayar2 = member2.hitungTotalBayar(belanja2);
        System.out.print("Inputkan jarak tujuan (km): ");
        double jarakSilver = scanner.nextDouble();
        double ongkirSilver = memberSilver.hitungOngkir(jarakSilver);

        System.out.println("Total bayar member: " + totalBayar2);
        System.out.println("Ongkir Member Silver: " + ongkirSilver);
       
        //Gold
        System.out.println("-----------------  Member Gold ----------------- ");
        System.out.print("Inputkan jumlah belanja: ");
        int belanja3 = scanner.nextInt();
        int totalBayar3 = member3.hitungTotalBayar(belanja3);
        System.out.print("Inputkan jarak tujuan (km): ");
        double jarakGold = scanner.nextDouble();
        double ongkirGold = memberGold.hitungOngkir(jarakGold);
        double cicilan3 = totalBayar3 /12;

        System.out.println("Total bayar member: " + totalBayar3);
        System.out.println("Ongkir Member: " + ongkirGold);
        System.out.println("Cicilan PerBln: Rp. " + cicilan3 + "/bulan");

        //Platinum
        System.out.println("-----------------  Member Platinum ----------------- ");
        System.out.print("Inputkan jumlah belanja: ");
        int belanja4 = scanner.nextInt();
        int totalBayar4 = member4.hitungTotalBayar(belanja4);
        System.out.print("Inputkan jarak tujuan (km): ");
        double jarakPlatinum = scanner.nextDouble();
        double ongkirPlatinum = memberPlatinum.hitungOngkir(jarakPlatinum);
        double cicilan4 = totalBayar4 /12;
        System.out.print("Inputkan jumlah deposit untuk Member: ");
        int depositPlatinum = scanner.nextInt();
        int saldoPlatinum = memberPlatinum.deposit(depositPlatinum);

        System.out.println("Total bayar member: " + totalBayar4);
        System.out.println("Ongkir Member Platinum: " + ongkirPlatinum);
        System.out.println("Cicilan PerBln: Rp. " + cicilan4 + "/bulan");
        System.out.println("Saldo Setelah Deposit: " + saldoPlatinum);

        scanner.close();
    }
   
}

